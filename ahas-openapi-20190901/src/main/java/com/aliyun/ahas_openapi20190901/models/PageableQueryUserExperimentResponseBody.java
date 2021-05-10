// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryUserExperimentResponseBody extends TeaModel {
    @NameInMap("Pages")
    public Integer pages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("ExperimentList")
    public java.util.List<PageableQueryUserExperimentResponseBodyExperimentList> experimentList;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static PageableQueryUserExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryUserExperimentResponseBody self = new PageableQueryUserExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public PageableQueryUserExperimentResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PageableQueryUserExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageableQueryUserExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageableQueryUserExperimentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageableQueryUserExperimentResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public PageableQueryUserExperimentResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public PageableQueryUserExperimentResponseBody setExperimentList(java.util.List<PageableQueryUserExperimentResponseBodyExperimentList> experimentList) {
        this.experimentList = experimentList;
        return this;
    }
    public java.util.List<PageableQueryUserExperimentResponseBodyExperimentList> getExperimentList() {
        return this.experimentList;
    }

    public PageableQueryUserExperimentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PageableQueryUserExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageableQueryUserExperimentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageableQueryUserExperimentResponseBodyExperimentList extends TeaModel {
        @NameInMap("Permission")
        public Integer permission;

        @NameInMap("Result")
        public String result;

        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("MiniApps")
        public java.util.List<String> miniApps;

        @NameInMap("Name")
        public String name;

        @NameInMap("Creator")
        public String creator;

        public static PageableQueryUserExperimentResponseBodyExperimentList build(java.util.Map<String, ?> map) throws Exception {
            PageableQueryUserExperimentResponseBodyExperimentList self = new PageableQueryUserExperimentResponseBodyExperimentList();
            return TeaModel.build(map, self);
        }

        public PageableQueryUserExperimentResponseBodyExperimentList setPermission(Integer permission) {
            this.permission = permission;
            return this;
        }
        public Integer getPermission() {
            return this.permission;
        }

        public PageableQueryUserExperimentResponseBodyExperimentList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public PageableQueryUserExperimentResponseBodyExperimentList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public PageableQueryUserExperimentResponseBodyExperimentList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public PageableQueryUserExperimentResponseBodyExperimentList setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public PageableQueryUserExperimentResponseBodyExperimentList setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public PageableQueryUserExperimentResponseBodyExperimentList setMiniApps(java.util.List<String> miniApps) {
            this.miniApps = miniApps;
            return this;
        }
        public java.util.List<String> getMiniApps() {
            return this.miniApps;
        }

        public PageableQueryUserExperimentResponseBodyExperimentList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PageableQueryUserExperimentResponseBodyExperimentList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

}
