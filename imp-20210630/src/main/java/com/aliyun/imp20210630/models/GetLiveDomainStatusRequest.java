// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveDomainStatusRequest extends TeaModel {
    // 应用唯一标识
    @NameInMap("AppId")
    public String appId;

    // 直播域名列表
    @NameInMap("LiveDomainList")
    public java.util.List<String> liveDomainList;

    public static GetLiveDomainStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveDomainStatusRequest self = new GetLiveDomainStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveDomainStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetLiveDomainStatusRequest setLiveDomainList(java.util.List<String> liveDomainList) {
        this.liveDomainList = liveDomainList;
        return this;
    }
    public java.util.List<String> getLiveDomainList() {
        return this.liveDomainList;
    }

}
