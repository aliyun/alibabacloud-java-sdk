// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageUserInfoRequest extends TeaModel {
    @NameInMap("CloudUid")
    public String cloudUid;

    public static GetMessageUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageUserInfoRequest self = new GetMessageUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageUserInfoRequest setCloudUid(String cloudUid) {
        this.cloudUid = cloudUid;
        return this;
    }
    public String getCloudUid() {
        return this.cloudUid;
    }

}
