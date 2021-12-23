// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDetectVideoLabelsTaskRequest extends TeaModel {
    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // SourceURI
    @NameInMap("SourceURI")
    public String sourceURI;

    // UserData
    @NameInMap("UserData")
    public String userData;

    public static CreateDetectVideoLabelsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectVideoLabelsTaskRequest self = new CreateDetectVideoLabelsTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDetectVideoLabelsTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateDetectVideoLabelsTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateDetectVideoLabelsTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
