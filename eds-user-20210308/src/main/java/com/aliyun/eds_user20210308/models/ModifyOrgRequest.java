// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ModifyOrgRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The ID of the organization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>org-76joc57khvnhdh***</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>The name of the organization.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    public static ModifyOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrgRequest self = new ModifyOrgRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOrgRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public ModifyOrgRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ModifyOrgRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

}
