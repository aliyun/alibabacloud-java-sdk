// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrefixListsRequest extends TeaModel {
    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribePrefixListsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListsRequest self = new DescribePrefixListsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListsRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribePrefixListsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
