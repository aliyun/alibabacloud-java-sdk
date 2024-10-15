// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVoiceFileAuditInfoRequest extends TeaModel {
    /**
     * <p>The type of the voice file. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): the voice notification file.</li>
     * <li><strong>2</strong>: the recording file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BusinessType")
    public Integer businessType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the voice file. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong> or <strong>Voice File Management</strong>, and then click the <strong>Voice Notification Files</strong> tab to view the <strong>voice ID</strong>.</p>
     * <blockquote>
     * <p>You can query up to 10 voice files each time. Separate the voice file names with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8501d2eb-efbb-471f-xxx8-****.wav</p>
     */
    @NameInMap("VoiceCodes")
    public String voiceCodes;

    public static QueryVoiceFileAuditInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceFileAuditInfoRequest self = new QueryVoiceFileAuditInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryVoiceFileAuditInfoRequest setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }
    public Integer getBusinessType() {
        return this.businessType;
    }

    public QueryVoiceFileAuditInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryVoiceFileAuditInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryVoiceFileAuditInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryVoiceFileAuditInfoRequest setVoiceCodes(String voiceCodes) {
        this.voiceCodes = voiceCodes;
        return this;
    }
    public String getVoiceCodes() {
        return this.voiceCodes;
    }

}
