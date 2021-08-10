// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentOverviewInfoRequest extends TeaModel {
    @NameInMap("UserType")
    public String userType;

    public static GetPatentOverviewInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatentOverviewInfoRequest self = new GetPatentOverviewInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPatentOverviewInfoRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
