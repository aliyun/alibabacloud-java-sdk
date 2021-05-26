// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetPageGroupsByChannelTypeRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("ChannelType")
    public Integer channelType;

    @NameInMap("AfterSortKey")
    public Long afterSortKey;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetPageGroupsByChannelTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPageGroupsByChannelTypeRequest self = new GetPageGroupsByChannelTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetPageGroupsByChannelTypeRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public GetPageGroupsByChannelTypeRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public GetPageGroupsByChannelTypeRequest setAfterSortKey(Long afterSortKey) {
        this.afterSortKey = afterSortKey;
        return this;
    }
    public Long getAfterSortKey() {
        return this.afterSortKey;
    }

    public GetPageGroupsByChannelTypeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
