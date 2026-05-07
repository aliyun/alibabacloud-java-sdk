// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class GenerateCdnDiagnoseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxx.jpg">http://www.example.com/xxx.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static GenerateCdnDiagnoseRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCdnDiagnoseRequest self = new GenerateCdnDiagnoseRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCdnDiagnoseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
