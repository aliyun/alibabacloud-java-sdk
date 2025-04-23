// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetJobConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration content. Configuration format for MultimodalIntelligentTag:</p>
     * <p>{ &quot;apiKey&quot;:&quot;sk-xxxxxxxxxxxxxxxxxxxxx&quot; }</p>
     * <p>MultimodalSemanticIndex</p>
     * <p>{ &quot;defaultModelId&quot;: &quot;xxx&quot; &quot;defaultModelVersion&quot;:&quot;1.0.0&quot; }</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;apiKey&quot;:&quot;sk-xxxxxxxxxxxxxxxxxxxxx&quot; }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li>MultimodalIntelligentTag</li>
     * <li>MultimodalSemanticIndex</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MultimodalIntelligentTag</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The time when the configuration is created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-16T01:44:10Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-lfd60v0p****ujtsdx</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The time when the configuration is modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-26T02:17:18Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D5BFFEE3-6025-443F-8A03-02D619B5C4B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>114243</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDatasetJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetJobConfigResponseBody self = new GetDatasetJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetJobConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetDatasetJobConfigResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetDatasetJobConfigResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetDatasetJobConfigResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public GetDatasetJobConfigResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetDatasetJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetJobConfigResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
