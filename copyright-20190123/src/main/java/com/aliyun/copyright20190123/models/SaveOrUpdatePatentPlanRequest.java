// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SaveOrUpdatePatentPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    public Long planId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Contact")
    public String contact;

    @NameInMap("ApplyNumbers")
    public String applyNumbers;

    public static SaveOrUpdatePatentPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOrUpdatePatentPlanRequest self = new SaveOrUpdatePatentPlanRequest();
        return TeaModel.build(map, self);
    }

    public SaveOrUpdatePatentPlanRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public SaveOrUpdatePatentPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveOrUpdatePatentPlanRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public SaveOrUpdatePatentPlanRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public SaveOrUpdatePatentPlanRequest setApplyNumbers(String applyNumbers) {
        this.applyNumbers = applyNumbers;
        return this;
    }
    public String getApplyNumbers() {
        return this.applyNumbers;
    }

}
