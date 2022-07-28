// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeNodeCidrListRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Region")
    public String region;

    public static DescribeNodeCidrListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeCidrListRequest self = new DescribeNodeCidrListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeCidrListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeNodeCidrListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeNodeCidrListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
