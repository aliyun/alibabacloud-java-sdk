// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnWafDomainConfigsRequest extends TeaModel {
    /**
     * <p>Specifies the header that records the IP address to be obtained. If the default header is selected, the value of this parameter is empty. If a custom header is selected, the value of this parameter is the value specified by the user. Separate multiple values with commas (,). You can specify a maximum of five values.</p>
     * 
     * <strong>example:</strong>
     * <p>X-Forwarded-For</p>
     */
    @NameInMap("ClientIpTag")
    public String clientIpTag;

    /**
     * <p>The protection status of the domain name. Valid values: on, off, and empty string.</p>
     * <ul>
     * <li>When you add a domain name, the value of this parameter is <strong>on</strong>, and the value of ClientIpTag takes effect, which is empty if the default header is selected and is the value specified by the user if a custom header is selected.</li>
     * <li>When you delete a domain name, the value of this parameter is <strong>off</strong>, and the value of ClientIpTag does not take effect.</li>
     * <li>When you only modify the value of ClientIpTag, the value of DefenseStatus is an empty string.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("DefenseStatus")
    public String defenseStatus;

    /**
     * <p>The protected domain names for which you want to change the protection status. You can specify up to 50 domain names. Separate multiple domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example2.com</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    public static BatchSetDcdnWafDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnWafDomainConfigsRequest self = new BatchSetDcdnWafDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnWafDomainConfigsRequest setClientIpTag(String clientIpTag) {
        this.clientIpTag = clientIpTag;
        return this;
    }
    public String getClientIpTag() {
        return this.clientIpTag;
    }

    public BatchSetDcdnWafDomainConfigsRequest setDefenseStatus(String defenseStatus) {
        this.defenseStatus = defenseStatus;
        return this;
    }
    public String getDefenseStatus() {
        return this.defenseStatus;
    }

    public BatchSetDcdnWafDomainConfigsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

}
