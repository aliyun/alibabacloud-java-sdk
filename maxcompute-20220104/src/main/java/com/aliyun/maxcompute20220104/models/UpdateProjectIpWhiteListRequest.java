// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectIpWhiteListRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     */
    @NameInMap("body")
    public String body;

    public static UpdateProjectIpWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectIpWhiteListRequest self = new UpdateProjectIpWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectIpWhiteListRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
