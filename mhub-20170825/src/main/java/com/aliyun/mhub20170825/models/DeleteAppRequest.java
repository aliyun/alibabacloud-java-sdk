// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class DeleteAppRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    public static DeleteAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppRequest self = new DeleteAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
