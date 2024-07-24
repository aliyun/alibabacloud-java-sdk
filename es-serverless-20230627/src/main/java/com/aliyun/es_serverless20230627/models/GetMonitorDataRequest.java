// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetMonitorDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;start&quot;:1689245180581,&quot;end&quot;:1689246950582,&quot;queries&quot;:[{&quot;metric&quot;:&quot;aliyunes.elasticsearch.index.docs.count&quot;,&quot;aggregator&quot;:&quot;sum&quot;,&quot;downsample&quot;:&quot;avg&quot;,&quot;tags&quot;:{&quot;resource&quot;:&quot;{appName}&quot;},&quot;filters&quot;:[],&quot;granularity&quot;:&quot;auto&quot;}]}</p>
     */
    @NameInMap("body")
    public String body;

    public static GetMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorDataRequest self = new GetMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public GetMonitorDataRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
