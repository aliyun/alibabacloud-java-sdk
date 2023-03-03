// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    @NameInMap("ChannelType")
    public Integer channelType;

    @NameInMap("ReceiveUid")
    public Long receiveUid;

    @NameInMap("RegionId")
    public String regionId;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public SendMessageRequest setReceiveUid(Long receiveUid) {
        this.receiveUid = receiveUid;
        return this;
    }
    public Long getReceiveUid() {
        return this.receiveUid;
    }

    public SendMessageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
