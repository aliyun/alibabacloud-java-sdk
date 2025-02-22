// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsUserInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserInfo")
    public DescribePdnsUserInfoResponseBodyUserInfo userInfo;

    public static DescribePdnsUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsUserInfoResponseBody self = new DescribePdnsUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePdnsUserInfoResponseBody setUserInfo(DescribePdnsUserInfoResponseBodyUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DescribePdnsUserInfoResponseBodyUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DescribePdnsUserInfoResponseBodyUserInfo extends TeaModel {
        @NameInMap("AvailableAccessSecurityType")
        public String availableAccessSecurityType;

        @NameInMap("AvailableService")
        public String availableService;

        @NameInMap("PdnsId")
        public Long pdnsId;

        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("State")
        public String state;

        @NameInMap("StatisticSwitchStatus")
        public String statisticSwitchStatus;

        @NameInMap("StoppedService")
        public String stoppedService;

        public static DescribePdnsUserInfoResponseBodyUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsUserInfoResponseBodyUserInfo self = new DescribePdnsUserInfoResponseBodyUserInfo();
            return TeaModel.build(map, self);
        }

        public DescribePdnsUserInfoResponseBodyUserInfo setAvailableAccessSecurityType(String availableAccessSecurityType) {
            this.availableAccessSecurityType = availableAccessSecurityType;
            return this;
        }
        public String getAvailableAccessSecurityType() {
            return this.availableAccessSecurityType;
        }

        public DescribePdnsUserInfoResponseBodyUserInfo setAvailableService(String availableService) {
            this.availableService = availableService;
            return this;
        }
        public String getAvailableService() {
            return this.availableService;
        }

        public DescribePdnsUserInfoResponseBodyUserInfo setPdnsId(Long pdnsId) {
            this.pdnsId = pdnsId;
            return this;
        }
        public Long getPdnsId() {
            return this.pdnsId;
        }

        public DescribePdnsUserInfoResponseBodyUserInfo setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public DescribePdnsUserInfoResponseBodyUserInfo setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribePdnsUserInfoResponseBodyUserInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePdnsUserInfoResponseBodyUserInfo setStatisticSwitchStatus(String statisticSwitchStatus) {
            this.statisticSwitchStatus = statisticSwitchStatus;
            return this;
        }
        public String getStatisticSwitchStatus() {
            return this.statisticSwitchStatus;
        }

        public DescribePdnsUserInfoResponseBodyUserInfo setStoppedService(String stoppedService) {
            this.stoppedService = stoppedService;
            return this;
        }
        public String getStoppedService() {
            return this.stoppedService;
        }

    }

}
