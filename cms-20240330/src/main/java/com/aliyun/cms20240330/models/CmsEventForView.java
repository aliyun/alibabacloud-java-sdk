// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CmsEventForView extends TeaModel {
    @NameInMap("annotations")
    public java.util.Map<String, ?> annotations;

    @NameInMap("data")
    public Object data;

    @NameInMap("datacontenttype")
    public String datacontenttype;

    @NameInMap("dataschema")
    public String dataschema;

    @NameInMap("dedupId")
    public String dedupId;

    @NameInMap("id")
    public String id;

    @NameInMap("integrationUuid")
    public String integrationUuid;

    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    @NameInMap("receiveTime")
    public Long receiveTime;

    @NameInMap("resource")
    public EventResourceForEventView resource;

    @NameInMap("severity")
    public String severity;

    @NameInMap("source")
    public String source;

    @NameInMap("sourcetype")
    public String sourcetype;

    @NameInMap("status")
    public String status;

    @NameInMap("subject")
    public String subject;

    @NameInMap("subtype")
    public String subtype;

    @NameInMap("sysId")
    public String sysId;

    @NameInMap("time")
    public String time;

    @NameInMap("timestamp")
    public Long timestamp;

    @NameInMap("type")
    public String type;

    @NameInMap("workspace")
    public String workspace;

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
