// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppAuditRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application whose content moderation settings you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The content moderation method. Valid values:</p>
     * <ul>
     * <li>0: disables content moderation.</li>
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
     * <p>The URL for content moderation. This parameter is required if you set AuditType to 2. The URL must start with http:// or https:// and cannot contain a private IP address or a port number.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/exampleaudit">http://example.aliyundoc.com/exampleaudit</a></p>
     */
    @NameInMap("AuditUrl")
    public String auditUrl;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    public static ModifyLiveMessageAppAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageAppAuditRequest self = new ModifyLiveMessageAppAuditRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageAppAuditRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageAppAuditRequest setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

    public ModifyLiveMessageAppAuditRequest setAuditUrl(String auditUrl) {
        this.auditUrl = auditUrl;
        return this;
    }
    public String getAuditUrl() {
        return this.auditUrl;
    }

    public ModifyLiveMessageAppAuditRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

}
