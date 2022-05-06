// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RecognizeCarNumRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    public static RecognizeCarNumRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCarNumRequest self = new RecognizeCarNumRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCarNumRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
