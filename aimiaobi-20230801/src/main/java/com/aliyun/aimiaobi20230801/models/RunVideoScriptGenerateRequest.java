// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunVideoScriptGenerateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <blockquote>
     * <p>=300</p>
     * </blockquote>
     */
    @NameInMap("ScriptLength")
    public String scriptLength;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScriptNumber")
    public Integer scriptNumber;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseSearch")
    public Boolean useSearch;

    /**
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
