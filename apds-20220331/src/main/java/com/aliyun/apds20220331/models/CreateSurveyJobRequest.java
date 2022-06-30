// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateSurveyJobRequest extends TeaModel {
    @NameInMap("Region")
    public java.util.List<String> region;

    @NameInMap("ResourceTypeList")
    public java.util.List<String> resourceTypeList;

    @NameInMap("ak")
    public String ak;

    // 调研渠道
    @NameInMap("channel")
    public String channel;

    @NameInMap("cloudType")
    public String cloudType;

    @NameInMap("name")
    public String name;

    @NameInMap("sk")
    public String sk;

    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("regionId")
    public String regionId;

    public static CreateSurveyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSurveyJobRequest self = new CreateSurveyJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateSurveyJobRequest setRegion(java.util.List<String> region) {
        this.region = region;
        return this;
    }
    public java.util.List<String> getRegion() {
        return this.region;
    }

    public CreateSurveyJobRequest setResourceTypeList(java.util.List<String> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
        return this;
    }
    public java.util.List<String> getResourceTypeList() {
        return this.resourceTypeList;
    }

    public CreateSurveyJobRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public CreateSurveyJobRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateSurveyJobRequest setCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }
    public String getCloudType() {
        return this.cloudType;
    }

    public CreateSurveyJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSurveyJobRequest setSk(String sk) {
        this.sk = sk;
        return this;
    }
    public String getSk() {
        return this.sk;
    }

    public CreateSurveyJobRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateSurveyJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
