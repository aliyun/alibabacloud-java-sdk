// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSecureTokenResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message returned for the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned security token.</p>
     */
    @NameInMap("SecureToken")
    public GetSecureTokenResponseBodySecureToken secureToken;

    public static GetSecureTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecureTokenResponseBody self = new GetSecureTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecureTokenResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSecureTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecureTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecureTokenResponseBody setSecureToken(GetSecureTokenResponseBodySecureToken secureToken) {
        this.secureToken = secureToken;
        return this;
    }
    public GetSecureTokenResponseBodySecureToken getSecureToken() {
        return this.secureToken;
    }

    public static class GetSecureTokenResponseBodySecureToken extends TeaModel {
        /**
         * <p>The AccessKey ID used in the namespace.</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The address of Address Server associated with the namespace.</p>
         */
        @NameInMap("AddressServerHost")
        public String addressServerHost;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("BelongRegion")
        public String belongRegion;

        /**
         * <p>The description of the namespace.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the Alibaba Cloud account that activated Enterprise Distributed Application Service (EDAS).</p>
         */
        @NameInMap("EdasId")
        public String edasId;

        /**
         * <p>The ID of the security token.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the MSE instance.</p>
         */
        @NameInMap("MseInstanceId")
        public String mseInstanceId;

        /**
         * <p>The public endpoint of the MSE registry.</p>
         */
        @NameInMap("MseInternetAddress")
        public String mseInternetAddress;

        /**
         * <p>The private endpoint of the MSE registry.</p>
         */
        @NameInMap("MseIntranetAddress")
        public String mseIntranetAddress;

        /**
         * <p>The type of the Microservices Engine (MSE) registry.</p>
         * <br>
         * <p>*   default: the shared registry of EDAS</p>
         * <p>*   exclusive_mse: MSE Nacos registry</p>
         */
        @NameInMap("MseRegistryType")
        public String mseRegistryType;

        /**
         * <p>The ID of the region where the namespace resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region where the namespace resides.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The AccessKey secret used in the namespace.</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The tenant ID of the namespace.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetSecureTokenResponseBodySecureToken build(java.util.Map<String, ?> map) throws Exception {
            GetSecureTokenResponseBodySecureToken self = new GetSecureTokenResponseBodySecureToken();
            return TeaModel.build(map, self);
        }

        public GetSecureTokenResponseBodySecureToken setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetSecureTokenResponseBodySecureToken setAddressServerHost(String addressServerHost) {
            this.addressServerHost = addressServerHost;
            return this;
        }
        public String getAddressServerHost() {
            return this.addressServerHost;
        }

        public GetSecureTokenResponseBodySecureToken setBelongRegion(String belongRegion) {
            this.belongRegion = belongRegion;
            return this;
        }
        public String getBelongRegion() {
            return this.belongRegion;
        }

        public GetSecureTokenResponseBodySecureToken setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSecureTokenResponseBodySecureToken setEdasId(String edasId) {
            this.edasId = edasId;
            return this;
        }
        public String getEdasId() {
            return this.edasId;
        }

        public GetSecureTokenResponseBodySecureToken setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSecureTokenResponseBodySecureToken setMseInstanceId(String mseInstanceId) {
            this.mseInstanceId = mseInstanceId;
            return this;
        }
        public String getMseInstanceId() {
            return this.mseInstanceId;
        }

        public GetSecureTokenResponseBodySecureToken setMseInternetAddress(String mseInternetAddress) {
            this.mseInternetAddress = mseInternetAddress;
            return this;
        }
        public String getMseInternetAddress() {
            return this.mseInternetAddress;
        }

        public GetSecureTokenResponseBodySecureToken setMseIntranetAddress(String mseIntranetAddress) {
            this.mseIntranetAddress = mseIntranetAddress;
            return this;
        }
        public String getMseIntranetAddress() {
            return this.mseIntranetAddress;
        }

        public GetSecureTokenResponseBodySecureToken setMseRegistryType(String mseRegistryType) {
            this.mseRegistryType = mseRegistryType;
            return this;
        }
        public String getMseRegistryType() {
            return this.mseRegistryType;
        }

        public GetSecureTokenResponseBodySecureToken setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetSecureTokenResponseBodySecureToken setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public GetSecureTokenResponseBodySecureToken setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public GetSecureTokenResponseBodySecureToken setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetSecureTokenResponseBodySecureToken setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
