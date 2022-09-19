// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogInstancesPagingRequest extends TeaModel {
    @NameInMap("Bid")
    public String bid;

    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Region")
    public String region;

    @NameInMap("UserId")
    public String userId;

    public static DescribeSqlLogInstancesPagingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogInstancesPagingRequest self = new DescribeSqlLogInstancesPagingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogInstancesPagingRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeSqlLogInstancesPagingRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DescribeSqlLogInstancesPagingRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeSqlLogInstancesPagingRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlLogInstancesPagingRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeSqlLogInstancesPagingRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
