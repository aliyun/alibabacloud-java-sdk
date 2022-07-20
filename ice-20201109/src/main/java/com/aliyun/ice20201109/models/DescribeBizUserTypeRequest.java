// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeBizUserTypeRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    public static DescribeBizUserTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizUserTypeRequest self = new DescribeBizUserTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBizUserTypeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
