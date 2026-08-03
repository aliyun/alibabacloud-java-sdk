// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeResourceLifeCycleEventsResponseBody extends TeaModel {
    /**
     * <p>The lifecycle events.<br>This field is returned as a JSON-serialized string. The string contains the hierarchical data for lifecycle event categories. Use a standard JSON deserialization tool for your programming language to parse the string into an array of objects.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;children&quot;:[{&quot;children&quot;:[{&quot;label&quot;:&quot;Create Events&quot;,&quot;labelEn&quot;:&quot;Create Events&quot;,&quot;value&quot;:&quot;Create,CreateInstance,RunInstances&quot;},{&quot;label&quot;:&quot;Delete Events&quot;,&quot;labelEn&quot;:&quot;Delete Events&quot;,&quot;value&quot;:&quot;DeleteInstance,DeleteInstances,Release&quot;}],&quot;label&quot;:&quot;ECS Instance&quot;,&quot;labelEn&quot;:&quot;ECS Instance&quot;,&quot;value&quot;:&quot;ACS::ECS::Instance&quot;}],&quot;label&quot;:&quot;Elastic Compute Service&quot;,&quot;labelEn&quot;:&quot;Elastic Compute Service&quot;,&quot;value&quot;:&quot;Ecs&quot;}]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B10969CF-C743-55F8-9710-F0711504****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceLifeCycleEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLifeCycleEventsResponseBody self = new DescribeResourceLifeCycleEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLifeCycleEventsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeResourceLifeCycleEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
