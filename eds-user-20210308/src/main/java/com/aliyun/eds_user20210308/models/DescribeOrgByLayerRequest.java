// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgByLayerRequest extends TeaModel {
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <strong>example:</strong>
     * <p>org-11fs****</p>
     */
    @NameInMap("ParentOrgId")
    public String parentOrgId;

    public static DescribeOrgByLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgByLayerRequest self = new DescribeOrgByLayerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrgByLayerRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DescribeOrgByLayerRequest setParentOrgId(String parentOrgId) {
        this.parentOrgId = parentOrgId;
        return this;
    }
    public String getParentOrgId() {
        return this.parentOrgId;
    }

}
