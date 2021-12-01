// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionMetaShrinkRequest extends TeaModel {
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Sid")
    public String sid;

    @NameInMap("SubMigrationJobIds")
    public String subMigrationJobIdsShrink;

    @NameInMap("Topics")
    public String topicsShrink;

    public static DescribeSubscriptionMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionMetaShrinkRequest self = new DescribeSubscriptionMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionMetaShrinkRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DescribeSubscriptionMetaShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSubscriptionMetaShrinkRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public DescribeSubscriptionMetaShrinkRequest setSubMigrationJobIdsShrink(String subMigrationJobIdsShrink) {
        this.subMigrationJobIdsShrink = subMigrationJobIdsShrink;
        return this;
    }
    public String getSubMigrationJobIdsShrink() {
        return this.subMigrationJobIdsShrink;
    }

    public DescribeSubscriptionMetaShrinkRequest setTopicsShrink(String topicsShrink) {
        this.topicsShrink = topicsShrink;
        return this;
    }
    public String getTopicsShrink() {
        return this.topicsShrink;
    }

}
