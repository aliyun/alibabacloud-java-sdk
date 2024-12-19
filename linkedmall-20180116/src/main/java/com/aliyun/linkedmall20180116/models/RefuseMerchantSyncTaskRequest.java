// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefuseMerchantSyncTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20190325****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("SellerNick")
    public String sellerNick;

    /**
     * <strong>example:</strong>
     * <p>1***1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>1641708010</p>
     */
    @NameInMap("TimeStamp")
    public Long timeStamp;

    public static RefuseMerchantSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseMerchantSyncTaskRequest self = new RefuseMerchantSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public RefuseMerchantSyncTaskRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefuseMerchantSyncTaskRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public RefuseMerchantSyncTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RefuseMerchantSyncTaskRequest setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

}
