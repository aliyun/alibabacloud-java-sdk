// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelListByTbOpenIdRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("TbOpenId")
    public String tbOpenId;

    public static QueryHotelListByTbOpenIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelListByTbOpenIdRequest self = new QueryHotelListByTbOpenIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotelListByTbOpenIdRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public QueryHotelListByTbOpenIdRequest setTbOpenId(String tbOpenId) {
        this.tbOpenId = tbOpenId;
        return this;
    }
    public String getTbOpenId() {
        return this.tbOpenId;
    }

}
