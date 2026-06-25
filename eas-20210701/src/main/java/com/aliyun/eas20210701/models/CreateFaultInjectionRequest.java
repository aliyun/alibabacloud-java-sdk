// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateFaultInjectionRequest extends TeaModel {
    /**
     * <p>The parameters for each fault type are described as follows:</p>
     * <ol>
     * <li><p>CpuFullloadTask (CPU full load fault)
     * <code>{ &quot;FaultType&quot;: &quot;CpuFullloadTask&quot;, &quot;FaultArgs&quot;: { &quot;FaultAction&quot;: &quot;fullload&quot;, &quot;CpuPercent&quot;: 50 } }</code></p>
     * </li>
     * <li><p>MemLoadTask (Memory load fault)
     * <code>{ &quot;FaultType&quot;: &quot;MemLoadTask&quot;, &quot;FaultArgs&quot;: { &quot;FaultAction&quot;: &quot;load&quot;, &quot;MemPercent&quot;: 80 } }</code></p>
     * </li>
     * <li><p>NetworkTask (Network fault)
     * 3.a. NetworkDelayAction (Network delay)
     * <code>{ &quot;FaultType&quot;: &quot;NetworkTask&quot;, &quot;FaultArgs&quot;: { &quot;FaultAction&quot;: &quot;delay&quot;, &quot;Time&quot;: 3000, &quot;Offset&quot;: 100 } }</code>
     * 3.b. NetworkCorruptAction (Network packet corruption)
     * <code>{ &quot;FaultType&quot;: &quot;NetworkTask&quot;, &quot;FaultArgs&quot;: { &quot;FaultAction&quot;: &quot;corrupt&quot;, &quot;Percent&quot;: 50 } }</code>
     * 3.c. NetworkLossAction (Network packet loss)
     * <code>{ &quot;FaultType&quot;: &quot;NetworkTask&quot;, &quot;FaultArgs&quot;: { &quot;FaultAction&quot;: &quot;loss&quot;, &quot;Percent&quot;: 30 } }</code></p>
     * </li>
     * <li><p>DiskBurnTask (Disk read/write fault)
     * <code>{ &quot;FaultType&quot;: &quot;DiskBurnTask&quot;, &quot;FaultArgs&quot;: { &quot;FaultAction&quot;: &quot;burn&quot;, &quot;Read&quot;: true, &quot;Write&quot;: true, &quot;Size&quot;: 100 } }</code></p>
     * </li>
     * <li><p>DiskFillTask (Disk fill fault)
     * <code>{ &quot;FaultType&quot;: &quot;DiskFillTask&quot;, &quot;FaultArgs&quot;: { &quot;FaultAction&quot;: &quot;fill&quot;, &quot;Percent&quot;: 80 } }</code></p>
     * </li>
     * </ol>
     * 
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
     * <p>The fault type.
     * Device faults: 1. CPU full load fault. 2. Memory load fault. 3. Network fault. 4. Disk read/write fault. 5. Disk fill fault.</p>
     * 
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
