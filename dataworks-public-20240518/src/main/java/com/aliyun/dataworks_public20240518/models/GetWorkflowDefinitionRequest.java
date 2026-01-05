// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>The ID of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>查询结果是否包含工作流内部节点的脚本内容（对于内容较多的节点，可能存在较长的网络传输延时）。</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeScriptContent")
    public Boolean includeScriptContent;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetWorkflowDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDefinitionRequest self = new GetWorkflowDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDefinitionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetWorkflowDefinitionRequest setIncludeScriptContent(Boolean includeScriptContent) {
        this.includeScriptContent = includeScriptContent;
        return this;
    }
    public Boolean getIncludeScriptContent() {
        return this.includeScriptContent;
    }

    public GetWorkflowDefinitionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
