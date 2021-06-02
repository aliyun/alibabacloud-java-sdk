// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryListRobotRequest extends TeaModel {
    // BuId
    @NameInMap("BuId")
    public Long buId;

    // AccountId
    @NameInMap("AccountId")
    public Long accountId;

    // PageNo
    @NameInMap("PageNo")
    public Integer pageNo;

    // PageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryListRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryListRobotRequest self = new QueryListRobotRequest();
        return TeaModel.build(map, self);
    }

    public QueryListRobotRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public QueryListRobotRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public QueryListRobotRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryListRobotRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
