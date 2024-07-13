// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateScriptRequest extends TeaModel {
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
     * <p>The script.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Script")
    public Script script;

    /**
     * <p>The script ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-da7476a7679a4d4c9cede62ebe09****</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The type of the script. Valid values:</p>
     * <ul>
     * <li>BOOTSTRAP: indicates a bootstrap action of the Elastic Compute Service (ECS) instance.</li>
     * <li>NORMAL: indicates a common script.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BOOTSTRAP</p>
     */
    @NameInMap("ScriptType")
    public String scriptType;

    public static UpdateScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptRequest self = new UpdateScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScriptRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateScriptRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateScriptRequest setScript(Script script) {
        this.script = script;
        return this;
    }
    public Script getScript() {
        return this.script;
    }

    public UpdateScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public UpdateScriptRequest setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

}
