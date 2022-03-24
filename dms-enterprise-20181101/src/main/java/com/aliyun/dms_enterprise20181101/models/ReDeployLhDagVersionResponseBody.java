// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ReDeployLhDagVersionResponseBody extends TeaModel {
    @NameInMap("DeployId")
    public Long deployId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReDeployLhDagVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReDeployLhDagVersionResponseBody self = new ReDeployLhDagVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReDeployLhDagVersionResponseBody setDeployId(Long deployId) {
        this.deployId = deployId;
        return this;
    }
    public Long getDeployId() {
        return this.deployId;
    }

    public ReDeployLhDagVersionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReDeployLhDagVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReDeployLhDagVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReDeployLhDagVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
