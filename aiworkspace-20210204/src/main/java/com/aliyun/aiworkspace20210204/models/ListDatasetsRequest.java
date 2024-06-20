// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceTypes")
    public String dataSourceTypes;

    /**
     * <strong>example:</strong>
     * <p>COMMON,TEXT</p>
     */
    @NameInMap("DataTypes")
    public String dataTypes;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("Properties")
    public String properties;

    @NameInMap("Provider")
    public String provider;

    /**
     * <strong>example:</strong>
     * <p>d-rbvg5wzljzjhc9ks92</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <strong>example:</strong>
     * <p>USER,ITAG</p>
     */
    @NameInMap("SourceTypes")
    public String sourceTypes;

    /**
     * <strong>example:</strong>
     * <p>324**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsRequest self = new ListDatasetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetsRequest setDataSourceTypes(String dataSourceTypes) {
        this.dataSourceTypes = dataSourceTypes;
        return this;
    }
    public String getDataSourceTypes() {
        return this.dataSourceTypes;
    }

    public ListDatasetsRequest setDataTypes(String dataTypes) {
        this.dataTypes = dataTypes;
        return this;
    }
    public String getDataTypes() {
        return this.dataTypes;
    }

    public ListDatasetsRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ListDatasetsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDatasetsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDatasetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetsRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public ListDatasetsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListDatasetsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ListDatasetsRequest setSourceTypes(String sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public String getSourceTypes() {
        return this.sourceTypes;
    }

    public ListDatasetsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
