// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AccountFlowListRequest extends TeaModel {
    @NameInMap("day_num")
    public Integer dayNum;

    @NameInMap("page_index")
    public Integer pageIndex;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("utc_begin_time")
    public Long utcBeginTime;

    public static AccountFlowListRequest build(java.util.Map<String, ?> map) throws Exception {
        AccountFlowListRequest self = new AccountFlowListRequest();
        return TeaModel.build(map, self);
    }

    public AccountFlowListRequest setDayNum(Integer dayNum) {
        this.dayNum = dayNum;
        return this;
    }
    public Integer getDayNum() {
        return this.dayNum;
    }

    public AccountFlowListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public AccountFlowListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public AccountFlowListRequest setUtcBeginTime(Long utcBeginTime) {
        this.utcBeginTime = utcBeginTime;
        return this;
    }
    public Long getUtcBeginTime() {
        return this.utcBeginTime;
    }

}
