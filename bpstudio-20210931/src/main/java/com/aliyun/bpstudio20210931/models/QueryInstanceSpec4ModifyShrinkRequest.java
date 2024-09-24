// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class QueryInstanceSpec4ModifyShrinkRequest extends TeaModel {
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
    public String parametersShrink;

    public static QueryInstanceSpec4ModifyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceSpec4ModifyShrinkRequest self = new QueryInstanceSpec4ModifyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceSpec4ModifyShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryInstanceSpec4ModifyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryInstanceSpec4ModifyShrinkRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public QueryInstanceSpec4ModifyShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

}
