// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeClientPackageRequest extends TeaModel {
    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("ExtraParams")
    public String extraParams;

    public static DescribeClientPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientPackageRequest self = new DescribeClientPackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientPackageRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public DescribeClientPackageRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

}
