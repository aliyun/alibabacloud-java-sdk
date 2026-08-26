// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppAuditRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The security audit method. Valid values:</p>
     * <ul>
     * <li>0: No security audit.</li>
     * <li>1: Built-in security audit.</li>
     * <li>2: Custom security audit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    /**
     * <p>The security audit URL required when custom security audit is used (AuditType=2). The URL must start with http:// or https://, must not contain private IP addresses, and must not include port numbers.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/exampleaudit">http://example.aliyundoc.com/exampleaudit</a></p>
     */
    @NameInMap("AuditUrl")
    public String auditUrl;

    /**
     * <p>The data center. This value must be the same as the data center specified in <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a>. Valid values: cn-shanghai (Shanghai) and ap-southeast-1 (Singapore).</p>
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
