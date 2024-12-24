// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetQueryResultRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The size of each page. The maximum value is 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query ID.</p>
     * <blockquote>
     * <p> You can call the SubmitQuery operation to query the query ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Q-41676378709440CE</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    public static GetQueryResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryResultRequest self = new GetQueryResultRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryResultRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetQueryResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetQueryResultRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
