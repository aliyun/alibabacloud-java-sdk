// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetPromptTemplateResponseBody extends TeaModel {
    /**
     * <p>The template content.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The template name.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6e49109bfeb94a39bb268f4e483ccxxx</p>
     */
    @NameInMap("promptTemplateId")
    public String promptTemplateId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8C56C7AF-6573-19CE-B018-E05E1EDCF4C5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The variables of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;theme&quot;]</p>
     */
    @NameInMap("variables")
    public java.util.List<String> variables;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-us9hjmt32nysdxxx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static GetPromptTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPromptTemplateResponseBody self = new GetPromptTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPromptTemplateResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetPromptTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetPromptTemplateResponseBody setPromptTemplateId(String promptTemplateId) {
        this.promptTemplateId = promptTemplateId;
        return this;
    }
    public String getPromptTemplateId() {
        return this.promptTemplateId;
    }

    public GetPromptTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPromptTemplateResponseBody setVariables(java.util.List<String> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<String> getVariables() {
        return this.variables;
    }

    public GetPromptTemplateResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
