// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateSensitiveWordRequest extends TeaModel {
    // 用户的应用ID，在控制台创建应用时生成。包含小写字母、数字，长度为6个字符。
    @NameInMap("AppId")
    public String appId;

    @NameInMap("WordList")
    public java.util.List<String> wordList;

    public static CreateSensitiveWordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSensitiveWordRequest self = new CreateSensitiveWordRequest();
        return TeaModel.build(map, self);
    }

    public CreateSensitiveWordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateSensitiveWordRequest setWordList(java.util.List<String> wordList) {
        this.wordList = wordList;
        return this;
    }
    public java.util.List<String> getWordList() {
        return this.wordList;
    }

}
