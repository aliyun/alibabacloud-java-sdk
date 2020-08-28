// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch.models;

import com.aliyun.tea.*;

public class Config extends TeaModel {
    @NameInMap("accessKeyId")
    public String accessKeyId;

    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    @NameInMap("type")
    public String type;

    @NameInMap("securityToken")
    public String securityToken;

    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("regionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("userAgent")
    public String userAgent;

    @NameInMap("readTimeout")
    public Integer readTimeout;

    @NameInMap("connectTimeout")
    public Integer connectTimeout;

    @NameInMap("httpProxy")
    public String httpProxy;

    @NameInMap("httpsProxy")
    public String httpsProxy;

    @NameInMap("noProxy")
    public String noProxy;

    @NameInMap("socks5Proxy")
    public String socks5Proxy;

    @NameInMap("socks5NetWork")
    public String socks5NetWork;

    @NameInMap("maxIdleConns")
    public Integer maxIdleConns;

    @NameInMap("endpointType")
    public String endpointType;

    @NameInMap("openPlatformEndpoint")
    public String openPlatformEndpoint;

    public static Config build(java.util.Map<String, ?> map) throws Exception {
        Config self = new Config();
        return TeaModel.build(map, self);
    }

}
