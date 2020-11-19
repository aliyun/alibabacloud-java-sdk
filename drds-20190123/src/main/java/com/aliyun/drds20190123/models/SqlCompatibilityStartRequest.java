// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SqlCompatibilityStartRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("TargetVersion")
    @Validation(required = true)
    public String targetVersion;

    @NameInMap("PerformanceTest")
    public Boolean performanceTest;

    public static SqlCompatibilityStartRequest build(java.util.Map<String, ?> map) throws Exception {
        SqlCompatibilityStartRequest self = new SqlCompatibilityStartRequest();
        return TeaModel.build(map, self);
    }

    public SqlCompatibilityStartRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SqlCompatibilityStartRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public SqlCompatibilityStartRequest setPerformanceTest(Boolean performanceTest) {
        this.performanceTest = performanceTest;
        return this;
    }
    public Boolean getPerformanceTest() {
        return this.performanceTest;
    }

}
