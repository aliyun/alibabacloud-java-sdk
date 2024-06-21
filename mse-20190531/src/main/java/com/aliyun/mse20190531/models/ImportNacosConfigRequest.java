// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportNacosConfigRequest extends TeaModel {
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
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://mse-shared.oss-xxx.aliyuncs.com/cfg/import/xxxx/2021/01/11/xxxx.zip">http://mse-shared.oss-xxx.aliyuncs.com/cfg/import/xxxx/2021/01/11/xxxx.zip</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The ID of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The policy.</p>
     * 
     * <strong>example:</strong>
     * <p>f5cdc80a-****-8094-282f5650fc00</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>ABORT</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>OVERWRITE</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>SKIP</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>overwrite</p>
     */
    @NameInMap("Policy")
    public String policy;

    public static ImportNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportNacosConfigRequest self = new ImportNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public ImportNacosConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ImportNacosConfigRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ImportNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ImportNacosConfigRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

}
