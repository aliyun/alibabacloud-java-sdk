// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddPhoneTagsRequest extends TeaModel {
    @NameInMap("Concurrency")
    public Integer concurrency;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumberList")
    public java.util.List<String> phoneNumberList;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("RegionNameCity")
    public String regionNameCity;

    @NameInMap("RegionNameProvince")
    public String regionNameProvince;

    @NameInMap("ServiceTag")
    public String serviceTag;

    @NameInMap("SipTag")
    public String sipTag;

    @NameInMap("Type")
    public Integer type;

    public static AddPhoneTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneTagsRequest self = new AddPhoneTagsRequest();
        return TeaModel.build(map, self);
    }

    public AddPhoneTagsRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public AddPhoneTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddPhoneTagsRequest setPhoneNumberList(java.util.List<String> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
        return this;
    }
    public java.util.List<String> getPhoneNumberList() {
        return this.phoneNumberList;
    }

    public AddPhoneTagsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public AddPhoneTagsRequest setRegionNameCity(String regionNameCity) {
        this.regionNameCity = regionNameCity;
        return this;
    }
    public String getRegionNameCity() {
        return this.regionNameCity;
    }

    public AddPhoneTagsRequest setRegionNameProvince(String regionNameProvince) {
        this.regionNameProvince = regionNameProvince;
        return this;
    }
    public String getRegionNameProvince() {
        return this.regionNameProvince;
    }

    public AddPhoneTagsRequest setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
        return this;
    }
    public String getServiceTag() {
        return this.serviceTag;
    }

    public AddPhoneTagsRequest setSipTag(String sipTag) {
        this.sipTag = sipTag;
        return this;
    }
    public String getSipTag() {
        return this.sipTag;
    }

    public AddPhoneTagsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
