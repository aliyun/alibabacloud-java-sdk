// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidProjectsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PidProjectList")
    @Validation(required = true)
    public java.util.List<ListPidProjectsResponsePidProjectList> pidProjectList;

    public static ListPidProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPidProjectsResponse self = new ListPidProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListPidProjectsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPidProjectsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPidProjectsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPidProjectsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPidProjectsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPidProjectsResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPidProjectsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPidProjectsResponse setPidProjectList(java.util.List<ListPidProjectsResponsePidProjectList> pidProjectList) {
        this.pidProjectList = pidProjectList;
        return this;
    }
    public java.util.List<ListPidProjectsResponsePidProjectList> getPidProjectList() {
        return this.pidProjectList;
    }

    public static class ListPidProjectsResponsePidProjectList extends TeaModel {
        @NameInMap("PidProjectId")
        @Validation(required = true)
        public String pidProjectId;

        @NameInMap("PidProjectName")
        @Validation(required = true)
        public String pidProjectName;

        @NameInMap("PidProjectDesc")
        @Validation(required = true)
        public String pidProjectDesc;

        @NameInMap("PidOrganisationId")
        @Validation(required = true)
        public String pidOrganisationId;

        public static ListPidProjectsResponsePidProjectList build(java.util.Map<String, ?> map) throws Exception {
            ListPidProjectsResponsePidProjectList self = new ListPidProjectsResponsePidProjectList();
            return TeaModel.build(map, self);
        }

        public ListPidProjectsResponsePidProjectList setPidProjectId(String pidProjectId) {
            this.pidProjectId = pidProjectId;
            return this;
        }
        public String getPidProjectId() {
            return this.pidProjectId;
        }

        public ListPidProjectsResponsePidProjectList setPidProjectName(String pidProjectName) {
            this.pidProjectName = pidProjectName;
            return this;
        }
        public String getPidProjectName() {
            return this.pidProjectName;
        }

        public ListPidProjectsResponsePidProjectList setPidProjectDesc(String pidProjectDesc) {
            this.pidProjectDesc = pidProjectDesc;
            return this;
        }
        public String getPidProjectDesc() {
            return this.pidProjectDesc;
        }

        public ListPidProjectsResponsePidProjectList setPidOrganisationId(String pidOrganisationId) {
            this.pidOrganisationId = pidOrganisationId;
            return this;
        }
        public String getPidOrganisationId() {
            return this.pidOrganisationId;
        }

    }

}
