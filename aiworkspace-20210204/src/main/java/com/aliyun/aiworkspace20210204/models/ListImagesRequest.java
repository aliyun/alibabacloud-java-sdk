// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    /**
     * <p>The visibility of the image. Currently only takes effect for custom images.</p>
     * <ul>
     * <li>PUBLIC: Public.</li>
     * <li>PRIVATE: Private.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The image URI.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/pai-compression/nlp:gpu</p>
     */
    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>The label filter conditions. Separate multiple conditions with commas (,).
     * The format of a single filter condition is <code>Key=Value</code>.
     * Valid values of Key:</p>
     * <ul>
     * <li>system.chipType</li>
     * <li>system.dsw.cudaVersion</li>
     * <li>system.dsw.fromImageId</li>
     * <li>system.dsw.fromInstanceId</li>
     * <li>system.dsw.id</li>
     * <li>system.dsw.os</li>
     * <li>system.dsw.osVersion</li>
     * <li>system.dsw.resourceType</li>
     * <li>system.dsw.rootImageId</li>
     * <li>system.dsw.stage</li>
     * <li>system.dsw.tag</li>
     * <li>system.dsw.type</li>
     * <li>system.framework</li>
     * <li>system.origin</li>
     * <li>system.pythonVersion</li>
     * <li>system.source</li>
     * <li>system.supported.dlc</li>
     * <li>system.supported.dsw</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system.framework=XGBoost 1.6.0,system.official=true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The image name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>tensorflow_2.9</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The options. Currently supports ExactMatchName for exact match search on Name.</p>
     * 
     * <strong>example:</strong>
     * <p>ExactMatchName</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The sort order for the specified sort field in a paged query. Used together with SortBy. Default value: ASC.</p>
     * <ul>
     * <li>ASC: Ascending order.</li>
     * <li>DESC: Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the image list. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Fuzzy searches by image name and description.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The sort field for a paged query. Currently, the GmtCreateTime field is used for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Specifies whether to display non-essential information. Non-essential information currently includes Labels. Valid values:</p>
     * <ul>
     * <li>true: Includes non-essential information.</li>
     * <li>false: Does not include non-essential information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>The workspace ID. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>20******55</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListImagesRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public ListImagesRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListImagesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListImagesRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public ListImagesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImagesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListImagesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListImagesRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListImagesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
