// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetHomePageGuidanceRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static GetHomePageGuidanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHomePageGuidanceRequest self = new GetHomePageGuidanceRequest();
        return TeaModel.build(map, self);
    }

    public GetHomePageGuidanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
