// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class QueryInstanceSpec4ModifyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BE68D71ZY5YYIU9R</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf66k9143r2ch*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    public static QueryInstanceSpec4ModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceSpec4ModifyRequest self = new QueryInstanceSpec4ModifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceSpec4ModifyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryInstanceSpec4ModifyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryInstanceSpec4ModifyRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public QueryInstanceSpec4ModifyRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

}
