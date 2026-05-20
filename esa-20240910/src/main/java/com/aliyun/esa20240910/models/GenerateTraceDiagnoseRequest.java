// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GenerateTraceDiagnoseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxx.jpg">http://www.example.com/xxx.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static GenerateTraceDiagnoseRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTraceDiagnoseRequest self = new GenerateTraceDiagnoseRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTraceDiagnoseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
