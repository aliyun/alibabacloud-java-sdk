// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiVersionConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable versioning.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The key in the specified header when the header versioning solution is used.</p>
     * 
     * <strong>example:</strong>
     * <p>my-version</p>
     */
    @NameInMap("headerName")
    public String headerName;

    /**
     * <p>The key in the specified query parameter when the query versioning solution is used.</p>
     * 
     * <strong>example:</strong>
     * <p>myVersion</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <p>The versioning solution.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Path</li>
     * <li>Query</li>
     * <li>Header</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Query</p>
     */
    @NameInMap("scheme")
    public String scheme;

    /**
     * <p>The version number.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("version")
    public String version;

    public static HttpApiVersionConfig build(java.util.Map<String, ?> map) throws Exception {
        HttpApiVersionConfig self = new HttpApiVersionConfig();
        return TeaModel.build(map, self);
    }

    public HttpApiVersionConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public HttpApiVersionConfig setHeaderName(String headerName) {
        this.headerName = headerName;
        return this;
    }
    public String getHeaderName() {
        return this.headerName;
    }

    public HttpApiVersionConfig setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public HttpApiVersionConfig setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public HttpApiVersionConfig setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
