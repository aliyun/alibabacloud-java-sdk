// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsOrganizationRequest extends TeaModel {
    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("Source")
    public String source;

    @NameInMap("RealPk")
    public String realPk;

    @NameInMap("DesiredMemberCount")
    public Integer desiredMemberCount;

    public static CreateDevopsOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsOrganizationRequest self = new CreateDevopsOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevopsOrganizationRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public CreateDevopsOrganizationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateDevopsOrganizationRequest setRealPk(String realPk) {
        this.realPk = realPk;
        return this;
    }
    public String getRealPk() {
        return this.realPk;
    }

    public CreateDevopsOrganizationRequest setDesiredMemberCount(Integer desiredMemberCount) {
        this.desiredMemberCount = desiredMemberCount;
        return this;
    }
    public Integer getDesiredMemberCount() {
        return this.desiredMemberCount;
    }

}
