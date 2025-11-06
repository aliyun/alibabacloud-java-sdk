// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateFaultInjectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;FaultType&quot;: &quot;DiskFillTask&quot;,
     *   &quot;FaultArgs&quot;: {
     *     &quot;FaultAction&quot;: &quot;fill&quot;,
     *     &quot;Percent&quot;: 80
     *   }
     * }</p>
     */
    @NameInMap("FaultArgs")
    public Object faultArgs;

    /**
     * <strong>example:</strong>
     * <p>CpuFullloadTask</p>
     */
    @NameInMap("FaultType")
    public String faultType;

    public static CreateFaultInjectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFaultInjectionRequest self = new CreateFaultInjectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateFaultInjectionRequest setFaultArgs(Object faultArgs) {
        this.faultArgs = faultArgs;
        return this;
    }
    public Object getFaultArgs() {
        return this.faultArgs;
    }

    public CreateFaultInjectionRequest setFaultType(String faultType) {
        this.faultType = faultType;
        return this;
    }
    public String getFaultType() {
        return this.faultType;
    }

}
