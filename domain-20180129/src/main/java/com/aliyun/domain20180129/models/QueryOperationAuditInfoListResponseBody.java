// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    /**
     * <p>Review data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryOperationAuditInfoListResponseBodyData> data;

    /**
     * <p>Indicates whether there is a next page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <p>Number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates whether a previous page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-40EC-8035-4B12FEFD7D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>199</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <p>Total number of pages.</p>
     * 
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
        /**
         * <p>Information pending review.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regType&quot;:1,&quot;registrantName&quot;:&quot;张三&quot;,&quot;telephone&quot;:&quot;1390123****&quot;,&quot;account&quot;:&quot;<a href="mailto:username@example.com">username@example.com</a>&quot;,&quot;reason&quot;:1,&quot;remark&quot;:&quot;账号丢失&quot;}</p>
         */
        @NameInMap("AuditInfo")
        public String auditInfo;

        /**
         * <p>Review status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Information to be completed.</li>
         * <li><strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>: Under review.</li>
         * <li><strong>5</strong>: Review failed.</li>
         * <li><strong>6</strong>: Review succeeded.</li>
         * <li><strong>7</strong>: Review canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <p>Review type. Valid value:</p>
         * <p><strong>1</strong>: Offline domain name transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditType")
        public Integer auditType;

        /**
         * <p>Name of the reviewed business.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com等域名线下转移</p>
         */
        @NameInMap("BusinessName")
        public String businessName;

        /**
         * <p>Record creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1581919010101</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Review record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Review remark.</p>
         * 
         * <strong>example:</strong>
         * <p>审核中</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Record update time.</p>
         * 
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
