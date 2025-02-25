// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginPoolRequest extends TeaModel {
    /**
     * <p>Whether the origin pool is enabled:</p>
     * <ul>
     * <li>true: Enabled;</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the origin pool, which can be obtained by calling the <a href="~~ListOriginPools~~">ListOriginPools</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1038520525196928</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Information about the origins added to the origin pool. Multiple origins are passed as an array.</p>
     */
    @NameInMap("Origins")
    public java.util.List<UpdateOriginPoolRequestOrigins> origins;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>216558609793952</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateOriginPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginPoolRequest self = new UpdateOriginPoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOriginPoolRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateOriginPoolRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateOriginPoolRequest setOrigins(java.util.List<UpdateOriginPoolRequestOrigins> origins) {
        this.origins = origins;
        return this;
    }
    public java.util.List<UpdateOriginPoolRequestOrigins> getOrigins() {
        return this.origins;
    }

    public UpdateOriginPoolRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class UpdateOriginPoolRequestOriginsAuthConf extends TeaModel {
        /**
         * <p>The AccessKey required for private authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI5t7fKVT****atQpfNes</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The type of authentication.</p>
         * <ul>
         * <li>public: Public read/write, used when the origin is OSS or S3 and is set to public read/write;</li>
         * <li>private_same_account: Private same account, used when the origin is OSS and the authentication type is private within the same account;</li>
         * <li>private_cross_account: Private cross-account, used when the origin is OSS and the authentication type is private across accounts;</li>
         * <li>private: Used when the origin is S3 and the authentication type is private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region of the origin required when the origin is AWS S3.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The SecretKey required for private authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S0****YoZ3nkp208dy5w7</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature version required when the origin is AWS S3.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("Version")
        public String version;

        public static UpdateOriginPoolRequestOriginsAuthConf build(java.util.Map<String, ?> map) throws Exception {
            UpdateOriginPoolRequestOriginsAuthConf self = new UpdateOriginPoolRequestOriginsAuthConf();
            return TeaModel.build(map, self);
        }

        public UpdateOriginPoolRequestOriginsAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public UpdateOriginPoolRequestOriginsAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateOriginPoolRequestOriginsAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateOriginPoolRequestOriginsAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public UpdateOriginPoolRequestOriginsAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateOriginPoolRequestOrigins extends TeaModel {
        /**
         * <p>The address of the origin, e.g., <a href="http://www.example.com">www.example.com</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>Authentication information. When the origin is OSS or S3 and requires authentication, you need to pass the related configuration information for authentication.</p>
         */
        @NameInMap("AuthConf")
        public UpdateOriginPoolRequestOriginsAuthConf authConf;

        /**
         * <p>Whether the origin is enabled:</p>
         * <ul>
         * <li>true: Enabled;</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The request header to be included when fetching from the origin, supporting only Host.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;Host&quot;: [
         *           &quot;example.com&quot;
         *         ]
         *       }</p>
         */
        @NameInMap("Header")
        public Object header;

        /**
         * <p>The name of the origin, which must be unique under one origin pool.</p>
         * 
         * <strong>example:</strong>
         * <p>origin1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the origin:</p>
         * <ul>
         * <li>ip_domain: IP or domain type origin;</li>
         * <li>OSS: OSS address origin;</li>
         * <li>S3: AWS S3 origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight, an integer between 0 and 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateOriginPoolRequestOrigins build(java.util.Map<String, ?> map) throws Exception {
            UpdateOriginPoolRequestOrigins self = new UpdateOriginPoolRequestOrigins();
            return TeaModel.build(map, self);
        }

        public UpdateOriginPoolRequestOrigins setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public UpdateOriginPoolRequestOrigins setAuthConf(UpdateOriginPoolRequestOriginsAuthConf authConf) {
            this.authConf = authConf;
            return this;
        }
        public UpdateOriginPoolRequestOriginsAuthConf getAuthConf() {
            return this.authConf;
        }

        public UpdateOriginPoolRequestOrigins setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateOriginPoolRequestOrigins setHeader(Object header) {
            this.header = header;
            return this;
        }
        public Object getHeader() {
            return this.header;
        }

        public UpdateOriginPoolRequestOrigins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateOriginPoolRequestOrigins setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateOriginPoolRequestOrigins setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
