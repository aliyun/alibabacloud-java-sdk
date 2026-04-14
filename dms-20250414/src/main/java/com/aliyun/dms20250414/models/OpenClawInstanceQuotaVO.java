// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OpenClawInstanceQuotaVO extends TeaModel {
    @NameInMap("AliyunAccountUid")
    public String aliyunAccountUid;

    @NameInMap("DeepResearchCallQuota")
    public String deepResearchCallQuota;

    @NameInMap("DeepResearchCallUsed")
    public String deepResearchCallUsed;

    @NameInMap("InstanceGmtCreate")
    public String instanceGmtCreate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("LastMeteringTime")
    public String lastMeteringTime;

    @NameInMap("ModelCallQuota")
    public String modelCallQuota;

    @NameInMap("ModelCallUsed")
    public String modelCallUsed;

    @NameInMap("RefreshDay")
    public String refreshDay;

    @NameInMap("SkillPlanCallQuota")
    public String skillPlanCallQuota;

    @NameInMap("SkillPlanCallUsed")
    public String skillPlanCallUsed;

    public static OpenClawInstanceQuotaVO build(java.util.Map<String, ?> map) throws Exception {
        OpenClawInstanceQuotaVO self = new OpenClawInstanceQuotaVO();
        return TeaModel.build(map, self);
    }

    public OpenClawInstanceQuotaVO setAliyunAccountUid(String aliyunAccountUid) {
        this.aliyunAccountUid = aliyunAccountUid;
        return this;
    }
    public String getAliyunAccountUid() {
        return this.aliyunAccountUid;
    }

    public OpenClawInstanceQuotaVO setDeepResearchCallQuota(String deepResearchCallQuota) {
        this.deepResearchCallQuota = deepResearchCallQuota;
        return this;
    }
    public String getDeepResearchCallQuota() {
        return this.deepResearchCallQuota;
    }

    public OpenClawInstanceQuotaVO setDeepResearchCallUsed(String deepResearchCallUsed) {
        this.deepResearchCallUsed = deepResearchCallUsed;
        return this;
    }
    public String getDeepResearchCallUsed() {
        return this.deepResearchCallUsed;
    }

    public OpenClawInstanceQuotaVO setInstanceGmtCreate(String instanceGmtCreate) {
        this.instanceGmtCreate = instanceGmtCreate;
        return this;
    }
    public String getInstanceGmtCreate() {
        return this.instanceGmtCreate;
    }

    public OpenClawInstanceQuotaVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OpenClawInstanceQuotaVO setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public OpenClawInstanceQuotaVO setLastMeteringTime(String lastMeteringTime) {
        this.lastMeteringTime = lastMeteringTime;
        return this;
    }
    public String getLastMeteringTime() {
        return this.lastMeteringTime;
    }

    public OpenClawInstanceQuotaVO setModelCallQuota(String modelCallQuota) {
        this.modelCallQuota = modelCallQuota;
        return this;
    }
    public String getModelCallQuota() {
        return this.modelCallQuota;
    }

    public OpenClawInstanceQuotaVO setModelCallUsed(String modelCallUsed) {
        this.modelCallUsed = modelCallUsed;
        return this;
    }
    public String getModelCallUsed() {
        return this.modelCallUsed;
    }

    public OpenClawInstanceQuotaVO setRefreshDay(String refreshDay) {
        this.refreshDay = refreshDay;
        return this;
    }
    public String getRefreshDay() {
        return this.refreshDay;
    }

    public OpenClawInstanceQuotaVO setSkillPlanCallQuota(String skillPlanCallQuota) {
        this.skillPlanCallQuota = skillPlanCallQuota;
        return this;
    }
    public String getSkillPlanCallQuota() {
        return this.skillPlanCallQuota;
    }

    public OpenClawInstanceQuotaVO setSkillPlanCallUsed(String skillPlanCallUsed) {
        this.skillPlanCallUsed = skillPlanCallUsed;
        return this;
    }
    public String getSkillPlanCallUsed() {
        return this.skillPlanCallUsed;
    }

}
