// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TextTaskResult extends TeaModel {
    @NameInMap("textTask")
    public TextTask textTask;

    public static TextTaskResult build(java.util.Map<String, ?> map) throws Exception {
        TextTaskResult self = new TextTaskResult();
        return TeaModel.build(map, self);
    }

    public TextTaskResult setTextTask(TextTask textTask) {
        this.textTask = textTask;
        return this;
    }
    public TextTask getTextTask() {
        return this.textTask;
    }

}
