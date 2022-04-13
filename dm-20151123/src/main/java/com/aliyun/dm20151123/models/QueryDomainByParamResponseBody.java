// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryDomainByParamResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("data")
    public QueryDomainByParamResponseBodyData data;

    public static QueryDomainByParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainByParamResponseBody self = new QueryDomainByParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainByParamResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDomainByParamResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDomainByParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainByParamResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryDomainByParamResponseBody setData(QueryDomainByParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDomainByParamResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDomainByParamResponseBodyDataDomain extends TeaModel {
        @NameInMap("CnameAuthStatus")
        public String cnameAuthStatus;

        @NameInMap("ConfirmStatus")
        public String confirmStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainRecord")
        public String domainRecord;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("IcpStatus")
        public String icpStatus;

        @NameInMap("MxAuthStatus")
        public String mxAuthStatus;

        @NameInMap("SpfAuthStatus")
        public String spfAuthStatus;

        @NameInMap("UtcCreateTime")
        public Long utcCreateTime;

        public static QueryDomainByParamResponseBodyDataDomain build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainByParamResponseBodyDataDomain self = new QueryDomainByParamResponseBodyDataDomain();
            return TeaModel.build(map, self);
        }

        public QueryDomainByParamResponseBodyDataDomain setCnameAuthStatus(String cnameAuthStatus) {
            this.cnameAuthStatus = cnameAuthStatus;
            return this;
        }
        public String getCnameAuthStatus() {
            return this.cnameAuthStatus;
        }

        public QueryDomainByParamResponseBodyDataDomain setConfirmStatus(String confirmStatus) {
            this.confirmStatus = confirmStatus;
            return this;
        }
        public String getConfirmStatus() {
            return this.confirmStatus;
        }

        public QueryDomainByParamResponseBodyDataDomain setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryDomainByParamResponseBodyDataDomain setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public QueryDomainByParamResponseBodyDataDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainByParamResponseBodyDataDomain setDomainRecord(String domainRecord) {
            this.domainRecord = domainRecord;
            return this;
        }
        public String getDomainRecord() {
            return this.domainRecord;
        }

        public QueryDomainByParamResponseBodyDataDomain setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public QueryDomainByParamResponseBodyDataDomain setIcpStatus(String icpStatus) {
            this.icpStatus = icpStatus;
            return this;
        }
        public String getIcpStatus() {
            return this.icpStatus;
        }

        public QueryDomainByParamResponseBodyDataDomain setMxAuthStatus(String mxAuthStatus) {
            this.mxAuthStatus = mxAuthStatus;
            return this;
        }
        public String getMxAuthStatus() {
            return this.mxAuthStatus;
        }

        public QueryDomainByParamResponseBodyDataDomain setSpfAuthStatus(String spfAuthStatus) {
            this.spfAuthStatus = spfAuthStatus;
            return this;
        }
        public String getSpfAuthStatus() {
            return this.spfAuthStatus;
        }

        public QueryDomainByParamResponseBodyDataDomain setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

    }

    public static class QueryDomainByParamResponseBodyData extends TeaModel {
        @NameInMap("domain")
        public java.util.List<QueryDomainByParamResponseBodyDataDomain> domain;

        public static QueryDomainByParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainByParamResponseBodyData self = new QueryDomainByParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDomainByParamResponseBodyData setDomain(java.util.List<QueryDomainByParamResponseBodyDataDomain> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<QueryDomainByParamResponseBodyDataDomain> getDomain() {
            return this.domain;
        }

    }

}
