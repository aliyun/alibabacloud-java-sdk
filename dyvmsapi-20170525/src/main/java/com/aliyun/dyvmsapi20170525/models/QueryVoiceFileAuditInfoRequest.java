// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVoiceFileAuditInfoRequest extends TeaModel {
    /**
     * <p>The type of the voice file. Valid values:</p>
     * <br>
     * <p>*   **0** (default): the voice notification file.</p>
     * <p>*   **2**: the recording file.</p>
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
     * <p>The ID of the voice file. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications** or **Voice File Management**, and then click the **Voice Notification Files** tab to view the **voice ID**.</p>
     * <br>
     * <p>> You can query up to 10 voice files each time. Separate the voice file names with commas (,).</p>
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
