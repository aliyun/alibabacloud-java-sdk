// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListSkillResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListSkillResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudListSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListSkillResponseBody self = new CloudListSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListSkillResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListSkillResponseBody setData(CloudListSkillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListSkillResponseBodyData getData() {
        return this.data;
    }

    public CloudListSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListSkillResponseBodyDataList extends TeaModel {
        /**
         * <p>描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>创建时间,精确到秒</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-30 06:12:41</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7122600</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>技能id</p>
         * 
         * <strong>example:</strong>
         * <p>52593</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>技能名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Name")
        public String name;

        public static CloudListSkillResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListSkillResponseBodyDataList self = new CloudListSkillResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListSkillResponseBodyDataList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CloudListSkillResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListSkillResponseBodyDataList setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListSkillResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudListSkillResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CloudListSkillResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("EndRow")
        public String endRow;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FirstPage")
        public String firstPage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasPreviousPage")
        public Boolean hasPreviousPage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFirstPage")
        public Boolean isFirstPage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLastPage")
        public Boolean isLastPage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LastPage")
        public String lastPage;

        @NameInMap("List")
        public java.util.List<CloudListSkillResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("NavigatePages")
        public String navigatePages;

        @NameInMap("NavigatepageNums")
        public java.util.List<String> navigatepageNums;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NextPage")
        public String nextPage;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public String pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Pages")
        public String pages;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PrePage")
        public String prePage;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartRow")
        public String startRow;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Total")
        public String total;

        public static CloudListSkillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListSkillResponseBodyData self = new CloudListSkillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListSkillResponseBodyData setEndRow(String endRow) {
            this.endRow = endRow;
            return this;
        }
        public String getEndRow() {
            return this.endRow;
        }

        public CloudListSkillResponseBodyData setFirstPage(String firstPage) {
            this.firstPage = firstPage;
            return this;
        }
        public String getFirstPage() {
            return this.firstPage;
        }

        public CloudListSkillResponseBodyData setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public CloudListSkillResponseBodyData setHasPreviousPage(Boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }
        public Boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public CloudListSkillResponseBodyData setIsFirstPage(Boolean isFirstPage) {
            this.isFirstPage = isFirstPage;
            return this;
        }
        public Boolean getIsFirstPage() {
            return this.isFirstPage;
        }

        public CloudListSkillResponseBodyData setIsLastPage(Boolean isLastPage) {
            this.isLastPage = isLastPage;
            return this;
        }
        public Boolean getIsLastPage() {
            return this.isLastPage;
        }

        public CloudListSkillResponseBodyData setLastPage(String lastPage) {
            this.lastPage = lastPage;
            return this;
        }
        public String getLastPage() {
            return this.lastPage;
        }

        public CloudListSkillResponseBodyData setList(java.util.List<CloudListSkillResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListSkillResponseBodyDataList> getList() {
            return this.list;
        }

        public CloudListSkillResponseBodyData setNavigatePages(String navigatePages) {
            this.navigatePages = navigatePages;
            return this;
        }
        public String getNavigatePages() {
            return this.navigatePages;
        }

        public CloudListSkillResponseBodyData setNavigatepageNums(java.util.List<String> navigatepageNums) {
            this.navigatepageNums = navigatepageNums;
            return this;
        }
        public java.util.List<String> getNavigatepageNums() {
            return this.navigatepageNums;
        }

        public CloudListSkillResponseBodyData setNextPage(String nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public String getNextPage() {
            return this.nextPage;
        }

        public CloudListSkillResponseBodyData setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public String getOrderBy() {
            return this.orderBy;
        }

        public CloudListSkillResponseBodyData setPageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public String getPageNum() {
            return this.pageNum;
        }

        public CloudListSkillResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public CloudListSkillResponseBodyData setPages(String pages) {
            this.pages = pages;
            return this;
        }
        public String getPages() {
            return this.pages;
        }

        public CloudListSkillResponseBodyData setPrePage(String prePage) {
            this.prePage = prePage;
            return this;
        }
        public String getPrePage() {
            return this.prePage;
        }

        public CloudListSkillResponseBodyData setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public CloudListSkillResponseBodyData setStartRow(String startRow) {
            this.startRow = startRow;
            return this;
        }
        public String getStartRow() {
            return this.startRow;
        }

        public CloudListSkillResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
