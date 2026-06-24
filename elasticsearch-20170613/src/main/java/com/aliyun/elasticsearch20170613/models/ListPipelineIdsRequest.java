// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineIdsRequest extends TeaModel {
    /**
     * <p>The request body parameters. For more information, see the RequestBody section below.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;userName&quot;:&quot;elastic&quot;,     &quot;password&quot;:&quot;xxxxxx&quot; }</p>
     */
    @NameInMap("body")
    public String body;

    public static ListPipelineIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineIdsRequest self = new ListPipelineIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineIdsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
