// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeBizChainStatInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeBizChainStatInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizChainStatInfoRequest self = new DescribeBizChainStatInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBizChainStatInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
