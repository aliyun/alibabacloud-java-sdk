// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginPoolRequest extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateOriginPool</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Origins")
    public java.util.List<UpdateOriginPoolRequestOrigins> origins;

    /**
     * <p>This parameter is required.</p>
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
        @NameInMap("Address")
        public String address;

        @NameInMap("AuthConf")
        public UpdateOriginPoolRequestOriginsAuthConf authConf;

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
