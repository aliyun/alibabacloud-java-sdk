// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribePackRequest extends TeaModel {
    @NameInMap("PackId")
    public String packId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribePackRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackRequest self = new DescribePackRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackRequest setPackId(String packId) {
        this.packId = packId;
        return this;
    }
    public String getPackId() {
        return this.packId;
    }

    public DescribePackRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
