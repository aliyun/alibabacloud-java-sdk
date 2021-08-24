// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListInuseServicesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("Services")
    public java.util.List<ListInuseServicesResponseBodyServices> services;

    public static ListInuseServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInuseServicesResponseBody self = new ListInuseServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInuseServicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInuseServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInuseServicesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListInuseServicesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListInuseServicesResponseBody setServices(java.util.List<ListInuseServicesResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListInuseServicesResponseBodyServices> getServices() {
        return this.services;
    }

    public static class ListInuseServicesResponseBodyServicesServiceInfos extends TeaModel {
        @NameInMap("Locale")
        public String locale;

        @NameInMap("Image")
        public String image;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShortDescription")
        public String shortDescription;

        public static ListInuseServicesResponseBodyServicesServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListInuseServicesResponseBodyServicesServiceInfos self = new ListInuseServicesResponseBodyServicesServiceInfos();
            return TeaModel.build(map, self);
        }

        public ListInuseServicesResponseBodyServicesServiceInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public ListInuseServicesResponseBodyServicesServiceInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListInuseServicesResponseBodyServicesServiceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInuseServicesResponseBodyServicesServiceInfos setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

    }

    public static class ListInuseServicesResponseBodyServices extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("Version")
        public String version;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("SupplierUrl")
        public String supplierUrl;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("ServiceInfos")
        public java.util.List<ListInuseServicesResponseBodyServicesServiceInfos> serviceInfos;

        @NameInMap("CommodityCode")
        public String commodityCode;

        public static ListInuseServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListInuseServicesResponseBodyServices self = new ListInuseServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListInuseServicesResponseBodyServices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInuseServicesResponseBodyServices setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListInuseServicesResponseBodyServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListInuseServicesResponseBodyServices setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListInuseServicesResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListInuseServicesResponseBodyServices setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public ListInuseServicesResponseBodyServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListInuseServicesResponseBodyServices setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListInuseServicesResponseBodyServices setServiceInfos(java.util.List<ListInuseServicesResponseBodyServicesServiceInfos> serviceInfos) {
            this.serviceInfos = serviceInfos;
            return this;
        }
        public java.util.List<ListInuseServicesResponseBodyServicesServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

        public ListInuseServicesResponseBodyServices setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

    }

}
