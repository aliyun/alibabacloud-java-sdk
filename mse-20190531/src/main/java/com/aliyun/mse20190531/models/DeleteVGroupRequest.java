// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteVGroupRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 集群名称
    @NameInMap("Name")
    public String name;

    public static DeleteVGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVGroupRequest self = new DeleteVGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVGroupRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteVGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
