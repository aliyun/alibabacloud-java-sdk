// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetTriggerResponseBody extends TeaModel {
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

    public static GetTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTriggerResponseBody self = new GetTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTriggerResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetTriggerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTriggerResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetTriggerResponseBody setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public GetTriggerResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetTriggerResponseBody setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public GetTriggerResponseBody setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public GetTriggerResponseBody setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public GetTriggerResponseBody setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

    public GetTriggerResponseBody setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public GetTriggerResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
