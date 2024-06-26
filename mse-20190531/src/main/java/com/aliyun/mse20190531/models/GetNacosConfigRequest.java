// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to perform a beta release. Valid values:</p>
     * <ul>
     * <li><code>true</code>: yes</li>
     * <li><code>false</code>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Beta")
    public Boolean beta;

    /**
     * <p>The ID of the data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>halvie-mp-item****</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The name of the configuration group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-i7m2h0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>ddaf8f12-****-b1c1-86e7c72e266b</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static GetNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNacosConfigRequest self = new GetNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetNacosConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetNacosConfigRequest setBeta(Boolean beta) {
        this.beta = beta;
        return this;
    }
    public Boolean getBeta() {
        return this.beta;
    }

    public GetNacosConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetNacosConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
