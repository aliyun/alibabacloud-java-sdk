// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ForceDeleteExpressConnectRouterRequest extends TeaModel {
    /**
     * <p>A client token to ensure that the request is idempotent.</p>
     * <p>Generate a unique parameter value from your client. The ClientToken parameter can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. Each API request has a unique <strong>RequestId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run to check the request. No resources are modified.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a standard request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the ECR instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-fu8rszhgv7623c****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("Version")
    public String version;

    public static ForceDeleteExpressConnectRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        ForceDeleteExpressConnectRouterRequest self = new ForceDeleteExpressConnectRouterRequest();
        return TeaModel.build(map, self);
    }

    public ForceDeleteExpressConnectRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ForceDeleteExpressConnectRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ForceDeleteExpressConnectRouterRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public ForceDeleteExpressConnectRouterRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
