// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListCommonGroupRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SmartGroupId")
    public String smartGroupId;

    @NameInMap("All")
    public Boolean all;

    public static ListCommonGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommonGroupRequest self = new ListCommonGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListCommonGroupRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListCommonGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListCommonGroupRequest setSmartGroupId(String smartGroupId) {
        this.smartGroupId = smartGroupId;
        return this;
    }
    public String getSmartGroupId() {
        return this.smartGroupId;
    }

    public ListCommonGroupRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

}
