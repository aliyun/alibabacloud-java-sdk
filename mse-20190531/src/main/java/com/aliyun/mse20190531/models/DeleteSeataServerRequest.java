// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteSeataServerRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 集群名称
    @NameInMap("SeataServerUniqueId")
    public String seataServerUniqueId;

    public static DeleteSeataServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSeataServerRequest self = new DeleteSeataServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSeataServerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteSeataServerRequest setSeataServerUniqueId(String seataServerUniqueId) {
        this.seataServerUniqueId = seataServerUniqueId;
        return this;
    }
    public String getSeataServerUniqueId() {
        return this.seataServerUniqueId;
    }

}
