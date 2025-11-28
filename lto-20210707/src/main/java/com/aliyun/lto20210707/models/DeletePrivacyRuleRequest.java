// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DeletePrivacyRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PrivacyRuleId")
    public String privacyRuleId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeletePrivacyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivacyRuleRequest self = new DeletePrivacyRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrivacyRuleRequest setPrivacyRuleId(String privacyRuleId) {
        this.privacyRuleId = privacyRuleId;
        return this;
    }
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

    public DeletePrivacyRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
