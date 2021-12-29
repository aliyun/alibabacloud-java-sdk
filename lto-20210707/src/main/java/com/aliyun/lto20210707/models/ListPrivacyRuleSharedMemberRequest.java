// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListPrivacyRuleSharedMemberRequest extends TeaModel {
    @NameInMap("PrivacyRuleId")
    public String privacyRuleId;

    public static ListPrivacyRuleSharedMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivacyRuleSharedMemberRequest self = new ListPrivacyRuleSharedMemberRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivacyRuleSharedMemberRequest setPrivacyRuleId(String privacyRuleId) {
        this.privacyRuleId = privacyRuleId;
        return this;
    }
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

}
