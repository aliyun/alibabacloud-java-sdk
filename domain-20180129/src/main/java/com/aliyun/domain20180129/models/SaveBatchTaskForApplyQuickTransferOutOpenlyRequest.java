// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForApplyQuickTransferOutOpenlyRequest extends TeaModel {
    /**
     * <p>The domain names to transfer out.</p>
     */
    @NameInMap("DomainNames")
    public java.util.List<String> domainNames;

    /**
     * <p>The language of returned error messages. Valid values: zh (Chinese) and en (English). Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The IP address of the user\&quot;s client.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
