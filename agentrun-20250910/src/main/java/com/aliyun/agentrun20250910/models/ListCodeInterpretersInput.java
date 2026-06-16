// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCodeInterpretersInput extends TeaModel {
    /**
     * <p>Filters results by code interpreter name.</p>
     */
    @NameInMap("codeInterpreterName")
    public String codeInterpreterName;

    /**
     * <p>The page number of the results to return. Default: 1.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Maximum number of results to return per page. Valid values: 1 to 100. Default: 20.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListCodeInterpretersInput build(java.util.Map<String, ?> map) throws Exception {
        ListCodeInterpretersInput self = new ListCodeInterpretersInput();
        return TeaModel.build(map, self);
    }

    public ListCodeInterpretersInput setCodeInterpreterName(String codeInterpreterName) {
        this.codeInterpreterName = codeInterpreterName;
        return this;
    }
    public String getCodeInterpreterName() {
        return this.codeInterpreterName;
    }

    public ListCodeInterpretersInput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCodeInterpretersInput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
