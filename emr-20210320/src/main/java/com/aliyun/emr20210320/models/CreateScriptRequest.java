// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateScriptRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The script type. Valid values:</p>
     * <ul>
     * <li><p>BOOTSTRAP: an ECS instance bootstrap script.</p>
     * </li>
     * <li><p>NORMAL: a normal script.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BOOTSTRAP</p>
     */
    @NameInMap("ScriptType")
    public String scriptType;

    /**
     * <p>The list of scripts.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scripts")
    public java.util.List<Script> scripts;

    /**
     * <p>The timeout period for manually executing the script. This parameter is not supported for bootstrap scripts.</p>
     */
    @NameInMap("TimeoutSecs")
    public String timeoutSecs;

    public static CreateScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptRequest self = new CreateScriptRequest();
        return TeaModel.build(map, self);
    }

    public CreateScriptRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateScriptRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScriptRequest setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

    public CreateScriptRequest setScripts(java.util.List<Script> scripts) {
        this.scripts = scripts;
        return this;
    }
    public java.util.List<Script> getScripts() {
        return this.scripts;
    }

    public CreateScriptRequest setTimeoutSecs(String timeoutSecs) {
        this.timeoutSecs = timeoutSecs;
        return this;
    }
    public String getTimeoutSecs() {
        return this.timeoutSecs;
    }

}
