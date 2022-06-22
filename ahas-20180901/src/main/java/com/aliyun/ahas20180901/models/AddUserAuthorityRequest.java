// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddUserAuthorityRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AuthItems")
    public String authItems;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static AddUserAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserAuthorityRequest self = new AddUserAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public AddUserAuthorityRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public AddUserAuthorityRequest setAuthItems(String authItems) {
        this.authItems = authItems;
        return this;
    }
    public String getAuthItems() {
        return this.authItems;
    }

    public AddUserAuthorityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddUserAuthorityRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
