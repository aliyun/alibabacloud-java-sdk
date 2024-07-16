// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryDomainByParamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>8C90CCD3-627C-4F87-AD8C-2F03146071EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CnameAuthStatus")
        public String cnameAuthStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ConfirmStatus")
        public String confirmStatus;

        /**
         * <strong>example:</strong>
         * <p>2019-09-29T13:28Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>158923</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <strong>example:</strong>
         * <p>vmeixme.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>6bd86901b9fe4618a046</p>
         */
        @NameInMap("DomainRecord")
        public String domainRecord;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IcpStatus")
        public String icpStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MxAuthStatus")
        public String mxAuthStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpfAuthStatus")
        public String spfAuthStatus;

        /**
         * <strong>example:</strong>
         * <p>1569734892</p>
         */
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
