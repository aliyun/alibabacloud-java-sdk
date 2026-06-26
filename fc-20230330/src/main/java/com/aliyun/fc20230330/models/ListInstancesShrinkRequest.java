// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The end time of the query range, specified as a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("endTimeMs")
    public Long endTimeMs;

    /**
     * <p>A list of instance IDs to return.</p>
     */
    @NameInMap("instanceIds")
    public String instanceIdsShrink;

    /**
     * <p>An array of instance statuses. The operation returns only instances whose status is in this array.</p>
     */
    @NameInMap("instanceStatus")
    public String instanceStatusShrink;

    /**
     * <p>The maximum number of instances to return.</p>
     */
    @NameInMap("limit")
    public String limit;

    /**
     * <p>The function version or alias.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The token that specifies where to start the query. It is returned in a truncated response and can be used to retrieve the next page of results.</p>
     */
    @NameInMap("startKey")
    public String startKey;

    /**
     * <p>The start time of the query range, specified as a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("startTimeMs")
    public Long startTimeMs;

    /**
     * <p>Specifies whether to list all active instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withAllActive")
    public Boolean withAllActive;

    public static ListInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesShrinkRequest self = new ListInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesShrinkRequest setEndTimeMs(Long endTimeMs) {
        this.endTimeMs = endTimeMs;
        return this;
    }
    public Long getEndTimeMs() {
        return this.endTimeMs;
    }

    public ListInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public ListInstancesShrinkRequest setInstanceStatusShrink(String instanceStatusShrink) {
        this.instanceStatusShrink = instanceStatusShrink;
        return this;
    }
    public String getInstanceStatusShrink() {
        return this.instanceStatusShrink;
    }

    public ListInstancesShrinkRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ListInstancesShrinkRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListInstancesShrinkRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

    public ListInstancesShrinkRequest setStartTimeMs(Long startTimeMs) {
        this.startTimeMs = startTimeMs;
        return this;
    }
    public Long getStartTimeMs() {
        return this.startTimeMs;
    }

    public ListInstancesShrinkRequest setWithAllActive(Boolean withAllActive) {
        this.withAllActive = withAllActive;
        return this;
    }
    public Boolean getWithAllActive() {
        return this.withAllActive;
    }

}
