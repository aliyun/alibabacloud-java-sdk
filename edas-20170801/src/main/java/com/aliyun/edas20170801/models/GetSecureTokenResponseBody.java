// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSecureTokenResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D16979DC-4D42-*************</p>
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
         * 
         * <strong>example:</strong>
         * <p>f676f1**************</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The address of Address Server associated with the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-<strong><strong>-</strong></strong>.edas.aliyun.com</p>
         */
        @NameInMap("AddressServerHost")
        public String addressServerHost;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("BelongRegion")
        public String belongRegion;

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>”“</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the Alibaba Cloud account that activated Enterprise Distributed Application Service (EDAS).</p>
         * 
         * <strong>example:</strong>
         * <p>11727458********</p>
         */
        @NameInMap("EdasId")
        public String edasId;

        /**
         * <p>The ID of the security token.</p>
         * 
         * <strong>example:</strong>
         * <p>7279</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the MSE instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-tl32p******</p>
         */
        @NameInMap("MseInstanceId")
        public String mseInstanceId;

        /**
         * <p>The public endpoint of the MSE registry.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-aa2******-p.nacos-ans.mse.aliyuncs.com</p>
         */
        @NameInMap("MseInternetAddress")
        public String mseInternetAddress;

        /**
         * <p>The private endpoint of the MSE registry.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-72******-nacos-ans.mse.aliyuncs.com</p>
         */
        @NameInMap("MseIntranetAddress")
        public String mseIntranetAddress;

        /**
         * <p>The type of the Microservices Engine (MSE) registry.</p>
         * <ul>
         * <li>default: the shared registry of EDAS</li>
         * <li>exclusive_mse: MSE Nacos registry</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exclusive_mse</p>
         */
        @NameInMap("MseRegistryType")
        public String mseRegistryType;

        /**
         * <p>The ID of the region where the namespace resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen:x*******</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region where the namespace resides.</p>
         * 
         * <strong>example:</strong>
         * <p>x******</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The AccessKey secret used in the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>gOSgbgR2R*************</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The tenant ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>401b7bc8-9441-4693-<strong><strong>-</strong></strong>********</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>edas_com***_****@<em><em><strong><strong>-</strong></strong></em>.</em>**</p>
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
