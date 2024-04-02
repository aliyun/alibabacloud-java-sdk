// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateAuditCallbackResponseBody extends TeaModel {
    @NameInMap("CallbackSuggestions")
    public java.util.List<String> callbackSuggestions;

    @NameInMap("CallbackTypes")
    public java.util.List<String> callbackTypes;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CryptType")
    public String cryptType;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Seed")
    public String seed;

    @NameInMap("Url")
    public String url;

    public static CreateAuditCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuditCallbackResponseBody self = new CreateAuditCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuditCallbackResponseBody setCallbackSuggestions(java.util.List<String> callbackSuggestions) {
        this.callbackSuggestions = callbackSuggestions;
        return this;
    }
    public java.util.List<String> getCallbackSuggestions() {
        return this.callbackSuggestions;
    }

    public CreateAuditCallbackResponseBody setCallbackTypes(java.util.List<String> callbackTypes) {
        this.callbackTypes = callbackTypes;
        return this;
    }
    public java.util.List<String> getCallbackTypes() {
        return this.callbackTypes;
    }

    public CreateAuditCallbackResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateAuditCallbackResponseBody setCryptType(String cryptType) {
        this.cryptType = cryptType;
        return this;
    }
    public String getCryptType() {
        return this.cryptType;
    }

    public CreateAuditCallbackResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateAuditCallbackResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public CreateAuditCallbackResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAuditCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAuditCallbackResponseBody setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

    public CreateAuditCallbackResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
