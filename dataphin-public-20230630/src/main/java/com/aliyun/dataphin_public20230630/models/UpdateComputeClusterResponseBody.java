// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateComputeClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateComputeClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateComputeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeClusterResponseBody self = new UpdateComputeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateComputeClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateComputeClusterResponseBody setData(UpdateComputeClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateComputeClusterResponseBodyData getData() {
        return this.data;
    }

    public UpdateComputeClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateComputeClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateComputeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateComputeClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateComputeClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>102111</p>
         */
        @NameInMap("DsId")
        public Long dsId;

        public static UpdateComputeClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeClusterResponseBodyData self = new UpdateComputeClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateComputeClusterResponseBodyData setDsId(Long dsId) {
            this.dsId = dsId;
            return this;
        }
        public Long getDsId() {
            return this.dsId;
        }

    }

}
