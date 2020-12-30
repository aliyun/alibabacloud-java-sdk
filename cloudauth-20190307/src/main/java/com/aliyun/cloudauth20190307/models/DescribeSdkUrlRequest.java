// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeSdkUrlRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Debug")
    public Boolean debug;

    public static DescribeSdkUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdkUrlRequest self = new DescribeSdkUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSdkUrlRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSdkUrlRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeSdkUrlRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

}
