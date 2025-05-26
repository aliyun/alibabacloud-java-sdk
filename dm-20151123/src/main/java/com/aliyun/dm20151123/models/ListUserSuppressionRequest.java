// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListUserSuppressionRequest extends TeaModel {
    /**
     * <p>Email address or domain name</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.net">test@example.net</a></p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>End time of the last bounce hit, timestamp, accurate to the second. The span between start and end times cannot exceed 7 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1715669077</p>
     */
    @NameInMap("EndBounceTime")
    public Integer endBounceTime;

    /**
     * <p>End creation time, timestamp, accurate to the second. The span between start and end times cannot exceed 7 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1715669077</p>
     */
    @NameInMap("EndCreateTime")
    public Integer endCreateTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Start time of the last bounce hit, timestamp, accurate to the second.</p>
     * 
     * <strong>example:</strong>
     * <p>1715668852</p>
     */
    @NameInMap("StartBounceTime")
    public Integer startBounceTime;

    /**
     * <p>Start creation time, timestamp, accurate to the second.</p>
     * 
     * <strong>example:</strong>
     * <p>1715668852</p>
     */
    @NameInMap("StartCreateTime")
    public Integer startCreateTime;

    public static ListUserSuppressionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserSuppressionRequest self = new ListUserSuppressionRequest();
        return TeaModel.build(map, self);
    }

    public ListUserSuppressionRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ListUserSuppressionRequest setEndBounceTime(Integer endBounceTime) {
        this.endBounceTime = endBounceTime;
        return this;
    }
    public Integer getEndBounceTime() {
        return this.endBounceTime;
    }

    public ListUserSuppressionRequest setEndCreateTime(Integer endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public Integer getEndCreateTime() {
        return this.endCreateTime;
    }

    public ListUserSuppressionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListUserSuppressionRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListUserSuppressionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserSuppressionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListUserSuppressionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListUserSuppressionRequest setStartBounceTime(Integer startBounceTime) {
        this.startBounceTime = startBounceTime;
        return this;
    }
    public Integer getStartBounceTime() {
        return this.startBounceTime;
    }

    public ListUserSuppressionRequest setStartCreateTime(Integer startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }
    public Integer getStartCreateTime() {
        return this.startCreateTime;
    }

}
