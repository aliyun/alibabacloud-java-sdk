// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryModuleVersionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-rds</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>terraform-alicloud-modules</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <strong>example:</strong>
     * <p>TRkuCaTw/VsEHrnCZgrBA0ftQSEJU/lzo2ei7MJjplg=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListRegistryModuleVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegistryModuleVersionsRequest self = new ListRegistryModuleVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRegistryModuleVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRegistryModuleVersionsRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListRegistryModuleVersionsRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public ListRegistryModuleVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
