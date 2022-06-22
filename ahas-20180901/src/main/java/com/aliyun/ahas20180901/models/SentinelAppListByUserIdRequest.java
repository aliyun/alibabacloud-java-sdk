// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppListByUserIdRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AuthId")
    public String authId;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelAppListByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppListByUserIdRequest self = new SentinelAppListByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public SentinelAppListByUserIdRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelAppListByUserIdRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public SentinelAppListByUserIdRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
