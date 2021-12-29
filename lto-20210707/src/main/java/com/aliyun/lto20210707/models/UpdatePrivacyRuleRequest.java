// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UpdatePrivacyRuleRequest extends TeaModel {
    @NameInMap("AlgImpl")
    public String algImpl;

    @NameInMap("AlgType")
    public String algType;

    @NameInMap("Name")
    public String name;

    @NameInMap("PrivacyRuleId")
    public String privacyRuleId;

    @NameInMap("Remark")
    public String remark;

    public static UpdatePrivacyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivacyRuleRequest self = new UpdatePrivacyRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivacyRuleRequest setAlgImpl(String algImpl) {
        this.algImpl = algImpl;
        return this;
    }
    public String getAlgImpl() {
        return this.algImpl;
    }

    public UpdatePrivacyRuleRequest setAlgType(String algType) {
        this.algType = algType;
        return this;
    }
    public String getAlgType() {
        return this.algType;
    }

    public UpdatePrivacyRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePrivacyRuleRequest setPrivacyRuleId(String privacyRuleId) {
        this.privacyRuleId = privacyRuleId;
        return this;
    }
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

    public UpdatePrivacyRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
