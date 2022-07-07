// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ApplyDistributorResponseBody extends TeaModel {
    // 渠道供应名称
    @NameInMap("ChannelSupplierName")
    public String channelSupplierName;

    @NameInMap("Code")
    public String code;

    // 联系人
    @NameInMap("Contractor")
    public String contractor;

    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 分销商名称
    @NameInMap("DistributorName")
    public String distributorName;

    // 主体信息
    @NameInMap("EntityInfo")
    public String entityInfo;

    // 所属行业
    @NameInMap("Industry")
    public String industry;

    @NameInMap("Message")
    public String message;

    // 联系电话
    @NameInMap("Phone")
    public String phone;

    // 客群偏好
    @NameInMap("Preference")
    public String preference;

    @NameInMap("RequestId")
    public String requestId;

    // 客户体量
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
