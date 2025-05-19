// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryProjectMetaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;product\&quot;,\&quot;value\&quot;:\&quot;MongoDB\&quot;]</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryProjectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectMetaRequest self = new QueryProjectMetaRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectMetaRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public QueryProjectMetaRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryProjectMetaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
