// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSparkLocalClientInfoResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetSparkLocalClientInfoResponseBodyData> data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSparkLocalClientInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkLocalClientInfoResponseBody self = new GetSparkLocalClientInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkLocalClientInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSparkLocalClientInfoResponseBody setData(java.util.List<GetSparkLocalClientInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSparkLocalClientInfoResponseBodyData> getData() {
        return this.data;
    }

    public GetSparkLocalClientInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSparkLocalClientInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSparkLocalClientInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSparkLocalClientInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSparkLocalClientInfoResponseBodyData extends TeaModel {
        /**
         * <p>The client file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXX-XXXX-XXXX-XXXX</p>
         */
        @NameInMap("ClientFileResourceId")
        public String clientFileResourceId;

        /**
         * <p>The client file name.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-cleint.zip</p>
         */
        @NameInMap("ClientFileResourceName")
        public String clientFileResourceName;

        /**
         * <p>The client name.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-clinet</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
         * <p>Indicates whether the client information is editable.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("Editable")
        public Boolean editable;

        public static GetSparkLocalClientInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkLocalClientInfoResponseBodyData self = new GetSparkLocalClientInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkLocalClientInfoResponseBodyData setClientFileResourceId(String clientFileResourceId) {
            this.clientFileResourceId = clientFileResourceId;
            return this;
        }
        public String getClientFileResourceId() {
            return this.clientFileResourceId;
        }

        public GetSparkLocalClientInfoResponseBodyData setClientFileResourceName(String clientFileResourceName) {
            this.clientFileResourceName = clientFileResourceName;
            return this;
        }
        public String getClientFileResourceName() {
            return this.clientFileResourceName;
        }

        public GetSparkLocalClientInfoResponseBodyData setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public GetSparkLocalClientInfoResponseBodyData setEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }
        public Boolean getEditable() {
            return this.editable;
        }

    }

}
