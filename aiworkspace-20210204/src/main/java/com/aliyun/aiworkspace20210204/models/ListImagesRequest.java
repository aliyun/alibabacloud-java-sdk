// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    /**
     * <p>The visibility of the image. This parameter is valid only for custom images.</p>
     * <ul>
     * <li><p>PUBLIC: The image is public.</p>
     * </li>
     * <li><p>PRIVATE: The image is private.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("ImageUri")
    public String imageUri;

    /**
     * <p>The filter conditions for labels. Separate multiple conditions with commas (,).
     * The format for a single filter condition is <code>Key=Value</code>.
     * The supported values for Key are:</p>
     * <ul>
     * <li><p>system.chipType</p>
     * </li>
     * <li><p>system.dsw\.cudaVersion</p>
     * </li>
     * <li><p>system.dsw\.fromImageId</p>
     * </li>
     * <li><p>system.dsw\.fromInstanceId</p>
     * </li>
     * <li><p>system.dsw\.id</p>
     * </li>
     * <li><p>system.dsw\.os</p>
     * </li>
     * <li><p>system.dsw\.osVersion</p>
     * </li>
     * <li><p>system.dsw\.resourceType</p>
     * </li>
     * <li><p>system.dsw\.rootImageId</p>
     * </li>
     * <li><p>system.dsw\.stage</p>
     * </li>
     * <li><p>system.dsw\.tag</p>
     * </li>
     * <li><p>system.dsw\.type</p>
     * </li>
     * <li><p>system.framework</p>
     * </li>
     * <li><p>system.origin</p>
     * </li>
     * <li><p>system.pythonVersion</p>
     * </li>
     * <li><p>system.source</p>
     * </li>
     * <li><p>system.supported.dlc</p>
     * </li>
     * <li><p>system.supported.dsw</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system.framework=XGBoost 1.6.0,system.official=true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The name of the image. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>tensorflow_2.9</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The order in which to sort the results of a paged query. This parameter is used with SortBy. The default value is ASC.</p>
     * <ul>
     * <li><p>ASC: ascending order.</p>
     * </li>
     * <li><p>DESC: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the image list. The value starts from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Performs a fuzzy search by image name and description.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The field to use for sorting in a paged query. Currently, only the GmtCreateTime field is used for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Specifies whether to display non-essential information. Non-essential information currently includes Labels. Valid values:</p>
     * <ul>
     * <li><p>true: Includes non-essential information.</p>
     * </li>
     * <li><p>false: Does not include non-essential information.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>The workspace ID. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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
