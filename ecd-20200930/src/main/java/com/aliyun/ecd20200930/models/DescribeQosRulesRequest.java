// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeQosRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np-cxj99qb8d34vo****</p>
     */
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QosRuleName")
    public String qosRuleName;

    public static DescribeQosRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosRulesRequest self = new DescribeQosRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQosRulesRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public DescribeQosRulesRequest setQosRuleName(String qosRuleName) {
        this.qosRuleName = qosRuleName;
        return this;
    }
    public String getQosRuleName() {
        return this.qosRuleName;
    }

}
