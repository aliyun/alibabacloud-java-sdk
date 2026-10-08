// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckTransferInFeasibilityRequest extends TeaModel {
    /**
     * <p>The domain name to be validated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the error message returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The transfer-in password for the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TransferAuthorizationCode")
    public String transferAuthorizationCode;

    /**
     * <p>The user IP address. You can set it to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CheckTransferInFeasibilityRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTransferInFeasibilityRequest self = new CheckTransferInFeasibilityRequest();
        return TeaModel.build(map, self);
    }

    public CheckTransferInFeasibilityRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CheckTransferInFeasibilityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckTransferInFeasibilityRequest setTransferAuthorizationCode(String transferAuthorizationCode) {
        this.transferAuthorizationCode = transferAuthorizationCode;
        return this;
    }
    public String getTransferAuthorizationCode() {
        return this.transferAuthorizationCode;
    }

    public CheckTransferInFeasibilityRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
