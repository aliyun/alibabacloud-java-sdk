// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateTriggerResponseBody extends TeaModel {
    // The time when the trigger was created.
    @NameInMap("createdTime")
    public String createdTime;

    // The description of the trigger.
    @NameInMap("description")
    public String description;

    // The domain name used to invoke the function by using HTTP. You can add this domain name as the prefix to the endpoint of Function Compute. This way, you can invoke the function that corresponds to the trigger by using HTTP. For example, `{domainName}.cn-shanghai.fc.aliyuncs.com`.
    @NameInMap("domainName")
    public String domainName;

    // The ARN of the RAM role that is used by the event source to invoke the function.
    @NameInMap("invocationRole")
    public String invocationRole;

    // The time when the trigger was last modified.
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    // The version of the service.
    @NameInMap("qualifier")
    public String qualifier;

    // The ARN of the event source.
    @NameInMap("sourceArn")
    public String sourceArn;

    // The configurations of the trigger. The configurations vary based on the trigger type.
    @NameInMap("triggerConfig")
    public String triggerConfig;

    // The unique ID of the trigger.
    @NameInMap("triggerId")
    public String triggerId;

    // The name of the trigger. The name contains only letters, digits, hyphens (-), and underscores (\_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).
    @NameInMap("triggerName")
    public String triggerName;

    // The trigger type, such as **oss**, **log**, **tablestore**, **timer**, **http**, **cdn_events**, and **mns_topic**.
    @NameInMap("triggerType")
    public String triggerType;

    // The public domain address. You can access HTTP triggers over the Internet by using HTTP or HTTPS.
    @NameInMap("urlInternet")
    public String urlInternet;

    // The private endpoint. In a VPC, you can access HTTP triggers by using HTTP or HTTPS.
    @NameInMap("urlIntranet")
    public String urlIntranet;

    public static CreateTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerResponseBody self = new CreateTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTriggerResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CreateTriggerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTriggerResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateTriggerResponseBody setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public CreateTriggerResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public CreateTriggerResponseBody setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public CreateTriggerResponseBody setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public CreateTriggerResponseBody setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public CreateTriggerResponseBody setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

    public CreateTriggerResponseBody setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public CreateTriggerResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public CreateTriggerResponseBody setUrlInternet(String urlInternet) {
        this.urlInternet = urlInternet;
        return this;
    }
    public String getUrlInternet() {
        return this.urlInternet;
    }

    public CreateTriggerResponseBody setUrlIntranet(String urlIntranet) {
        this.urlIntranet = urlIntranet;
        return this;
    }
    public String getUrlIntranet() {
        return this.urlIntranet;
    }

}
