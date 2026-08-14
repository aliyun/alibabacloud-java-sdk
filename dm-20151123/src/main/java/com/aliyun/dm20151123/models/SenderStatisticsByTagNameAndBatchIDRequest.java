// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SenderStatisticsByTagNameAndBatchIDRequest extends TeaModel {
    /**
     * <p>The sender address. If this parameter is not specified, data for all addresses is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>For dedicated IP users, specifies a dedicated IP address to query data for.</p>
     * <p>If this parameter is not specified, data for all dedicated IP addresses is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.xxx.xxx.xxx</p>
     */
    @NameInMap("DedicatedIp")
    public String dedicatedIp;

    /**
     * <p>For dedicated IP users, specifies the ID of a dedicated IP pool to query data for.</p>
     * <p>If this parameter is not specified, data for all dedicated IP pools is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DedicatedIpPoolId")
    public String dedicatedIpPoolId;

    /**
     * <p>The sender domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>dmdomain.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end time. The time span between the start time and end time cannot exceed 31 days. Format: yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>For dedicated IP users, specifies a particular ESP to query data for. Valid values:</p>
     * <ul>
     * <li>gmail.com</li>
     * <li>yahoo.com</li>
     * <li>outlook.com</li>
     * <li>icloud.com</li>
     * <li>others: data for ESPs other than the ones listed above.</li>
     * </ul>
     * <p>If this parameter is not specified, data for all ESPs is returned.</p>
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
     * <p>The start time. The time cannot be earlier than 90 days ago. Format: yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The email tag. If this parameter is not specified, data for all tags is returned.</p>
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
