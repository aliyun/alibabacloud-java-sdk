// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetParseResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetParseResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0abb793617204049360065953ec6dd</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GetParseResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParseResultResponseBody self = new GetParseResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParseResultResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetParseResultResponseBody setData(GetParseResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetParseResultResponseBodyData getData() {
        return this.data;
    }

    public GetParseResultResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetParseResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetParseResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetParseResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParseResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetParseResultResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetParseResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("providerType")
        public String providerType;

        /**
         * <strong>example:</strong>
         * <p>b0a202e2-5031-4589-a6d7-39185f0d8d01</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>{
         *           &quot;Status&quot;: &quot;Success&quot;,
         *           &quot;Data&quot;: {},
         *           &quot;Message&quot;: null,
         *           &quot;TaskId&quot;: &quot;docmind-20240601-123abc&quot;
         *         }</p>
         */
        @NameInMap("result")
        public java.util.Map<String, ?> result;

        @NameInMap("resultUrl")
        public String resultUrl;

        /**
         * <strong>example:</strong>
         * <p>WaitRefresh</p>
         */
        @NameInMap("status")
        public String status;

        public static GetParseResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetParseResultResponseBodyData self = new GetParseResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetParseResultResponseBodyData setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetParseResultResponseBodyData setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public GetParseResultResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetParseResultResponseBodyData setResult(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, ?> getResult() {
            return this.result;
        }

        public GetParseResultResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetParseResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
