// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainVerifyDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.yourdomain.com">www.yourdomain.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to enable the global resource plan.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>off</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("GlobalResourcePlan")
    public String globalResourcePlan;

    public static DescribeDomainVerifyDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainVerifyDataRequest self = new DescribeDomainVerifyDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainVerifyDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainVerifyDataRequest setGlobalResourcePlan(String globalResourcePlan) {
        this.globalResourcePlan = globalResourcePlan;
        return this;
    }
    public String getGlobalResourcePlan() {
        return this.globalResourcePlan;
    }

}
