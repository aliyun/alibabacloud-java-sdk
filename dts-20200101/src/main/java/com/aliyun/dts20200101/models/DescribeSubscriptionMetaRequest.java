// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionMetaRequest extends TeaModel {
    /**
     * <p>The ID of the distributed change tracking instance.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the region in which the change tracking instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the consumer group.</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The IDs of all subtasks in the distributed change tracking task. Separate multiple subtask IDs with commas (,).</p>
     * <br>
     * <p>>  You must specify at least one of the SubMigrationJobIds and **Topics** parameters. We recommend that you specify the SubMigrationJobIds parameter.</p>
     */
    @NameInMap("SubMigrationJobIds")
    public java.util.Map<String, ?> subMigrationJobIds;

    /**
     * <p>The topics of all subtasks in the distributed change tracking task. Separate multiple topics with commas (,).</p>
     * <br>
     * <p>>  You must specify at least one of the **SubMigrationJobIds** and Topics parameters. We recommend that you specify the **SubMigrationJobIds** parameter.</p>
     */
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
