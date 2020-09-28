// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidLoopsRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("PidLoopName")
    public String pidLoopName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListPidLoopsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPidLoopsRequest self = new ListPidLoopsRequest();
        return TeaModel.build(map, self);
    }

    public ListPidLoopsRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public ListPidLoopsRequest setPidLoopName(String pidLoopName) {
        this.pidLoopName = pidLoopName;
        return this;
    }
    public String getPidLoopName() {
        return this.pidLoopName;
    }

    public ListPidLoopsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPidLoopsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
