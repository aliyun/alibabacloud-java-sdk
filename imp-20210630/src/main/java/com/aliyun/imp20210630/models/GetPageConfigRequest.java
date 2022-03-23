// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetPageConfigRequest extends TeaModel {
    // 云账号id
    @NameInMap("CloudUid")
    public String cloudUid;

    public static GetPageConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPageConfigRequest self = new GetPageConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetPageConfigRequest setCloudUid(String cloudUid) {
        this.cloudUid = cloudUid;
        return this;
    }
    public String getCloudUid() {
        return this.cloudUid;
    }

}
