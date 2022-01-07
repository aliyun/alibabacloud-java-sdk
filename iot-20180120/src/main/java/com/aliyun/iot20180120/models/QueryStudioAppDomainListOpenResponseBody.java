// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppDomainListOpenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStudioAppDomainListOpenResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStudioAppDomainListOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppDomainListOpenResponseBody self = new QueryStudioAppDomainListOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppDomainListOpenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStudioAppDomainListOpenResponseBody setData(QueryStudioAppDomainListOpenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStudioAppDomainListOpenResponseBodyData getData() {
        return this.data;
    }

    public QueryStudioAppDomainListOpenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStudioAppDomainListOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStudioAppDomainListOpenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("IsBeian")
        public String isBeian;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("TenantId")
        public String tenantId;

        public static QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo self = new QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo setIsBeian(String isBeian) {
            this.isBeian = isBeian;
            return this;
        }
        public String getIsBeian() {
            return this.isBeian;
        }

        public QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class QueryStudioAppDomainListOpenResponseBodyDataList extends TeaModel {
        @NameInMap("DomainInfo")
        public java.util.List<QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo> domainInfo;

        public static QueryStudioAppDomainListOpenResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppDomainListOpenResponseBodyDataList self = new QueryStudioAppDomainListOpenResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppDomainListOpenResponseBodyDataList setDomainInfo(java.util.List<QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo> domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }
        public java.util.List<QueryStudioAppDomainListOpenResponseBodyDataListDomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

    }

    public static class QueryStudioAppDomainListOpenResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryStudioAppDomainListOpenResponseBodyDataList list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryStudioAppDomainListOpenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppDomainListOpenResponseBodyData self = new QueryStudioAppDomainListOpenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppDomainListOpenResponseBodyData setList(QueryStudioAppDomainListOpenResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryStudioAppDomainListOpenResponseBodyDataList getList() {
            return this.list;
        }

        public QueryStudioAppDomainListOpenResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryStudioAppDomainListOpenResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStudioAppDomainListOpenResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryStudioAppDomainListOpenResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
