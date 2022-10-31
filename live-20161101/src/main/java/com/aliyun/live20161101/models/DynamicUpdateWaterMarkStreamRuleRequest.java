// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DynamicUpdateWaterMarkStreamRuleRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Stream")
    public String stream;

    @NameInMap("TemplateId")
    public String templateId;

    public static DynamicUpdateWaterMarkStreamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DynamicUpdateWaterMarkStreamRuleRequest self = new DynamicUpdateWaterMarkStreamRuleRequest();
        return TeaModel.build(map, self);
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

    public DynamicUpdateWaterMarkStreamRuleRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
