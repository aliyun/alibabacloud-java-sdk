// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class TestGetInstanceBaseInfoRequest extends TeaModel {
    @NameInMap("userId")
    public String userId;

    public static TestGetInstanceBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        TestGetInstanceBaseInfoRequest self = new TestGetInstanceBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public TestGetInstanceBaseInfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
