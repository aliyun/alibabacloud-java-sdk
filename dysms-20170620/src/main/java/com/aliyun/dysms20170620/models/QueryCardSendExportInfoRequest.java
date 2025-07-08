// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSendExportInfoRequest extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Status")
    public Long status;

    @NameInMap("Type")
    public Long type;

    public static QueryCardSendExportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSendExportInfoRequest self = new QueryCardSendExportInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardSendExportInfoRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryCardSendExportInfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCardSendExportInfoRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryCardSendExportInfoRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
