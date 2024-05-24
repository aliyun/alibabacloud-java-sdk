// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ManualEventPayload extends TeaModel {
    @NameInMap("branch")
    public String branch;

    @NameInMap("commitID")
    public String commitID;

    @NameInMap("tag")
    public String tag;

    @NameInMap("templateConfig")
    public TemplateConfig templateConfig;

    public static ManualEventPayload build(java.util.Map<String, ?> map) throws Exception {
        ManualEventPayload self = new ManualEventPayload();
        return TeaModel.build(map, self);
    }

    public ManualEventPayload setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public ManualEventPayload setCommitID(String commitID) {
        this.commitID = commitID;
        return this;
    }
    public String getCommitID() {
        return this.commitID;
    }

    public ManualEventPayload setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ManualEventPayload setTemplateConfig(TemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public TemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

}
