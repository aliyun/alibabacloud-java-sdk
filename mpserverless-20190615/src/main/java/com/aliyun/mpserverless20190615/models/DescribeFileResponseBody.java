// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFileResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Url")
    public String url;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Float size;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("Name")
    public String name;

    @NameInMap("Id")
    public String id;

    public static DescribeFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileResponseBody self = new DescribeFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeFileResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DescribeFileResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileResponseBody setSize(Float size) {
        this.size = size;
        return this;
    }
    public Float getSize() {
        return this.size;
    }

    public DescribeFileResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFileResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFileResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
