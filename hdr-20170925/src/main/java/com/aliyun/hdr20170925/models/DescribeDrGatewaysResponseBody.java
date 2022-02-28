// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewaysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DrGateways")
    public DescribeDrGatewaysResponseBodyDrGateways drGateways;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDrGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewaysResponseBody self = new DescribeDrGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewaysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDrGatewaysResponseBody setDrGateways(DescribeDrGatewaysResponseBodyDrGateways drGateways) {
        this.drGateways = drGateways;
        return this;
    }
    public DescribeDrGatewaysResponseBodyDrGateways getDrGateways() {
        return this.drGateways;
    }

    public DescribeDrGatewaysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDrGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDrGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrGatewaysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDrGatewaysResponseBodyDrGatewaysGateway extends TeaModel {
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DownstreamSpeed")
        public Long downstreamSpeed;

        @NameInMap("GatewayClass")
        public String gatewayClass;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operations")
        public String operations;

        @NameInMap("SiteId")
        public String siteId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpstreamSpeed")
        public Long upstreamSpeed;

        @NameInMap("Version")
        public String version;

        public static DescribeDrGatewaysResponseBodyDrGatewaysGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrGatewaysResponseBodyDrGatewaysGateway self = new DescribeDrGatewaysResponseBodyDrGatewaysGateway();
            return TeaModel.build(map, self);
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setDownstreamSpeed(Long downstreamSpeed) {
            this.downstreamSpeed = downstreamSpeed;
            return this;
        }
        public Long getDownstreamSpeed() {
            return this.downstreamSpeed;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setGatewayClass(String gatewayClass) {
            this.gatewayClass = gatewayClass;
            return this;
        }
        public String getGatewayClass() {
            return this.gatewayClass;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setOperations(String operations) {
            this.operations = operations;
            return this;
        }
        public String getOperations() {
            return this.operations;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setUpstreamSpeed(Long upstreamSpeed) {
            this.upstreamSpeed = upstreamSpeed;
            return this;
        }
        public Long getUpstreamSpeed() {
            return this.upstreamSpeed;
        }

        public DescribeDrGatewaysResponseBodyDrGatewaysGateway setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeDrGatewaysResponseBodyDrGateways extends TeaModel {
        @NameInMap("gateway")
        public java.util.List<DescribeDrGatewaysResponseBodyDrGatewaysGateway> gateway;

        public static DescribeDrGatewaysResponseBodyDrGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrGatewaysResponseBodyDrGateways self = new DescribeDrGatewaysResponseBodyDrGateways();
            return TeaModel.build(map, self);
        }

        public DescribeDrGatewaysResponseBodyDrGateways setGateway(java.util.List<DescribeDrGatewaysResponseBodyDrGatewaysGateway> gateway) {
            this.gateway = gateway;
            return this;
        }
        public java.util.List<DescribeDrGatewaysResponseBodyDrGatewaysGateway> getGateway() {
            return this.gateway;
        }

    }

}
