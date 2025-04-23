// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateOrgRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>org-evk12ozjvmlxl****</p>
     */
    @NameInMap("ParentOrgId")
    public String parentOrgId;

    public static CreateOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrgRequest self = new CreateOrgRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrgRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public CreateOrgRequest setParentOrgId(String parentOrgId) {
        this.parentOrgId = parentOrgId;
        return this;
    }
    public String getParentOrgId() {
        return this.parentOrgId;
    }

}
