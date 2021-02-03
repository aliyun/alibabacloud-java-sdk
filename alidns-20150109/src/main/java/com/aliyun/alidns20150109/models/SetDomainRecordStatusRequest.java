// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainRecordStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static SetDomainRecordStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRecordStatusRequest self = new SetDomainRecordStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainRecordStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetDomainRecordStatusRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SetDomainRecordStatusRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public SetDomainRecordStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
