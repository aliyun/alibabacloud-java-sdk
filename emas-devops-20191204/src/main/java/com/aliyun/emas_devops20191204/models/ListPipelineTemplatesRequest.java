// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPipelineTemplatesRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("AppPlatform")
    public Integer appPlatform;

    @NameInMap("PipelineScope")
    public String pipelineScope;

    @NameInMap("PipelineLevel")
    public String pipelineLevel;

    public static ListPipelineTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTemplatesRequest self = new ListPipelineTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineTemplatesRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ListPipelineTemplatesRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public ListPipelineTemplatesRequest setPipelineScope(String pipelineScope) {
        this.pipelineScope = pipelineScope;
        return this;
    }
    public String getPipelineScope() {
        return this.pipelineScope;
    }

    public ListPipelineTemplatesRequest setPipelineLevel(String pipelineLevel) {
        this.pipelineLevel = pipelineLevel;
        return this;
    }
    public String getPipelineLevel() {
        return this.pipelineLevel;
    }

}
