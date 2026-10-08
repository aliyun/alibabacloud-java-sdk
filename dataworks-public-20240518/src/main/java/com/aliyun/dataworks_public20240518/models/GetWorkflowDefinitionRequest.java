// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>The ID of the workflow.</p>
     * <blockquote>
     * <p>This field is of type Long in SDK versions earlier than 8.0.0 and String in SDK version 8.0.0 and later. This change does not affect normal SDK usage; the parameter is still returned according to the type defined in the SDK. Upgrading the SDK across version 8.0.0 may cause compilation failures due to the type change. In this case, manually update the data type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>860438872620****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether the query result includes the script content of internal nodes in the workflow definition. For nodes with large content, this may cause high network transmission latency.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeScriptContent")
    public Boolean includeScriptContent;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to query the ID.</p>
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
