// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiInfoByName extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gw-xx</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The API name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-api</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The API type.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Specifies whether to enable versioning.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("versionEnabled")
    public Boolean versionEnabled;

    /**
     * <p>The information about the versioned API.</p>
     */
    @NameInMap("versionedHttpApis")
    public java.util.List<HttpApiApiInfo> versionedHttpApis;

    public static HttpApiInfoByName build(java.util.Map<String, ?> map) throws Exception {
        HttpApiInfoByName self = new HttpApiInfoByName();
        return TeaModel.build(map, self);
    }

    public HttpApiInfoByName setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public HttpApiInfoByName setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpApiInfoByName setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public HttpApiInfoByName setVersionEnabled(Boolean versionEnabled) {
        this.versionEnabled = versionEnabled;
        return this;
    }
    public Boolean getVersionEnabled() {
        return this.versionEnabled;
    }

    public HttpApiInfoByName setVersionedHttpApis(java.util.List<HttpApiApiInfo> versionedHttpApis) {
        this.versionedHttpApis = versionedHttpApis;
        return this;
    }
    public java.util.List<HttpApiApiInfo> getVersionedHttpApis() {
        return this.versionedHttpApis;
    }

}
