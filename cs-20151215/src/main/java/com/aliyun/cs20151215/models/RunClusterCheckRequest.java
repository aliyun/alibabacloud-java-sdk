// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunClusterCheckRequest extends TeaModel {
    /**
     * <p>The check options.</p>
     */
    @NameInMap("options")
    public java.util.Map<String, String> options;

    /**
     * <p>The check target.</p>
     * <p>If the type parameter is set to NodePoolUpgrade, this parameter must be set to the node pool ID.</p>
     * <p>If other check types are selected, this parameter does not need to be set.</p>
     * 
     * <strong>example:</strong>
     * <p>np1f6779297c4444a3a1cdd29be8******</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <p>The check type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NodePoolUpgrade</p>
     */
    @NameInMap("type")
    public String type;

    public static RunClusterCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClusterCheckRequest self = new RunClusterCheckRequest();
        return TeaModel.build(map, self);
    }

    public RunClusterCheckRequest setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public RunClusterCheckRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public RunClusterCheckRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
