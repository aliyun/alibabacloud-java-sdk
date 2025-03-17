// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosConfigRequest extends TeaModel {
    /**
     * <p>Language type of the returned information:</p>
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
     * <p>Whether it is a Beta release. Default is false.</p>
     * <ul>
     * <li><code>true</code>: Yes</li>
     * <li><code>false</code>: No</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Beta")
    public Boolean beta;

    /**
     * <p>Configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user-ds.yml</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>Group type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HALVIE_MICRO_GROUP</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-tl32epfyu18</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Namespace ID. Default is public.</p>
     * 
     * <strong>example:</strong>
     * <p>0e9d849b-****-8435da6c21ad</p>
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
