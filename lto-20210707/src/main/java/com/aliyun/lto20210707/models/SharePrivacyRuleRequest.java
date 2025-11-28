// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class SharePrivacyRuleRequest extends TeaModel {
    @NameInMap("MemberIdList")
    public String memberIdList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PrivacyRuleId")
    public String privacyRuleId;

    @NameInMap("RegionId")
    public String regionId;

    public static SharePrivacyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SharePrivacyRuleRequest self = new SharePrivacyRuleRequest();
        return TeaModel.build(map, self);
    }

    public SharePrivacyRuleRequest setMemberIdList(String memberIdList) {
        this.memberIdList = memberIdList;
        return this;
    }
    public String getMemberIdList() {
        return this.memberIdList;
    }

    public SharePrivacyRuleRequest setPrivacyRuleId(String privacyRuleId) {
        this.privacyRuleId = privacyRuleId;
        return this;
    }
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

    public SharePrivacyRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
