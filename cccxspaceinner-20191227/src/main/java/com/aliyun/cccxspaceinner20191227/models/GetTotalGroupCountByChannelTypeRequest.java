// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetTotalGroupCountByChannelTypeRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("ChannelType")
    public Integer channelType;

    public static GetTotalGroupCountByChannelTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTotalGroupCountByChannelTypeRequest self = new GetTotalGroupCountByChannelTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetTotalGroupCountByChannelTypeRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public GetTotalGroupCountByChannelTypeRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

}
