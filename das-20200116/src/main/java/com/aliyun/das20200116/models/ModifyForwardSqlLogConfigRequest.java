// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyForwardSqlLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable.</li>
     * <li><strong>false</strong>: Disable.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The service type. Valid values:
     * DAS_OPS: enables TOP KEY delivery.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAS_OPS</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The task source. Valid values:</p>
     * <ul>
     * <li>TOP_KEY: enables TOP KEY delivery.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TOP_KEY</p>
     */
    @NameInMap("Source")
    public String source;

    public static ModifyForwardSqlLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardSqlLogConfigRequest self = new ModifyForwardSqlLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyForwardSqlLogConfigRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyForwardSqlLogConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyForwardSqlLogConfigRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ModifyForwardSqlLogConfigRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
