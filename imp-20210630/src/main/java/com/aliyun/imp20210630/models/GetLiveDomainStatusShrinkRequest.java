// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveDomainStatusShrinkRequest extends TeaModel {
    // 应用唯一标识
    @NameInMap("AppId")
    public String appId;

    // 直播域名列表
    @NameInMap("LiveDomainList")
    public String liveDomainListShrink;

    public static GetLiveDomainStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveDomainStatusShrinkRequest self = new GetLiveDomainStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveDomainStatusShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetLiveDomainStatusShrinkRequest setLiveDomainListShrink(String liveDomainListShrink) {
        this.liveDomainListShrink = liveDomainListShrink;
        return this;
    }
    public String getLiveDomainListShrink() {
        return this.liveDomainListShrink;
    }

}
