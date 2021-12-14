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

    // 直播域名类型，推流域名: push, 拉流域名: pull, 回放域名: palyback
    @NameInMap("LiveDomainType")
    public String liveDomainType;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

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

    public GetLiveDomainStatusShrinkRequest setLiveDomainType(String liveDomainType) {
        this.liveDomainType = liveDomainType;
        return this;
    }
    public String getLiveDomainType() {
        return this.liveDomainType;
    }

    public GetLiveDomainStatusShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
