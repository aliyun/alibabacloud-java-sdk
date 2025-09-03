// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetTrackListByMailFromAndTagNameRequest extends TeaModel {
    /**
     * <p>Sender address.</p>
     * <blockquote>
     * <p>If not filled, it represents all addresses; if there is a TagName, this parameter must not be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:e-service@amegroups.cn">e-service@amegroups.cn</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ConfigSetId")
    public String configSetId;

    @NameInMap("DedicatedIp")
    public String dedicatedIp;

    @NameInMap("DedicatedIpPoolId")
    public String dedicatedIpPoolId;

    /**
     * <p>End time, with a span from the start time that cannot exceed 15 days. Format: yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Esp")
    public String esp;

    /**
     * <p>For the first query, set to 0; for subsequent queries, fixed at 1. 1 indicates pagination in ascending order by time. (This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>（本字段已废弃）</p>
     */
    @NameInMap("Offset")
    public String offset;

    /**
     * <p>Used for pagination. Not set for the first query; for subsequent queries, set to the value of OffsetCreateTime from the previous response. (This field is deprecated)</p>
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
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>Page size</p>
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
     * <p>Start time, which cannot be earlier than 30 days. Format: yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Email tag. If not filled, it represents all tags.</p>
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
