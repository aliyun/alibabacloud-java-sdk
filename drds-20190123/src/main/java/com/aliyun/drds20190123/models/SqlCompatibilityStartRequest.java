// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SqlCompatibilityStartRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("PerformanceTest")
    public Boolean performanceTest;

    @NameInMap("TargetVersion")
    public String targetVersion;

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

    public SqlCompatibilityStartRequest setPerformanceTest(Boolean performanceTest) {
        this.performanceTest = performanceTest;
        return this;
    }
    public Boolean getPerformanceTest() {
        return this.performanceTest;
    }

    public SqlCompatibilityStartRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
