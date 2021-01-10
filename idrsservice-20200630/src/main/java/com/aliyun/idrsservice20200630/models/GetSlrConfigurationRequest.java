// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetSlrConfigurationRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    public static GetSlrConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSlrConfigurationRequest self = new GetSlrConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetSlrConfigurationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
