// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetTrackListByMailFromAndTagNameRequest extends TeaModel {
    /**
     * <p>The sender address.</p>
     * <blockquote>
     * <p>If you leave this parameter empty, data for all addresses is returned. This parameter is required if you specify TagName.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:e-service@amegroups.cn">e-service@amegroups.cn</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The configuration set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ConfigSetId")
    public String configSetId;

    /**
     * <p>The dedicated IP address. This parameter is available only for users of dedicated IPs.</p>
     * <p>If you do not specify this parameter, data for all IPs is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.xxx.xxx.xxx</p>
     */
    @NameInMap("DedicatedIp")
    public String dedicatedIp;

    /**
     * <p>The ID of the dedicated IP pool. This parameter is available only for users of dedicated IPs.</p>
     * <p>If you do not specify this parameter, data for all IP pools is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DedicatedIpPoolId")
    public String dedicatedIpPoolId;

    /**
     * <p>The end time. The time span between the start time and end time cannot exceed 15 days. The format is yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The Email Service Provider (ESP). This parameter is available only for users of dedicated IPs. Valid values:</p>
     * <ul>
     * <li><p>gmail.com</p>
     * </li>
     * <li><p>yahoo.com</p>
     * </li>
     * <li><p>outlook.com</p>
     * </li>
     * <li><p>icloud.com</p>
     * </li>
     * <li><p>others (data for ESPs other than the ones listed above)</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, data for all ESPs is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>gmail.com</p>
     */
    @NameInMap("Esp")
    public String esp;

    /**
     * <p>The value is 0 for the first query and 1 for subsequent queries. A value of 1 indicates a paged query in chronological order. (This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>（本字段已废弃）</p>
     */
    @NameInMap("Offset")
    public String offset;

    /**
     * <p>Used for paging. Do not set this parameter for the first query. For subsequent queries, set this parameter to the OffsetCreateTime value from the previous response. (This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>（本字段已废弃）</p>
     */
    @NameInMap("OffsetCreateTime")
    public String offsetCreateTime;

    /**
     * <p>(This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>（本字段已废弃）</p>
     */
    @NameInMap("OffsetCreateTimeDesc")
    public String offsetCreateTimeDesc;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time. The time cannot be earlier than 30 days ago. The format is yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The email tag. If you leave this parameter empty, data for all tags is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>(This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>（本字段已废弃）</p>
     */
    @NameInMap("Total")
    public String total;

    public static GetTrackListByMailFromAndTagNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrackListByMailFromAndTagNameRequest self = new GetTrackListByMailFromAndTagNameRequest();
        return TeaModel.build(map, self);
    }

    public GetTrackListByMailFromAndTagNameRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetTrackListByMailFromAndTagNameRequest setConfigSetId(String configSetId) {
        this.configSetId = configSetId;
        return this;
    }
    public String getConfigSetId() {
        return this.configSetId;
    }

    public GetTrackListByMailFromAndTagNameRequest setDedicatedIp(String dedicatedIp) {
        this.dedicatedIp = dedicatedIp;
        return this;
    }
    public String getDedicatedIp() {
        return this.dedicatedIp;
    }

    public GetTrackListByMailFromAndTagNameRequest setDedicatedIpPoolId(String dedicatedIpPoolId) {
        this.dedicatedIpPoolId = dedicatedIpPoolId;
        return this;
    }
    public String getDedicatedIpPoolId() {
        return this.dedicatedIpPoolId;
    }

    public GetTrackListByMailFromAndTagNameRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTrackListByMailFromAndTagNameRequest setEsp(String esp) {
        this.esp = esp;
        return this;
    }
    public String getEsp() {
        return this.esp;
    }

    public GetTrackListByMailFromAndTagNameRequest setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public GetTrackListByMailFromAndTagNameRequest setOffsetCreateTime(String offsetCreateTime) {
        this.offsetCreateTime = offsetCreateTime;
        return this;
    }
    public String getOffsetCreateTime() {
        return this.offsetCreateTime;
    }

    public GetTrackListByMailFromAndTagNameRequest setOffsetCreateTimeDesc(String offsetCreateTimeDesc) {
        this.offsetCreateTimeDesc = offsetCreateTimeDesc;
        return this;
    }
    public String getOffsetCreateTimeDesc() {
        return this.offsetCreateTimeDesc;
    }

    public GetTrackListByMailFromAndTagNameRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetTrackListByMailFromAndTagNameRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public GetTrackListByMailFromAndTagNameRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetTrackListByMailFromAndTagNameRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetTrackListByMailFromAndTagNameRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetTrackListByMailFromAndTagNameRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetTrackListByMailFromAndTagNameRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public GetTrackListByMailFromAndTagNameRequest setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

}
