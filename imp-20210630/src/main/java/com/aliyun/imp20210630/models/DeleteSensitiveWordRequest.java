// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteSensitiveWordRequest extends TeaModel {
    // 弹幕发送者的用户ID，最大长度不超过32个字节。
    @NameInMap("AppId")
    public String appId;

    @NameInMap("WordList")
    public java.util.List<String> wordList;

    public static DeleteSensitiveWordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSensitiveWordRequest self = new DeleteSensitiveWordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSensitiveWordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteSensitiveWordRequest setWordList(java.util.List<String> wordList) {
        this.wordList = wordList;
        return this;
    }
    public java.util.List<String> getWordList() {
        return this.wordList;
    }

}
