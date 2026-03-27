// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusManagedInstance extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>rum-xxx</p>
     */
    @NameInMap("prometheusInstanceId")
    public String prometheusInstanceId;

    /**
     * <strong>example:</strong>
     * <p>rum-xxx</p>
     */
    @NameInMap("prometheusInstanceName")
    public String prometheusInstanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static PrometheusManagedInstance build(java.util.Map<String, ?> map) throws Exception {
        PrometheusManagedInstance self = new PrometheusManagedInstance();
        return TeaModel.build(map, self);
    }

    public PrometheusManagedInstance setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public PrometheusManagedInstance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public PrometheusManagedInstance setPrometheusInstanceId(String prometheusInstanceId) {
        this.prometheusInstanceId = prometheusInstanceId;
        return this;
    }
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
    }

    public PrometheusManagedInstance setPrometheusInstanceName(String prometheusInstanceName) {
        this.prometheusInstanceName = prometheusInstanceName;
        return this;
    }
    public String getPrometheusInstanceName() {
        return this.prometheusInstanceName;
    }

    public PrometheusManagedInstance setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PrometheusManagedInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PrometheusManagedInstance setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
