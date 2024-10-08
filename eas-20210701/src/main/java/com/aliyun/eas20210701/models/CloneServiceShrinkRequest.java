// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CloneServiceShrinkRequest extends TeaModel {
    /**
     * <p>The label of the service to be cloned.</p>
     */
    @NameInMap("Labels")
    public String labelsShrink;

    /**
     * <p>The request body. For more information, see <a href="https://help.aliyun.com/document_detail/412086.html">CreateService</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;name&quot;: &quot;foo&quot;,   &quot;model_path&quot;: &quot;<a href="http://path/to/model.tar.gz">http://path/to/model.tar.gz</a>&quot;,   &quot;processor&quot;: &quot;tensorflow_cpu&quot;,   &quot;metadata&quot;: {     &quot;instance&quot;: 2,     &quot;memory&quot;: 7000,     &quot;cpu&quot;: 4   } }</p>
     */
    @NameInMap("body")
    public String body;

    public static CloneServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneServiceShrinkRequest self = new CloneServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CloneServiceShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public CloneServiceShrinkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
