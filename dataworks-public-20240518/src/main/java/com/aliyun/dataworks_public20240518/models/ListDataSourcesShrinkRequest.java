// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataSourcesShrinkRequest extends TeaModel {
    /**
     * <p>The environment in which the data sources are used. Valid values:</p>
     * <ul>
     * <li>Dev: development environment</li>
     * <li>Prod: production environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The name of the data source. Fuzzy match by data source name is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The order in which you want to sort the data sources. Valid values:</p>
     * <ul>
     * <li>Desc: descending order</li>
     * <li>Asc: ascending order</li>
     * </ul>
     * <p>Default value: Asc</p>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17820</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The field that you want to use to sort the data sources. Valid values:</p>
     * <ul>
     * <li>CreateTime</li>
     * <li>Id</li>
     * <li>Name</li>
     * </ul>
     * <p>Default value: Id</p>
     * 
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The tag of the data source. This parameter specifies a filter condition.</p>
     * <ul>
     * <li>You can specify multiple tags, which are in the logical AND relation. For example, you can query the data sources that contain the following tags: <code>[&quot;tag1&quot;, &quot;tag2&quot;, &quot;tag3&quot;]</code>.</li>
     * <li>If you do not configure this parameter, tag-based filtering is not performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;tag1&quot;, &quot;tag2&quot;, &quot;tag3&quot;]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The data source types. This parameter specifies a filter condition. You can specify multiple data source types.</p>
     */
    @NameInMap("Types")
    public String typesShrink;

    public static ListDataSourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesShrinkRequest self = new ListDataSourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListDataSourcesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDataSourcesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDataSourcesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSourcesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourcesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataSourcesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDataSourcesShrinkRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ListDataSourcesShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

}
