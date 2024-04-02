// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateWebsiteInstanceStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Status")
    public String status;

    public static UpdateWebsiteInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebsiteInstanceStatusRequest self = new UpdateWebsiteInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebsiteInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWebsiteInstanceStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateWebsiteInstanceStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateWebsiteInstanceStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
