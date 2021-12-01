// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionMetaRequest extends TeaModel {
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Sid")
    public String sid;

    @NameInMap("SubMigrationJobIds")
    public java.util.Map<String, ?> subMigrationJobIds;

    @NameInMap("Topics")
    public java.util.Map<String, ?> topics;

    public static DescribeSubscriptionMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionMetaRequest self = new DescribeSubscriptionMetaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionMetaRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DescribeSubscriptionMetaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSubscriptionMetaRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public DescribeSubscriptionMetaRequest setSubMigrationJobIds(java.util.Map<String, ?> subMigrationJobIds) {
        this.subMigrationJobIds = subMigrationJobIds;
        return this;
    }
    public java.util.Map<String, ?> getSubMigrationJobIds() {
        return this.subMigrationJobIds;
    }

    public DescribeSubscriptionMetaRequest setTopics(java.util.Map<String, ?> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.Map<String, ?> getTopics() {
        return this.topics;
    }

}
