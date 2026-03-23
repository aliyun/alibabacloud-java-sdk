// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetTrackListRequest extends TeaModel {
    /**
     * <p>The sender address.</p>
     * <blockquote>
     * <p>If you omit this parameter, the query returns data for all sender addresses. This parameter is required if you specify the <code>TagName</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.com">test@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The ID of the configuration set.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ConfigSetId")
    public String configSetId;

    /**
     * <p>The dedicated IP address to query.</p>
     * <p>If this parameter is omitted, data for all dedicated IPs is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.xxx.xxx.xxx</p>
     */
    @NameInMap("DedicatedIp")
    public String dedicatedIp;

    /**
     * <p>The ID of the dedicated IP pool to query.</p>
     * <p>If this parameter is omitted, data for all IP pools is returned.</p>
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
     * <p>The end date of the query. The duration between the StartTime and EndTime cannot exceed 7 days. The format is <code>yyyy-MM-dd</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The Email Service Provider (ESP) to query. Valid values are:</p>
     * <ul>
     * <li><p>gmail.com</p>
     * </li>
     * <li><p>yahoo.com</p>
     * </li>
     * <li><p>outlook.com</p>
     * </li>
     * <li><p>icloud.com</p>
     * </li>
     * <li><p>Others: Any ESP not listed above.</p>
     * </li>
     * </ul>
     * <p>If you omit this parameter, the query returns data for all ESPs.</p>
     * 
     * <strong>example:</strong>
     * <p>gmail.com</p>
     */
    @NameInMap("Esp")
    public String esp;

    /**
     * <p>Set this to 0 for the first query. For subsequent queries, set it to 1 to perform a paged query in chronological order. (This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>（本字段已废弃）</p>
     */
    @NameInMap("Offset")
    public String offset;

    /**
     * <p>Used for pagination. Do not set this parameter for the first query. For subsequent queries, set this parameter to the <code>OffsetCreateTime</code> value returned in the previous response. (This field is deprecated)</p>
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
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
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
     * <p>The start date of the query. The date must be within the last 30 days. The format is <code>yyyy-MM-dd</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tag name.</p>
     * 
     * <strong>example:</strong>
     * <p>tagname</p>
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

    public static GetTrackListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrackListRequest self = new GetTrackListRequest();
        return TeaModel.build(map, self);
    }

    public GetTrackListRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetTrackListRequest setConfigSetId(String configSetId) {
        this.configSetId = configSetId;
        return this;
    }
    public String getConfigSetId() {
        return this.configSetId;
    }

    public GetTrackListRequest setDedicatedIp(String dedicatedIp) {
        this.dedicatedIp = dedicatedIp;
        return this;
    }
    public String getDedicatedIp() {
        return this.dedicatedIp;
    }

    public GetTrackListRequest setDedicatedIpPoolId(String dedicatedIpPoolId) {
        this.dedicatedIpPoolId = dedicatedIpPoolId;
        return this;
    }
    public String getDedicatedIpPoolId() {
        return this.dedicatedIpPoolId;
    }

    public GetTrackListRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetTrackListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTrackListRequest setEsp(String esp) {
        this.esp = esp;
        return this;
    }
    public String getEsp() {
        return this.esp;
    }

    public GetTrackListRequest setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public GetTrackListRequest setOffsetCreateTime(String offsetCreateTime) {
        this.offsetCreateTime = offsetCreateTime;
        return this;
    }
    public String getOffsetCreateTime() {
        return this.offsetCreateTime;
    }

    public GetTrackListRequest setOffsetCreateTimeDesc(String offsetCreateTimeDesc) {
        this.offsetCreateTimeDesc = offsetCreateTimeDesc;
        return this;
    }
    public String getOffsetCreateTimeDesc() {
        return this.offsetCreateTimeDesc;
    }

    public GetTrackListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetTrackListRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public GetTrackListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetTrackListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetTrackListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetTrackListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetTrackListRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public GetTrackListRequest setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

}
