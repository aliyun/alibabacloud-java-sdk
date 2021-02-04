// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetTokenRequest extends TeaModel {
    @NameInMap("PathType")
    public String pathType;

    public static GetTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenRequest self = new GetTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenRequest setPathType(String pathType) {
        this.pathType = pathType;
        return this;
    }
    public String getPathType() {
        return this.pathType;
    }

}
