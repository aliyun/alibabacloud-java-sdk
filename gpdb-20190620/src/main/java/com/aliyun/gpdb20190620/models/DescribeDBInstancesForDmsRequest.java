// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesForDmsRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDBInstancesForDmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesForDmsRequest self = new DescribeDBInstancesForDmsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesForDmsRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeDBInstancesForDmsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
