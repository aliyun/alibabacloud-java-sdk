// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectTextAnomalyRequest extends TeaModel {
    /**
     * <p>The text to be detected. It can contain up to 10,000 characters (including punctuation marks). Only Chinese text can be detected.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
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
