// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclWhitelistResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DomainGroupUseDns")
    public Boolean domainGroupUseDns;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NatDomainGroupUseDns")
    public Boolean natDomainGroupUseDns;

    /**
     * <strong>example:</strong>
     * <p>7D45133B-DBC0-506B-9DF9-AB0735D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportMessageType")
    public Boolean supportMessageType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VpcDomainGroupUseDns")
    public Boolean vpcDomainGroupUseDns;

    public static DescribeAclWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclWhitelistResponseBody self = new DescribeAclWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclWhitelistResponseBody setDomainGroupUseDns(Boolean domainGroupUseDns) {
        this.domainGroupUseDns = domainGroupUseDns;
        return this;
    }
    public Boolean getDomainGroupUseDns() {
        return this.domainGroupUseDns;
    }

    public DescribeAclWhitelistResponseBody setNatDomainGroupUseDns(Boolean natDomainGroupUseDns) {
        this.natDomainGroupUseDns = natDomainGroupUseDns;
        return this;
    }
    public Boolean getNatDomainGroupUseDns() {
        return this.natDomainGroupUseDns;
    }

    public DescribeAclWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAclWhitelistResponseBody setSupportMessageType(Boolean supportMessageType) {
        this.supportMessageType = supportMessageType;
        return this;
    }
    public Boolean getSupportMessageType() {
        return this.supportMessageType;
    }

    public DescribeAclWhitelistResponseBody setVpcDomainGroupUseDns(Boolean vpcDomainGroupUseDns) {
        this.vpcDomainGroupUseDns = vpcDomainGroupUseDns;
        return this;
    }
    public Boolean getVpcDomainGroupUseDns() {
        return this.vpcDomainGroupUseDns;
    }

}
