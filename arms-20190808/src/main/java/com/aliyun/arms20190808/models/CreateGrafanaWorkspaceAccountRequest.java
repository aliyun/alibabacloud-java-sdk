// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateGrafanaWorkspaceAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>notes</p>
     */
    @NameInMap("AccountNotes")
    public String accountNotes;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1449570186405787</p>
     */
    @NameInMap("AliyunUid")
    public String aliyunUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-cn-06f4xyxjo01</p>
     */
    @NameInMap("GrafanaWorkspaceId")
    public String grafanaWorkspaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrgId")
    public Integer orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Role")
    public String role;

    public static CreateGrafanaWorkspaceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGrafanaWorkspaceAccountRequest self = new CreateGrafanaWorkspaceAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateGrafanaWorkspaceAccountRequest setAccountNotes(String accountNotes) {
        this.accountNotes = accountNotes;
        return this;
    }
    public String getAccountNotes() {
        return this.accountNotes;
    }

    public CreateGrafanaWorkspaceAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateGrafanaWorkspaceAccountRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateGrafanaWorkspaceAccountRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public CreateGrafanaWorkspaceAccountRequest setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public CreateGrafanaWorkspaceAccountRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public CreateGrafanaWorkspaceAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGrafanaWorkspaceAccountRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
