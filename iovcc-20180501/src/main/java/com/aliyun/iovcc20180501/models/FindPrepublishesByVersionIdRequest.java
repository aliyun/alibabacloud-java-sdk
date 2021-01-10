// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindPrepublishesByVersionIdRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public Integer versionId;

    @NameInMap("VersionType")
    public String versionType;

    public static FindPrepublishesByVersionIdRequest build(java.util.Map<String, ?> map) throws Exception {
        FindPrepublishesByVersionIdRequest self = new FindPrepublishesByVersionIdRequest();
        return TeaModel.build(map, self);
    }

    public FindPrepublishesByVersionIdRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindPrepublishesByVersionIdRequest setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

    public FindPrepublishesByVersionIdRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
