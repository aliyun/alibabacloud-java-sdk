// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateSensitiveWordShrinkRequest extends TeaModel {
    // 用户的应用ID，在控制台创建应用时生成。包含小写字母、数字，长度为6个字符。
    @NameInMap("AppId")
    public String appId;

    @NameInMap("WordList")
    public String wordListShrink;

    public static CreateSensitiveWordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSensitiveWordShrinkRequest self = new CreateSensitiveWordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSensitiveWordShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateSensitiveWordShrinkRequest setWordListShrink(String wordListShrink) {
        this.wordListShrink = wordListShrink;
        return this;
    }
    public String getWordListShrink() {
        return this.wordListShrink;
    }

}
