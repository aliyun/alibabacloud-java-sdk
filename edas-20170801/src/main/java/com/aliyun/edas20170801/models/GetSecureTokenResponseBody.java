// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSecureTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AddressServerHost")
        public String addressServerHost;

        @NameInMap("BelongRegion")
        public String belongRegion;

        @NameInMap("Description")
        public String description;

        @NameInMap("EdasId")
        public String edasId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("TenantId")
        public String tenantId;

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
