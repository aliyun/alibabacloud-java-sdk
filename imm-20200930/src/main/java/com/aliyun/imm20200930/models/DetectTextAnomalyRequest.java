// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectTextAnomalyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static DetectTextAnomalyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectTextAnomalyRequest self = new DetectTextAnomalyRequest();
        return TeaModel.build(map, self);
    }

    public DetectTextAnomalyRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DetectTextAnomalyRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
