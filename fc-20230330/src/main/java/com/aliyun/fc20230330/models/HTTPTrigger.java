// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class HTTPTrigger extends TeaModel {
    @NameInMap("urlInternet")
    public String urlInternet;

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
