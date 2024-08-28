// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateBenchmarkTaskRequest extends TeaModel {
    /**
     * <p>The request body. The body includes the parameters that are set to create a stress testing task. For more information, see <strong>Table 1. Fields in the base parameter</strong>.</p>
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
