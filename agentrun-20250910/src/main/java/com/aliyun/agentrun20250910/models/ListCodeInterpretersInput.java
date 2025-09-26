// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCodeInterpretersInput extends TeaModel {
    /**
     * <p>按代码解释器名称过滤</p>
     */
    @NameInMap("codeInterpreterName")
    public String codeInterpreterName;

    @NameInMap("pageNumber")
    public Integer pageNumber;

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
