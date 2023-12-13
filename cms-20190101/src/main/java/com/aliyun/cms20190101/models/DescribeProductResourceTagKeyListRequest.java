// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductResourceTagKeyListRequest extends TeaModel {
    /**
     * <p>The pagination cursor.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeProductResourceTagKeyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductResourceTagKeyListRequest self = new DescribeProductResourceTagKeyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductResourceTagKeyListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProductResourceTagKeyListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
