// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionReleaseNoteRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("ReleaseNote")
    public String releaseNote;

    public static UpdateOsVersionReleaseNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionReleaseNoteRequest self = new UpdateOsVersionReleaseNoteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionReleaseNoteRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateOsVersionReleaseNoteRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public UpdateOsVersionReleaseNoteRequest setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

}
