// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListResultTokenUrlRequest extends TeaModel {
    @NameInMap("AsynToken")
    public String asynToken;

    @NameInMap("RegionId")
    public String regionId;

    public static ListResultTokenUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResultTokenUrlRequest self = new ListResultTokenUrlRequest();
        return TeaModel.build(map, self);
    }

    public ListResultTokenUrlRequest setAsynToken(String asynToken) {
        this.asynToken = asynToken;
        return this;
    }
    public String getAsynToken() {
        return this.asynToken;
    }

    public ListResultTokenUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
