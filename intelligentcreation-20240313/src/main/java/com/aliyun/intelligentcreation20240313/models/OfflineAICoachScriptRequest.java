// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class OfflineAICoachScriptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scriptId")
    public String scriptId;

    public static OfflineAICoachScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineAICoachScriptRequest self = new OfflineAICoachScriptRequest();
        return TeaModel.build(map, self);
    }

    public OfflineAICoachScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
