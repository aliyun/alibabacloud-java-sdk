// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetDomainAndUriResourcesResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetDomainAndUriResourcesResponseBodyData> data;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("ip")
    public String ip;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("message")
    public String message;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("httpCode")
    public Integer httpCode;

    public static GetDomainAndUriResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainAndUriResourcesResponseBody self = new GetDomainAndUriResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainAndUriResourcesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetDomainAndUriResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDomainAndUriResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDomainAndUriResourcesResponseBody setData(java.util.List<GetDomainAndUriResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDomainAndUriResourcesResponseBodyData> getData() {
        return this.data;
    }

    public GetDomainAndUriResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDomainAndUriResourcesResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetDomainAndUriResourcesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDomainAndUriResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDomainAndUriResourcesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDomainAndUriResourcesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class GetDomainAndUriResourcesResponseBodyDataUris extends TeaModel {
        // 配置状态。值为 ACTIVE/MODIFIED/REMOVED
        @NameInMap("configStatus")
        public String configStatus;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // URI前缀
        @NameInMap("uriPrefix")
        public String uriPrefix;

        // 是否单元化
        @NameInMap("isUnit")
        public Boolean isUnit;

        public static GetDomainAndUriResourcesResponseBodyDataUris build(java.util.Map<String, ?> map) throws Exception {
            GetDomainAndUriResourcesResponseBodyDataUris self = new GetDomainAndUriResourcesResponseBodyDataUris();
            return TeaModel.build(map, self);
        }

        public GetDomainAndUriResourcesResponseBodyDataUris setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public GetDomainAndUriResourcesResponseBodyDataUris setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDomainAndUriResourcesResponseBodyDataUris setUriPrefix(String uriPrefix) {
            this.uriPrefix = uriPrefix;
            return this;
        }
        public String getUriPrefix() {
            return this.uriPrefix;
        }

        public GetDomainAndUriResourcesResponseBodyDataUris setIsUnit(Boolean isUnit) {
            this.isUnit = isUnit;
            return this;
        }
        public Boolean getIsUnit() {
            return this.isUnit;
        }

    }

    public static class GetDomainAndUriResourcesResponseBodyData extends TeaModel {
        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 命名空间ID
        @NameInMap("mshaTenantId")
        public String mshaTenantId;

        // 域名
        @NameInMap("domain")
        public String domain;

        // 协议类型。值为 http/websocket
        @NameInMap("protocolType")
        public String protocolType;

        // 流量纠错类型。值为 upstream/301/302
        @NameInMap("redirectType")
        public String redirectType;

        // 配置状态。值为 ACTIVE/MODIFIED/REMOVED
        @NameInMap("configStatus")
        public String configStatus;

        // 接入类型。值为 ip/domain
        @NameInMap("accessType")
        public String accessType;

        // URI列表
        @NameInMap("uris")
        public java.util.List<GetDomainAndUriResourcesResponseBodyDataUris> uris;

        // 域名类型，值为 单元化域名：unit，强中心域名：center
        @NameInMap("domainType")
        public String domainType;

        // 域名托管方式 ：DNS/GTM/EMPTY
        @NameInMap("managerType")
        public String managerType;

        public static GetDomainAndUriResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDomainAndUriResourcesResponseBodyData self = new GetDomainAndUriResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDomainAndUriResourcesResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDomainAndUriResourcesResponseBodyData setMshaTenantId(String mshaTenantId) {
            this.mshaTenantId = mshaTenantId;
            return this;
        }
        public String getMshaTenantId() {
            return this.mshaTenantId;
        }

        public GetDomainAndUriResourcesResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetDomainAndUriResourcesResponseBodyData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public GetDomainAndUriResourcesResponseBodyData setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

        public GetDomainAndUriResourcesResponseBodyData setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public GetDomainAndUriResourcesResponseBodyData setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public GetDomainAndUriResourcesResponseBodyData setUris(java.util.List<GetDomainAndUriResourcesResponseBodyDataUris> uris) {
            this.uris = uris;
            return this;
        }
        public java.util.List<GetDomainAndUriResourcesResponseBodyDataUris> getUris() {
            return this.uris;
        }

        public GetDomainAndUriResourcesResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public GetDomainAndUriResourcesResponseBodyData setManagerType(String managerType) {
            this.managerType = managerType;
            return this;
        }
        public String getManagerType() {
            return this.managerType;
        }

    }

}
