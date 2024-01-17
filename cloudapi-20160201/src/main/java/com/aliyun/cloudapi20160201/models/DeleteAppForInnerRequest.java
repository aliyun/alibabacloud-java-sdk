// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteAppForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AppId")
    public Long appId;

    public static DeleteAppForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppForInnerRequest self = new DeleteAppForInnerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DeleteAppForInnerRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

}
