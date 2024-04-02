// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateWebsiteInstanceKeyUrlRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Urls")
    public String urls;

    public static UpdateWebsiteInstanceKeyUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebsiteInstanceKeyUrlRequest self = new UpdateWebsiteInstanceKeyUrlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebsiteInstanceKeyUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWebsiteInstanceKeyUrlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateWebsiteInstanceKeyUrlRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateWebsiteInstanceKeyUrlRequest setUrls(String urls) {
        this.urls = urls;
        return this;
    }
    public String getUrls() {
        return this.urls;
    }

}
