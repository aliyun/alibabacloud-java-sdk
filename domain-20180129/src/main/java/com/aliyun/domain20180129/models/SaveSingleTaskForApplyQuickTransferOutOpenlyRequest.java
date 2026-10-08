// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForApplyQuickTransferOutOpenlyRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the returned error message. Valid values: zh (Chinese) and en (English). The default is en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The user\&quot;s client IP.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForApplyQuickTransferOutOpenlyRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForApplyQuickTransferOutOpenlyRequest self = new SaveSingleTaskForApplyQuickTransferOutOpenlyRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForApplyQuickTransferOutOpenlyRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForApplyQuickTransferOutOpenlyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForApplyQuickTransferOutOpenlyRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
