// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstancePolicyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VisualLossless")
    public String visualLossless;

    @NameInMap("OptimizeFor3d")
    public String optimizeFor3d;

    @NameInMap("AsyncMode")
    public Boolean asyncMode;

    public static SetInstancePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstancePolicyRequest self = new SetInstancePolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetInstancePolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetInstancePolicyRequest setVisualLossless(String visualLossless) {
        this.visualLossless = visualLossless;
        return this;
    }
    public String getVisualLossless() {
        return this.visualLossless;
    }

    public SetInstancePolicyRequest setOptimizeFor3d(String optimizeFor3d) {
        this.optimizeFor3d = optimizeFor3d;
        return this;
    }
    public String getOptimizeFor3d() {
        return this.optimizeFor3d;
    }

    public SetInstancePolicyRequest setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
        return this;
    }
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

}
