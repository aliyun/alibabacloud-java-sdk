// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUserBizTypesRequest extends TeaModel {
    @NameInMap("Customized")
    public Boolean customized;

    public static DescribeUserBizTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBizTypesRequest self = new DescribeUserBizTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserBizTypesRequest setCustomized(Boolean customized) {
        this.customized = customized;
        return this;
    }
    public Boolean getCustomized() {
        return this.customized;
    }

}
