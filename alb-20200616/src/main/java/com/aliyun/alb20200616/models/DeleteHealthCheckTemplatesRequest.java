// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteHealthCheckTemplatesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a **2xx HTTP** status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the health check template.</p>
     */
    @NameInMap("HealthCheckTemplateIds")
    public java.util.List<String> healthCheckTemplateIds;

    public static DeleteHealthCheckTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHealthCheckTemplatesRequest self = new DeleteHealthCheckTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHealthCheckTemplatesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteHealthCheckTemplatesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteHealthCheckTemplatesRequest setHealthCheckTemplateIds(java.util.List<String> healthCheckTemplateIds) {
        this.healthCheckTemplateIds = healthCheckTemplateIds;
        return this;
    }
    public java.util.List<String> getHealthCheckTemplateIds() {
        return this.healthCheckTemplateIds;
    }

}
