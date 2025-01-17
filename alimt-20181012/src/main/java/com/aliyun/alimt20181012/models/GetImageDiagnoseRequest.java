// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageDiagnoseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{   &quot;product_id&quot;: &quot;1&quot;,   &quot;platform&quot;: &quot;ae&quot; }</p>
     */
    @NameInMap("Extra")
    public String extra;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxxx.oss-cn-shenzhen.aliyuncs.com/jd/41209/xxxxx.jpg">http://xxxxx.oss-cn-shenzhen.aliyuncs.com/jd/41209/xxxxx.jpg</a></p>
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
