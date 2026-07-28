// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerRegistryModuleExamplesRequest extends TeaModel {
    /**
     * <p>The example name of the module.</p>
     * 
     * <strong>example:</strong>
     * <p>complete</p>
     */
    @NameInMap("exampleName")
    public String exampleName;

    /**
     * <p>The search keyword. Supports fuzzy match based on the module name or module example name.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 0 to 200.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The name of the module.</p>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <p>The version of the module.</p>
     * 
     * <strong>example:</strong>
     * <p>1.11.0</p>
     */
    @NameInMap("moduleVersion")
    public String moduleVersion;

    /**
     * <p>The name of the workspace to which the module belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <p>The pagination token for the next page of results.</p>
     * <p>If the total number of entries exceeds the maxResults limit, the data is truncated. You can use nextToken to query the next page of data.</p>
     * 
     * <strong>example:</strong>
     * <p>IbuvZbAXFOiB4nKg8iOH447bhHWDavGTOMijI2Jep7c=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListExplorerRegistryModuleExamplesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerRegistryModuleExamplesRequest self = new ListExplorerRegistryModuleExamplesRequest();
        return TeaModel.build(map, self);
    }

    public ListExplorerRegistryModuleExamplesRequest setExampleName(String exampleName) {
        this.exampleName = exampleName;
        return this;
    }
    public String getExampleName() {
        return this.exampleName;
    }

    public ListExplorerRegistryModuleExamplesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListExplorerRegistryModuleExamplesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExplorerRegistryModuleExamplesRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListExplorerRegistryModuleExamplesRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public ListExplorerRegistryModuleExamplesRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public ListExplorerRegistryModuleExamplesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
