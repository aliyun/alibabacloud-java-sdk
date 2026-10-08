// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForAssociatingEnsRequest extends TeaModel {
    /**
     * <p>ENS address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0x1234567890123456789012345678901234567890</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>Domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.luxe</p>
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
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForAssociatingEnsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForAssociatingEnsRequest self = new SaveSingleTaskForAssociatingEnsRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForAssociatingEnsRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SaveSingleTaskForAssociatingEnsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForAssociatingEnsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForAssociatingEnsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
