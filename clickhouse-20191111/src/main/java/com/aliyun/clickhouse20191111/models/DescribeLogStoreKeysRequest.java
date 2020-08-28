// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLogStoreKeysRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("LogStoreName")
    @Validation(required = true)
    public String logStoreName;

    public static DescribeLogStoreKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreKeysRequest self = new DescribeLogStoreKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLogStoreKeysRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeLogStoreKeysRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

}
