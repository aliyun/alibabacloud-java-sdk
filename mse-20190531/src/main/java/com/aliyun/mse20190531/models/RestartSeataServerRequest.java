// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RestartSeataServerRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 集群名称
    @NameInMap("SeataServerUniqueId")
    public String seataServerUniqueId;

    public static RestartSeataServerRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartSeataServerRequest self = new RestartSeataServerRequest();
        return TeaModel.build(map, self);
    }

    public RestartSeataServerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public RestartSeataServerRequest setSeataServerUniqueId(String seataServerUniqueId) {
        this.seataServerUniqueId = seataServerUniqueId;
        return this;
    }
    public String getSeataServerUniqueId() {
        return this.seataServerUniqueId;
    }

}
