// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunVideoScriptGenerateRequest extends TeaModel {
    /**
     * <p>The language of the generated script.
     * Recommended values:</p>
     * <p>zh-CN: Chinese</p>
     * <p>en-US: English</p>
     * <p>The default is Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The prompt for the video script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>写一篇关于黄山旅游的脚本</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The length of the script. Valid values:</p>
     * <p>20\~75: 10 to 15 seconds of normal speaking time.</p>
     * <p>75\~150: 15 to 30 seconds of normal speaking time.</p>
     * <p>150\~300: Approximately 30 to 60 seconds of normal speaking time.</p>
     * <p>\&gt;=300: 60 seconds or more of normal speaking time.</p>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * <p>=300</p>
     * </blockquote>
     */
    @NameInMap("ScriptLength")
    public String scriptLength;

    /**
     * <p>The number of scripts to generate. The default is 1. You can generate a maximum of three scripts at a time.
     * If you specify multiple scripts, the results are returned in parallel streams. The client distinguishes between the streams using different session IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScriptNumber")
    public Integer scriptNumber;

    /**
     * <p>Specifies whether to use an internet search. If you set this to true, the system performs intention recognition and then searches the internet for relevant reference materials.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseSearch")
    public Boolean useSearch;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunVideoScriptGenerateRequest build(java.util.Map<String, ?> map) throws Exception {
        RunVideoScriptGenerateRequest self = new RunVideoScriptGenerateRequest();
        return TeaModel.build(map, self);
    }

    public RunVideoScriptGenerateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RunVideoScriptGenerateRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunVideoScriptGenerateRequest setScriptLength(String scriptLength) {
        this.scriptLength = scriptLength;
        return this;
    }
    public String getScriptLength() {
        return this.scriptLength;
    }

    public RunVideoScriptGenerateRequest setScriptNumber(Integer scriptNumber) {
        this.scriptNumber = scriptNumber;
        return this;
    }
    public Integer getScriptNumber() {
        return this.scriptNumber;
    }

    public RunVideoScriptGenerateRequest setUseSearch(Boolean useSearch) {
        this.useSearch = useSearch;
        return this;
    }
    public Boolean getUseSearch() {
        return this.useSearch;
    }

    public RunVideoScriptGenerateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
