// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonMonitorDataRequest extends TeaModel {
    /**
     * <p>The Grafana metric monitoring query conditions, including the query start time, metric expression, and metric query list.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;start&quot;:1522127381471,&quot;queries&quot;:[{&quot;metric&quot;:&quot;elasticbuild.elasticsearch.source.total_doc_count&quot;,&quot;aggregator&quot;:&quot;sum&quot;,&quot;downsample&quot;:&quot;avg&quot;,&quot;tags&quot;:{&quot;taskName&quot;:&quot;et-testtsk&quot;,&quot;userId&quot;:&quot;123456&quot;},&quot;granularity&quot;:&quot;1m&quot;}],&quot;limit&quot;:&quot;&quot;,&quot;end&quot;:1522129151000}</p>
     */
    @NameInMap("body")
    public String body;

    public static GetEmonMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmonMonitorDataRequest self = new GetEmonMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public GetEmonMonitorDataRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
