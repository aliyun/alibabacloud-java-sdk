// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeTrailsRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the information about multi-account trails. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("IncludeOrganizationTrail")
    public Boolean includeOrganizationTrail;

    /**
     * <p>Specifies whether to return the information about shadow trails. Valid values:</p>
     * <br>
     * <p>*   false: Do not return the information about shadow trails. It is the default value.</p>
     * <p>*   true: Return the information about shadow trails.</p>
     */
    @NameInMap("IncludeShadowTrails")
    public Boolean includeShadowTrails;

    /**
     * <p>The names of the trails whose information you want to query. Separate multiple trail names with commas (,).</p>
     */
    @NameInMap("NameList")
    public String nameList;

    public static DescribeTrailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrailsRequest self = new DescribeTrailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrailsRequest setIncludeOrganizationTrail(Boolean includeOrganizationTrail) {
        this.includeOrganizationTrail = includeOrganizationTrail;
        return this;
    }
    public Boolean getIncludeOrganizationTrail() {
        return this.includeOrganizationTrail;
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

}
