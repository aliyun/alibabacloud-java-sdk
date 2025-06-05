// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupEventsResponseBody extends TeaModel {
    /**
     * <p>Details of the events.</p>
     */
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1340C38D-6189-54D1-86F6-7D5ECF3E0088</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries of returned events.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeContainerGroupEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupEventsResponseBody self = new DescribeContainerGroupEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupEventsResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
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

    public static class Metadata extends TeaModel {
        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-uto-created-eci-for-ubuntu.167e3fb73cc7f9cb</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        public static Metadata build(java.util.Map<String, ?> map) throws Exception {
            Metadata self = new Metadata();
            return TeaModel.build(map, self);
        }

        public Metadata setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Metadata setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class Source extends TeaModel {
        /**
         * <p>The component.</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        @NameInMap("Component")
        public String component;

        /**
         * <p>The host.</p>
         * 
         * <strong>example:</strong>
         * <p>eci</p>
         */
        @NameInMap("Host")
        public String host;

        public static Source build(java.util.Map<String, ?> map) throws Exception {
            Source self = new Source();
            return TeaModel.build(map, self);
        }

        public Source setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public Source setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

    public static class InvolvedObject extends TeaModel {
        /**
         * <p>The version of Kubernetes.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("ApiVersion")
        public String apiVersion;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Pod</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace where the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-8vb5nkcq3a5cu0p3****</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static InvolvedObject build(java.util.Map<String, ?> map) throws Exception {
            InvolvedObject self = new InvolvedObject();
            return TeaModel.build(map, self);
        }

        public InvolvedObject setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public InvolvedObject setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public InvolvedObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InvolvedObject setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public InvolvedObject setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class Events extends TeaModel {
        /**
         * <p>The number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The first occurrence time of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-04T09:08:04Z</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The most recent occurrence time of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-04T09:08:04Z</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The message about the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Started container</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The metadata of the event.</p>
         */
        @NameInMap("Metadata")
        public Metadata metadata;

        /**
         * <p>The cause of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The component from which the event is reported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReportingComponent")
        public String reportingComponent;

        /**
         * <p>The instance from which the event is reported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReportingInstance")
        public String reportingInstance;

        /**
         * <p>The source.</p>
         */
        @NameInMap("Source")
        public Source source;

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Warning</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The resource object that the event is about.</p>
         */
        @NameInMap("involvedObject")
        public InvolvedObject involvedObject;

        public static Events build(java.util.Map<String, ?> map) throws Exception {
            Events self = new Events();
            return TeaModel.build(map, self);
        }

        public Events setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public Events setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public Events setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public Events setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Events setMetadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public Metadata getMetadata() {
            return this.metadata;
        }

        public Events setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public Events setReportingComponent(String reportingComponent) {
            this.reportingComponent = reportingComponent;
            return this;
        }
        public String getReportingComponent() {
            return this.reportingComponent;
        }

        public Events setReportingInstance(String reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }
        public String getReportingInstance() {
            return this.reportingInstance;
        }

        public Events setSource(Source source) {
            this.source = source;
            return this;
        }
        public Source getSource() {
            return this.source;
        }

        public Events setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public Events setInvolvedObject(InvolvedObject involvedObject) {
            this.involvedObject = involvedObject;
            return this;
        }
        public InvolvedObject getInvolvedObject() {
            return this.involvedObject;
        }

    }

    public static class Data extends TeaModel {
        /**
         * <p>The annotations of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;tenancy.x-k8s.io/namespace\&quot;:\&quot;redis\&quot;}&quot;</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The ID of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-uf6fonnghi50v6nq****</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The events.</p>
         */
        @NameInMap("Events")
        public java.util.List<Events> events;

        /**
         * <p>The name of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace where the elastic container instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The UUID of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3fc6b309-<strong><strong>-</strong></strong></p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public Data setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public Data setEvents(java.util.List<Events> events) {
            this.events = events;
            return this;
        }
        public java.util.List<Events> getEvents() {
            return this.events;
        }

        public Data setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Data setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public Data setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
