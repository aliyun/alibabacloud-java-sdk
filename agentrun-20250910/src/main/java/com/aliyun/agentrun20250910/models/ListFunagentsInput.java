// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListFunagentsInput extends TeaModel {
    @NameInMap("funagentName")
    public String funagentName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("status")
    public String status;

    public static ListFunagentsInput build(java.util.Map<String, ?> map) throws Exception {
        ListFunagentsInput self = new ListFunagentsInput();
        return TeaModel.build(map, self);
    }

    public ListFunagentsInput setFunagentName(String funagentName) {
        this.funagentName = funagentName;
        return this;
    }
    public String getFunagentName() {
        return this.funagentName;
    }

    public ListFunagentsInput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFunagentsInput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFunagentsInput setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
