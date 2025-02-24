// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachScriptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scriptRecordId")
    public String scriptRecordId;

    public static GetAICoachScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachScriptRequest self = new GetAICoachScriptRequest();
        return TeaModel.build(map, self);
    }

    public GetAICoachScriptRequest setScriptRecordId(String scriptRecordId) {
        this.scriptRecordId = scriptRecordId;
        return this;
    }
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

}
