// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListBindingsRequest extends TeaModel {
    /**
     * <p>The dataset name. For information about how to obtain the dataset name, see <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <ul>
     * <li>The maximum number of bindings to return. Valid values: 0 to 200.</li>
     * <li>If this parameter is not set or is set to 0, the default value 100 is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The name of the binding task.</p>
     * 
     * <strong>example:</strong>
     * <p>imm</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <ul>
     * <li>The pagination token that is used when the total number of bindings exceeds the MaxResults value.</li>
     * <li>Binding information is returned in alphabetical order starting from the NextToken value.</li>
     * <li>Leave this parameter empty for the first request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>immtest:dataset001:examplebucket01</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static ListBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBindingsRequest self = new ListBindingsRequest();
        return TeaModel.build(map, self);
    }

    public ListBindingsRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ListBindingsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListBindingsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListBindingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBindingsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
