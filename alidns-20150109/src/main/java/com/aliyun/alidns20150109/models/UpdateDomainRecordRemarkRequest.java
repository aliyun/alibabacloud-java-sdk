// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordRemarkRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static UpdateDomainRecordRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordRemarkRequest self = new UpdateDomainRecordRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRecordRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDomainRecordRemarkRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateDomainRecordRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateDomainRecordRemarkRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
