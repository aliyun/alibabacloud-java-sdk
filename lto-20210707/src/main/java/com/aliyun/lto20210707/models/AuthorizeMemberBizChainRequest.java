// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AuthorizeMemberBizChainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizChainInfo")
    public String bizChainInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("RegionId")
    public String regionId;

    public static AuthorizeMemberBizChainRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeMemberBizChainRequest self = new AuthorizeMemberBizChainRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeMemberBizChainRequest setBizChainInfo(String bizChainInfo) {
        this.bizChainInfo = bizChainInfo;
        return this;
    }
    public String getBizChainInfo() {
        return this.bizChainInfo;
    }

    public AuthorizeMemberBizChainRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public AuthorizeMemberBizChainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
