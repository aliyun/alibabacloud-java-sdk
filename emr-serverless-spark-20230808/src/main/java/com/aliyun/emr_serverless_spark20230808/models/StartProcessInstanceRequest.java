// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartProcessInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to run the workflow in the production environment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isProd")
    public Boolean isProd;

    /**
     * <p>The workflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12***********</p>
     */
    @NameInMap("processDefinitionCode")
    public Long processDefinitionCode;

    /**
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SS</p>
     */
    @NameInMap("productNamespace")
    public String productNamespace;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The queue on which the workflow runs.</p>
     * 
     * <strong>example:</strong>
     * <p>root_queue</p>
     */
    @NameInMap("runtimeQueue")
    public String runtimeQueue;

    /**
     * <p>The hash code of the version.</p>
     * 
     * <strong>example:</strong>
     * <p>dh*********</p>
     */
    @NameInMap("versionHashCode")
    public String versionHashCode;

    /**
     * <p>The version number of the workflow.</p>
     * 
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
