// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class AddScriptHotWordRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("hotWord")
    public String hotWord;

    @NameInMap("scriptRecordId")
    public String scriptRecordId;

    public static AddScriptHotWordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddScriptHotWordRequest self = new AddScriptHotWordRequest();
        return TeaModel.build(map, self);
    }

    public AddScriptHotWordRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddScriptHotWordRequest setHotWord(String hotWord) {
        this.hotWord = hotWord;
        return this;
    }
    public String getHotWord() {
        return this.hotWord;
    }

    public AddScriptHotWordRequest setScriptRecordId(String scriptRecordId) {
        this.scriptRecordId = scriptRecordId;
        return this;
    }
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

}
