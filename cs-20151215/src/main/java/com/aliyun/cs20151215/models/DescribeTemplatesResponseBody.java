// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
    @NameInMap("template")
    @Validation(required = true)
    public String template;

    @NameInMap("acl")
    @Validation(required = true)
    public String acl;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("tags")
    @Validation(required = true)
    public String tags;

    @NameInMap("template_type")
    @Validation(required = true)
    public String templateType;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static DescribeTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponseBody self = new DescribeTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

}
