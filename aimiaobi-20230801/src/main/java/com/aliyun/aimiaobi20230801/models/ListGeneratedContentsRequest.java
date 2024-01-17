// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListGeneratedContentsRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ContentDomain")
    public String contentDomain;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Title")
    public String title;

    public static ListGeneratedContentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGeneratedContentsRequest self = new ListGeneratedContentsRequest();
        return TeaModel.build(map, self);
    }

    public ListGeneratedContentsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListGeneratedContentsRequest setContentDomain(String contentDomain) {
        this.contentDomain = contentDomain;
        return this;
    }
    public String getContentDomain() {
        return this.contentDomain;
    }

    public ListGeneratedContentsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListGeneratedContentsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListGeneratedContentsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListGeneratedContentsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListGeneratedContentsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
