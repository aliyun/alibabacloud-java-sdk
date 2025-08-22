// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerRegistryModuleVersionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <strong>example:</strong>
     * <p>1.11.0</p>
     */
    @NameInMap("moduleVersion")
    public String moduleVersion;

    /**
     * <strong>example:</strong>
     * <p>alibaba</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <strong>example:</strong>
     * <p>lJTuhMWkNH89zZWyYM9GjpAbgRb+bPPPwN0Q3pclzKI=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListExplorerRegistryModuleVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerRegistryModuleVersionsRequest self = new ListExplorerRegistryModuleVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListExplorerRegistryModuleVersionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListExplorerRegistryModuleVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExplorerRegistryModuleVersionsRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListExplorerRegistryModuleVersionsRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public ListExplorerRegistryModuleVersionsRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public ListExplorerRegistryModuleVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
