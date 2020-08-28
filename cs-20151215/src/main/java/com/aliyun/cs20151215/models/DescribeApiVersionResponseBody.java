// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeApiVersionResponseBody extends TeaModel {
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    @NameInMap("build")
    @Validation(required = true)
    public String build;

    @NameInMap("docker_version")
    @Validation(required = true)
    public String dockerVersion;

    @NameInMap("docker_region_versions")
    @Validation(required = true)
    public String dockerRegionVersions;

    public static DescribeApiVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiVersionResponseBody self = new DescribeApiVersionResponseBody();
        return TeaModel.build(map, self);
    }

}
