// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginPoolRequest extends TeaModel {
    /**
     * <p>Specifies whether the origin address pool is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The origin address pool ID. You can call the <a href="~~ListOriginPools~~">ListOriginPools</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1038520525196928</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The origin server information added to the origin address pool. Use an array to pass multiple origin servers.</p>
     */
    @NameInMap("Origins")
    public java.util.List<UpdateOriginPoolRequestOrigins> origins;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the ID.</p>
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
         * <p>yourAccessKeyID</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li>public: public read/write. Use this value when the origin server is OSS or S3 with public read/write access.</li>
         * <li>private_same_account: private same-account. Use this value when the origin server is OSS with same-account private authentication.</li>
         * <li>private_cross_account: private cross-account. Use this value when the origin server is OSS with cross-account private authentication.</li>
         * <li>private: Use this value when the origin server is S3 with private authentication.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region of the origin server required when the origin server is AWS S3.</p>
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
         * <p>yourAccessKeySecret</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature version required when the origin server is AWS S3.</p>
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
         * <p>The addresses of the origin server, such as <a href="http://www.example.com">www.example.com</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The authentication information. This parameter is required when the origin server is OSS, S3, or another origin server that requires authentication.</p>
         */
        @NameInMap("AuthConf")
        public UpdateOriginPoolRequestOriginsAuthConf authConf;

        /**
         * <p>Specifies whether the origin server is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The request header included in back-to-origin requests. Only Host is supported.</p>
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
         * <p>The IP protocol version used for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li>round_robin: default policy. Randomly polls IPv4 or IPv6 origin servers.</li>
         * <li>ipv4_first: preferentially uses IPv4 origin servers.</li>
         * <li>ipv6_first: preferentially uses IPv6 origin servers.</li>
         * <li>follow: preferentially follows the IP version used by the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        @NameInMap("IpVersionPolicy")
        public String ipVersionPolicy;

        /**
         * <p>The origin server name. The name must be unique within an origin address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>origin1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The origin server type. Valid values:</p>
         * <ul>
         * <li>ip_domain: an IP address or domain name-based origin server.</li>
         * <li>OSS: an OSS address-based origin server.</li>
         * <li>S3: an AWS S3 origin server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight. The value is an integer from 0 to 100.</p>
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

        public UpdateOriginPoolRequestOrigins setIpVersionPolicy(String ipVersionPolicy) {
            this.ipVersionPolicy = ipVersionPolicy;
            return this;
        }
        public String getIpVersionPolicy() {
            return this.ipVersionPolicy;
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
