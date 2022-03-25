// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetCurrentUserRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    public static GetCurrentUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentUserRequest self = new GetCurrentUserRequest();
        return TeaModel.build(map, self);
    }

    public GetCurrentUserRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

}
