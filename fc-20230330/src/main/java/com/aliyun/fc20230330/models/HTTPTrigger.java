// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class HTTPTrigger extends TeaModel {
    /**
     * <p>The public domain address. You can access HTTP triggers over the Internet by using HTTP or HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://svc-func-xxxxxxxx.cn-hangzhou.fcapp.run">https://svc-func-xxxxxxxx.cn-hangzhou.fcapp.run</a></p>
     */
    @NameInMap("urlInternet")
    public String urlInternet;

    /**
     * <p>The private endpoint. In a VPC, you can access HTTP triggers by using HTTP or HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://svc-func-xxxxxxxx.cn-hangzhou-vpc.fcapp.run">https://svc-func-xxxxxxxx.cn-hangzhou-vpc.fcapp.run</a></p>
     */
    @NameInMap("urlIntranet")
    public String urlIntranet;

    public static HTTPTrigger build(java.util.Map<String, ?> map) throws Exception {
        HTTPTrigger self = new HTTPTrigger();
        return TeaModel.build(map, self);
    }

    public HTTPTrigger setUrlInternet(String urlInternet) {
        this.urlInternet = urlInternet;
        return this;
    }
    public String getUrlInternet() {
        return this.urlInternet;
    }

    public HTTPTrigger setUrlIntranet(String urlIntranet) {
        this.urlIntranet = urlIntranet;
        return this;
    }
    public String getUrlIntranet() {
        return this.urlIntranet;
    }

}
