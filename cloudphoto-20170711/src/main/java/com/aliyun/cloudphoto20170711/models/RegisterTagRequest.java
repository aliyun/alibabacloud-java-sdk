// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RegisterTagRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("TagKey")
    public String tagKey;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Text")
    public String text;

    public static RegisterTagRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterTagRequest self = new RegisterTagRequest();
        return TeaModel.build(map, self);
    }

    public RegisterTagRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public RegisterTagRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public RegisterTagRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RegisterTagRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
