// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourceTypesRequest extends TeaModel {
    @NameInMap("ak")
    public String ak;

    @NameInMap("cloudType")
    public String cloudType;

    @NameInMap("region")
    public String region;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("sk")
    public String sk;

    public static ListSurveyResourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourceTypesRequest self = new ListSurveyResourceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourceTypesRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public ListSurveyResourceTypesRequest setCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }
    public String getCloudType() {
        return this.cloudType;
    }

    public ListSurveyResourceTypesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListSurveyResourceTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSurveyResourceTypesRequest setSk(String sk) {
        this.sk = sk;
        return this;
    }
    public String getSk() {
        return this.sk;
    }

}
