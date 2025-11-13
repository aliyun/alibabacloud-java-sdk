// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsUserInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FD552816-FCC8-4832-B4A2-2DA0C2BA1688</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the user.</p>
     */
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
        /**
         * <p>The enabled access security types.</p>
         * 
         * <strong>example:</strong>
         * <p>SECURE</p>
         */
        @NameInMap("AvailableAccessSecurityType")
        public String availableAccessSecurityType;

        /**
         * <p>The enabled public recursive DNS service.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP,HTTPS</p>
         */
        @NameInMap("AvailableService")
        public String availableService;

        /**
         * <p>The configuration ID of the users in public recursive DNS.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("PdnsId")
        public Long pdnsId;

        /**
         * <p>The SecretKey configured for a UDP-based CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>1c092d715b7a48de</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The type of the public recursive DNS service.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The status of the public recursive DNS service.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the traffic analysis switch for the user in public recursive DNS service.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOSED</p>
         */
        @NameInMap("StatisticSwitchStatus")
        public String statisticSwitchStatus;

        /**
         * <p>The disabled public recursive DNS service.</p>
         */
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
