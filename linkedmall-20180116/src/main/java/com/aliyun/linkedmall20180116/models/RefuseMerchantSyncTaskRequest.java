// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefuseMerchantSyncTaskRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("SellerNick")
    public String sellerNick;

    @NameInMap("TaskId")
    public String taskId;

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
