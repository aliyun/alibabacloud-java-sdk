// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveMessageAppRequest extends TeaModel {
    /**
     * <p>The name of the application. The name must be 2 to 16 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The content moderation method. Valid values:</p>
     * <ul>
     * <li>0 (default): disables content moderation.</li>
     * <li>1: uses built-in content moderation.</li>
     * <li>2: uses custom content moderation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    /**
     * <p>The URL for content moderation. If you set AuditType to 2, you must specify this parameter. The URL must start with http:// or https:// and cannot contain a private IP address or a port number. For more information about custom content moderation, see the &quot;Custom content moderation&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://demo.aliyundoc.com/exampleaudit">http://demo.aliyundoc.com/exampleaudit</a></p>
     */
    @NameInMap("AuditUrl")
    public String auditUrl;

    /**
     * <p>The data center. Valid values:</p>
     * <ul>
     * <li>cn-shanghai (default)</li>
     * <li>ap-southeast-1: Singapore</li>
     * </ul>
     * <blockquote>
     * <p> When you call other operations to manage the interactive messaging application, you must specify the same data center in which the application is created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The callback URL for events, such as logon, logoff, and joining and leaving a group. If you leave this parameter empty, event callbacks are disabled. <a href="~~2672836~~"></a>The callback URL must start with http:// or https:// and cannot contain a private IP address or a port number. For information about the callback message format and authentication logic, see the &quot;Event callbacks&quot; and &quot;Callback authentication&quot; sections of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://demo.aliyundoc.com/examplecallback">http://demo.aliyundoc.com/examplecallback</a></p>
     */
    @NameInMap("EventCallbackUrl")
    public String eventCallbackUrl;

    /**
     * <p>The retention period of group messages in the application. Valid values:</p>
     * <ul>
     * <li>0 (default): 30 days.</li>
     * <li>1: 90 days.</li>
     * <li>2: 180 days.</li>
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
