// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class QueryAsynTokenResultRequest extends TeaModel {
    @NameInMap("AsynToken")
    public String asynToken;

    @NameInMap("RegionId")
    public String regionId;

    public static QueryAsynTokenResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAsynTokenResultRequest self = new QueryAsynTokenResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryAsynTokenResultRequest setAsynToken(String asynToken) {
        this.asynToken = asynToken;
        return this;
    }
    public String getAsynToken() {
        return this.asynToken;
    }

    public QueryAsynTokenResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
