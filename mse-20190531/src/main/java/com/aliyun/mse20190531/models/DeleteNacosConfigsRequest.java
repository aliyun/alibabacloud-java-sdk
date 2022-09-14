// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosConfigsRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DeleteNacosConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosConfigsRequest self = new DeleteNacosConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNacosConfigsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteNacosConfigsRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteNacosConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNacosConfigsRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public DeleteNacosConfigsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
