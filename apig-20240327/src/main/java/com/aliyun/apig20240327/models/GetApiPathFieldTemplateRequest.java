// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetApiPathFieldTemplateRequest extends TeaModel {
    /**
     * <p>The URI of the request, used to query the field template corresponding to the URI.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1/chat/completions</p>
     */
    @NameInMap("path")
    public String path;

    public static GetApiPathFieldTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiPathFieldTemplateRequest self = new GetApiPathFieldTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetApiPathFieldTemplateRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
