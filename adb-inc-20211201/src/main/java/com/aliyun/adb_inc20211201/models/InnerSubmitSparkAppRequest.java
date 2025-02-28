// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerSubmitSparkAppRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Console</p>
     */
    @NameInMap("AgentSource")
    public String agentSource;

    /**
     * <strong>example:</strong>
     * <p>1.091</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <strong>example:</strong>
     * <p>TestApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("TemplateFileId")
    public Long templateFileId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TrustedCallerParentId")
    public Long trustedCallerParentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TrustedCallerType")
    public String trustedCallerType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TrustedCallerUid")
    public Long trustedCallerUid;

    public static InnerSubmitSparkAppRequest build(java.util.Map<String, ?> map) throws Exception {
        InnerSubmitSparkAppRequest self = new InnerSubmitSparkAppRequest();
        return TeaModel.build(map, self);
    }

    public InnerSubmitSparkAppRequest setAgentSource(String agentSource) {
        this.agentSource = agentSource;
        return this;
    }
    public String getAgentSource() {
        return this.agentSource;
    }

    public InnerSubmitSparkAppRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public InnerSubmitSparkAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public InnerSubmitSparkAppRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public InnerSubmitSparkAppRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public InnerSubmitSparkAppRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InnerSubmitSparkAppRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public InnerSubmitSparkAppRequest setTemplateFileId(Long templateFileId) {
        this.templateFileId = templateFileId;
        return this;
    }
    public Long getTemplateFileId() {
        return this.templateFileId;
    }

    public InnerSubmitSparkAppRequest setTrustedCallerParentId(Long trustedCallerParentId) {
        this.trustedCallerParentId = trustedCallerParentId;
        return this;
    }
    public Long getTrustedCallerParentId() {
        return this.trustedCallerParentId;
    }

    public InnerSubmitSparkAppRequest setTrustedCallerType(String trustedCallerType) {
        this.trustedCallerType = trustedCallerType;
        return this;
    }
    public String getTrustedCallerType() {
        return this.trustedCallerType;
    }

    public InnerSubmitSparkAppRequest setTrustedCallerUid(Long trustedCallerUid) {
        this.trustedCallerUid = trustedCallerUid;
        return this;
    }
    public Long getTrustedCallerUid() {
        return this.trustedCallerUid;
    }

}
