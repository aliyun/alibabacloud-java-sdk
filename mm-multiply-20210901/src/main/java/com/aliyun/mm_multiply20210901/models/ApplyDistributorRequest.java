// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ApplyDistributorRequest extends TeaModel {
    @NameInMap("ChannelSupplierId")
    public String channelSupplierId;

    @NameInMap("ChannelSupplierName")
    public String channelSupplierName;

    @NameInMap("Contractor")
    public String contractor;

    @NameInMap("DistributorName")
    public String distributorName;

    @NameInMap("EntityInfo")
    public String entityInfo;

    @NameInMap("Industry")
    public String industry;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Preference")
    public String preference;

    @NameInMap("Scale")
    public String scale;

    public static ApplyDistributorRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributorRequest self = new ApplyDistributorRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDistributorRequest setChannelSupplierId(String channelSupplierId) {
        this.channelSupplierId = channelSupplierId;
        return this;
    }
    public String getChannelSupplierId() {
        return this.channelSupplierId;
    }

    public ApplyDistributorRequest setChannelSupplierName(String channelSupplierName) {
        this.channelSupplierName = channelSupplierName;
        return this;
    }
    public String getChannelSupplierName() {
        return this.channelSupplierName;
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
