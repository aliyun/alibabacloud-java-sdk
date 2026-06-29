// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceUpDownStreamShrinkRequest extends TeaModel {
    /**
     * <p>The number of downstream node levels. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DownStreamDepth")
    public Integer downStreamDepth;

    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: development environment. </li>
     * <li>PROD (default): production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The center node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceIdShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001121</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The number of upstream node levels. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UpStreamDepth")
    public Integer upStreamDepth;

    public static GetInstanceUpDownStreamShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUpDownStreamShrinkRequest self = new GetInstanceUpDownStreamShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceUpDownStreamShrinkRequest setDownStreamDepth(Integer downStreamDepth) {
        this.downStreamDepth = downStreamDepth;
        return this;
    }
    public Integer getDownStreamDepth() {
        return this.downStreamDepth;
    }

    public GetInstanceUpDownStreamShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetInstanceUpDownStreamShrinkRequest setInstanceIdShrink(String instanceIdShrink) {
        this.instanceIdShrink = instanceIdShrink;
        return this;
    }
    public String getInstanceIdShrink() {
        return this.instanceIdShrink;
    }

    public GetInstanceUpDownStreamShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetInstanceUpDownStreamShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetInstanceUpDownStreamShrinkRequest setUpStreamDepth(Integer upStreamDepth) {
        this.upStreamDepth = upStreamDepth;
        return this;
    }
    public Integer getUpStreamDepth() {
        return this.upStreamDepth;
    }

}
