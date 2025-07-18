// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpConfig extends TeaModel {
    @NameInMap("AttrMapConfig")
    public IdpAttrMapConfig attrMapConfig;

    @NameInMap("ConnectConfig")
    public IdpConnectConfig connectConfig;

    @NameInMap("Description")
    public String description;

    @NameInMap("DingtalkConfig")
    public IdpDingtalkSubConfig dingtalkConfig;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("FeishuConfig")
    public IdpFeishuSubConfig feishuConfig;

    @NameInMap("IdaasConfig")
    public IdpIdaas2SubConfig idaasConfig;

    @NameInMap("IdpConfigId")
    public String idpConfigId;

    @NameInMap("LastSyncTimeUnix")
    public Long lastSyncTimeUnix;

    @NameInMap("LdapConfig")
    public IdpLdapSubConfig ldapConfig;

    @NameInMap("LoginConfig")
    public IdpLoginConfig loginConfig;

    @NameInMap("Name")
    public String name;

    @NameInMap("SyncConfig")
    public IdpSyncConfig syncConfig;

    @NameInMap("SyncStatus")
    public String syncStatus;

    @NameInMap("Type")
    public String type;

    @NameInMap("WeixinConfig")
    public IdpWeixin2SubConfig weixinConfig;

    @NameInMap("WuyingConfig")
    public OpenStructIdpWuyingSubConfig wuyingConfig;

    public static IdpConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpConfig self = new IdpConfig();
        return TeaModel.build(map, self);
    }

    public IdpConfig setAttrMapConfig(IdpAttrMapConfig attrMapConfig) {
        this.attrMapConfig = attrMapConfig;
        return this;
    }
    public IdpAttrMapConfig getAttrMapConfig() {
        return this.attrMapConfig;
    }

    public IdpConfig setConnectConfig(IdpConnectConfig connectConfig) {
        this.connectConfig = connectConfig;
        return this;
    }
    public IdpConnectConfig getConnectConfig() {
        return this.connectConfig;
    }

    public IdpConfig setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IdpConfig setDingtalkConfig(IdpDingtalkSubConfig dingtalkConfig) {
        this.dingtalkConfig = dingtalkConfig;
        return this;
    }
    public IdpDingtalkSubConfig getDingtalkConfig() {
        return this.dingtalkConfig;
    }

    public IdpConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public IdpConfig setFeishuConfig(IdpFeishuSubConfig feishuConfig) {
        this.feishuConfig = feishuConfig;
        return this;
    }
    public IdpFeishuSubConfig getFeishuConfig() {
        return this.feishuConfig;
    }

    public IdpConfig setIdaasConfig(IdpIdaas2SubConfig idaasConfig) {
        this.idaasConfig = idaasConfig;
        return this;
    }
    public IdpIdaas2SubConfig getIdaasConfig() {
        return this.idaasConfig;
    }

    public IdpConfig setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public IdpConfig setLastSyncTimeUnix(Long lastSyncTimeUnix) {
        this.lastSyncTimeUnix = lastSyncTimeUnix;
        return this;
    }
    public Long getLastSyncTimeUnix() {
        return this.lastSyncTimeUnix;
    }

    public IdpConfig setLdapConfig(IdpLdapSubConfig ldapConfig) {
        this.ldapConfig = ldapConfig;
        return this;
    }
    public IdpLdapSubConfig getLdapConfig() {
        return this.ldapConfig;
    }

    public IdpConfig setLoginConfig(IdpLoginConfig loginConfig) {
        this.loginConfig = loginConfig;
        return this;
    }
    public IdpLoginConfig getLoginConfig() {
        return this.loginConfig;
    }

    public IdpConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IdpConfig setSyncConfig(IdpSyncConfig syncConfig) {
        this.syncConfig = syncConfig;
        return this;
    }
    public IdpSyncConfig getSyncConfig() {
        return this.syncConfig;
    }

    public IdpConfig setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
    public String getSyncStatus() {
        return this.syncStatus;
    }

    public IdpConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IdpConfig setWeixinConfig(IdpWeixin2SubConfig weixinConfig) {
        this.weixinConfig = weixinConfig;
        return this;
    }
    public IdpWeixin2SubConfig getWeixinConfig() {
        return this.weixinConfig;
    }

    public IdpConfig setWuyingConfig(OpenStructIdpWuyingSubConfig wuyingConfig) {
        this.wuyingConfig = wuyingConfig;
        return this;
    }
    public OpenStructIdpWuyingSubConfig getWuyingConfig() {
        return this.wuyingConfig;
    }

}
