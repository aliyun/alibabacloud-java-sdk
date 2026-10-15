// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigRequest extends TeaModel {
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
    public ModifyInstanceConfigRequestBody body;

    public static ModifyInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceConfigRequest self = new ModifyInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceConfigRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyInstanceConfigRequest setUserConfig(String userConfig) {
        this.userConfig = userConfig;
        return this;
    }
    public String getUserConfig() {
        return this.userConfig;
    }

    public ModifyInstanceConfigRequest setBody(ModifyInstanceConfigRequestBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceConfigRequestBody getBody() {
        return this.body;
    }

    public static class ModifyInstanceConfigRequestBody extends TeaModel {
        /**
         * <p>The configuration content to write to the instance, formatted as a YAML string.</p>
         * 
         * <strong>example:</strong>
         * <p>dataCoord:\n  segment:\n    maxSize: 1024</p>
         */
        @NameInMap("userConfig")
        public String userConfig;

        public static ModifyInstanceConfigRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceConfigRequestBody self = new ModifyInstanceConfigRequestBody();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceConfigRequestBody setUserConfig(String userConfig) {
            this.userConfig = userConfig;
            return this;
        }
        public String getUserConfig() {
            return this.userConfig;
        }

    }

}
