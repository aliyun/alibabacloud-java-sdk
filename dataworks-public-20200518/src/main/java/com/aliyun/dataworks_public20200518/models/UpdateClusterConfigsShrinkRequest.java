// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateClusterConfigsShrinkRequest extends TeaModel {
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
    public String configValuesShrink;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5678</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static UpdateClusterConfigsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterConfigsShrinkRequest self = new UpdateClusterConfigsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterConfigsShrinkRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterConfigsShrinkRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public UpdateClusterConfigsShrinkRequest setConfigValuesShrink(String configValuesShrink) {
        this.configValuesShrink = configValuesShrink;
        return this;
    }
    public String getConfigValuesShrink() {
        return this.configValuesShrink;
    }

    public UpdateClusterConfigsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
