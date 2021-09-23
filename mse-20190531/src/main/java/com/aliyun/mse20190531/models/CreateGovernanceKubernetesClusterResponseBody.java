// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGovernanceKubernetesClusterResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Long data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public String success;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    public static CreateGovernanceKubernetesClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGovernanceKubernetesClusterResponseBody self = new CreateGovernanceKubernetesClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGovernanceKubernetesClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGovernanceKubernetesClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGovernanceKubernetesClusterResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateGovernanceKubernetesClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateGovernanceKubernetesClusterResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public CreateGovernanceKubernetesClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

}
