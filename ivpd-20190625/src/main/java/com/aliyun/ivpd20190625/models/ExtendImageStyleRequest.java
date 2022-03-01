// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class ExtendImageStyleRequest extends TeaModel {
    @NameInMap("MajorUrl")
    public String majorUrl;

    @NameInMap("StyleUrl")
    public String styleUrl;

    public static ExtendImageStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleRequest self = new ExtendImageStyleRequest();
        return TeaModel.build(map, self);
    }

    public ExtendImageStyleRequest setMajorUrl(String majorUrl) {
        this.majorUrl = majorUrl;
        return this;
    }
    public String getMajorUrl() {
        return this.majorUrl;
    }

    public ExtendImageStyleRequest setStyleUrl(String styleUrl) {
        this.styleUrl = styleUrl;
        return this;
    }
    public String getStyleUrl() {
        return this.styleUrl;
    }

}
