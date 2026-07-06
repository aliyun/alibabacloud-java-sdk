// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DiagnosisTarget extends TeaModel {
    /**
     * <p>The end of the diagnostic time window, in ISO 8601 format. Must be after <code>StartTime</code>.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:30:00+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>A map of key-value pairs providing additional context for the diagnosis.</p>
     */
    @NameInMap("Extra")
    public java.util.Map<String, String> extra;

    /**
     * <p>The namespace that contains the repository.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of a related operation, such as a previous diagnostic task.</p>
     */
    @NameInMap("RelatedId")
    public String relatedId;

    /**
     * <p>The name of the repository.</p>
     * 
     * <strong>example:</strong>
     * <p>test_repo</p>
     */
    @NameInMap("Repository")
    public String repository;

    /**
     * <p>The start of the diagnostic time window, in ISO 8601 format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The container image tag.</p>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static DiagnosisTarget build(java.util.Map<String, ?> map) throws Exception {
        DiagnosisTarget self = new DiagnosisTarget();
        return TeaModel.build(map, self);
    }

    public DiagnosisTarget setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DiagnosisTarget setExtra(java.util.Map<String, String> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, String> getExtra() {
        return this.extra;
    }

    public DiagnosisTarget setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DiagnosisTarget setRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }
    public String getRelatedId() {
        return this.relatedId;
    }

    public DiagnosisTarget setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

    public DiagnosisTarget setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DiagnosisTarget setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
