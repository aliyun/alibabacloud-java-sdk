// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListEventSourcesResponseBody extends TeaModel {
    /**
     * <p>Queries all the event sources of a function.</p>
     */
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
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>Jianyi</p>
         */
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
