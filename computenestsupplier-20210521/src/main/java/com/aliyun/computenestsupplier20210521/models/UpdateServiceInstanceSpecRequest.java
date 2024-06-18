// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceSpecRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    @NameInMap("OperationName")
    public String operationName;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;EcsInstanceParameter\&quot;:\&quot;4vCPU 8GiB\&quot;,\&quot;ZoneId\&quot;:\&quot;cn-heyuan-a\&quot;,\&quot;SystemDiskSize\&quot;:50,\&quot;DataDiskSize\&quot;:150,\&quot;InternetMaxBandwidthOut\&quot;:2,\&quot;RegionId\&quot;:\&quot;cn-heyuan\&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("PredefinedParametersName")
    public String predefinedParametersName;

    /**
     * <strong>example:</strong>
     * <p>si-0e6fca6a51a54420****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static UpdateServiceInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceSpecRequest self = new UpdateServiceInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceInstanceSpecRequest setEnableUserPrometheus(Boolean enableUserPrometheus) {
        this.enableUserPrometheus = enableUserPrometheus;
        return this;
    }
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    public UpdateServiceInstanceSpecRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public UpdateServiceInstanceSpecRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public UpdateServiceInstanceSpecRequest setPredefinedParametersName(String predefinedParametersName) {
        this.predefinedParametersName = predefinedParametersName;
        return this;
    }
    public String getPredefinedParametersName() {
        return this.predefinedParametersName;
    }

    public UpdateServiceInstanceSpecRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
