// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAvailableVipsRequest extends TeaModel {
    @NameInMap("Vip")
    public String vip;

    public static DescribeAvailableVipsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableVipsRequest self = new DescribeAvailableVipsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableVipsRequest setVip(String vip) {
        this.vip = vip;
        return this;
    }
    public String getVip() {
        return this.vip;
    }

}
