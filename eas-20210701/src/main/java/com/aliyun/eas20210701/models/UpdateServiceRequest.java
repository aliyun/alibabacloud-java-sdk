// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    /**
     * <p>The type of the service update. Valid values: merge and replace. By default, merge is used if you do not specify this parameter.</p>
     * <ul>
     * <li>merge: If the JSON string configured for the existing service is <code>{&quot;a&quot;:&quot;b&quot;}</code> and the JSON string specified in the body parameter is <code>{&quot;c&quot;:&quot;d&quot;}</code>, the JSON string is <code>{&quot;a&quot;:&quot;b&quot;,&quot;c&quot;:&quot;d&quot;}</code> after the service update.</li>
     * <li>replace: If the JSON string configured for the existing service is <code>{&quot;a&quot;:&quot;b&quot;}</code> and the JSON string specified in the body parameter is <code>{&quot;c&quot;:&quot;d&quot;}</code>, the JSON string is <code>{&quot;c&quot;:&quot;d&quot;}</code> after the service update.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>merge</p>
     */
    @NameInMap("UpdateType")
    public String updateType;

    /**
     * <p>The request body. The body includes the request parameters that you want to update. For more information about the request parameters, see <a href="https://help.aliyun.com/document_detail/412086.html">CreateService</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;name&quot;: &quot;foo&quot;,   &quot;model_path&quot;: &quot;<a href="http://path/to/model.tar.gz">http://path/to/model.tar.gz</a>&quot;,   &quot;processor&quot;: &quot;tensorflow_cpu&quot;,   &quot;metadata&quot;: {     &quot;instance&quot;: 2,     &quot;memory&quot;: 7000,     &quot;cpu&quot;: 4   } }</p>
     */
    @NameInMap("body")
    public String body;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

    public UpdateServiceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
