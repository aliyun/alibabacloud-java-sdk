// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeSdkUrlRequest extends TeaModel {
    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Id")
    @Validation(required = true)
    public Long id;

    public static DescribeSdkUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdkUrlRequest self = new DescribeSdkUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSdkUrlRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public DescribeSdkUrlRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
