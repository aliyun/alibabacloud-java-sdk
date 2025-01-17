// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SyncMerchantInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******002</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ItemList")
    public String itemList;

    @NameInMap("SellerNick")
    public String sellerNick;

    /**
     * <strong>example:</strong>
     * <p>1****3</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>1639540484044</p>
     */
    @NameInMap("TimeStamp")
    public Long timeStamp;

    public static SyncMerchantInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMerchantInfoRequest self = new SyncMerchantInfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncMerchantInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SyncMerchantInfoRequest setItemList(String itemList) {
        this.itemList = itemList;
        return this;
    }
    public String getItemList() {
        return this.itemList;
    }

    public SyncMerchantInfoRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public SyncMerchantInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SyncMerchantInfoRequest setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

}
