// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateComputeClusterResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation result.</p>
     */
    @NameInMap("Data")
    public CreateComputeClusterResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateComputeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeClusterResponseBody self = new CreateComputeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComputeClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateComputeClusterResponseBody setData(CreateComputeClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateComputeClusterResponseBodyData getData() {
        return this.data;
    }

    public CreateComputeClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateComputeClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateComputeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateComputeClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateComputeClusterResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102111</p>
         */
        @NameInMap("DsId")
        public Long dsId;

        public static CreateComputeClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeClusterResponseBodyData self = new CreateComputeClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateComputeClusterResponseBodyData setDsId(Long dsId) {
            this.dsId = dsId;
            return this;
        }
        public Long getDsId() {
            return this.dsId;
        }

    }

}
