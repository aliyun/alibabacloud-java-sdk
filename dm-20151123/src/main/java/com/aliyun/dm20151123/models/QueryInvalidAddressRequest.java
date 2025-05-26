// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryInvalidAddressRequest extends TeaModel {
    /**
     * <p>End time, with a span from the start time that cannot exceed 30 days, in the format yyyy-MM-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Keyword. If not provided, it represents all invalid addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>info</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>Number of items per request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>Request starting position.</p>
     * 
     * <strong>example:</strong>
     * <hr>
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
     * <p>Start time, which cannot be earlier than 30 days ago, in the format yyyy-MM-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryInvalidAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInvalidAddressRequest self = new QueryInvalidAddressRequest();
        return TeaModel.build(map, self);
    }

    public QueryInvalidAddressRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryInvalidAddressRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryInvalidAddressRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public QueryInvalidAddressRequest setNextStart(String nextStart) {
        this.nextStart = nextStart;
        return this;
    }
    public String getNextStart() {
        return this.nextStart;
    }

    public QueryInvalidAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryInvalidAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryInvalidAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryInvalidAddressRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
