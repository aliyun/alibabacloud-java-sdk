// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRecordFileDownloadUrlRequest extends TeaModel {
    /**
     * <p>The ID of the call record. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view **Call Record ID** on the **Call Record Query** page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The call initiation time in the call record. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account). View **Call Initiated At** on the **Call Record Query** page, or view the call_time field in the Call Detail Record (CDR) receipt.</p>
     */
    @NameInMap("CallTime")
    public String callTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     * <br>
     * <p>>  This parameter is required when **ProductType** is left empty.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The product type. Valid values:</p>
     * <br>
     * <p>*   **AXB_170**.</p>
     * <p>*   **AXN_170**.</p>
     * <p>*   **AXN_95**.</p>
     * <p>*   **AXN_EXTENSION_REUSE**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.</p>
     * <br>
     * <p>*   This parameter is required when **PoolKey** is left empty.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryRecordFileDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordFileDownloadUrlRequest self = new QueryRecordFileDownloadUrlRequest();
        return TeaModel.build(map, self);
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

    public QueryRecordFileDownloadUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

}
