// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class PageQueryResourcePackageListResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public PageQueryResourcePackageListResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static PageQueryResourcePackageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQueryResourcePackageListResponseBody self = new PageQueryResourcePackageListResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQueryResourcePackageListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQueryResourcePackageListResponseBody setData(PageQueryResourcePackageListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PageQueryResourcePackageListResponseBodyData getData() {
        return this.data;
    }

    public PageQueryResourcePackageListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageQueryResourcePackageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageQueryResourcePackageListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageQueryResourcePackageListResponseBodyDataRecords extends TeaModel {
        // 当前资源包剩余总量
        @NameInMap("CurrentAmount")
        public Long currentAmount;

        // 资源包有效开始时间
        @NameInMap("GmtValidBegin")
        public String gmtValidBegin;

        // 资源包有效结束时间
        @NameInMap("GmtValidEnd")
        public String gmtValidEnd;

        // 当前资源包购买总量
        @NameInMap("InitAmount")
        public Long initAmount;

        // 资源包实例ID
        @NameInMap("PackageInstanceId")
        public String packageInstanceId;

        // 资源包类型
        @NameInMap("PackageType")
        public String packageType;

        public static PageQueryResourcePackageListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            PageQueryResourcePackageListResponseBodyDataRecords self = new PageQueryResourcePackageListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public PageQueryResourcePackageListResponseBodyDataRecords setCurrentAmount(Long currentAmount) {
            this.currentAmount = currentAmount;
            return this;
        }
        public Long getCurrentAmount() {
            return this.currentAmount;
        }

        public PageQueryResourcePackageListResponseBodyDataRecords setGmtValidBegin(String gmtValidBegin) {
            this.gmtValidBegin = gmtValidBegin;
            return this;
        }
        public String getGmtValidBegin() {
            return this.gmtValidBegin;
        }

        public PageQueryResourcePackageListResponseBodyDataRecords setGmtValidEnd(String gmtValidEnd) {
            this.gmtValidEnd = gmtValidEnd;
            return this;
        }
        public String getGmtValidEnd() {
            return this.gmtValidEnd;
        }

        public PageQueryResourcePackageListResponseBodyDataRecords setInitAmount(Long initAmount) {
            this.initAmount = initAmount;
            return this;
        }
        public Long getInitAmount() {
            return this.initAmount;
        }

        public PageQueryResourcePackageListResponseBodyDataRecords setPackageInstanceId(String packageInstanceId) {
            this.packageInstanceId = packageInstanceId;
            return this;
        }
        public String getPackageInstanceId() {
            return this.packageInstanceId;
        }

        public PageQueryResourcePackageListResponseBodyDataRecords setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

    }

    public static class PageQueryResourcePackageListResponseBodyData extends TeaModel {
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
        public java.util.List<PageQueryResourcePackageListResponseBodyDataRecords> records;

        // 总共项数
        @NameInMap("TotalCount")
        public Long totalCount;

        public static PageQueryResourcePackageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageQueryResourcePackageListResponseBodyData self = new PageQueryResourcePackageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageQueryResourcePackageListResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public PageQueryResourcePackageListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public PageQueryResourcePackageListResponseBodyData setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public PageQueryResourcePackageListResponseBodyData setRecords(java.util.List<PageQueryResourcePackageListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<PageQueryResourcePackageListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public PageQueryResourcePackageListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
