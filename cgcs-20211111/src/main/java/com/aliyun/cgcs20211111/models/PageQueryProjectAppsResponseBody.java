// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class PageQueryProjectAppsResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public PageQueryProjectAppsResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static PageQueryProjectAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQueryProjectAppsResponseBody self = new PageQueryProjectAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQueryProjectAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQueryProjectAppsResponseBody setData(PageQueryProjectAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PageQueryProjectAppsResponseBodyData getData() {
        return this.data;
    }

    public PageQueryProjectAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageQueryProjectAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageQueryProjectAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageQueryProjectAppsResponseBodyDataRecords extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("ProjectId")
        public String projectId;

        public static PageQueryProjectAppsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            PageQueryProjectAppsResponseBodyDataRecords self = new PageQueryProjectAppsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public PageQueryProjectAppsResponseBodyDataRecords setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public PageQueryProjectAppsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public PageQueryProjectAppsResponseBodyDataRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public PageQueryProjectAppsResponseBodyDataRecords setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class PageQueryProjectAppsResponseBodyData extends TeaModel {
        // 当前页码，默认1
        @NameInMap("PageNumber")
        public Long pageNumber;

        // 每页项数，默认20,最大100
        @NameInMap("PageSize")
        public Long pageSize;

        // 总页数
        @NameInMap("Pages")
        public Long pages;

        // 结果集
        @NameInMap("Records")
        public java.util.List<PageQueryProjectAppsResponseBodyDataRecords> records;

        // 总共项数
        @NameInMap("TotalCount")
        public Long totalCount;

        public static PageQueryProjectAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageQueryProjectAppsResponseBodyData self = new PageQueryProjectAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageQueryProjectAppsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public PageQueryProjectAppsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public PageQueryProjectAppsResponseBodyData setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public PageQueryProjectAppsResponseBodyData setRecords(java.util.List<PageQueryProjectAppsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<PageQueryProjectAppsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public PageQueryProjectAppsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
