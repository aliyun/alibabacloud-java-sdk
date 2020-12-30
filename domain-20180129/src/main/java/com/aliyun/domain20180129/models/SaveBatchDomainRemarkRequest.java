// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchDomainRemarkRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchDomainRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchDomainRemarkRequest self = new SaveBatchDomainRemarkRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchDomainRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchDomainRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SaveBatchDomainRemarkRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public SaveBatchDomainRemarkRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
