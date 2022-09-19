// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SubmitSparkAppRequest extends TeaModel {
    @NameInMap("AgentSource")
    public String agentSource;

    @NameInMap("AgentVersion")
    public String agentVersion;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Data")
    public String data;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("TemplateFileId")
    public Long templateFileId;

    public static SubmitSparkAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkAppRequest self = new SubmitSparkAppRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSparkAppRequest setAgentSource(String agentSource) {
        this.agentSource = agentSource;
        return this;
    }
    public String getAgentSource() {
        return this.agentSource;
    }

    public SubmitSparkAppRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public SubmitSparkAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SubmitSparkAppRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SubmitSparkAppRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SubmitSparkAppRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitSparkAppRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public SubmitSparkAppRequest setTemplateFileId(Long templateFileId) {
        this.templateFileId = templateFileId;
        return this;
    }
    public Long getTemplateFileId() {
        return this.templateFileId;
    }

}
