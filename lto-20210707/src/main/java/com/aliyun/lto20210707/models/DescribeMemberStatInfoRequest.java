// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberStatInfoRequest extends TeaModel {
    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMemberStatInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberStatInfoRequest self = new DescribeMemberStatInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMemberStatInfoRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public DescribeMemberStatInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
