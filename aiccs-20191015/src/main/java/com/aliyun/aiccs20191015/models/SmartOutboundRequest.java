// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SmartOutboundRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Calling")
    public String calling;

    @NameInMap("Called")
    public String called;

    public static SmartOutboundRequest build(java.util.Map<String, ?> map) throws Exception {
        SmartOutboundRequest self = new SmartOutboundRequest();
        return TeaModel.build(map, self);
    }

    public SmartOutboundRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public SmartOutboundRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public SmartOutboundRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SmartOutboundRequest setCalling(String calling) {
        this.calling = calling;
        return this;
    }
    public String getCalling() {
        return this.calling;
    }

    public SmartOutboundRequest setCalled(String called) {
        this.called = called;
        return this;
    }
    public String getCalled() {
        return this.called;
    }

}
