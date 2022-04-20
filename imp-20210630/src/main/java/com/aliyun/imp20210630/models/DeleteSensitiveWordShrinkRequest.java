// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteSensitiveWordShrinkRequest extends TeaModel {
    // 弹幕发送者的用户ID，最大长度不超过32个字节。
    @NameInMap("AppId")
    public String appId;

    @NameInMap("WordList")
    public String wordListShrink;

    public static DeleteSensitiveWordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSensitiveWordShrinkRequest self = new DeleteSensitiveWordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSensitiveWordShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteSensitiveWordShrinkRequest setWordListShrink(String wordListShrink) {
        this.wordListShrink = wordListShrink;
        return this;
    }
    public String getWordListShrink() {
        return this.wordListShrink;
    }

}
