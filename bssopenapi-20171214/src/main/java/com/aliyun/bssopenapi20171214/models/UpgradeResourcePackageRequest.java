// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UpgradeResourcePackageRequest extends TeaModel {
    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Specification")
    public String specification;

    public static UpgradeResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeResourcePackageRequest self = new UpgradeResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeResourcePackageRequest setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public UpgradeResourcePackageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeResourcePackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeResourcePackageRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

}
