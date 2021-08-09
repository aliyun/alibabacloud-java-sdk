// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetUrisResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetUrisResponseBodyData> data;

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

    public static GetUrisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUrisResponseBody self = new GetUrisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUrisResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetUrisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUrisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUrisResponseBody setData(java.util.List<GetUrisResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUrisResponseBodyData> getData() {
        return this.data;
    }

    public GetUrisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUrisResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetUrisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetUrisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUrisResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetUrisResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class GetUrisResponseBodyDataDomainUriDO extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("isDeleted")
        public Boolean isDeleted;

        @NameInMap("domainId")
        public Long domainId;

        @NameInMap("uriPrefix")
        public String uriPrefix;

        @NameInMap("isUnit")
        public Boolean isUnit;

        @NameInMap("configStatus")
        public String configStatus;

        @NameInMap("uriFrom")
        public String uriFrom;

        @NameInMap("hasDefaultRouterId")
        public Boolean hasDefaultRouterId;

        public static GetUrisResponseBodyDataDomainUriDO build(java.util.Map<String, ?> map) throws Exception {
            GetUrisResponseBodyDataDomainUriDO self = new GetUrisResponseBodyDataDomainUriDO();
            return TeaModel.build(map, self);
        }

        public GetUrisResponseBodyDataDomainUriDO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUrisResponseBodyDataDomainUriDO setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUrisResponseBodyDataDomainUriDO setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetUrisResponseBodyDataDomainUriDO setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public GetUrisResponseBodyDataDomainUriDO setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public GetUrisResponseBodyDataDomainUriDO setUriPrefix(String uriPrefix) {
            this.uriPrefix = uriPrefix;
            return this;
        }
        public String getUriPrefix() {
            return this.uriPrefix;
        }

        public GetUrisResponseBodyDataDomainUriDO setIsUnit(Boolean isUnit) {
            this.isUnit = isUnit;
            return this;
        }
        public Boolean getIsUnit() {
            return this.isUnit;
        }

        public GetUrisResponseBodyDataDomainUriDO setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public GetUrisResponseBodyDataDomainUriDO setUriFrom(String uriFrom) {
            this.uriFrom = uriFrom;
            return this;
        }
        public String getUriFrom() {
            return this.uriFrom;
        }

        public GetUrisResponseBodyDataDomainUriDO setHasDefaultRouterId(Boolean hasDefaultRouterId) {
            this.hasDefaultRouterId = hasDefaultRouterId;
            return this;
        }
        public Boolean getHasDefaultRouterId() {
            return this.hasDefaultRouterId;
        }

    }

    public static class GetUrisResponseBodyDataUriUpstreamDOs extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("isDeleted")
        public Boolean isDeleted;

        @NameInMap("domainUriId")
        public Long domainUriId;

        @NameInMap("unitFlag")
        public String unitFlag;

        @NameInMap("cell")
        public String cell;

        @NameInMap("backIps")
        public String backIps;

        public static GetUrisResponseBodyDataUriUpstreamDOs build(java.util.Map<String, ?> map) throws Exception {
            GetUrisResponseBodyDataUriUpstreamDOs self = new GetUrisResponseBodyDataUriUpstreamDOs();
            return TeaModel.build(map, self);
        }

        public GetUrisResponseBodyDataUriUpstreamDOs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUrisResponseBodyDataUriUpstreamDOs setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUrisResponseBodyDataUriUpstreamDOs setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetUrisResponseBodyDataUriUpstreamDOs setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public GetUrisResponseBodyDataUriUpstreamDOs setDomainUriId(Long domainUriId) {
            this.domainUriId = domainUriId;
            return this;
        }
        public Long getDomainUriId() {
            return this.domainUriId;
        }

        public GetUrisResponseBodyDataUriUpstreamDOs setUnitFlag(String unitFlag) {
            this.unitFlag = unitFlag;
            return this;
        }
        public String getUnitFlag() {
            return this.unitFlag;
        }

        public GetUrisResponseBodyDataUriUpstreamDOs setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public GetUrisResponseBodyDataUriUpstreamDOs setBackIps(String backIps) {
            this.backIps = backIps;
            return this;
        }
        public String getBackIps() {
            return this.backIps;
        }

    }

    public static class GetUrisResponseBodyData extends TeaModel {
        @NameInMap("mshaTenantId")
        public String mshaTenantId;

        @NameInMap("domainUriDO")
        public GetUrisResponseBodyDataDomainUriDO domainUriDO;

        @NameInMap("uriUpstreamDOs")
        public java.util.List<GetUrisResponseBodyDataUriUpstreamDOs> uriUpstreamDOs;

        public static GetUrisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUrisResponseBodyData self = new GetUrisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUrisResponseBodyData setMshaTenantId(String mshaTenantId) {
            this.mshaTenantId = mshaTenantId;
            return this;
        }
        public String getMshaTenantId() {
            return this.mshaTenantId;
        }

        public GetUrisResponseBodyData setDomainUriDO(GetUrisResponseBodyDataDomainUriDO domainUriDO) {
            this.domainUriDO = domainUriDO;
            return this;
        }
        public GetUrisResponseBodyDataDomainUriDO getDomainUriDO() {
            return this.domainUriDO;
        }

        public GetUrisResponseBodyData setUriUpstreamDOs(java.util.List<GetUrisResponseBodyDataUriUpstreamDOs> uriUpstreamDOs) {
            this.uriUpstreamDOs = uriUpstreamDOs;
            return this;
        }
        public java.util.List<GetUrisResponseBodyDataUriUpstreamDOs> getUriUpstreamDOs() {
            return this.uriUpstreamDOs;
        }

    }

}
