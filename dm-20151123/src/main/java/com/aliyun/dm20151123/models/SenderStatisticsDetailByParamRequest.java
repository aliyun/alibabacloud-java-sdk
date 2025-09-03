// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SenderStatisticsDetailByParamRequest extends TeaModel {
    /**
     * <p>Sending address. If not filled, it represents all addresses.</p>
     * <blockquote>
     * <p><strong>AccountName</strong>, <strong>TagName</strong>, and <strong>ToAddress</strong> can all be left unfilled. If any are filled, only one of these parameters can be passed; you cannot pass a combination of two or more.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s***@example.net</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigSetId")
    public String configSetId;

    /**
     * <p>End time. The span between start and end times cannot exceed 30 days, format: yyyy-MM-dd HH:mm.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-04-29 00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    /**
     * <p>Specifies the number of results to return in this request. Range is 1~100.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>Used for pagination. Specifies the offset for this request. If there are more results, set this returned value to the NextStart in the next request.</p>
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
     * <p>Start time. The span between start and end times cannot exceed 30 days, format: yyyy-MM-dd HH:mm</p>
     * 
     * <strong>example:</strong>
     * <p>2021-04-28 00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Delivery result. If not filled, it represents all statuses. Values:</p>
     * <ul>
     * <li>0: Success</li>
     * <li>2: Invalid Address</li>
     * <li>3: Spam</li>
     * <li>4: Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Email tag. If not filled, it represents all tags.</p>
     * 
     * <strong>example:</strong>
     * <p>EmailQuestionnaireHelioscam</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>Recipient address. If not filled, it represents all recipient addresses.</p>
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
