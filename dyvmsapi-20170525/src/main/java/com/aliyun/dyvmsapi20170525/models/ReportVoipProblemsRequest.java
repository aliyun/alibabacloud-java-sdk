// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ReportVoipProblemsRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Title")
    public String title;

    @NameInMap("VoipId")
    public String voipId;

    public static ReportVoipProblemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportVoipProblemsRequest self = new ReportVoipProblemsRequest();
        return TeaModel.build(map, self);
    }

    public ReportVoipProblemsRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ReportVoipProblemsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ReportVoipProblemsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReportVoipProblemsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReportVoipProblemsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReportVoipProblemsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ReportVoipProblemsRequest setVoipId(String voipId) {
        this.voipId = voipId;
        return this;
    }
    public String getVoipId() {
        return this.voipId;
    }

}
