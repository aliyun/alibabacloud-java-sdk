// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryOperationAuditInfoListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-40EC-8035-4B12FEFD7D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>199</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryOperationAuditInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationAuditInfoListResponseBody self = new QueryOperationAuditInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOperationAuditInfoListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryOperationAuditInfoListResponseBody setData(java.util.List<QueryOperationAuditInfoListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOperationAuditInfoListResponseBodyData> getData() {
        return this.data;
    }

    public QueryOperationAuditInfoListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryOperationAuditInfoListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOperationAuditInfoListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryOperationAuditInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOperationAuditInfoListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryOperationAuditInfoListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryOperationAuditInfoListResponseBodyData extends TeaModel {
        @NameInMap("AuditInfo")
        public String auditInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditType")
        public Integer auditType;

        @NameInMap("BusinessName")
        public String businessName;

        /**
         * <strong>example:</strong>
         * <p>1581919010101</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>example.com,aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>1581919010101</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static QueryOperationAuditInfoListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOperationAuditInfoListResponseBodyData self = new QueryOperationAuditInfoListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOperationAuditInfoListResponseBodyData setAuditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }
        public String getAuditInfo() {
            return this.auditInfo;
        }

        public QueryOperationAuditInfoListResponseBodyData setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public QueryOperationAuditInfoListResponseBodyData setAuditType(Integer auditType) {
            this.auditType = auditType;
            return this;
        }
        public Integer getAuditType() {
            return this.auditType;
        }

        public QueryOperationAuditInfoListResponseBodyData setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public QueryOperationAuditInfoListResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryOperationAuditInfoListResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryOperationAuditInfoListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryOperationAuditInfoListResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryOperationAuditInfoListResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
