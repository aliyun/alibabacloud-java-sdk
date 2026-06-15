// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SenderStatisticsDetailByParamRequest extends TeaModel {
    /**
     * <p>The sender address. If you leave this parameter empty, emails from all sender addresses are queried.</p>
     * <blockquote>
     * <p>You can leave <strong>AccountName</strong>, <strong>TagName</strong>, and <strong>ToAddress</strong> empty. You can specify a value for only one of these parameters at a time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s***@example.net</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The ID of the configuration set.</p>
     * 
     * <strong>example:</strong>
     * <p>95437e39-5433-4c6c-8b66-0c4eac2f4d97</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigSetId")
    public String configSetId;

    /**
     * <p>The end time. The time range between the start time and the end time cannot exceed 30 days. The format is yyyy-MM-dd HH:mm.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-04-29 00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the independent IP address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>e42a4d8e-66e0-4ea3-88aa-74c66c661cef</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    /**
     * <p>The number of results to return. The value can range from 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The offset for this request, used for paging. If more results are available, set the \<code>NextStart\\</code> parameter in your next request to this return value.</p>
     * 
     * <strong>example:</strong>
     * <p>90f0243616#203#a***@example.net-1658817837#a***@example.net.247475288187</p>
     */
    @NameInMap("NextStart")
    public String nextStart;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time. The time range between the start time and the end time cannot exceed 30 days. The format is yyyy-MM-dd HH:mm.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-04-28 00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The delivery status. If you leave this parameter empty, emails in all delivery statuses are queried. Valid values:</p>
     * <ul>
     * <li><p>0: delivered successfully</p>
     * </li>
     * <li><p>2: invalid address</p>
     * </li>
     * <li><p>3: spam</p>
     * </li>
     * <li><p>4: failed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The email tag. If you leave this parameter empty, emails with all tags are queried.
     * When you send an email using SMTP, specify the \<code>TagName\\</code> and its value for the \<code>X-AliDM-Trace\\</code> field. For more information, see the examples for email tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>EmailQuestionnaireHelioscam</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The recipient address. If you leave this parameter empty, emails sent to all recipient addresses are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>b***@example.net</p>
     */
    @NameInMap("ToAddress")
    public String toAddress;

    public static SenderStatisticsDetailByParamRequest build(java.util.Map<String, ?> map) throws Exception {
        SenderStatisticsDetailByParamRequest self = new SenderStatisticsDetailByParamRequest();
        return TeaModel.build(map, self);
    }

    public SenderStatisticsDetailByParamRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SenderStatisticsDetailByParamRequest setConfigSetId(String configSetId) {
        this.configSetId = configSetId;
        return this;
    }
    public String getConfigSetId() {
        return this.configSetId;
    }

    public SenderStatisticsDetailByParamRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SenderStatisticsDetailByParamRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public SenderStatisticsDetailByParamRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public SenderStatisticsDetailByParamRequest setNextStart(String nextStart) {
        this.nextStart = nextStart;
        return this;
    }
    public String getNextStart() {
        return this.nextStart;
    }

    public SenderStatisticsDetailByParamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SenderStatisticsDetailByParamRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SenderStatisticsDetailByParamRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SenderStatisticsDetailByParamRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SenderStatisticsDetailByParamRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SenderStatisticsDetailByParamRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public SenderStatisticsDetailByParamRequest setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

}
