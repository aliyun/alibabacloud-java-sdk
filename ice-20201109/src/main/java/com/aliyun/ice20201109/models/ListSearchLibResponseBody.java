// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSearchLibResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Information about search libraries.</p>
     */
    @NameInMap("SearchLibInfoList")
    public java.util.List<ListSearchLibResponseBodySearchLibInfoList> searchLibInfoList;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListSearchLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSearchLibResponseBody self = new ListSearchLibResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSearchLibResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSearchLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchLibResponseBody setSearchLibInfoList(java.util.List<ListSearchLibResponseBodySearchLibInfoList> searchLibInfoList) {
        this.searchLibInfoList = searchLibInfoList;
        return this;
    }
    public java.util.List<ListSearchLibResponseBodySearchLibInfoList> getSearchLibInfoList() {
        return this.searchLibInfoList;
    }

    public ListSearchLibResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListSearchLibResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListSearchLibResponseBodySearchLibInfoListIndexInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("IndexReadiness")
        public String indexReadiness;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("IndexStatus")
        public String indexStatus;

        /**
         * <strong>example:</strong>
         * <p>face</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        public static ListSearchLibResponseBodySearchLibInfoListIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSearchLibResponseBodySearchLibInfoListIndexInfo self = new ListSearchLibResponseBodySearchLibInfoListIndexInfo();
            return TeaModel.build(map, self);
        }

        public ListSearchLibResponseBodySearchLibInfoListIndexInfo setIndexReadiness(String indexReadiness) {
            this.indexReadiness = indexReadiness;
            return this;
        }
        public String getIndexReadiness() {
            return this.indexReadiness;
        }

        public ListSearchLibResponseBodySearchLibInfoListIndexInfo setIndexStatus(String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }
        public String getIndexStatus() {
            return this.indexStatus;
        }

        public ListSearchLibResponseBodySearchLibInfoListIndexInfo setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

    }

    public static class ListSearchLibResponseBodySearchLibInfoList extends TeaModel {
        @NameInMap("IndexInfo")
        public java.util.List<ListSearchLibResponseBodySearchLibInfoListIndexInfo> indexInfo;

        @NameInMap("SearchLibConfig")
        public String searchLibConfig;

        /**
         * <p>The search library.</p>
         * 
         * <strong>example:</strong>
         * <p>faceSearchLib</p>
         */
        @NameInMap("SearchLibName")
        public String searchLibName;

        /**
         * <p>The status of the search library.</p>
         * <ul>
         * <li>normal</li>
         * <li>deleting</li>
         * <li>deleteFail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListSearchLibResponseBodySearchLibInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListSearchLibResponseBodySearchLibInfoList self = new ListSearchLibResponseBodySearchLibInfoList();
            return TeaModel.build(map, self);
        }

        public ListSearchLibResponseBodySearchLibInfoList setIndexInfo(java.util.List<ListSearchLibResponseBodySearchLibInfoListIndexInfo> indexInfo) {
            this.indexInfo = indexInfo;
            return this;
        }
        public java.util.List<ListSearchLibResponseBodySearchLibInfoListIndexInfo> getIndexInfo() {
            return this.indexInfo;
        }

        public ListSearchLibResponseBodySearchLibInfoList setSearchLibConfig(String searchLibConfig) {
            this.searchLibConfig = searchLibConfig;
            return this;
        }
        public String getSearchLibConfig() {
            return this.searchLibConfig;
        }

        public ListSearchLibResponseBodySearchLibInfoList setSearchLibName(String searchLibName) {
            this.searchLibName = searchLibName;
            return this;
        }
        public String getSearchLibName() {
            return this.searchLibName;
        }

        public ListSearchLibResponseBodySearchLibInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
