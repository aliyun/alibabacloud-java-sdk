// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSearchLibResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchLibInfoList")
    public java.util.List<ListSearchLibResponseBodySearchLibInfoList> searchLibInfoList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

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

    public static class ListSearchLibResponseBodySearchLibInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>faceSearchLib</p>
         */
        @NameInMap("SearchLibName")
        public String searchLibName;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListSearchLibResponseBodySearchLibInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListSearchLibResponseBodySearchLibInfoList self = new ListSearchLibResponseBodySearchLibInfoList();
            return TeaModel.build(map, self);
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
