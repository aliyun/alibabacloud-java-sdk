// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeImageColorAdvanceRequest extends TeaModel {
    @NameInMap("ColorCount")
    public Integer colorCount;

    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static RecognizeImageColorAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageColorAdvanceRequest self = new RecognizeImageColorAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeImageColorAdvanceRequest setColorCount(Integer colorCount) {
        this.colorCount = colorCount;
        return this;
    }
    public Integer getColorCount() {
        return this.colorCount;
    }

    public RecognizeImageColorAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
