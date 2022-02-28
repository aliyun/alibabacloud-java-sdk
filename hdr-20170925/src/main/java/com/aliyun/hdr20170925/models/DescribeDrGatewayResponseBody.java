// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewayResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

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

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operations")
    public String operations;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("UpstreamSpeed")
    public Long upstreamSpeed;

    @NameInMap("Version")
    public String version;

    public static DescribeDrGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewayResponseBody self = new DescribeDrGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDrGatewayResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public DescribeDrGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDrGatewayResponseBody setDownstreamSpeed(Long downstreamSpeed) {
        this.downstreamSpeed = downstreamSpeed;
        return this;
    }
    public Long getDownstreamSpeed() {
        return this.downstreamSpeed;
    }

    public DescribeDrGatewayResponseBody setGatewayClass(String gatewayClass) {
        this.gatewayClass = gatewayClass;
        return this;
    }
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    public DescribeDrGatewayResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeDrGatewayResponseBody setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public DescribeDrGatewayResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public DescribeDrGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDrGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDrGatewayResponseBody setOperations(String operations) {
        this.operations = operations;
        return this;
    }
    public String getOperations() {
        return this.operations;
    }

    public DescribeDrGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrGatewayResponseBody setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeDrGatewayResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDrGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrGatewayResponseBody setUpstreamSpeed(Long upstreamSpeed) {
        this.upstreamSpeed = upstreamSpeed;
        return this;
    }
    public Long getUpstreamSpeed() {
        return this.upstreamSpeed;
    }

    public DescribeDrGatewayResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
