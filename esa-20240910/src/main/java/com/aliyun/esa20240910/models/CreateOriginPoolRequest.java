// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginPoolRequest extends TeaModel {
    /**
     * <p>Specifies whether the origin pool is enabled.</p>
     * <ul>
     * <li><p><code>true</code>: enabled</p>
     * </li>
     * <li><p><code>false</code>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The name of the origin pool. The name must be unique within a site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pool1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of origins to add to the origin pool. Use an array to specify multiple origins.</p>
     */
    @NameInMap("Origins")
    public java.util.List<CreateOriginPoolRequestOrigins> origins;

    /**
     * <p>The site ID. To obtain this ID, call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li><p><code>public</code>: Public read/write. Use this for public OSS or AWS S3 buckets.</p>
         * </li>
         * <li><p><code>private_same_account</code>: Private authentication for an OSS bucket in the same Alibaba Cloud account.</p>
         * </li>
         * <li><p><code>private_cross_account</code>: Private authentication for an OSS bucket in a different Alibaba Cloud account.</p>
         * </li>
         * <li><p><code>private</code>: Private authentication for an AWS S3 bucket.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region of the origin. Required for AWS S3 origins.</p>
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
         * <p>The signature version. Required for AWS S3 origins.</p>
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
         * <p>The address of the origin. For example, www\.example.com.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The authentication configuration for the origin. Required if the origin is an OSS or AWS S3 bucket that requires authentication.</p>
         */
        @NameInMap("AuthConf")
        public CreateOriginPoolRequestOriginsAuthConf authConf;

        /**
         * <p>Specifies whether the origin is enabled.</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The request header to include in back-to-origin requests. Only the <code>Host</code> header is supported.</p>
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
         * <p>The IP protocol version for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li><p><code>round_robin</code>: Default. Randomly selects an IPv4 or IPv6 origin.</p>
         * </li>
         * <li><p><code>ipv4_first</code>: Prioritizes IPv4 origins.</p>
         * </li>
         * <li><p><code>ipv6_first</code>: Prioritizes IPv6 origins.</p>
         * </li>
         * <li><p><code>follow</code>: Uses the same IP protocol version as the client\&quot;s request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        @NameInMap("IpVersionPolicy")
        public String ipVersionPolicy;

        /**
         * <p>The name of the origin. The name must be unique within the origin pool.</p>
         * 
         * <strong>example:</strong>
         * <p>origin1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the origin. Valid values:</p>
         * <ul>
         * <li><p><code>ip_domain</code>: An IP address or a domain name.</p>
         * </li>
         * <li><p><code>OSS</code>: An Alibaba Cloud OSS bucket.</p>
         * </li>
         * <li><p><code>S3</code>: An AWS S3 bucket.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip_domain</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin. The value must be an integer from 0 to 100.</p>
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

        public CreateOriginPoolRequestOrigins setIpVersionPolicy(String ipVersionPolicy) {
            this.ipVersionPolicy = ipVersionPolicy;
            return this;
        }
        public String getIpVersionPolicy() {
            return this.ipVersionPolicy;
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
