// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRecordFileDownloadUrlRequest extends TeaModel {
    /**
     * <p>The ID of the call record. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view <strong>Call Record ID</strong> on the <strong>Call Record Query</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abcedf1234</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The call initiation time in the call record. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>. View <strong>Call Initiated At</strong> on the <strong>Call Record Query</strong> page, or view the call_time field in the Call Detail Record (CDR) receipt.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-05 12:00:00</p>
     */
    @NameInMap("CallTime")
    public String callTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * <blockquote>
     * <p> This parameter is required when <strong>ProductType</strong> is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FC123456</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><strong>AXB_170</strong>.</li>
     * <li><strong>AXN_170</strong>.</li>
     * <li><strong>AXN_95</strong>.</li>
     * <li><strong>AXN_EXTENSION_REUSE</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.</p>
     * </li>
     * <li><p>This parameter is required when <strong>PoolKey</strong> is left empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AXB_170</p>
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
