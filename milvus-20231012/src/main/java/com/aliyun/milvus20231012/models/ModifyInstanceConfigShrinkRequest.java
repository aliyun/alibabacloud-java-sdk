// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-123xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The reason for the update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>for test</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The custom configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>dataCoord:\n  segment:\n    maxSize: 1024</p>
     */
    @NameInMap("UserConfig")
    public String userConfig;

    /**
     * <p>Submits the instance configurations to be updated as a JSON object.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static ModifyInstanceConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceConfigShrinkRequest self = new ModifyInstanceConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceConfigShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceConfigShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyInstanceConfigShrinkRequest setUserConfig(String userConfig) {
        this.userConfig = userConfig;
        return this;
    }
    public String getUserConfig() {
        return this.userConfig;
    }

    public ModifyInstanceConfigShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
