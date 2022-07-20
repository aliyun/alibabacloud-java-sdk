// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class PageQueryProjectResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public PageQueryProjectResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static PageQueryProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQueryProjectResponseBody self = new PageQueryProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQueryProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQueryProjectResponseBody setData(PageQueryProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PageQueryProjectResponseBodyData getData() {
        return this.data;
    }

    public PageQueryProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageQueryProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageQueryProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageQueryProjectResponseBodyDataRecordsProjectQuotaLimit extends TeaModel {
        // key - districtId
        @NameInMap("DistrictLimitMap")
        public java.util.Map<String, DataRecordsProjectQuotaLimitDistrictLimitMapValue> districtLimitMap;

        // 限制类型 ：目前默认 - ReserveContainer
        @NameInMap("LimitType")
        public String limitType;

        public static PageQueryProjectResponseBodyDataRecordsProjectQuotaLimit build(java.util.Map<String, ?> map) throws Exception {
            PageQueryProjectResponseBodyDataRecordsProjectQuotaLimit self = new PageQueryProjectResponseBodyDataRecordsProjectQuotaLimit();
            return TeaModel.build(map, self);
        }

        public PageQueryProjectResponseBodyDataRecordsProjectQuotaLimit setDistrictLimitMap(java.util.Map<String, DataRecordsProjectQuotaLimitDistrictLimitMapValue> districtLimitMap) {
            this.districtLimitMap = districtLimitMap;
            return this;
        }
        public java.util.Map<String, DataRecordsProjectQuotaLimitDistrictLimitMapValue> getDistrictLimitMap() {
            return this.districtLimitMap;
        }

        public PageQueryProjectResponseBodyDataRecordsProjectQuotaLimit setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

    public static class PageQueryProjectResponseBodyDataRecords extends TeaModel {
        // 项目关联的应用数量
        @NameInMap("BoundAppNums")
        public Long boundAppNums;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectMemo")
        public String projectMemo;

        @NameInMap("ProjectName")
        public String projectName;

        // key : districtId
        @NameInMap("ProjectQuotaLimit")
        public PageQueryProjectResponseBodyDataRecordsProjectQuotaLimit projectQuotaLimit;

        public static PageQueryProjectResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            PageQueryProjectResponseBodyDataRecords self = new PageQueryProjectResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public PageQueryProjectResponseBodyDataRecords setBoundAppNums(Long boundAppNums) {
            this.boundAppNums = boundAppNums;
            return this;
        }
        public Long getBoundAppNums() {
            return this.boundAppNums;
        }

        public PageQueryProjectResponseBodyDataRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public PageQueryProjectResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public PageQueryProjectResponseBodyDataRecords setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public PageQueryProjectResponseBodyDataRecords setProjectMemo(String projectMemo) {
            this.projectMemo = projectMemo;
            return this;
        }
        public String getProjectMemo() {
            return this.projectMemo;
        }

        public PageQueryProjectResponseBodyDataRecords setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public PageQueryProjectResponseBodyDataRecords setProjectQuotaLimit(PageQueryProjectResponseBodyDataRecordsProjectQuotaLimit projectQuotaLimit) {
            this.projectQuotaLimit = projectQuotaLimit;
            return this;
        }
        public PageQueryProjectResponseBodyDataRecordsProjectQuotaLimit getProjectQuotaLimit() {
            return this.projectQuotaLimit;
        }

    }

    public static class PageQueryProjectResponseBodyData extends TeaModel {
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
        public java.util.List<PageQueryProjectResponseBodyDataRecords> records;

        // 总共项数
        @NameInMap("TotalCount")
        public Long totalCount;

        public static PageQueryProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageQueryProjectResponseBodyData self = new PageQueryProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageQueryProjectResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public PageQueryProjectResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public PageQueryProjectResponseBodyData setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public PageQueryProjectResponseBodyData setRecords(java.util.List<PageQueryProjectResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<PageQueryProjectResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public PageQueryProjectResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
