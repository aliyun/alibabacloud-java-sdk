// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BuildAICoachScriptRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx/data.json">https://xxx/data.json</a></p>
     */
    @NameInMap("scriptJsonUrl")
    public String scriptJsonUrl;

    public static BuildAICoachScriptRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        BuildAICoachScriptRecordRequest self = new BuildAICoachScriptRecordRequest();
        return TeaModel.build(map, self);
    }

    public BuildAICoachScriptRecordRequest setScriptJsonUrl(String scriptJsonUrl) {
        this.scriptJsonUrl = scriptJsonUrl;
        return this;
    }
    public String getScriptJsonUrl() {
        return this.scriptJsonUrl;
    }

}
