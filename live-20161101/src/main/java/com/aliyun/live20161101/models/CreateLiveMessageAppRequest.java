// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveMessageAppRequest extends TeaModel {
    /**
     * <p>The application name. The name must be 2 to 16 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The security audit mode. Valid values:</p>
     * <ul>
     * <li>0: default value. Security audit is disabled.</li>
     * <li>1: built-in security audit.</li>
     * <li>2: custom security audit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    /**
     * <p>The URL for custom security audit. This parameter is required when custom security audit is selected (AuditType=2). The URL must start with http:// or https://, must not contain private IP addresses, and must not include port numbers. For the format of custom security audit content, see the following section.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://demo.aliyundoc.com/exampleaudit">http://demo.aliyundoc.com/exampleaudit</a></p>
     */
    @NameInMap("AuditUrl")
    public String auditUrl;

    /**
     * <p>The data center. Valid values:</p>
     * <ul>
     * <li>cn-shanghai: default value. Shanghai.</li>
     * <li>ap-southeast-1: Singapore.</li>
     * </ul>
     * <blockquote>
     * <p>When calling other interactive messaging API operations, the data center must be the same as the one specified when creating the interactive messaging application.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The event callback URL for client logon, logout, join group, and leave group events. If this parameter is empty, event callbacks are disabled. For the callback API operations that are triggered, see <a href="https://help.aliyun.com/document_detail/2672836.html">Client access</a>. The event callback URL must start with http:// or https://, must not contain private IP addresses, and must not include port numbers. For the event callback format and callback authentication logic, see the following section.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://demo.aliyundoc.com/examplecallback">http://demo.aliyundoc.com/examplecallback</a></p>
     */
    @NameInMap("EventCallbackUrl")
    public String eventCallbackUrl;

    /**
     * <p>The storage duration tier for group messages within the application. Valid values:</p>
     * <ul>
     * <li>0: default value. Messages are stored for 30 days.</li>
     * <li>1: messages are stored for 90 days.</li>
     * <li>2: messages are stored for 180 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MsgLifeCycle")
    public Integer msgLifeCycle;

    public static CreateLiveMessageAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveMessageAppRequest self = new CreateLiveMessageAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveMessageAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateLiveMessageAppRequest setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

    public CreateLiveMessageAppRequest setAuditUrl(String auditUrl) {
        this.auditUrl = auditUrl;
        return this;
    }
    public String getAuditUrl() {
        return this.auditUrl;
    }

    public CreateLiveMessageAppRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateLiveMessageAppRequest setEventCallbackUrl(String eventCallbackUrl) {
        this.eventCallbackUrl = eventCallbackUrl;
        return this;
    }
    public String getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

    public CreateLiveMessageAppRequest setMsgLifeCycle(Integer msgLifeCycle) {
        this.msgLifeCycle = msgLifeCycle;
        return this;
    }
    public Integer getMsgLifeCycle() {
        return this.msgLifeCycle;
    }

}
