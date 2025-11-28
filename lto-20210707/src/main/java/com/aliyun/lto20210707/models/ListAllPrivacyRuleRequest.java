// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllPrivacyRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListAllPrivacyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllPrivacyRuleRequest self = new ListAllPrivacyRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListAllPrivacyRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
