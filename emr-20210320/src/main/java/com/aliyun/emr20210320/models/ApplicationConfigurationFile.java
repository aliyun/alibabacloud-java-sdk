// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ApplicationConfigurationFile extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ConfigFileFormat")
    public String configFileFormat;

    @NameInMap("ConfigFileGroup")
    public String configFileGroup;

    @NameInMap("ConfigFileLink")
    public String configFileLink;

    @NameInMap("ConfigFileMode")
    public String configFileMode;

    @NameInMap("ConfigFileName")
    public String configFileName;

    @NameInMap("ConfigFileOwner")
    public String configFileOwner;

    @NameInMap("ConfigFilePath")
    public String configFilePath;

    @NameInMap("Description")
    public String description;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("NodeId")
    public String nodeId;

    public static ApplicationConfigurationFile build(java.util.Map<String, ?> map) throws Exception {
        ApplicationConfigurationFile self = new ApplicationConfigurationFile();
        return TeaModel.build(map, self);
    }

    public ApplicationConfigurationFile setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ApplicationConfigurationFile setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ApplicationConfigurationFile setConfigFileFormat(String configFileFormat) {
        this.configFileFormat = configFileFormat;
        return this;
    }
    public String getConfigFileFormat() {
        return this.configFileFormat;
    }

    public ApplicationConfigurationFile setConfigFileGroup(String configFileGroup) {
        this.configFileGroup = configFileGroup;
        return this;
    }
    public String getConfigFileGroup() {
        return this.configFileGroup;
    }

    public ApplicationConfigurationFile setConfigFileLink(String configFileLink) {
        this.configFileLink = configFileLink;
        return this;
    }
    public String getConfigFileLink() {
        return this.configFileLink;
    }

    public ApplicationConfigurationFile setConfigFileMode(String configFileMode) {
        this.configFileMode = configFileMode;
        return this;
    }
    public String getConfigFileMode() {
        return this.configFileMode;
    }

    public ApplicationConfigurationFile setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public ApplicationConfigurationFile setConfigFileOwner(String configFileOwner) {
        this.configFileOwner = configFileOwner;
        return this;
    }
    public String getConfigFileOwner() {
        return this.configFileOwner;
    }

    public ApplicationConfigurationFile setConfigFilePath(String configFilePath) {
        this.configFilePath = configFilePath;
        return this;
    }
    public String getConfigFilePath() {
        return this.configFilePath;
    }

    public ApplicationConfigurationFile setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApplicationConfigurationFile setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ApplicationConfigurationFile setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
