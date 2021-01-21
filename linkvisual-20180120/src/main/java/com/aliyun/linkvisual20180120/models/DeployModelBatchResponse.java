// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeployModelBatchResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public DeployModelBatchResponseData data;

    public static DeployModelBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployModelBatchResponse self = new DeployModelBatchResponse();
        return TeaModel.build(map, self);
    }

    public DeployModelBatchResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployModelBatchResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeployModelBatchResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeployModelBatchResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeployModelBatchResponse setData(DeployModelBatchResponseData data) {
        this.data = data;
        return this;
    }
    public DeployModelBatchResponseData getData() {
        return this.data;
    }

    public static class DeployModelBatchResponseData extends TeaModel {
        @NameInMap("DeployTaskResultVOList")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> deployTaskResultVOList;

        public static DeployModelBatchResponseData build(java.util.Map<String, ?> map) throws Exception {
            DeployModelBatchResponseData self = new DeployModelBatchResponseData();
            return TeaModel.build(map, self);
        }

        public DeployModelBatchResponseData setDeployTaskResultVOList(java.util.List<java.util.Map<String, ?>> deployTaskResultVOList) {
            this.deployTaskResultVOList = deployTaskResultVOList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDeployTaskResultVOList() {
            return this.deployTaskResultVOList;
        }

    }

}
