// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppDomainListOpenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryStudioAppDomainListOpenResponseData data;

    public static QueryStudioAppDomainListOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppDomainListOpenResponse self = new QueryStudioAppDomainListOpenResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppDomainListOpenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStudioAppDomainListOpenResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryStudioAppDomainListOpenResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStudioAppDomainListOpenResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStudioAppDomainListOpenResponse setData(QueryStudioAppDomainListOpenResponseData data) {
        this.data = data;
        return this;
    }
    public QueryStudioAppDomainListOpenResponseData getData() {
        return this.data;
    }

    public static class QueryStudioAppDomainListOpenResponseDataListDomainInfo extends TeaModel {
        @NameInMap("TenantId")
        @Validation(required = true)
        public String tenantId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("IsBeian")
        @Validation(required = true)
        public String isBeian;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        public static QueryStudioAppDomainListOpenResponseDataListDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppDomainListOpenResponseDataListDomainInfo self = new QueryStudioAppDomainListOpenResponseDataListDomainInfo();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppDomainListOpenResponseDataListDomainInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryStudioAppDomainListOpenResponseDataListDomainInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryStudioAppDomainListOpenResponseDataListDomainInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryStudioAppDomainListOpenResponseDataListDomainInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryStudioAppDomainListOpenResponseDataListDomainInfo setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryStudioAppDomainListOpenResponseDataListDomainInfo setIsBeian(String isBeian) {
            this.isBeian = isBeian;
            return this;
        }
        public String getIsBeian() {
            return this.isBeian;
        }

        public QueryStudioAppDomainListOpenResponseDataListDomainInfo setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryStudioAppDomainListOpenResponseDataListDomainInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryStudioAppDomainListOpenResponseDataListDomainInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class QueryStudioAppDomainListOpenResponseDataList extends TeaModel {
        @NameInMap("DomainInfo")
        @Validation(required = true)
        public java.util.List<QueryStudioAppDomainListOpenResponseDataListDomainInfo> domainInfo;

        public static QueryStudioAppDomainListOpenResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppDomainListOpenResponseDataList self = new QueryStudioAppDomainListOpenResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppDomainListOpenResponseDataList setDomainInfo(java.util.List<QueryStudioAppDomainListOpenResponseDataListDomainInfo> domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }
        public java.util.List<QueryStudioAppDomainListOpenResponseDataListDomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

    }

    public static class QueryStudioAppDomainListOpenResponseData extends TeaModel {
        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("List")
        @Validation(required = true)
        public QueryStudioAppDomainListOpenResponseDataList list;

        public static QueryStudioAppDomainListOpenResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppDomainListOpenResponseData self = new QueryStudioAppDomainListOpenResponseData();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppDomainListOpenResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryStudioAppDomainListOpenResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStudioAppDomainListOpenResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryStudioAppDomainListOpenResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public QueryStudioAppDomainListOpenResponseData setList(QueryStudioAppDomainListOpenResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryStudioAppDomainListOpenResponseDataList getList() {
            return this.list;
        }

    }

}
