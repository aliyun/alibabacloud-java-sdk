// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class AddWhitelistUserRequest extends TeaModel {
    @NameInMap("remark")
    public String remark;

    @NameInMap("userId")
    public String userId;

    public static AddWhitelistUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWhitelistUserRequest self = new AddWhitelistUserRequest();
        return TeaModel.build(map, self);
    }

    public AddWhitelistUserRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddWhitelistUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
