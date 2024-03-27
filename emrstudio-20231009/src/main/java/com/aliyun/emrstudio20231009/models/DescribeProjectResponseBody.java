// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeProjectResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectResponseBody self = new DescribeProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeProjectResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeProjectResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
