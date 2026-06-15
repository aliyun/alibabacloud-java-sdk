// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SenderStatisticsByTagNameAndBatchIDRequest extends TeaModel {
    /**
     * <p>The sender address. If you do not specify this parameter, statistics for all sender addresses are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>If you use Dedicated IPs, use this parameter to filter statistics by a specific Dedicated IP.</p>
     * <p>If you do not specify this parameter, statistics for all dedicated IPs that match the other criteria are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.xxx.xxx.xxx</p>
     */
    @NameInMap("DedicatedIp")
    public String dedicatedIp;

    /**
     * <p>If you use Dedicated IPs, specify the ID of the dedicated IP pool to query.</p>
     * <p>If you do not specify this parameter, statistics for all resources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DedicatedIpPoolId")
    public String dedicatedIpPoolId;

    /**
     * <strong>example:</strong>
     * <p>dmdomain.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end time for the query. The time range between <code>StartTime</code> and <code>EndTime</code> cannot exceed 7 days. The format must be <code>YYYY-MM-DD</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>If you use Dedicated IPs, use this parameter to filter statistics by a specific Email Service Provider (ESP). Valid values are:</p>
     * <ul>
     * <li><p><code>gmail.com</code></p>
     * </li>
     * <li><p><code>yahoo.com</code></p>
     * </li>
     * <li><p><code>outlook.com</code></p>
     * </li>
     * <li><p><code>icloud.com</code></p>
     * </li>
     * <li><p><code>others</code> (matches data for all other ESPs)</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, statistics for all ESPs are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>gmail.com</p>
     */
    @NameInMap("Esp")
    public String esp;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time for the query. The date cannot be more than 30 days in the past. The format must be <code>YYYY-MM-DD</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The email tag. If you do not specify this parameter, statistics for all tags are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static SenderStatisticsByTagNameAndBatchIDRequest build(java.util.Map<String, ?> map) throws Exception {
        SenderStatisticsByTagNameAndBatchIDRequest self = new SenderStatisticsByTagNameAndBatchIDRequest();
        return TeaModel.build(map, self);
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setDedicatedIp(String dedicatedIp) {
        this.dedicatedIp = dedicatedIp;
        return this;
    }
    public String getDedicatedIp() {
        return this.dedicatedIp;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setDedicatedIpPoolId(String dedicatedIpPoolId) {
        this.dedicatedIpPoolId = dedicatedIpPoolId;
        return this;
    }
    public String getDedicatedIpPoolId() {
        return this.dedicatedIpPoolId;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setEsp(String esp) {
        this.esp = esp;
        return this;
    }
    public String getEsp() {
        return this.esp;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SenderStatisticsByTagNameAndBatchIDRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
