// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceAccount extends TeaModel {
    @NameInMap("accountId")
    public Long accountId;

    @NameInMap("accountNotes")
    public String accountNotes;

    @NameInMap("aliyunUid")
    public String aliyunUid;

    @NameInMap("aliyunUserName")
    public String aliyunUserName;

    @NameInMap("gmtCreate")
    public Float gmtCreate;

    @NameInMap("orgs")
    public java.util.List<GrafanaWorkspaceUserOrg> orgs;

    @NameInMap("type")
    public String type;

    public static GrafanaWorkspaceAccount build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceAccount self = new GrafanaWorkspaceAccount();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceAccount setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public GrafanaWorkspaceAccount setAccountNotes(String accountNotes) {
        this.accountNotes = accountNotes;
        return this;
    }
    public String getAccountNotes() {
        return this.accountNotes;
    }

    public GrafanaWorkspaceAccount setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public GrafanaWorkspaceAccount setAliyunUserName(String aliyunUserName) {
        this.aliyunUserName = aliyunUserName;
        return this;
    }
    public String getAliyunUserName() {
        return this.aliyunUserName;
    }

    public GrafanaWorkspaceAccount setGmtCreate(Float gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Float getGmtCreate() {
        return this.gmtCreate;
    }

    public GrafanaWorkspaceAccount setOrgs(java.util.List<GrafanaWorkspaceUserOrg> orgs) {
        this.orgs = orgs;
        return this;
    }
    public java.util.List<GrafanaWorkspaceUserOrg> getOrgs() {
        return this.orgs;
    }

    public GrafanaWorkspaceAccount setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
