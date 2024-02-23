// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallInTransferRecordRequest extends TeaModel {
    /**
     * <p>The calling number of the inbound call.</p>
     */
    @NameInMap("CallInCaller")
    public String callInCaller;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Valid values: 1 to 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The phone number to which a call is transferred.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The time at which call transfer records are queried, in the YYYY-MM-DD hh:mm:ss format.</p>
     * <br>
     * <p>> The query result is all the call transfer records of the specified day.</p>
     */
    @NameInMap("QueryDate")
    public String queryDate;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryCallInTransferRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallInTransferRecordRequest self = new QueryCallInTransferRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryCallInTransferRecordRequest setCallInCaller(String callInCaller) {
        this.callInCaller = callInCaller;
        return this;
    }
    public String getCallInCaller() {
        return this.callInCaller;
    }

    public QueryCallInTransferRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCallInTransferRecordRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryCallInTransferRecordRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCallInTransferRecordRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public QueryCallInTransferRecordRequest setQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public String getQueryDate() {
        return this.queryDate;
    }

    public QueryCallInTransferRecordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryCallInTransferRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
