// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateAppServiceRequest extends TeaModel {
    /**
     * <p>The quota ID.</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The workspace ID.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The application type.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   LLM: the large language model (LLM) application</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The application version.</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The additional configurations that are required for service deployment.</p>
     */
    @NameInMap("Config")
    public java.util.Map<String, ?> config;

    /**
     * <p>The number of instances. This value must be greater than 0.</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The service specifications. Valid values:</p>
     * <br>
     * <p>*   llama\_7b_fp16</p>
     * <p>*   llama\_7b_int8</p>
     * <p>*   llama\_13b_fp16</p>
     * <p>*   llama\_7b_int8</p>
     * <p>*   chatglm\_6b_fp16</p>
     * <p>*   chatglm\_6b_int8</p>
     * <p>*   chatglm2\_6b_fp16</p>
     * <p>*   baichuan\_7b_int8</p>
     * <p>*   baichuan\_13b_fp16</p>
     * <p>*   baichuan\_7b_fp16</p>
     */
    @NameInMap("ServiceSpec")
    public String serviceSpec;

    public static UpdateAppServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppServiceRequest self = new UpdateAppServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppServiceRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public UpdateAppServiceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateAppServiceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public UpdateAppServiceRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UpdateAppServiceRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public UpdateAppServiceRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public UpdateAppServiceRequest setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

}
