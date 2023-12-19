// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRecoverableOtsInstancesRequest extends TeaModel {
    /**
     * <p>The role name created in the RAM of the original account used for cross-account backup.</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The type of cross-account backup. Supported:</p>
     * <p>* SELF_ACCOUNT: backup of this account</p>
     * <p>* CROSS_ACCOUNT: Cross-account backup</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The Alibaba Cloud Uid of the original account used to cross accounts.</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    public static DescribeRecoverableOtsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoverableOtsInstancesRequest self = new DescribeRecoverableOtsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecoverableOtsInstancesRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public DescribeRecoverableOtsInstancesRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public DescribeRecoverableOtsInstancesRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

}
