// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectIpWhiteListRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>json {&quot;ipWhiteList&quot;:{&quot;ipList&quot;: &quot;&quot;, // The IP address whitelists are of the STRING data type. Separate multiple IP address whitelists with commas (,). &quot;vpcIpList&quot;: &quot;&quot;, //} }</p>
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
