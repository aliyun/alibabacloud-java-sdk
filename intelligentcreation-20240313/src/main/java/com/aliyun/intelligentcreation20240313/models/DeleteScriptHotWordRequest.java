// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteScriptHotWordRequest extends TeaModel {
    @NameInMap("hotWordId")
    public String hotWordId;

    public static DeleteScriptHotWordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScriptHotWordRequest self = new DeleteScriptHotWordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScriptHotWordRequest setHotWordId(String hotWordId) {
        this.hotWordId = hotWordId;
        return this;
    }
    public String getHotWordId() {
        return this.hotWordId;
    }

}
