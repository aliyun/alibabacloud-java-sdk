// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateClusterConfigsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster associated with DataWorks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ClusterId")
    public Long clusterId;

    /**
     * <p>The configuration type of the cluster. Valid values:</p>
     * <ul>
     * <li>SPARK_CONF: SPARK parameters</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPARK_CONF</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The configuration information of the cluster submodule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigValues")
    public java.util.List<ClusterConfig> configValues;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5678</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static UpdateClusterConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterConfigsRequest self = new UpdateClusterConfigsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterConfigsRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterConfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public UpdateClusterConfigsRequest setConfigValues(java.util.List<ClusterConfig> configValues) {
        this.configValues = configValues;
        return this;
    }
    public java.util.List<ClusterConfig> getConfigValues() {
        return this.configValues;
    }

    public UpdateClusterConfigsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
