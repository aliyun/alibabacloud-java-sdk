// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DiagnosisVersionRequest extends TeaModel {
    @NameInMap("OriginalId")
    public String originalId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("DiagnoseStyle")
    public String diagnoseStyle;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DiagnosisVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DiagnosisVersionRequest self = new DiagnosisVersionRequest();
        return TeaModel.build(map, self);
    }

    public DiagnosisVersionRequest setOriginalId(String originalId) {
        this.originalId = originalId;
        return this;
    }
    public String getOriginalId() {
        return this.originalId;
    }

    public DiagnosisVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DiagnosisVersionRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public DiagnosisVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DiagnosisVersionRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public DiagnosisVersionRequest setDiagnoseStyle(String diagnoseStyle) {
        this.diagnoseStyle = diagnoseStyle;
        return this;
    }
    public String getDiagnoseStyle() {
        return this.diagnoseStyle;
    }

    public DiagnosisVersionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DiagnosisVersionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
