// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class FixDataShrinkRequest extends TeaModel {
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
     * <p>The command to rerun downstream nodes to fix data link issues. You can choose to force a rerun.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FixDataCommand")
    public String fixDataCommandShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static FixDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FixDataShrinkRequest self = new FixDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FixDataShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public FixDataShrinkRequest setFixDataCommandShrink(String fixDataCommandShrink) {
        this.fixDataCommandShrink = fixDataCommandShrink;
        return this;
    }
    public String getFixDataCommandShrink() {
        return this.fixDataCommandShrink;
    }

    public FixDataShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
