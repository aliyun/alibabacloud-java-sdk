// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class TestGetUserByIdRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    public static TestGetUserByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        TestGetUserByIdRequest self = new TestGetUserByIdRequest();
        return TeaModel.build(map, self);
    }

    public TestGetUserByIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
