// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ConfirmTransferInEmailRequest extends TeaModel {
    /**
     * <p>Domain name list</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc.com</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    /**
     * <p>Mailbox</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@test.com">test@test.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Language of the error message returned by the API. Valid enumeration values: zh (Chinese); en (English). Default value is en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User IP</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ConfirmTransferInEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmTransferInEmailRequest self = new ConfirmTransferInEmailRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmTransferInEmailRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public ConfirmTransferInEmailRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ConfirmTransferInEmailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ConfirmTransferInEmailRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
