// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSecureTokenResponseBody extends TeaModel {
    @NameInMap("SecureToken")
    public GetSecureTokenResponseBodySecureToken secureToken;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static GetSecureTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecureTokenResponseBody self = new GetSecureTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecureTokenResponseBody setSecureToken(GetSecureTokenResponseBodySecureToken secureToken) {
        this.secureToken = secureToken;
        return this;
    }
    public GetSecureTokenResponseBodySecureToken getSecureToken() {
        return this.secureToken;
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

    public GetSecureTokenResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetSecureTokenResponseBodySecureToken extends TeaModel {
        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("BelongRegion")
        public String belongRegion;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("EdasId")
        public String edasId;

        @NameInMap("AddressServerHost")
        public String addressServerHost;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("RegionId")
        public String regionId;

        public static GetSecureTokenResponseBodySecureToken build(java.util.Map<String, ?> map) throws Exception {
            GetSecureTokenResponseBodySecureToken self = new GetSecureTokenResponseBodySecureToken();
            return TeaModel.build(map, self);
        }

        public GetSecureTokenResponseBodySecureToken setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public GetSecureTokenResponseBodySecureToken setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
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

        public GetSecureTokenResponseBodySecureToken setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public GetSecureTokenResponseBodySecureToken setEdasId(String edasId) {
            this.edasId = edasId;
            return this;
        }
        public String getEdasId() {
            return this.edasId;
        }

        public GetSecureTokenResponseBodySecureToken setAddressServerHost(String addressServerHost) {
            this.addressServerHost = addressServerHost;
            return this;
        }
        public String getAddressServerHost() {
            return this.addressServerHost;
        }

        public GetSecureTokenResponseBodySecureToken setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetSecureTokenResponseBodySecureToken setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSecureTokenResponseBodySecureToken setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetSecureTokenResponseBodySecureToken setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
