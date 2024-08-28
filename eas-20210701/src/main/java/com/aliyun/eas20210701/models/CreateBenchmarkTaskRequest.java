// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateBenchmarkTaskRequest extends TeaModel {
    /**
     * <p>The request body. The body includes the parameters that are set to create a stress testing task.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;base&quot;: {
     *         &quot;duration&quot;: 600
     *     },
     *     &quot;service&quot;: {
     *         &quot;serviceName&quot;: &quot;test_service&quot;,
     *         &quot;requestToken&quot;: &quot;test_token&quot;
     *     },
     *     &quot;data&quot;: {
     *         &quot;path&quot;: &quot;<a href="https://larec-benchmark-cd.oss-cn-chengdu.aliyuncs.com/youbei/sv_dbmtl/data/youbei.warmup.tf.bin">https://larec-benchmark-cd.oss-cn-chengdu.aliyuncs.com/youbei/sv_dbmtl/data/youbei.warmup.tf.bin</a>&quot;,
     *         &quot;dataType&quot;: &quot;binary&quot;
     *     },
     *     &quot;optional&quot;: {
     *        &quot;maxRt&quot;: 100
     *     }
     * }</p>
     */
    @NameInMap("body")
    public String body;

    public static CreateBenchmarkTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBenchmarkTaskRequest self = new CreateBenchmarkTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateBenchmarkTaskRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
