// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateIndividuationProjectRequest extends TeaModel {
    @NameInMap("projectInfo")
    public String projectInfo;

    /**
     * <strong>example:</strong>
     * <p>avatar-1</p>
     */
    @NameInMap("projectName")
    public String projectName;

    @NameInMap("purpose")
    public String purpose;

    /**
     * <strong>example:</strong>
     * <p>ail003</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    public static CreateIndividuationProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndividuationProjectRequest self = new CreateIndividuationProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndividuationProjectRequest setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
        return this;
    }
    public String getProjectInfo() {
        return this.projectInfo;
    }

    public CreateIndividuationProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateIndividuationProjectRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public CreateIndividuationProjectRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
