// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceFeiShuDocsParameters extends TeaModel {
    /**
     * <p>The App ID of the custom Lark application. Obtain this value after creating an application on the Lark Open Platform.</p>
     * 
     * <strong>example:</strong>
     * <p>cli_a946c046xxxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The App Secret of the custom Lark application. Obtain this value after creating an application on the Lark Open Platform.</p>
     * 
     * <strong>example:</strong>
     * <p>yO3hEYiSjkBVxxxx</p>
     */
    @NameInMap("AppSecret")
    public String appSecret;

    /**
     * <p>The name of the Lark knowledge space. An exact match is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Product Documentation Center</p>
     */
    @NameInMap("KnowledgeSpaceName")
    public String knowledgeSpaceName;

    /**
     * <p>The document loading mode. Valid values: block: splits the document by blocks, with each block as a separate event. single (default): treats the entire document as a single event, with metadata extension keys such as file name, modification time, and original link. Use this mode when importing into an EventHouse knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
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
