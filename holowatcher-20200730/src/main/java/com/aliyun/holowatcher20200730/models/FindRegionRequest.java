// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class FindRegionRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("RegionCode")
    public Long regionCode;

    public static FindRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        FindRegionRequest self = new FindRegionRequest();
        return TeaModel.build(map, self);
    }

    public FindRegionRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public FindRegionRequest setRegionCode(Long regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public Long getRegionCode() {
        return this.regionCode;
    }

}
