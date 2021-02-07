// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRecordFileDownloadUrlRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("CallTime")
    public String callTime;

    public static QueryRecordFileDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordFileDownloadUrlRequest self = new QueryRecordFileDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordFileDownloadUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryRecordFileDownloadUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryRecordFileDownloadUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryRecordFileDownloadUrlRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public QueryRecordFileDownloadUrlRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryRecordFileDownloadUrlRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public QueryRecordFileDownloadUrlRequest setCallTime(String callTime) {
        this.callTime = callTime;
        return this;
    }
    public String getCallTime() {
        return this.callTime;
    }

}
