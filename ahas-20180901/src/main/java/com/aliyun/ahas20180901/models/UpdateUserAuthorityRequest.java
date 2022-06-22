// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateUserAuthorityRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RoleType")
    public Integer roleType;

    @NameInMap("SubUid")
    public String subUid;

    @NameInMap("UserName")
    public String userName;

    public static UpdateUserAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAuthorityRequest self = new UpdateUserAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserAuthorityRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateUserAuthorityRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateUserAuthorityRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateUserAuthorityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateUserAuthorityRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateUserAuthorityRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public UpdateUserAuthorityRequest setSubUid(String subUid) {
        this.subUid = subUid;
        return this;
    }
    public String getSubUid() {
        return this.subUid;
    }

    public UpdateUserAuthorityRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
