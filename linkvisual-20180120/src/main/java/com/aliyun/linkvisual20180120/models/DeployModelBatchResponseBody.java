// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeployModelBatchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeployModelBatchResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DeployModelBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployModelBatchResponseBody self = new DeployModelBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployModelBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployModelBatchResponseBody setData(DeployModelBatchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeployModelBatchResponseBodyData getData() {
        return this.data;
    }

    public DeployModelBatchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeployModelBatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeployModelBatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeployModelBatchResponseBodyData extends TeaModel {
        @NameInMap("DeployTaskResultVOList")
        public java.util.List<java.util.Map<String, ?>> deployTaskResultVOList;

        public static DeployModelBatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeployModelBatchResponseBodyData self = new DeployModelBatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeployModelBatchResponseBodyData setDeployTaskResultVOList(java.util.List<java.util.Map<String, ?>> deployTaskResultVOList) {
            this.deployTaskResultVOList = deployTaskResultVOList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDeployTaskResultVOList() {
            return this.deployTaskResultVOList;
        }

    }

}
