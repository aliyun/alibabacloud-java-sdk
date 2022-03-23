// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetUserInfoRequest extends TeaModel {
    // 云账号id
    @NameInMap("CloudUid")
    public String cloudUid;

    public static GetUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoRequest self = new GetUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserInfoRequest setCloudUid(String cloudUid) {
        this.cloudUid = cloudUid;
        return this;
    }
    public String getCloudUid() {
        return this.cloudUid;
    }

}
