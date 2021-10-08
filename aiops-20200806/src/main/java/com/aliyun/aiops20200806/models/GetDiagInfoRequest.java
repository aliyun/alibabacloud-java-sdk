// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDiagInfoRequest extends TeaModel {
    @NameInMap("Uid")
    public Long uid;

    @NameInMap("Starttime")
    public Long starttime;

    @NameInMap("Endtime")
    public Long endtime;

    @NameInMap("DiagnosticId")
    public String diagnosticId;

    @NameInMap("Status")
    public String status;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetDiagInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiagInfoRequest self = new GetDiagInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDiagInfoRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public GetDiagInfoRequest setStarttime(Long starttime) {
        this.starttime = starttime;
        return this;
    }
    public Long getStarttime() {
        return this.starttime;
    }

    public GetDiagInfoRequest setEndtime(Long endtime) {
        this.endtime = endtime;
        return this;
    }
    public Long getEndtime() {
        return this.endtime;
    }

    public GetDiagInfoRequest setDiagnosticId(String diagnosticId) {
        this.diagnosticId = diagnosticId;
        return this;
    }
    public String getDiagnosticId() {
        return this.diagnosticId;
    }

    public GetDiagInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDiagInfoRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDiagInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
