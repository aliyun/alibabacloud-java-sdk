// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBrokerDemandRecordRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryBrokerDemandRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBrokerDemandRecordRequest self = new QueryBrokerDemandRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryBrokerDemandRecordRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBrokerDemandRecordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryBrokerDemandRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
