// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerResponseBody extends TeaModel {
    // 创建时间
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("description")
    public String description;

    // 域名名称，使用域名名称拼接上函数计算域名，可以采用HTTP协议调用到触发器对应版本的函数。例如{domainName}.cn-shanghai.fc.aliyuncs.com
    @NameInMap("domainName")
    public String domainName;

    // 调用函数使用的RAM角色的ARN
    @NameInMap("invocationRole")
    public String invocationRole;

    // 上次修改时间
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    // service版本
    @NameInMap("qualifier")
    public String qualifier;

    // event source的Aliyun Resource Name（ARN
    @NameInMap("sourceArn")
    public String sourceArn;

    // trigger配置对象
    @NameInMap("triggerConfig")
    public String triggerConfig;

    @NameInMap("triggerId")
    public String triggerId;

    // trigger名称
    @NameInMap("triggerName")
    public String triggerName;

    // trigger类型，如 oss, log, tablestore, timer, http, cdn_events, mns_topic
    @NameInMap("triggerType")
    public String triggerType;

    // 公网域名地址。在互联网可以通过HTTP协议或者HTTPS协议访问HTTP Trigger。
    @NameInMap("urlInternet")
    public String urlInternet;

    // 私网域名地址。在VPC可以通过HTTP协议或者HTTPS协议访问HTTP Trigger。
    @NameInMap("urlIntranet")
    public String urlIntranet;

    public static UpdateTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerResponseBody self = new UpdateTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public UpdateTriggerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTriggerResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateTriggerResponseBody setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public UpdateTriggerResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public UpdateTriggerResponseBody setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public UpdateTriggerResponseBody setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public UpdateTriggerResponseBody setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public UpdateTriggerResponseBody setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

    public UpdateTriggerResponseBody setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public UpdateTriggerResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public UpdateTriggerResponseBody setUrlInternet(String urlInternet) {
        this.urlInternet = urlInternet;
        return this;
    }
    public String getUrlInternet() {
        return this.urlInternet;
    }

    public UpdateTriggerResponseBody setUrlIntranet(String urlIntranet) {
        this.urlIntranet = urlIntranet;
        return this;
    }
    public String getUrlIntranet() {
        return this.urlIntranet;
    }

}
