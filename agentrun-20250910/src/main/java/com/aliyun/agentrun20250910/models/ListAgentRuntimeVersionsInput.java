// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeVersionsInput extends TeaModel {
    /**
     * <p>The page number to retrieve.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of results to return per page.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListAgentRuntimeVersionsInput build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimeVersionsInput self = new ListAgentRuntimeVersionsInput();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimeVersionsInput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRuntimeVersionsInput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
