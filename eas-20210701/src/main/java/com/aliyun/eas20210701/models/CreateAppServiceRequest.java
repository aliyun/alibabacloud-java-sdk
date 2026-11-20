// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateAppServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5db780a0-9d3e-4f35-a84a-xxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run without performing the actual operation. If the request fails the dry run, an error is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li>false (default): sends a normal request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abcdef</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The type of the application service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LLM</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The application version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The additional configuration information required for deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;ModelStorage&quot;: &quot;oss&quot;, &quot;OssPath&quot;: &quot;oss://examplebucket/xxxx/&quot; }</p>
     */
    @NameInMap("Config")
    public java.util.Map<String, ?> config;

    /**
     * <p>The number of instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The name of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The service specifications. Valid values:</p>
     * <ul>
     * <li>llama_7b_fp16</li>
     * <li>llama_7b_int8</li>
     * <li>llama_13b_fp16</li>
     * <li>llama_7b_int8</li>
     * <li>chatglm_6b_fp16</li>
     * <li>chatglm_6b_int8</li>
     * <li>chatglm2_6b_fp16</li>
     * <li>baichuan_7b_int8</li>
     * <li>baichuan_13b_fp16</li>
     * <li>baichuan_7b_fp16</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llama_7b_fp16</p>
     */
    @NameInMap("ServiceSpec")
    public String serviceSpec;

    public static CreateAppServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppServiceRequest self = new CreateAppServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAppServiceRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public CreateAppServiceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateAppServiceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateAppServiceRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppServiceRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public CreateAppServiceRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateAppServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateAppServiceRequest setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

}
