// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DiagnosisIssue extends TeaModel {
    /**
     * <p>A unique code that identifies the issue type.</p>
     * 
     * <strong>example:</strong>
     * <p>RepoNumOverLimit</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>An object that contains additional, unstructured key-value information about the issue.</p>
     */
    @NameInMap("Extra")
    public java.util.Map<String, String> extra;

    /**
     * <p>The time, in ISO 8601 format, when the issue was first detected.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00+08:00</p>
     */
    @NameInMap("FirstOccurrence")
    public String firstOccurrence;

    /**
     * <p>The time, in ISO 8601 format, when the issue was last detected.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:30:00+08:00</p>
     */
    @NameInMap("LastOccurrence")
    public String lastOccurrence;

    /**
     * <p>Specifies the severity of the issue. Valid values are <code>INFO</code>, <code>WARN</code>, and <code>ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The total number of times the issue has occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OccurrenceCount")
    public Long occurrenceCount;

    /**
     * <p>The recommended action to resolve the issue.</p>
     * 
     * <strong>example:</strong>
     * <p>Buy repository quota</p>
     */
    @NameInMap("Solution")
    public String solution;

    public static DiagnosisIssue build(java.util.Map<String, ?> map) throws Exception {
        DiagnosisIssue self = new DiagnosisIssue();
        return TeaModel.build(map, self);
    }

    public DiagnosisIssue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DiagnosisIssue setExtra(java.util.Map<String, String> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, String> getExtra() {
        return this.extra;
    }

    public DiagnosisIssue setFirstOccurrence(String firstOccurrence) {
        this.firstOccurrence = firstOccurrence;
        return this;
    }
    public String getFirstOccurrence() {
        return this.firstOccurrence;
    }

    public DiagnosisIssue setLastOccurrence(String lastOccurrence) {
        this.lastOccurrence = lastOccurrence;
        return this;
    }
    public String getLastOccurrence() {
        return this.lastOccurrence;
    }

    public DiagnosisIssue setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DiagnosisIssue setOccurrenceCount(Long occurrenceCount) {
        this.occurrenceCount = occurrenceCount;
        return this;
    }
    public Long getOccurrenceCount() {
        return this.occurrenceCount;
    }

    public DiagnosisIssue setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

}
