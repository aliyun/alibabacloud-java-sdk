// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetDomainsResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetDomainsResponseBodyData> data;

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

    public static GetDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainsResponseBody self = new GetDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetDomainsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDomainsResponseBody setData(java.util.List<GetDomainsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDomainsResponseBodyData> getData() {
        return this.data;
    }

    public GetDomainsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDomainsResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetDomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDomainsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDomainsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDomainsResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class GetDomainsResponseBodyDataUris extends TeaModel {
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

        public static GetDomainsResponseBodyDataUris build(java.util.Map<String, ?> map) throws Exception {
            GetDomainsResponseBodyDataUris self = new GetDomainsResponseBodyDataUris();
            return TeaModel.build(map, self);
        }

        public GetDomainsResponseBodyDataUris setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public GetDomainsResponseBodyDataUris setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDomainsResponseBodyDataUris setUriPrefix(String uriPrefix) {
            this.uriPrefix = uriPrefix;
            return this;
        }
        public String getUriPrefix() {
            return this.uriPrefix;
        }

        public GetDomainsResponseBodyDataUris setIsUnit(Boolean isUnit) {
            this.isUnit = isUnit;
            return this;
        }
        public Boolean getIsUnit() {
            return this.isUnit;
        }

    }

    public static class GetDomainsResponseBodyData extends TeaModel {
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
        public java.util.List<GetDomainsResponseBodyDataUris> uris;

        // 域名类型，值为 单元化域名：unit，强中心域名：center
        @NameInMap("domainType")
        public String domainType;

        // 域名托管方式 ：DNS/GTM/EMPTY
        @NameInMap("managerType")
        public String managerType;

        // 域id
        @NameInMap("id")
        public Long id;

        public static GetDomainsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDomainsResponseBodyData self = new GetDomainsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDomainsResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDomainsResponseBodyData setMshaTenantId(String mshaTenantId) {
            this.mshaTenantId = mshaTenantId;
            return this;
        }
        public String getMshaTenantId() {
            return this.mshaTenantId;
        }

        public GetDomainsResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetDomainsResponseBodyData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public GetDomainsResponseBodyData setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

        public GetDomainsResponseBodyData setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public GetDomainsResponseBodyData setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public GetDomainsResponseBodyData setUris(java.util.List<GetDomainsResponseBodyDataUris> uris) {
            this.uris = uris;
            return this;
        }
        public java.util.List<GetDomainsResponseBodyDataUris> getUris() {
            return this.uris;
        }

        public GetDomainsResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public GetDomainsResponseBodyData setManagerType(String managerType) {
            this.managerType = managerType;
            return this;
        }
        public String getManagerType() {
            return this.managerType;
        }

        public GetDomainsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
