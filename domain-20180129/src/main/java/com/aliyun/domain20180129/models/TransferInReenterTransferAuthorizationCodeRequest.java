// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class TransferInReenterTransferAuthorizationCodeRequest extends TeaModel {
    /**
     * <p>Domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Language of the error message returned by the API. Valid values:</p>
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
     * <p>Transfer password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testCode</p>
     */
    @NameInMap("TransferAuthorizationCode")
    public String transferAuthorizationCode;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static TransferInReenterTransferAuthorizationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferInReenterTransferAuthorizationCodeRequest self = new TransferInReenterTransferAuthorizationCodeRequest();
        return TeaModel.build(map, self);
    }

    public TransferInReenterTransferAuthorizationCodeRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public TransferInReenterTransferAuthorizationCodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TransferInReenterTransferAuthorizationCodeRequest setTransferAuthorizationCode(String transferAuthorizationCode) {
        this.transferAuthorizationCode = transferAuthorizationCode;
        return this;
    }
    public String getTransferAuthorizationCode() {
        return this.transferAuthorizationCode;
    }

    public TransferInReenterTransferAuthorizationCodeRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
