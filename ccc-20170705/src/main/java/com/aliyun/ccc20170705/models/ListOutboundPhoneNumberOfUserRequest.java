// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListOutboundPhoneNumberOfUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UserId")
    public String userId;

    public static ListOutboundPhoneNumberOfUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundPhoneNumberOfUserRequest self = new ListOutboundPhoneNumberOfUserRequest();
        return TeaModel.build(map, self);
    }

    public ListOutboundPhoneNumberOfUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOutboundPhoneNumberOfUserRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOutboundPhoneNumberOfUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOutboundPhoneNumberOfUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
