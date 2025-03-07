// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSparkLocalClientInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetSparkLocalClientInfoResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>XXXX-XXXX-XXXX-XXXX</p>
         */
        @NameInMap("ClientFileResourceId")
        public String clientFileResourceId;

        /**
         * <strong>example:</strong>
         * <p>spark-cleint.zip</p>
         */
        @NameInMap("ClientFileResourceName")
        public String clientFileResourceName;

        /**
         * <strong>example:</strong>
         * <p>spark-clinet</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
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
