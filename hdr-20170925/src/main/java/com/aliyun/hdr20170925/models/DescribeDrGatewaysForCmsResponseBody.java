// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewaysForCmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DrGateways")
    public DescribeDrGatewaysForCmsResponseBodyDrGateways drGateways;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrGatewaysForCmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewaysForCmsResponseBody self = new DescribeDrGatewaysForCmsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewaysForCmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDrGatewaysForCmsResponseBody setDrGateways(DescribeDrGatewaysForCmsResponseBodyDrGateways drGateways) {
        this.drGateways = drGateways;
        return this;
    }
    public DescribeDrGatewaysForCmsResponseBodyDrGateways getDrGateways() {
        return this.drGateways;
    }

    public DescribeDrGatewaysForCmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDrGatewaysForCmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrGatewaysForCmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("Name")
        public String name;

        @NameInMap("SitePairName")
        public String sitePairName;

        public static DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway self = new DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway();
            return TeaModel.build(map, self);
        }

        public DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway setSitePairName(String sitePairName) {
            this.sitePairName = sitePairName;
            return this;
        }
        public String getSitePairName() {
            return this.sitePairName;
        }

    }

    public static class DescribeDrGatewaysForCmsResponseBodyDrGateways extends TeaModel {
        @NameInMap("gateway")
        public java.util.List<DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway> gateway;

        public static DescribeDrGatewaysForCmsResponseBodyDrGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrGatewaysForCmsResponseBodyDrGateways self = new DescribeDrGatewaysForCmsResponseBodyDrGateways();
            return TeaModel.build(map, self);
        }

        public DescribeDrGatewaysForCmsResponseBodyDrGateways setGateway(java.util.List<DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway> gateway) {
            this.gateway = gateway;
            return this;
        }
        public java.util.List<DescribeDrGatewaysForCmsResponseBodyDrGatewaysGateway> getGateway() {
            return this.gateway;
        }

    }

}
