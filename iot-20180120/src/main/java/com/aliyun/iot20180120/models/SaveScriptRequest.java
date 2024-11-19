// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SaveScriptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-n8t***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("ParserId")
    public Long parserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>var data = payload(&quot;json&quot;)</p>
     */
    @NameInMap("ScriptDraft")
    public String scriptDraft;

    public static SaveScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveScriptRequest self = new SaveScriptRequest();
        return TeaModel.build(map, self);
    }

    public SaveScriptRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SaveScriptRequest setParserId(Long parserId) {
        this.parserId = parserId;
        return this;
    }
    public Long getParserId() {
        return this.parserId;
    }

    public SaveScriptRequest setScriptDraft(String scriptDraft) {
        this.scriptDraft = scriptDraft;
        return this;
    }
    public String getScriptDraft() {
        return this.scriptDraft;
    }

}
