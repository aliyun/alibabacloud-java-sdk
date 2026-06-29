// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OperateInstanceShrinkRequest extends TeaModel {
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
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The operation request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperateCommand")
    public String operateCommandShrink;

    public static OperateInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateInstanceShrinkRequest self = new OperateInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OperateInstanceShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public OperateInstanceShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public OperateInstanceShrinkRequest setOperateCommandShrink(String operateCommandShrink) {
        this.operateCommandShrink = operateCommandShrink;
        return this;
    }
    public String getOperateCommandShrink() {
        return this.operateCommandShrink;
    }

}
