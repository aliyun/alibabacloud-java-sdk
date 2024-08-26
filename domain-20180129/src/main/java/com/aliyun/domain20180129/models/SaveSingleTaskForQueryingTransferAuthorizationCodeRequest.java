// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForQueryingTransferAuthorizationCodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForQueryingTransferAuthorizationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForQueryingTransferAuthorizationCodeRequest self = new SaveSingleTaskForQueryingTransferAuthorizationCodeRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
