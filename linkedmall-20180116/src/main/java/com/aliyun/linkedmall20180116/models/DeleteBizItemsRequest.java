// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DeleteBizItemsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ItemIdList")
    public java.util.List<Long> itemIdList;

    @NameInMap("SubBizId")
    public String subBizId;

    public static DeleteBizItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizItemsRequest self = new DeleteBizItemsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBizItemsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteBizItemsRequest setItemIdList(java.util.List<Long> itemIdList) {
        this.itemIdList = itemIdList;
        return this;
    }
    public java.util.List<Long> getItemIdList() {
        return this.itemIdList;
    }

    public DeleteBizItemsRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

}
