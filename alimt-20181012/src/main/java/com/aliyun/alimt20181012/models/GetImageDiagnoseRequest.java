// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageDiagnoseRequest extends TeaModel {
    @NameInMap("Extra")
    public String extra;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Url")
    public String url;

    public static GetImageDiagnoseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageDiagnoseRequest self = new GetImageDiagnoseRequest();
        return TeaModel.build(map, self);
    }

    public GetImageDiagnoseRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public GetImageDiagnoseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
