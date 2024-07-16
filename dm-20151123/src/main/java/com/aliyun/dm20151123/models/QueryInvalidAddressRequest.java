// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryInvalidAddressRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2019-09-29</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>info</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
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
