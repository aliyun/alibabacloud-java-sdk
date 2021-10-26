// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListEventSourcesResponseBody extends TeaModel {
    // 事件源列表
    @NameInMap("eventSources")
    public java.util.List<ListEventSourcesResponseBodyEventSources> eventSources;

    public static ListEventSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventSourcesResponseBody self = new ListEventSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventSourcesResponseBody setEventSources(java.util.List<ListEventSourcesResponseBodyEventSources> eventSources) {
        this.eventSources = eventSources;
        return this;
    }
    public java.util.List<ListEventSourcesResponseBodyEventSources> getEventSources() {
        return this.eventSources;
    }

    public static class ListEventSourcesResponseBodyEventSources extends TeaModel {
        // 创建时间
        @NameInMap("createdTime")
        public String createdTime;

        // 事件源资源标识符
        @NameInMap("sourceArn")
        public String sourceArn;

        public static ListEventSourcesResponseBodyEventSources build(java.util.Map<String, ?> map) throws Exception {
            ListEventSourcesResponseBodyEventSources self = new ListEventSourcesResponseBodyEventSources();
            return TeaModel.build(map, self);
        }

        public ListEventSourcesResponseBodyEventSources setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListEventSourcesResponseBodyEventSources setSourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public String getSourceArn() {
            return this.sourceArn;
        }

    }

}
