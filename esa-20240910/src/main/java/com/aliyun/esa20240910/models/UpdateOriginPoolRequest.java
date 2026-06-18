// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginPoolRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the origin pool:</p>
     * <ul>
     * <li><p>true: Enables the origin pool.</p>
     * </li>
     * <li><p>false: Disables the origin pool.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The origin pool ID. Get this ID by calling the <a href="~~ListOriginPools~~">ListOriginPools</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1038520525196928</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>An array of origin configurations.</p>
     */
    @NameInMap("Origins")
    public java.util.List<UpdateOriginPoolRequestOrigins> origins;

    /**
     * <p>The site ID. Get this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
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
         * <p>The access key for private authentication. Required for private origins.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li><p>public: For public OSS or S3 origins.</p>
         * </li>
         * <li><p>private_same_account: For private OSS origins in the same account.</p>
         * </li>
         * <li><p>private_cross_account: For private OSS origins that use cross-account authentication.</p>
         * </li>
         * <li><p>private: For private S3 origins.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region of the origin. This parameter is required if the origin type is S3.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The secret key for private authentication. Required for private origins.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeySecret</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature version. This parameter is required if the origin type is S3.</p>
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
         * <p>The origin\&quot;s domain name or IP address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The authentication configuration. Required for private OSS or S3 origins.</p>
         */
        @NameInMap("AuthConf")
        public UpdateOriginPoolRequestOriginsAuthConf authConf;

        /**
         * <p>Specifies whether to enable the origin:</p>
         * <ul>
         * <li><p>true: Enables the origin.</p>
         * </li>
         * <li><p>false: Disables the origin.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The request header to add to back-to-origin requests. Only the Host header is supported.</p>
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
         * <p>The IP version policy for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li><p>round_robin: (Default) Randomly selects an IPv4 or IPv6 origin.</p>
         * </li>
         * <li><p>ipv4_first: Prioritizes IPv4 origins.</p>
         * </li>
         * <li><p>ipv6_first: Prioritizes IPv6 origins.</p>
         * </li>
         * <li><p>follow: Uses the same IP version as the client request.</p>
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
         * <p>The origin type. Valid values:</p>
         * <ul>
         * <li><p>ip_domain: An IP address or a domain name.</p>
         * </li>
         * <li><p>OSS: An OSS origin.</p>
         * </li>
         * <li><p>S3: An AWS S3 origin.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
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
