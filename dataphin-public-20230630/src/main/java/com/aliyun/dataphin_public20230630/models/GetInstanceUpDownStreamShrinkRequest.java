// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceUpDownStreamShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DownStreamDepth")
    public Integer downStreamDepth;

    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceIdShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001121</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
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
