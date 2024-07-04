// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfigsRequest extends TeaModel {
    /**
     * <p>The application configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLUSTER</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<UpdateApplicationConfig> applicationConfigs;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-e6a9d46e9267****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The operation performed on configuration items. Valid values:</p>
     * <ul>
     * <li>ADD</li>
     * <li>UPDATE</li>
     * <li>DELETE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("ConfigAction")
    public String configAction;

    /**
     * <p>The operation scope. Valid values:</p>
     * <ul>
     * <li>CLUSTER</li>
     * <li>NODE_GROUP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLUSTER</p>
     */
    @NameInMap("ConfigScope")
    public String configScope;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>更新YARN内存配置。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The node group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1cudc25w2bfwl5****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>Specifies whether to refresh the configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RefreshConfig")
    public Boolean refreshConfig;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

    public UpdateApplicationConfigsRequest setRefreshConfig(Boolean refreshConfig) {
        this.refreshConfig = refreshConfig;
        return this;
    }
    public Boolean getRefreshConfig() {
        return this.refreshConfig;
    }

    public UpdateApplicationConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
