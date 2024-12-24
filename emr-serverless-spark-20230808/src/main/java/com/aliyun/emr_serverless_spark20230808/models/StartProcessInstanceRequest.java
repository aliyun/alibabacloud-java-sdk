// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartProcessInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isProd")
    public Boolean isProd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12***********</p>
     */
    @NameInMap("processDefinitionCode")
    public Long processDefinitionCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SS</p>
     */
    @NameInMap("productNamespace")
    public String productNamespace;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>root_queue</p>
     */
    @NameInMap("runtimeQueue")
    public String runtimeQueue;

    /**
     * <strong>example:</strong>
     * <p>dh*********</p>
     */
    @NameInMap("versionHashCode")
    public String versionHashCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("versionNumber")
    public Integer versionNumber;

    public static StartProcessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartProcessInstanceRequest self = new StartProcessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartProcessInstanceRequest setIsProd(Boolean isProd) {
        this.isProd = isProd;
        return this;
    }
    public Boolean getIsProd() {
        return this.isProd;
    }

    public StartProcessInstanceRequest setProcessDefinitionCode(Long processDefinitionCode) {
        this.processDefinitionCode = processDefinitionCode;
        return this;
    }
    public Long getProcessDefinitionCode() {
        return this.processDefinitionCode;
    }

    public StartProcessInstanceRequest setProductNamespace(String productNamespace) {
        this.productNamespace = productNamespace;
        return this;
    }
    public String getProductNamespace() {
        return this.productNamespace;
    }

    public StartProcessInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartProcessInstanceRequest setRuntimeQueue(String runtimeQueue) {
        this.runtimeQueue = runtimeQueue;
        return this;
    }
    public String getRuntimeQueue() {
        return this.runtimeQueue;
    }

    public StartProcessInstanceRequest setVersionHashCode(String versionHashCode) {
        this.versionHashCode = versionHashCode;
        return this;
    }
    public String getVersionHashCode() {
        return this.versionHashCode;
    }

    public StartProcessInstanceRequest setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }
    public Integer getVersionNumber() {
        return this.versionNumber;
    }

}
