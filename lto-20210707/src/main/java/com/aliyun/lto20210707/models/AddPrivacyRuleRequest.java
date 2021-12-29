// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddPrivacyRuleRequest extends TeaModel {
    @NameInMap("AlgImpl")
    public String algImpl;

    @NameInMap("AlgType")
    public String algType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    public static AddPrivacyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrivacyRuleRequest self = new AddPrivacyRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddPrivacyRuleRequest setAlgImpl(String algImpl) {
        this.algImpl = algImpl;
        return this;
    }
    public String getAlgImpl() {
        return this.algImpl;
    }

    public AddPrivacyRuleRequest setAlgType(String algType) {
        this.algType = algType;
        return this;
    }
    public String getAlgType() {
        return this.algType;
    }

    public AddPrivacyRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddPrivacyRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
