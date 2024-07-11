// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitImageCopyrightRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;abc-test&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;out.jpeg&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <strong>example:</strong>
     * <p>{&quot;width&quot;:2999, &quot;height&quot;:2999, &quot;afa&quot;: 3, &quot;type&quot;:1, &quot;version&quot;:0}</p>
     */
    @NameInMap("Params")
    public String params;

    public static SubmitImageCopyrightRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCopyrightRequest self = new SubmitImageCopyrightRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageCopyrightRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitImageCopyrightRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitImageCopyrightRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
