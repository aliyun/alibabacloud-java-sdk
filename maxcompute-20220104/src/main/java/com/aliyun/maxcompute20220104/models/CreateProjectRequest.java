// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;name&quot;:&quot;project_name&quot;,
     *     &quot;comment&quot;:&quot;&quot;,
     *     &quot;productType&quot;:&quot;payasyougo/subscription/dev&quot;,
     *     &quot;defaultQuota&quot;:&quot;quota_nick_name&quot;,
     *     &quot;properties&quot;:{
     *         &quot;sqlMeteringMax&quot;:&quot;&quot;,
     *         &quot;typeSystem&quot;:&quot;&quot;,
     *         &quot;encryption&quot;:{
     *             &quot;enable&quot;:true,
     *             &quot;algorithm&quot;:&quot;&quot;,
     *             &quot;key&quot;:&quot;&quot;
     *         }
     *     }
     * }</p>
     */
    @NameInMap("body")
    public String body;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
