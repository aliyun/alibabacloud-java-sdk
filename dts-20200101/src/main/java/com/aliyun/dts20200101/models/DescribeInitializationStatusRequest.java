// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeInitializationStatusRequest extends TeaModel {
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static DescribeInitializationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInitializationStatusRequest self = new DescribeInitializationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInitializationStatusRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public DescribeInitializationStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInitializationStatusRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeInitializationStatusRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeInitializationStatusRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
