// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetKeywordLibResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetKeywordLibResponseBodyData data;

    /**
     * <p>The detailed description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetKeywordLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordLibResponseBody self = new GetKeywordLibResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKeywordLibResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetKeywordLibResponseBody setData(GetKeywordLibResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKeywordLibResponseBodyData getData() {
        return this.data;
    }

    public GetKeywordLibResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetKeywordLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKeywordLibResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKeywordLibResponseBodyData extends TeaModel {
        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-29 10:26:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The number of keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KeywordCount")
        public String keywordCount;

        /**
         * <p>The ID of the keyword library.</p>
         * 
         * <strong>example:</strong>
         * <p>customxx_xxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>The name of the keyword library.</p>
         * 
         * <strong>example:</strong>
         * <p>Test keyword library</p>
         */
        @NameInMap("LibName")
        public String libName;

        /**
         * <p>The preprocessing list of the keyword library. If ServiceCode is not specified or no preprocessing is configured, an empty array is returned.</p>
         */
        @NameInMap("PreprocessList")
        public java.util.List<String> preprocessList;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1825457112123838</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static GetKeywordLibResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKeywordLibResponseBodyData self = new GetKeywordLibResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKeywordLibResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetKeywordLibResponseBodyData setKeywordCount(String keywordCount) {
            this.keywordCount = keywordCount;
            return this;
        }
        public String getKeywordCount() {
            return this.keywordCount;
        }

        public GetKeywordLibResponseBodyData setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public GetKeywordLibResponseBodyData setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

        public GetKeywordLibResponseBodyData setPreprocessList(java.util.List<String> preprocessList) {
            this.preprocessList = preprocessList;
            return this;
        }
        public java.util.List<String> getPreprocessList() {
            return this.preprocessList;
        }

        public GetKeywordLibResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
