// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupDetailRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    public static DescribePurchasedApiGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiGroupDetailRequest self = new DescribePurchasedApiGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiGroupDetailRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
