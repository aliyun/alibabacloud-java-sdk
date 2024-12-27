// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginPoolRequest extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateOriginPool</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Origins")
    public java.util.List<CreateOriginPoolRequestOrigins> origins;

    /**
     * <p>This parameter is required.</p>
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
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AuthType")
        public String authType;

        @NameInMap("Region")
        public String region;

        @NameInMap("SecretKey")
        public String secretKey;

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
        @NameInMap("Address")
        public String address;

        @NameInMap("AuthConf")
        public CreateOriginPoolRequestOriginsAuthConf authConf;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Header")
        public Object header;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

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
