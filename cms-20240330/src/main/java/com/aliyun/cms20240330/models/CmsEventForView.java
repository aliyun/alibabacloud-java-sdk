// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CmsEventForView extends TeaModel {
    /**
     * <p>Additional annotations for the event. This is an unstructured description field.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;description&quot;: &quot;High load detected on server&quot;, &quot;operator&quot;: &quot;auto&quot; }</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, ?> annotations;

    /**
     * <p>The raw data of the event. The format depends on the event type and dataschema.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;metricName&quot;: &quot;cpu_usage&quot;, &quot;value&quot;: 95.2, &quot;threshold&quot;: 80 }</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>The content type of the data field.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;application/json&quot;</p>
     */
    @NameInMap("datacontenttype")
    public String datacontenttype;

    /**
     * <p>The data schema definition, which describes the structure of the data field.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;<a href="https://schema.alibabacloud.com/cms/alert/v1">https://schema.alibabacloud.com/cms/alert/v1</a>&quot;</p>
     */
    @NameInMap("dataschema")
    public String dataschema;

    /**
     * <p>The deduplication ID. It identifies different instances of the same event, such as a repeatedly reported event.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;dedup-abc123&quot;</p>
     */
    @NameInMap("dedupId")
    public String dedupId;

    /**
     * <p>The unique identifier for the event. The system generates this globally unique ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;event-1234567890&quot;</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The unique integration identifier. It is used for identity recognition in cross-system integrations.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;integration-xyz&quot;</p>
     */
    @NameInMap("integrationUuid")
    public String integrationUuid;

    /**
     * <p>The key-value pairs of the event labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;source\&quot;: \&quot;system\&quot;}</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    /**
     * <p>The timestamp when the event was received and processed.</p>
     * 
     * <strong>example:</strong>
     * <p>1743846610000</p>
     */
    @NameInMap("receiveTime")
    public Long receiveTime;

    /**
     * <p>Information about the resource associated with the event, such as the instance ID, IP address, and region.</p>
     */
    @NameInMap("resource")
    public EventResourceForEventView resource;

    /**
     * <p>The severity level of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;CRITICAL&quot;</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The name of the source system or service, such as ECS, RDS, or VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ECS&quot;</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The type of event source. It distinguishes between sources such as monitoring systems, Simple Log Service, and application observability.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;CloudMonitor&quot;</p>
     */
    @NameInMap("sourcetype")
    public String sourcetype;

    /**
     * <p>The current status of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The subject or title of the event. It briefly describes the event.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Instance cpu usage exceeds threshold&quot;</p>
     */
    @NameInMap("subject")
    public String subject;

    /**
     * <p>The event subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;HighCPUUsage&quot;</p>
     */
    @NameInMap("subtype")
    public String subtype;

    /**
     * <p>The internal system event ID. It is used for internal tracking and log association.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;sys-event-987654321&quot;</p>
     */
    @NameInMap("sysId")
    public String sysId;

    /**
     * <p>The time when the event occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;2025-04-05T10:30:00Z&quot;</p>
     */
    @NameInMap("time")
    public String time;

    /**
     * <p>The timestamp of the event occurrence.</p>
     * 
     * <strong>example:</strong>
     * <p>1743846600000</p>
     */
    @NameInMap("timestamp")
    public Long timestamp;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Alert&quot;</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The ID or name of the workspace. It is used for multi-tenant or organization fencing.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ws-abc123&quot;</p>
     */
    @NameInMap("workspace")
    public String workspace;

    /**
     * <p>The workspace tags. They help you manage events by tag.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;department&quot;: &quot;finance&quot;, &quot;project&quot;: &quot;payment-gateway&quot; }</p>
     */
    @NameInMap("workspaceTags")
    public java.util.Map<String, ?> workspaceTags;

    public static CmsEventForView build(java.util.Map<String, ?> map) throws Exception {
        CmsEventForView self = new CmsEventForView();
        return TeaModel.build(map, self);
    }

    public CmsEventForView setAnnotations(java.util.Map<String, ?> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, ?> getAnnotations() {
        return this.annotations;
    }

    public CmsEventForView setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public CmsEventForView setDatacontenttype(String datacontenttype) {
        this.datacontenttype = datacontenttype;
        return this;
    }
    public String getDatacontenttype() {
        return this.datacontenttype;
    }

    public CmsEventForView setDataschema(String dataschema) {
        this.dataschema = dataschema;
        return this;
    }
    public String getDataschema() {
        return this.dataschema;
    }

    public CmsEventForView setDedupId(String dedupId) {
        this.dedupId = dedupId;
        return this;
    }
    public String getDedupId() {
        return this.dedupId;
    }

    public CmsEventForView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CmsEventForView setIntegrationUuid(String integrationUuid) {
        this.integrationUuid = integrationUuid;
        return this;
    }
    public String getIntegrationUuid() {
        return this.integrationUuid;
    }

    public CmsEventForView setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public CmsEventForView setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
        return this;
    }
    public Long getReceiveTime() {
        return this.receiveTime;
    }

    public CmsEventForView setResource(EventResourceForEventView resource) {
        this.resource = resource;
        return this;
    }
    public EventResourceForEventView getResource() {
        return this.resource;
    }

    public CmsEventForView setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CmsEventForView setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CmsEventForView setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype;
        return this;
    }
    public String getSourcetype() {
        return this.sourcetype;
    }

    public CmsEventForView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CmsEventForView setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CmsEventForView setSubtype(String subtype) {
        this.subtype = subtype;
        return this;
    }
    public String getSubtype() {
        return this.subtype;
    }

    public CmsEventForView setSysId(String sysId) {
        this.sysId = sysId;
        return this;
    }
    public String getSysId() {
        return this.sysId;
    }

    public CmsEventForView setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public CmsEventForView setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public CmsEventForView setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CmsEventForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CmsEventForView setWorkspaceTags(java.util.Map<String, ?> workspaceTags) {
        this.workspaceTags = workspaceTags;
        return this;
    }
    public java.util.Map<String, ?> getWorkspaceTags() {
        return this.workspaceTags;
    }

}
