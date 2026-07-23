// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceFeiShuDocsParameters extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppSecret")
    public String appSecret;

    @NameInMap("KnowledgeSpaceName")
    public String knowledgeSpaceName;

    @NameInMap("LoadMode")
    public String loadMode;

    public static SourceFeiShuDocsParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceFeiShuDocsParameters self = new SourceFeiShuDocsParameters();
        return TeaModel.build(map, self);
    }

    public SourceFeiShuDocsParameters setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SourceFeiShuDocsParameters setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public SourceFeiShuDocsParameters setKnowledgeSpaceName(String knowledgeSpaceName) {
        this.knowledgeSpaceName = knowledgeSpaceName;
        return this;
    }
    public String getKnowledgeSpaceName() {
        return this.knowledgeSpaceName;
    }

    public SourceFeiShuDocsParameters setLoadMode(String loadMode) {
        this.loadMode = loadMode;
        return this;
    }
    public String getLoadMode() {
        return this.loadMode;
    }

}
