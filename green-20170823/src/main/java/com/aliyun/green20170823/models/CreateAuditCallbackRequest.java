// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateAuditCallbackRequest extends TeaModel {
    @NameInMap("CallbackSuggestions")
    public String callbackSuggestions;

    @NameInMap("CallbackTypes")
    public String callbackTypes;

    @NameInMap("CryptType")
    public String cryptType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Url")
    public String url;

    public static CreateAuditCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuditCallbackRequest self = new CreateAuditCallbackRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuditCallbackRequest setCallbackSuggestions(String callbackSuggestions) {
        this.callbackSuggestions = callbackSuggestions;
        return this;
    }
    public String getCallbackSuggestions() {
        return this.callbackSuggestions;
    }

    public CreateAuditCallbackRequest setCallbackTypes(String callbackTypes) {
        this.callbackTypes = callbackTypes;
        return this;
    }
    public String getCallbackTypes() {
        return this.callbackTypes;
    }

    public CreateAuditCallbackRequest setCryptType(String cryptType) {
        this.cryptType = cryptType;
        return this;
    }
    public String getCryptType() {
        return this.cryptType;
    }

    public CreateAuditCallbackRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAuditCallbackRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
