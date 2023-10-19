// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("Beta")
    public Boolean beta;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DeleteNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosConfigRequest self = new DeleteNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNacosConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteNacosConfigRequest setBeta(Boolean beta) {
        this.beta = beta;
        return this;
    }
    public Boolean getBeta() {
        return this.beta;
    }

    public DeleteNacosConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DeleteNacosConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DeleteNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
