// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDatasetShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("AccessLevel")
    public String accessLevel;

    /**
     * <p>The dataset search configuration.</p>
     */
    @NameInMap("DatasetConfig")
    public String datasetConfigShrink;

    /**
     * <p>The description of the dataset. This is the display name in the console. Use a human-readable name.</p>
     * 
     * <strong>example:</strong>
     * <p>企业知识库</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <p>The name of the dataset. The name must be globally unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>businessDataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The type of the dataset. Valid values:</p>
     * <ul>
     * <li><p>CustomSemanticSearch: A custom semantic index. This is the default value. Upload documents to build the dataset.</p>
     * </li>
     * <li><p>ThirdSearch: A third-party search source (API). Configure your own search API.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CustomSemanticSearch</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    /**
     * <p>Dataset index configuration.</p>
     */
    @NameInMap("DocumentHandleConfig")
    public String documentHandleConfigShrink;

    /**
     * <p>The invocation method. Currently, only portal is supported, which indicates an invocation from the console.</p>
     * <ul>
     * <li><p>If left empty: When DatasetType is ThirdSearch, datasetConfig.SearchSourceConfigs (third-party API definition) is required.</p>
     * </li>
     * <li><p>If set to portal: When DatasetType is ThirdSearch, the system initializes a SearchSourceConfigs (third-party API demo) example by default for your reference.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>portal</p>
     */
    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <p>The dataset search switch. Valid values:</p>
     * <ul>
     * <li><p>0: Disabled for all.</p>
     * </li>
     * <li><p>1: Visible only to Miao Search.</p>
     * </li>
     * <li><p>2: Visible only to Miao Bi.</p>
     * </li>
     * <li><p>3: Visible to both Miao Search and Miao Bi. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SearchDatasetEnable")
    public Integer searchDatasetEnable;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Obtain a workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetShrinkRequest self = new CreateDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetShrinkRequest setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public String getAccessLevel() {
        return this.accessLevel;
    }

    public CreateDatasetShrinkRequest setDatasetConfigShrink(String datasetConfigShrink) {
        this.datasetConfigShrink = datasetConfigShrink;
        return this;
    }
    public String getDatasetConfigShrink() {
        return this.datasetConfigShrink;
    }

    public CreateDatasetShrinkRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public CreateDatasetShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateDatasetShrinkRequest setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public CreateDatasetShrinkRequest setDocumentHandleConfigShrink(String documentHandleConfigShrink) {
        this.documentHandleConfigShrink = documentHandleConfigShrink;
        return this;
    }
    public String getDocumentHandleConfigShrink() {
        return this.documentHandleConfigShrink;
    }

    public CreateDatasetShrinkRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public CreateDatasetShrinkRequest setSearchDatasetEnable(Integer searchDatasetEnable) {
        this.searchDatasetEnable = searchDatasetEnable;
        return this;
    }
    public Integer getSearchDatasetEnable() {
        return this.searchDatasetEnable;
    }

    public CreateDatasetShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
