// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForGenerateDomainCertificateRequest extends TeaModel {
    /**
     * <p>The domain names.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainNames")
    public java.util.List<String> domainNames;

    /**
     * <p>The language of the error message to return if the request fails. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForGenerateDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForGenerateDomainCertificateRequest self = new SaveBatchTaskForGenerateDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForGenerateDomainCertificateRequest setDomainNames(java.util.List<String> domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public java.util.List<String> getDomainNames() {
        return this.domainNames;
    }

    public SaveBatchTaskForGenerateDomainCertificateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForGenerateDomainCertificateRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
