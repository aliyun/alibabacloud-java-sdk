// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class RecognizeImageColorRequest extends TeaModel {
    @NameInMap("ColorCount")
    public String colorCount;

    @NameInMap("Url")
    public String url;

    public static RecognizeImageColorRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageColorRequest self = new RecognizeImageColorRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeImageColorRequest setColorCount(String colorCount) {
        this.colorCount = colorCount;
        return this;
    }
    public String getColorCount() {
        return this.colorCount;
    }

    public RecognizeImageColorRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
