// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CommonMediaResource extends TeaModel {
    // media format
    @NameInMap("Format")
    public String format;

    // media id
    @NameInMap("Id")
    public String id;

    // name
    @NameInMap("Name")
    public String name;

    // media sha1
    @NameInMap("Sha1")
    public String sha1;

    // media size
    @NameInMap("Size")
    public Long size;

    // resource url
    @NameInMap("Url")
    public String url;

    public static CommonMediaResource build(java.util.Map<String, ?> map) throws Exception {
        CommonMediaResource self = new CommonMediaResource();
        return TeaModel.build(map, self);
    }

    public CommonMediaResource setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public CommonMediaResource setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CommonMediaResource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CommonMediaResource setSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }
    public String getSha1() {
        return this.sha1;
    }

    public CommonMediaResource setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public CommonMediaResource setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
