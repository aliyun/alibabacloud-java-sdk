// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabSessionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LabSessions")
    public java.util.List<PageListLabSessionsResponseBodyLabSessions> labSessions;

    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static PageListLabSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageListLabSessionsResponseBody self = new PageListLabSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public PageListLabSessionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageListLabSessionsResponseBody setLabSessions(java.util.List<PageListLabSessionsResponseBodyLabSessions> labSessions) {
        this.labSessions = labSessions;
        return this;
    }
    public java.util.List<PageListLabSessionsResponseBodyLabSessions> getLabSessions() {
        return this.labSessions;
    }

    public PageListLabSessionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageListLabSessionsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PageListLabSessionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PageListLabSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageListLabSessionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PageListLabSessionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class PageListLabSessionsResponseBodyLabSessions extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("Id")
        public String id;

        @NameInMap("LabId")
        public Long labId;

        @NameInMap("Url")
        public String url;

        public static PageListLabSessionsResponseBodyLabSessions build(java.util.Map<String, ?> map) throws Exception {
            PageListLabSessionsResponseBodyLabSessions self = new PageListLabSessionsResponseBodyLabSessions();
            return TeaModel.build(map, self);
        }

        public PageListLabSessionsResponseBodyLabSessions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PageListLabSessionsResponseBodyLabSessions setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public PageListLabSessionsResponseBodyLabSessions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PageListLabSessionsResponseBodyLabSessions setLabId(Long labId) {
            this.labId = labId;
            return this;
        }
        public Long getLabId() {
            return this.labId;
        }

        public PageListLabSessionsResponseBodyLabSessions setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
