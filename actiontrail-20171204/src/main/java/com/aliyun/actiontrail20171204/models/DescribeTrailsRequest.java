// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class DescribeTrailsRequest extends TeaModel {
    @NameInMap("IncludeShadowTrails")
    public Boolean includeShadowTrails;

    @NameInMap("NameList")
    public String nameList;

    @NameInMap("IncludeOrganizationTrail")
    public Boolean includeOrganizationTrail;

    public static DescribeTrailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrailsRequest self = new DescribeTrailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrailsRequest setIncludeShadowTrails(Boolean includeShadowTrails) {
        this.includeShadowTrails = includeShadowTrails;
        return this;
    }
    public Boolean getIncludeShadowTrails() {
        return this.includeShadowTrails;
    }

    public DescribeTrailsRequest setNameList(String nameList) {
        this.nameList = nameList;
        return this;
    }
    public String getNameList() {
        return this.nameList;
    }

    public DescribeTrailsRequest setIncludeOrganizationTrail(Boolean includeOrganizationTrail) {
        this.includeOrganizationTrail = includeOrganizationTrail;
        return this;
    }
    public Boolean getIncludeOrganizationTrail() {
        return this.includeOrganizationTrail;
    }

}
