// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class TransferDomainRequest extends TeaModel {
    /**
     * <p>The domain names. Separate multiple domain names with commas (,). Only domain names registered with Alibaba Cloud are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1.com,test2.com</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The description of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>test domain transfer</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The destination user ID. The domain names and their Domain Name System (DNS) records are transferred to the destination user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("TargetUserId")
    public Long targetUserId;

    public static TransferDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferDomainRequest self = new TransferDomainRequest();
        return TeaModel.build(map, self);
    }

    public TransferDomainRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public TransferDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TransferDomainRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public TransferDomainRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

}
