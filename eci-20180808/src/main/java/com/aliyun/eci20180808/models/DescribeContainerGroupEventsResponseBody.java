// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupEventsResponseBody extends TeaModel {
    /**
     * <p>Details of the events.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeContainerGroupEventsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries of returned events.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeContainerGroupEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupEventsResponseBody self = new DescribeContainerGroupEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupEventsResponseBody setData(java.util.List<DescribeContainerGroupEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeContainerGroupEventsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeContainerGroupEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContainerGroupEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeContainerGroupEventsResponseBodyDataEventsMetadata extends TeaModel {
        /**
         * <p>The event name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        public static DescribeContainerGroupEventsResponseBodyDataEventsMetadata build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupEventsResponseBodyDataEventsMetadata self = new DescribeContainerGroupEventsResponseBodyDataEventsMetadata();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupEventsResponseBodyDataEventsMetadata setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupEventsResponseBodyDataEventsMetadata setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class DescribeContainerGroupEventsResponseBodyDataEventsSource extends TeaModel {
        /**
         * <p>The component.</p>
         */
        @NameInMap("Component")
        public String component;

        /**
         * <p>The host.</p>
         */
        @NameInMap("Host")
        public String host;

        public static DescribeContainerGroupEventsResponseBodyDataEventsSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupEventsResponseBodyDataEventsSource self = new DescribeContainerGroupEventsResponseBodyDataEventsSource();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupEventsResponseBodyDataEventsSource setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public DescribeContainerGroupEventsResponseBodyDataEventsSource setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

    public static class DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject extends TeaModel {
        /**
         * <p>The version of Kubernetes.</p>
         */
        @NameInMap("ApiVersion")
        public String apiVersion;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The resource name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace where the resource resides.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The resource ID.</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject self = new DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class DescribeContainerGroupEventsResponseBodyDataEvents extends TeaModel {
        /**
         * <p>The number of events.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The first occurrence time of the event.</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The most recent occurrence time of the event.</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The message about the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The metadata of the event.</p>
         */
        @NameInMap("Metadata")
        public DescribeContainerGroupEventsResponseBodyDataEventsMetadata metadata;

        /**
         * <p>The cause of the event.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The component from which the event is reported.</p>
         */
        @NameInMap("ReportingComponent")
        public String reportingComponent;

        /**
         * <p>The instance from which the event is reported.</p>
         */
        @NameInMap("ReportingInstance")
        public String reportingInstance;

        /**
         * <p>The source.</p>
         */
        @NameInMap("Source")
        public DescribeContainerGroupEventsResponseBodyDataEventsSource source;

        /**
         * <p>The event type. Valid values:</p>
         * <br>
         * <p>*   Normal</p>
         * <p>*   Warning</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The resource object that the event is about.</p>
         */
        @NameInMap("involvedObject")
        public DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject involvedObject;

        public static DescribeContainerGroupEventsResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupEventsResponseBodyDataEvents self = new DescribeContainerGroupEventsResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setMetadata(DescribeContainerGroupEventsResponseBodyDataEventsMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public DescribeContainerGroupEventsResponseBodyDataEventsMetadata getMetadata() {
            return this.metadata;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setReportingComponent(String reportingComponent) {
            this.reportingComponent = reportingComponent;
            return this;
        }
        public String getReportingComponent() {
            return this.reportingComponent;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setReportingInstance(String reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }
        public String getReportingInstance() {
            return this.reportingInstance;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setSource(DescribeContainerGroupEventsResponseBodyDataEventsSource source) {
            this.source = source;
            return this;
        }
        public DescribeContainerGroupEventsResponseBodyDataEventsSource getSource() {
            return this.source;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeContainerGroupEventsResponseBodyDataEvents setInvolvedObject(DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject involvedObject) {
            this.involvedObject = involvedObject;
            return this;
        }
        public DescribeContainerGroupEventsResponseBodyDataEventsInvolvedObject getInvolvedObject() {
            return this.involvedObject;
        }

    }

    public static class DescribeContainerGroupEventsResponseBodyData extends TeaModel {
        /**
         * <p>The annotations of the elastic container instance.</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The ID of the elastic container instance.</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The events.</p>
         */
        @NameInMap("Events")
        public java.util.List<DescribeContainerGroupEventsResponseBodyDataEvents> events;

        /**
         * <p>The name of the elastic container instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace where the elastic container instance resides.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The UUID of the elastic container instance.</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static DescribeContainerGroupEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupEventsResponseBodyData self = new DescribeContainerGroupEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupEventsResponseBodyData setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public DescribeContainerGroupEventsResponseBodyData setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DescribeContainerGroupEventsResponseBodyData setEvents(java.util.List<DescribeContainerGroupEventsResponseBodyDataEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeContainerGroupEventsResponseBodyDataEvents> getEvents() {
            return this.events;
        }

        public DescribeContainerGroupEventsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupEventsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeContainerGroupEventsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
