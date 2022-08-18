// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainRecordRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DeleteDomainRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainRecordRequest self = new DeleteDomainRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDomainRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public DeleteDomainRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
