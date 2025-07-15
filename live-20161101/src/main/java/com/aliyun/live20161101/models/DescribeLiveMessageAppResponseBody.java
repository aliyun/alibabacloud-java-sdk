// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveMessageAppResponseBody extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The AppKey of the interactive messaging application. It is used to authorize operations related to the application ID.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The name of the interactive messaging application.</p>
     * 
     * <strong>example:</strong>
     * <p>testApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The signature of the interactive messaging application. It is required by the interactive messaging SDK.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AppSign")
    public String appSign;

    /**
     * <p>The content moderation method. Valid values:</p>
     * <ul>
     * <li>0: Content moderation is disabled.</li>
     * <li>1: Built-in content moderation is used.</li>
     * <li>2: Custom content moderation is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    /**
     * <p>The URL for content moderation. This parameter is returned when the value of AuditType is 2.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/exampleaudit">http://example.aliyundoc.com/exampleaudit</a></p>
     */
    @NameInMap("AuditUrl")
    public String auditUrl;

    /**
     * <p>The time when the interactive messaging application was created. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1698305471</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The data center.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>Indicates whether the interactive messaging application is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Disable")
    public Boolean disable;

    /**
     * <p>The callback URL for events such as user logon, logoff, joining a group, and leaving a group. An empty value indicates that callbacks are disabled.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/examplecallback">http://example.aliyundoc.com/examplecallback</a></p>
     */
    @NameInMap("EventCallbackUrl")
    public String eventCallbackUrl;

    /**
     * <p>The time when the interactive messaging application was modified. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1698305471</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The retention period of group messages in the application. Valid values:</p>
     * <ul>
     * <li>0 (default): 30 days</li>
     * <li>1: 90 days</li>
     * <li>2: 180 days</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MsgLifeCycle")
    public Integer msgLifeCycle;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9FB68B5B-ED07-18F0-A3CF-083F4E74****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveMessageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveMessageAppResponseBody self = new DescribeLiveMessageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveMessageAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeLiveMessageAppResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeLiveMessageAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveMessageAppResponseBody setAppSign(String appSign) {
        this.appSign = appSign;
        return this;
    }
    public String getAppSign() {
        return this.appSign;
    }

    public DescribeLiveMessageAppResponseBody setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

    public DescribeLiveMessageAppResponseBody setAuditUrl(String auditUrl) {
        this.auditUrl = auditUrl;
        return this;
    }
    public String getAuditUrl() {
        return this.auditUrl;
    }

    public DescribeLiveMessageAppResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeLiveMessageAppResponseBody setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public DescribeLiveMessageAppResponseBody setDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }
    public Boolean getDisable() {
        return this.disable;
    }

    public DescribeLiveMessageAppResponseBody setEventCallbackUrl(String eventCallbackUrl) {
        this.eventCallbackUrl = eventCallbackUrl;
        return this;
    }
    public String getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

    public DescribeLiveMessageAppResponseBody setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public DescribeLiveMessageAppResponseBody setMsgLifeCycle(Integer msgLifeCycle) {
        this.msgLifeCycle = msgLifeCycle;
        return this;
    }
    public Integer getMsgLifeCycle() {
        return this.msgLifeCycle;
    }

    public DescribeLiveMessageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
