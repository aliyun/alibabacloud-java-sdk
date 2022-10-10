// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ApplyDistributorResponseBody extends TeaModel {
    @NameInMap("ChannelSupplierName")
    public String channelSupplierName;

    @NameInMap("Code")
    public String code;

    @NameInMap("Contractor")
    public String contractor;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("DistributorName")
    public String distributorName;

    @NameInMap("EntityInfo")
    public String entityInfo;

    @NameInMap("Industry")
    public String industry;

    @NameInMap("Message")
    public String message;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Preference")
    public String preference;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scale")
    public String scale;

    @NameInMap("Success")
    public Boolean success;

    public static ApplyDistributorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributorResponseBody self = new ApplyDistributorResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyDistributorResponseBody setChannelSupplierName(String channelSupplierName) {
        this.channelSupplierName = channelSupplierName;
        return this;
    }
    public String getChannelSupplierName() {
        return this.channelSupplierName;
    }

    public ApplyDistributorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyDistributorResponseBody setContractor(String contractor) {
        this.contractor = contractor;
        return this;
    }
    public String getContractor() {
        return this.contractor;
    }

    public ApplyDistributorResponseBody setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ApplyDistributorResponseBody setDistributorName(String distributorName) {
        this.distributorName = distributorName;
        return this;
    }
    public String getDistributorName() {
        return this.distributorName;
    }

    public ApplyDistributorResponseBody setEntityInfo(String entityInfo) {
        this.entityInfo = entityInfo;
        return this;
    }
    public String getEntityInfo() {
        return this.entityInfo;
    }

    public ApplyDistributorResponseBody setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public ApplyDistributorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyDistributorResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ApplyDistributorResponseBody setPreference(String preference) {
        this.preference = preference;
        return this;
    }
    public String getPreference() {
        return this.preference;
    }

    public ApplyDistributorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyDistributorResponseBody setScale(String scale) {
        this.scale = scale;
        return this;
    }
    public String getScale() {
        return this.scale;
    }

    public ApplyDistributorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
