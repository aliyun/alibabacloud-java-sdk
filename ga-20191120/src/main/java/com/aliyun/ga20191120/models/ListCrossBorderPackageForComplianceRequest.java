// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCrossBorderPackageForComplianceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ResourceUid")
    public Long resourceUid;

    @NameInMap("IsBinded")
    public Boolean isBinded;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResult")
    public Integer maxResult;

    public static ListCrossBorderPackageForComplianceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrossBorderPackageForComplianceRequest self = new ListCrossBorderPackageForComplianceRequest();
        return TeaModel.build(map, self);
    }

    public ListCrossBorderPackageForComplianceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCrossBorderPackageForComplianceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListCrossBorderPackageForComplianceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListCrossBorderPackageForComplianceRequest setResourceUid(Long resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public Long getResourceUid() {
        return this.resourceUid;
    }

    public ListCrossBorderPackageForComplianceRequest setIsBinded(Boolean isBinded) {
        this.isBinded = isBinded;
        return this;
    }
    public Boolean getIsBinded() {
        return this.isBinded;
    }

    public ListCrossBorderPackageForComplianceRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCrossBorderPackageForComplianceRequest setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Integer getMaxResult() {
        return this.maxResult;
    }

}
