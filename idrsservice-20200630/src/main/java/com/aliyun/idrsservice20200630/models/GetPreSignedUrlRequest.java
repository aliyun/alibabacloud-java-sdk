// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetPreSignedUrlRequest extends TeaModel {
    @NameInMap("Prefix")
    public String prefix;

    public static GetPreSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPreSignedUrlRequest self = new GetPreSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetPreSignedUrlRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
