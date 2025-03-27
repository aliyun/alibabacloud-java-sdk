// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginPoolRequest extends TeaModel {
    /**
     * <p>Whether the origin address pool is enabled:</p>
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
     * <p>The name of the origin address pool, which must be unique within a site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pool1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Information about the origins added to the origin address pool, with multiple origins passed as an array.</p>
     */
    @NameInMap("Origins")
    public java.util.List<CreateOriginPoolRequestOrigins> origins;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21655860979****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static CreateOriginPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOriginPoolRequest self = new CreateOriginPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateOriginPoolRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateOriginPoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOriginPoolRequest setOrigins(java.util.List<CreateOriginPoolRequestOrigins> origins) {
        this.origins = origins;
        return this;
    }
    public java.util.List<CreateOriginPoolRequestOrigins> getOrigins() {
        return this.origins;
    }

    public CreateOriginPoolRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class CreateOriginPoolRequestOriginsAuthConf extends TeaModel {
        /**
         * <p>The access key required for private authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
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
         * <p>The secret key required for private authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeySecret</p>
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

        public static CreateOriginPoolRequestOriginsAuthConf build(java.util.Map<String, ?> map) throws Exception {
            CreateOriginPoolRequestOriginsAuthConf self = new CreateOriginPoolRequestOriginsAuthConf();
            return TeaModel.build(map, self);
        }

        public CreateOriginPoolRequestOriginsAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateOriginPoolRequestOriginsAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CreateOriginPoolRequestOriginsAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateOriginPoolRequestOriginsAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public CreateOriginPoolRequestOriginsAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateOriginPoolRequestOrigins extends TeaModel {
        /**
         * <p>The address of the origin, e.g., <a href="http://www.example.com">www.example.com</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>Authentication information, required when the origin is OSS or S3 and needs authentication, including related configuration details.</p>
         */
        @NameInMap("AuthConf")
        public CreateOriginPoolRequestOriginsAuthConf authConf;

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
         * <p>The request header to be included when fetching from the origin, only Host is supported.</p>
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
         * <p>The name of the origin, which must be unique within an origin address.</p>
         * 
         * <strong>example:</strong>
         * <p>origin1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the origin:</p>
         * <ul>
         * <li>ip_domain: IP or domain name type origin;</li>
         * <li>OSS: OSS address origin;</li>
         * <li>S3: AWS S3 origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip_domain</p>
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

        public static CreateOriginPoolRequestOrigins build(java.util.Map<String, ?> map) throws Exception {
            CreateOriginPoolRequestOrigins self = new CreateOriginPoolRequestOrigins();
            return TeaModel.build(map, self);
        }

        public CreateOriginPoolRequestOrigins setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateOriginPoolRequestOrigins setAuthConf(CreateOriginPoolRequestOriginsAuthConf authConf) {
            this.authConf = authConf;
            return this;
        }
        public CreateOriginPoolRequestOriginsAuthConf getAuthConf() {
            return this.authConf;
        }

        public CreateOriginPoolRequestOrigins setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateOriginPoolRequestOrigins setHeader(Object header) {
            this.header = header;
            return this;
        }
        public Object getHeader() {
            return this.header;
        }

        public CreateOriginPoolRequestOrigins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOriginPoolRequestOrigins setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateOriginPoolRequestOrigins setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
