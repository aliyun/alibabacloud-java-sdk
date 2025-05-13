// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetUmodelDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;filter&quot;: {
     *         &quot;domains&quot;: []
     *     },
     *     &quot;offset&quot;: 0,
     *     &quot;size&quot;: 100000
     * }</p>
     */
    @NameInMap("content")
    public Object content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ListData</p>
     */
    @NameInMap("method")
    public String method;

    public static GetUmodelDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUmodelDataRequest self = new GetUmodelDataRequest();
        return TeaModel.build(map, self);
    }

    public GetUmodelDataRequest setContent(Object content) {
        this.content = content;
        return this;
    }
    public Object getContent() {
        return this.content;
    }

    public GetUmodelDataRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

}
