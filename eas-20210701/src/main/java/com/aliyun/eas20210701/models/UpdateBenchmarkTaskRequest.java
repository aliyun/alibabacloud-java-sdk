// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateBenchmarkTaskRequest extends TeaModel {
    /**
     * <p>The configuration parameters of the stress testing task. For more information, see <strong>Table 1. base description table</strong>. The target stress testing task must be in the Running state. You can call the DescribeBenchmarkTask operation to query the task status. If the task is in the Stopped state, you must first call the StartBenchmarkTask operation and wait until the task enters the Running state.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;base&quot;:  {
     *          &quot;qps&quot;: 200
     *     }
     * }</p>
     */
    @NameInMap("body")
    public String body;

    public static UpdateBenchmarkTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBenchmarkTaskRequest self = new UpdateBenchmarkTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBenchmarkTaskRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
