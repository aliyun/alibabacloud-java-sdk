// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabSessionsRequest extends TeaModel {
    @NameInMap("Finished")
    public Boolean finished;

    @NameInMap("LabId")
    public Long labId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RamAccountId")
    public Long ramAccountId;

    public static PageListLabSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        PageListLabSessionsRequest self = new PageListLabSessionsRequest();
        return TeaModel.build(map, self);
    }

    public PageListLabSessionsRequest setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public PageListLabSessionsRequest setLabId(Long labId) {
        this.labId = labId;
        return this;
    }
    public Long getLabId() {
        return this.labId;
    }

    public PageListLabSessionsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PageListLabSessionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PageListLabSessionsRequest setRamAccountId(Long ramAccountId) {
        this.ramAccountId = ramAccountId;
        return this;
    }
    public Long getRamAccountId() {
        return this.ramAccountId;
    }

}
