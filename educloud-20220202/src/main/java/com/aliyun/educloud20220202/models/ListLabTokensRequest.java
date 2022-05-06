// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListLabTokensRequest extends TeaModel {
    @NameInMap("FinishStatus")
    public Long finishStatus;

    @NameInMap("LabId")
    public String labId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RamUid")
    public String ramUid;

    public static ListLabTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLabTokensRequest self = new ListLabTokensRequest();
        return TeaModel.build(map, self);
    }

    public ListLabTokensRequest setFinishStatus(Long finishStatus) {
        this.finishStatus = finishStatus;
        return this;
    }
    public Long getFinishStatus() {
        return this.finishStatus;
    }

    public ListLabTokensRequest setLabId(String labId) {
        this.labId = labId;
        return this;
    }
    public String getLabId() {
        return this.labId;
    }

    public ListLabTokensRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListLabTokensRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLabTokensRequest setRamUid(String ramUid) {
        this.ramUid = ramUid;
        return this;
    }
    public String getRamUid() {
        return this.ramUid;
    }

}
