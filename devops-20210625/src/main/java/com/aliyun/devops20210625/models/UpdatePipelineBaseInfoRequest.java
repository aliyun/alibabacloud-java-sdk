// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePipelineBaseInfoRequest extends TeaModel {
    @NameInMap("envId")
    public Long envId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    @NameInMap("tagList")
    public String tagList;

    public static UpdatePipelineBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineBaseInfoRequest self = new UpdatePipelineBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineBaseInfoRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public UpdatePipelineBaseInfoRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public UpdatePipelineBaseInfoRequest setTagList(String tagList) {
        this.tagList = tagList;
        return this;
    }
    public String getTagList() {
        return this.tagList;
    }

}
