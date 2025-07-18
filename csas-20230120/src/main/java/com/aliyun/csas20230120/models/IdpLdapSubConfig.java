// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpLdapSubConfig extends TeaModel {
    @NameInMap("BaseDn")
    public String baseDn;

    @NameInMap("GroupBaseDn")
    public String groupBaseDn;

    @NameInMap("GroupFilter")
    public String groupFilter;

    @NameInMap("GroupMembershipAttr")
    public String groupMembershipAttr;

    @NameInMap("GroupNameAttr")
    public String groupNameAttr;

    @NameInMap("LoginNameAttr")
    public String loginNameAttr;

    @NameInMap("ServerAddr")
    public String serverAddr;

    @NameInMap("ServerPort")
    public String serverPort;

    @NameInMap("ServerType")
    public String serverType;

    @NameInMap("UseSsl")
    public Boolean useSsl;

    @NameInMap("UserDn")
    public String userDn;

    @NameInMap("UserFilter")
    public String userFilter;

    @NameInMap("UserPassword")
    public String userPassword;

    public static IdpLdapSubConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpLdapSubConfig self = new IdpLdapSubConfig();
        return TeaModel.build(map, self);
    }

    public IdpLdapSubConfig setBaseDn(String baseDn) {
        this.baseDn = baseDn;
        return this;
    }
    public String getBaseDn() {
        return this.baseDn;
    }

    public IdpLdapSubConfig setGroupBaseDn(String groupBaseDn) {
        this.groupBaseDn = groupBaseDn;
        return this;
    }
    public String getGroupBaseDn() {
        return this.groupBaseDn;
    }

    public IdpLdapSubConfig setGroupFilter(String groupFilter) {
        this.groupFilter = groupFilter;
        return this;
    }
    public String getGroupFilter() {
        return this.groupFilter;
    }

    public IdpLdapSubConfig setGroupMembershipAttr(String groupMembershipAttr) {
        this.groupMembershipAttr = groupMembershipAttr;
        return this;
    }
    public String getGroupMembershipAttr() {
        return this.groupMembershipAttr;
    }

    public IdpLdapSubConfig setGroupNameAttr(String groupNameAttr) {
        this.groupNameAttr = groupNameAttr;
        return this;
    }
    public String getGroupNameAttr() {
        return this.groupNameAttr;
    }

    public IdpLdapSubConfig setLoginNameAttr(String loginNameAttr) {
        this.loginNameAttr = loginNameAttr;
        return this;
    }
    public String getLoginNameAttr() {
        return this.loginNameAttr;
    }

    public IdpLdapSubConfig setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
        return this;
    }
    public String getServerAddr() {
        return this.serverAddr;
    }

    public IdpLdapSubConfig setServerPort(String serverPort) {
        this.serverPort = serverPort;
        return this;
    }
    public String getServerPort() {
        return this.serverPort;
    }

    public IdpLdapSubConfig setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

    public IdpLdapSubConfig setUseSsl(Boolean useSsl) {
        this.useSsl = useSsl;
        return this;
    }
    public Boolean getUseSsl() {
        return this.useSsl;
    }

    public IdpLdapSubConfig setUserDn(String userDn) {
        this.userDn = userDn;
        return this;
    }
    public String getUserDn() {
        return this.userDn;
    }

    public IdpLdapSubConfig setUserFilter(String userFilter) {
        this.userFilter = userFilter;
        return this;
    }
    public String getUserFilter() {
        return this.userFilter;
    }

    public IdpLdapSubConfig setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public String getUserPassword() {
        return this.userPassword;
    }

}
