// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitOperationAuditInfoRequest extends TeaModel {
    /**
     * <p>The information to be reviewed. The displayed information varies by business type.</p>
     * 
     * <strong>example:</strong>
     * <p>个人 {&quot;regType&quot;:1,&quot;registrantName&quot;:&quot;张三&quot;,&quot;registrantNo&quot;:&quot;2201919190**&quot;,&quot;telephone&quot;:&quot;1390123****&quot;,&quot;account&quot;:&quot;<a href="mailto:zhangsan@alimail.com">zhangsan@alimail.com</a>&quot;,&quot;reason&quot;:1,&quot;remark&quot;:&quot;账号丢失&quot;} 企业 {&quot;regType&quot;:2,&quot;registrantName&quot;:&quot;华大信通&quot;,&quot;operatorName&quot;:&quot;王武&quot;,&quot;operatorNo&quot;:&quot;2201811987101901**&quot;,      &quot;operatorPhone&quot;:&quot;1390123****&quot;,&quot;account&quot;:&quot;<a href="mailto:wangwu@alimail.com">wangwu@alimail.com</a>&quot;,&quot;companyNo&quot;:&quot;91361100MA35N6****&quot;,&quot;reason&quot;:2,&quot;remark&quot;:&quot;账号丢失&quot;}</p>
     */
    @NameInMap("AuditInfo")
    public String auditInfo;

    /**
     * <p>The business type. Valid values:</p>
     * <p><strong>1</strong>: Transfer a domain name offline, that is, transfer the domain name from the current Alibaba Cloud account to another Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    /**
     * <p>The domain name. You can specify one or more domain names, separated by commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx.com,yyyy.cn</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The review ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the error message returned by the API. Valid values:</p>
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

    public static SubmitOperationAuditInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationAuditInfoRequest self = new SubmitOperationAuditInfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitOperationAuditInfoRequest setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public String getAuditInfo() {
        return this.auditInfo;
    }

    public SubmitOperationAuditInfoRequest setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

    public SubmitOperationAuditInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SubmitOperationAuditInfoRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SubmitOperationAuditInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
