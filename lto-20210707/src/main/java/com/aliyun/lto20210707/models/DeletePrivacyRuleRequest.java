// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DeletePrivacyRuleRequest extends TeaModel {
    @NameInMap("PrivacyRuleId")
    public String privacyRuleId;

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

}
