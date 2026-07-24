// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AccountFlowListRequest extends TeaModel {
    /**
     * <p>The number of days to search. Maximum value: 30. Valid values: 0 to 30.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("day_num")
    public Integer dayNum;

    /**
     * <p>The page index.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_index")
    public Integer pageIndex;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <p>The start search timestamp, effective to the day. Specify a 13-digit UTC timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1677427200000</p>
     */
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
