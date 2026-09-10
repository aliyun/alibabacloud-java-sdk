// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckColumnResultsRequest extends TeaModel {
    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The validation result ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001</p>
     */
    @NameInMap("resultId")
    public String resultId;

    public static ListDataCheckColumnResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckColumnResultsRequest self = new ListDataCheckColumnResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCheckColumnResultsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDataCheckColumnResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataCheckColumnResultsRequest setResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }
    public String getResultId() {
        return this.resultId;
    }

}
