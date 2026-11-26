// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class UpdateScriptHotWordRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("hotWord")
    public String hotWord;

    @NameInMap("hotWordId")
    public String hotWordId;

    public static UpdateScriptHotWordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptHotWordRequest self = new UpdateScriptHotWordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScriptHotWordRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateScriptHotWordRequest setHotWord(String hotWord) {
        this.hotWord = hotWord;
        return this;
    }
    public String getHotWord() {
        return this.hotWord;
    }

    public UpdateScriptHotWordRequest setHotWordId(String hotWordId) {
        this.hotWordId = hotWordId;
        return this;
    }
    public String getHotWordId() {
        return this.hotWordId;
    }

}
