// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeImageColorRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("ColorCount")
    public Integer colorCount;

    public static RecognizeImageColorRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageColorRequest self = new RecognizeImageColorRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeImageColorRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeImageColorRequest setColorCount(Integer colorCount) {
        this.colorCount = colorCount;
        return this;
    }
    public Integer getColorCount() {
        return this.colorCount;
    }

}
