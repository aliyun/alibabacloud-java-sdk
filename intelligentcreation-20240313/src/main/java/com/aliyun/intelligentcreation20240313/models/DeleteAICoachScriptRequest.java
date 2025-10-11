// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteAICoachScriptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scriptId")
    public String scriptId;

    public static DeleteAICoachScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAICoachScriptRequest self = new DeleteAICoachScriptRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAICoachScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
