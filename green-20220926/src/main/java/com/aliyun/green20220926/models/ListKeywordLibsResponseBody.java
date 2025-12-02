// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListKeywordLibsResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListKeywordLibsResponseBodyData> data;

    /**
     * <p>Further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>ID assigned by the backend to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success indicator.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListKeywordLibsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKeywordLibsResponseBody self = new ListKeywordLibsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKeywordLibsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListKeywordLibsResponseBody setData(java.util.List<ListKeywordLibsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListKeywordLibsResponseBodyData> getData() {
        return this.data;
    }

    public ListKeywordLibsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListKeywordLibsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKeywordLibsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKeywordLibsResponseBodyData extends TeaModel {
        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-30 16:30:29</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Number of keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("KeywordCount")
        public String keywordCount;

        /**
         * <p>Library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_xxxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>Library name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("LibName")
        public String libName;

        /**
         * <p>Service codes.</p>
         * 
         * <strong>example:</strong>
         * <p>service1,service2</p>
         */
        @NameInMap("ServiceCodes")
        public String serviceCodes;

        /**
         * <p>UID.</p>
         * 
         * <strong>example:</strong>
         * <p>19964*****086772</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static ListKeywordLibsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKeywordLibsResponseBodyData self = new ListKeywordLibsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKeywordLibsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListKeywordLibsResponseBodyData setKeywordCount(String keywordCount) {
            this.keywordCount = keywordCount;
            return this;
        }
        public String getKeywordCount() {
            return this.keywordCount;
        }

        public ListKeywordLibsResponseBodyData setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ListKeywordLibsResponseBodyData setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

        public ListKeywordLibsResponseBodyData setServiceCodes(String serviceCodes) {
            this.serviceCodes = serviceCodes;
            return this;
        }
        public String getServiceCodes() {
            return this.serviceCodes;
        }

        public ListKeywordLibsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
