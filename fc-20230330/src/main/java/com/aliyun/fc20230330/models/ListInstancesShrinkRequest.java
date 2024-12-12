// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListInstancesShrinkRequest extends TeaModel {
    @NameInMap("endTimeMs")
    public Long endTimeMs;

    @NameInMap("instanceIds")
    public String instanceIdsShrink;

    @NameInMap("instanceStatus")
    public String instanceStatusShrink;

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

    @NameInMap("startKey")
    public String startKey;

    @NameInMap("startTimeMs")
    public Long startTimeMs;

    /**
     * <p>Specifies whether to list all instances. Valid values: true and false.</p>
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
