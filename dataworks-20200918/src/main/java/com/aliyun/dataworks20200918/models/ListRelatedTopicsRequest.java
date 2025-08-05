// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListRelatedTopicsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InGroupId")
    public Integer inGroupId;

    @NameInMap("TopicStatuses")
    public String topicStatuses;

    public static ListRelatedTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRelatedTopicsRequest self = new ListRelatedTopicsRequest();
        return TeaModel.build(map, self);
    }

    public ListRelatedTopicsRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

    public ListRelatedTopicsRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public ListRelatedTopicsRequest setInGroupId(Integer inGroupId) {
        this.inGroupId = inGroupId;
        return this;
    }
    public Integer getInGroupId() {
        return this.inGroupId;
    }

    public ListRelatedTopicsRequest setTopicStatuses(String topicStatuses) {
        this.topicStatuses = topicStatuses;
        return this;
    }
    public String getTopicStatuses() {
        return this.topicStatuses;
    }

}
