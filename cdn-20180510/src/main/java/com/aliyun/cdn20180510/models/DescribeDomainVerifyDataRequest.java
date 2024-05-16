// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainVerifyDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to enable the global resource plan.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   off</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   on</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
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
