// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class UpdateDistributorRequest extends TeaModel {
    // 联系人
    @NameInMap("Contractor")
    public String contractor;

    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

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

    public static UpdateDistributorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDistributorRequest self = new UpdateDistributorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDistributorRequest setContractor(String contractor) {
        this.contractor = contractor;
        return this;
    }
    public String getContractor() {
        return this.contractor;
    }

    public UpdateDistributorRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public UpdateDistributorRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public UpdateDistributorRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateDistributorRequest setPreference(String preference) {
        this.preference = preference;
        return this;
    }
    public String getPreference() {
        return this.preference;
    }

    public UpdateDistributorRequest setScale(String scale) {
        this.scale = scale;
        return this;
    }
    public String getScale() {
        return this.scale;
    }

}
