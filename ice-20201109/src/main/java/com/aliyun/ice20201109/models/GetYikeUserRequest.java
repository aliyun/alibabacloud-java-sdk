// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetYikeUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test.xxx@xxx.yikeai">test.xxx@xxx.yikeai</a></p>
     */
    @NameInMap("UserName")
    public String userName;

    public static GetYikeUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYikeUserRequest self = new GetYikeUserRequest();
        return TeaModel.build(map, self);
    }

    public GetYikeUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
