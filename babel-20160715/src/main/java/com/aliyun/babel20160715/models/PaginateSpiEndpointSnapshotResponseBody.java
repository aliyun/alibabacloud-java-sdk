// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class PaginateSpiEndpointSnapshotResponseBody extends TeaModel {
    @NameInMap("SpiEndpointSnapshotList")
    public java.util.List<PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList> spiEndpointSnapshotList;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("Success")
    public Boolean success;

    public static PaginateSpiEndpointSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PaginateSpiEndpointSnapshotResponseBody self = new PaginateSpiEndpointSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public PaginateSpiEndpointSnapshotResponseBody setSpiEndpointSnapshotList(java.util.List<PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList> spiEndpointSnapshotList) {
        this.spiEndpointSnapshotList = spiEndpointSnapshotList;
        return this;
    }
    public java.util.List<PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList> getSpiEndpointSnapshotList() {
        return this.spiEndpointSnapshotList;
    }

    public PaginateSpiEndpointSnapshotResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PaginateSpiEndpointSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PaginateSpiEndpointSnapshotResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public PaginateSpiEndpointSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListDefaultEndpoint extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        public static PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListDefaultEndpoint build(java.util.Map<String, ?> map) throws Exception {
            PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListDefaultEndpoint self = new PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListDefaultEndpoint();
            return TeaModel.build(map, self);
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListDefaultEndpoint setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListDefaultEndpoint setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

    }

    public static class PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Params")
        public java.util.List<String> params;

        @NameInMap("Evaluator")
        public String evaluator;

        @NameInMap("Priority")
        public String priority;

        public static PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules build(java.util.Map<String, ?> map) throws Exception {
            PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules self = new PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules();
            return TeaModel.build(map, self);
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules setParams(java.util.List<String> params) {
            this.params = params;
            return this;
        }
        public java.util.List<String> getParams() {
            return this.params;
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules setEvaluator(String evaluator) {
            this.evaluator = evaluator;
            return this;
        }
        public String getEvaluator() {
            return this.evaluator;
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

    }

    public static class PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList extends TeaModel {
        @NameInMap("DefaultEndpoint")
        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListDefaultEndpoint defaultEndpoint;

        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("RouteRules")
        public java.util.List<PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules> routeRules;

        @NameInMap("VersionStamp")
        public String versionStamp;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("RegionId")
        public String regionId;

        public static PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList build(java.util.Map<String, ?> map) throws Exception {
            PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList self = new PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList();
            return TeaModel.build(map, self);
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList setDefaultEndpoint(PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListDefaultEndpoint defaultEndpoint) {
            this.defaultEndpoint = defaultEndpoint;
            return this;
        }
        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListDefaultEndpoint getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList setRouteRules(java.util.List<PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules> routeRules) {
            this.routeRules = routeRules;
            return this;
        }
        public java.util.List<PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotListRouteRules> getRouteRules() {
            return this.routeRules;
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList setVersionStamp(String versionStamp) {
            this.versionStamp = versionStamp;
            return this;
        }
        public String getVersionStamp() {
            return this.versionStamp;
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public PaginateSpiEndpointSnapshotResponseBodySpiEndpointSnapshotList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
