// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetServiceConfigurationRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    public static GetServiceConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConfigurationRequest self = new GetServiceConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceConfigurationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
