// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidProjectsRequest extends TeaModel {
    @NameInMap("PidProjectName")
    public String pidProjectName;

    @NameInMap("PidOrganisationId")
    public String pidOrganisationId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static ListPidProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPidProjectsRequest self = new ListPidProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListPidProjectsRequest setPidProjectName(String pidProjectName) {
        this.pidProjectName = pidProjectName;
        return this;
    }
    public String getPidProjectName() {
        return this.pidProjectName;
    }

    public ListPidProjectsRequest setPidOrganisationId(String pidOrganisationId) {
        this.pidOrganisationId = pidOrganisationId;
        return this;
    }
    public String getPidOrganisationId() {
        return this.pidOrganisationId;
    }

    public ListPidProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPidProjectsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
