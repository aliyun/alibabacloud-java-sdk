// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeSdkUrlRequest extends TeaModel {
    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

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

    public DescribeSdkUrlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSdkUrlRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
