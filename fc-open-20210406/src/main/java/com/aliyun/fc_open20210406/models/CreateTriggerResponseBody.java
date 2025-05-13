// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateTriggerResponseBody extends TeaModel {
    /**
     * <p>The time when the trigger was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-08-15T15:00:00.000+0000</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The description of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The domain name used to invoke the function by using HTTP. You can add this domain name as the prefix to the endpoint of Function Compute. This way, you can invoke the function that corresponds to the trigger by using HTTP. For example, <code>{domainName}.cn-shanghai.fc.aliyuncs.com</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-service-demo-function-jkhksh</p>
     */
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>The ARN of the RAM role that is used by the event source to invoke the function.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/fc-test</p>
     */
    @NameInMap("invocationRole")
    public String invocationRole;

    /**
     * <p>The time when the trigger was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>016-08-15T17:00:00.000+0000</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The version of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The ARN of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:12345:mybucket</p>
     */
    @NameInMap("sourceArn")
    public String sourceArn;

    /**
     * <p>The configurations of the trigger. The configurations vary based on the trigger type.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;events&quot;: [&quot;oss:ObjectCreated:*&quot;], &quot;filter&quot;: {&quot;key&quot;: {&quot;prefix&quot;: &quot;/prefix&quot;, &quot;suffix&quot;: &quot;.zip&quot;}}}</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfig;

    /**
     * <p>The unique ID of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>3e270f2f-cef2-421a-bc86-ff4e8088****</p>
     */
    @NameInMap("triggerId")
    public String triggerId;

    /**
     * <p>The name of the trigger. The name contains only letters, digits, hyphens (-), and underscores (_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).</p>
     * 
     * <strong>example:</strong>
     * <p>oss_create_object_trigger_demo</p>
     */
    @NameInMap("triggerName")
    public String triggerName;

    /**
     * <p>The trigger type. Valid values: <strong>oss</strong>, <strong>log</strong>, <strong>tablestore</strong>, <strong>timer</strong>, <strong>http</strong>, <strong>cdn_events</strong>, <strong>mns_topic</strong>, and <strong>eventbridge</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    /**
     * <p>The public domain address. You can access HTTP triggers over the Internet by using HTTP or HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://svc-func-xxxxxxxx.cn-hangzhou.fcapp.run">https://svc-func-xxxxxxxx.cn-hangzhou.fcapp.run</a></p>
     */
    @NameInMap("urlInternet")
    public String urlInternet;

    /**
     * <p>The private endpoint. In a VPC, you can access HTTP triggers by using HTTP or HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://svc-func-xxxxxxxx.cn-hangzhou-vpc.fcapp.run">https://svc-func-xxxxxxxx.cn-hangzhou-vpc.fcapp.run</a></p>
     */
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
