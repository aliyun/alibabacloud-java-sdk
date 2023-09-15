// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForApplyQuickTransferOutOpenlyRequest extends TeaModel {
    @NameInMap("DomainNames")
    public java.util.List<String> domainNames;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForApplyQuickTransferOutOpenlyRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForApplyQuickTransferOutOpenlyRequest self = new SaveBatchTaskForApplyQuickTransferOutOpenlyRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForApplyQuickTransferOutOpenlyRequest setDomainNames(java.util.List<String> domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public java.util.List<String> getDomainNames() {
        return this.domainNames;
    }

    public SaveBatchTaskForApplyQuickTransferOutOpenlyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForApplyQuickTransferOutOpenlyRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
