// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CommandPublicModelEngineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    public static CommandPublicModelEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        CommandPublicModelEngineRequest self = new CommandPublicModelEngineRequest();
        return TeaModel.build(map, self);
    }

    public CommandPublicModelEngineRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CommandPublicModelEngineRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
