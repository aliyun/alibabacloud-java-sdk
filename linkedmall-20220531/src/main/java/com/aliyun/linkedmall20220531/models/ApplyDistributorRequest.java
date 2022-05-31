// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ApplyDistributorRequest extends TeaModel {
    // 联系人
    @NameInMap("Contractor")
    public String contractor;

    // 分销商名称
    @NameInMap("DistributorName")
    public String distributorName;

    // 主体信息
    @NameInMap("EntityInfo")
    public String entityInfo;

    // 所属行业
    @NameInMap("Industry")
    public String industry;

    // 联系电话
    @NameInMap("Phone")
    public String phone;

    // 客群偏好
    @NameInMap("Preference")
    public String preference;

    // 客户体量
    @NameInMap("Scale")
    public String scale;

    public static ApplyDistributorRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributorRequest self = new ApplyDistributorRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDistributorRequest setContractor(String contractor) {
        this.contractor = contractor;
        return this;
    }
    public String getContractor() {
        return this.contractor;
    }

    public ApplyDistributorRequest setDistributorName(String distributorName) {
        this.distributorName = distributorName;
        return this;
    }
    public String getDistributorName() {
        return this.distributorName;
    }

    public ApplyDistributorRequest setEntityInfo(String entityInfo) {
        this.entityInfo = entityInfo;
        return this;
    }
    public String getEntityInfo() {
        return this.entityInfo;
    }

    public ApplyDistributorRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public ApplyDistributorRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ApplyDistributorRequest setPreference(String preference) {
        this.preference = preference;
        return this;
    }
    public String getPreference() {
        return this.preference;
    }

    public ApplyDistributorRequest setScale(String scale) {
        this.scale = scale;
        return this;
    }
    public String getScale() {
        return this.scale;
    }

}
