// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfigsRequest extends TeaModel {
    /**
     * <p>应用配置列表。</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<UpdateApplicationConfig> applicationConfigs;

    /**
     * <p>应用名称。</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>配置项操作。取值范围：</p>
     * <p>- ADD：添加。</p>
     * <p>- DELETE：删除。</p>
     * <p>- UPDATE：更新。</p>
     */
    @NameInMap("ConfigAction")
    public String configAction;

    /**
     * <p>配置操作范围。取值范围：</p>
     * <p>- CLUSTER：集群范围。</p>
     * <p>- NODE_GROUP：节点组范围。</p>
     */
    @NameInMap("ConfigScope")
    public String configScope;

    /**
     * <p>本次更新操作描述。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>节点组ID。</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>节点ID。</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateApplicationConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationConfigsRequest self = new UpdateApplicationConfigsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationConfigsRequest setApplicationConfigs(java.util.List<UpdateApplicationConfig> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<UpdateApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public UpdateApplicationConfigsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateApplicationConfigsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateApplicationConfigsRequest setConfigAction(String configAction) {
        this.configAction = configAction;
        return this;
    }
    public String getConfigAction() {
        return this.configAction;
    }

    public UpdateApplicationConfigsRequest setConfigScope(String configScope) {
        this.configScope = configScope;
        return this;
    }
    public String getConfigScope() {
        return this.configScope;
    }

    public UpdateApplicationConfigsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationConfigsRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public UpdateApplicationConfigsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateApplicationConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
