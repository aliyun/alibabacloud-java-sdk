// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryDomainListResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryDomainListResponseBodyData data;

    /**
     * <p>Indicates whether the current page is followed by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates whether the current page follows another page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainListResponseBody self = new QueryDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryDomainListResponseBody setData(QueryDomainListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDomainListResponseBodyData getData() {
        return this.data;
    }

    public QueryDomainListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryDomainListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDomainListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryDomainListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryDomainListResponseBodyDataDomain extends TeaModel {
        @NameInMap("DeadDate")
        public String deadDate;

        @NameInMap("DeadDateLong")
        public Long deadDateLong;

        @NameInMap("DeadDateStatus")
        public String deadDateStatus;

        @NameInMap("DomainAuditStatus")
        public String domainAuditStatus;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainRegType")
        public String domainRegType;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Premium")
        public Boolean premium;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("RegDate")
        public String regDate;

        @NameInMap("RegDateLong")
        public Long regDateLong;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SaleId")
        public String saleId;

        public static QueryDomainListResponseBodyDataDomain build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListResponseBodyDataDomain self = new QueryDomainListResponseBodyDataDomain();
            return TeaModel.build(map, self);
        }

        public QueryDomainListResponseBodyDataDomain setDeadDate(String deadDate) {
            this.deadDate = deadDate;
            return this;
        }
        public String getDeadDate() {
            return this.deadDate;
        }

        public QueryDomainListResponseBodyDataDomain setDeadDateLong(Long deadDateLong) {
            this.deadDateLong = deadDateLong;
            return this;
        }
        public Long getDeadDateLong() {
            return this.deadDateLong;
        }

        public QueryDomainListResponseBodyDataDomain setDeadDateStatus(String deadDateStatus) {
            this.deadDateStatus = deadDateStatus;
            return this;
        }
        public String getDeadDateStatus() {
            return this.deadDateStatus;
        }

        public QueryDomainListResponseBodyDataDomain setDomainAuditStatus(String domainAuditStatus) {
            this.domainAuditStatus = domainAuditStatus;
            return this;
        }
        public String getDomainAuditStatus() {
            return this.domainAuditStatus;
        }

        public QueryDomainListResponseBodyDataDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainListResponseBodyDataDomain setDomainRegType(String domainRegType) {
            this.domainRegType = domainRegType;
            return this;
        }
        public String getDomainRegType() {
            return this.domainRegType;
        }

        public QueryDomainListResponseBodyDataDomain setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public QueryDomainListResponseBodyDataDomain setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public QueryDomainListResponseBodyDataDomain setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDomainListResponseBodyDataDomain setPremium(Boolean premium) {
            this.premium = premium;
            return this;
        }
        public Boolean getPremium() {
            return this.premium;
        }

        public QueryDomainListResponseBodyDataDomain setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryDomainListResponseBodyDataDomain setRegDate(String regDate) {
            this.regDate = regDate;
            return this;
        }
        public String getRegDate() {
            return this.regDate;
        }

        public QueryDomainListResponseBodyDataDomain setRegDateLong(Long regDateLong) {
            this.regDateLong = regDateLong;
            return this;
        }
        public Long getRegDateLong() {
            return this.regDateLong;
        }

        public QueryDomainListResponseBodyDataDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryDomainListResponseBodyDataDomain setSaleId(String saleId) {
            this.saleId = saleId;
            return this;
        }
        public String getSaleId() {
            return this.saleId;
        }

    }

    public static class QueryDomainListResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<QueryDomainListResponseBodyDataDomain> domain;

        public static QueryDomainListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListResponseBodyData self = new QueryDomainListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDomainListResponseBodyData setDomain(java.util.List<QueryDomainListResponseBodyDataDomain> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<QueryDomainListResponseBodyDataDomain> getDomain() {
            return this.domain;
        }

    }

}
