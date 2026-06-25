// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListModelVersionsRequest extends TeaModel {
    /**
     * <p>The approval status. This parameter is used to filter the model version list. Valid values:</p>
     * <ul>
     * <li><p>Pending: The model version is pending approval.</p>
     * </li>
     * <li><p>Approved: The model version is approved for publishing.</p>
     * </li>
     * <li><p>Rejected: The model version is rejected for publishing.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    /**
     * <p>The model format. This parameter is used to filter the model version list. Valid values:</p>
     * <ul>
     * <li><p>OfflineModel</p>
     * </li>
     * <li><p>SavedModel</p>
     * </li>
     * <li><p>Keras H5</p>
     * </li>
     * <li><p>Frozen Pb</p>
     * </li>
     * <li><p>Caffe Prototxt</p>
     * </li>
     * <li><p>TorchScript</p>
     * </li>
     * <li><p>XGBoost</p>
     * </li>
     * <li><p>PMML</p>
     * </li>
     * <li><p>AlinkModel</p>
     * </li>
     * <li><p>ONNX</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SavedModel</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The model framework. This parameter is used to filter the model version list. Valid values:</p>
     * <ul>
     * <li><p>Pytorch
     * -XGBoost</p>
     * </li>
     * <li><p>Keras</p>
     * </li>
     * <li><p>Caffe</p>
     * </li>
     * <li><p>Alink</p>
     * </li>
     * <li><p>Xflow</p>
     * </li>
     * <li><p>TensorFlow</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TensorFlow</p>
     */
    @NameInMap("FrameworkType")
    public String frameworkType;

    /**
     * <p>The label string. This parameter is used to filter the list. Model versions that have the specified string in the key or value of their labels are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The order in which to sort the entries in the paged query. The default value is ASC.</p>
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
     * <p>The page number of the model version list. The value starts from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field to use for sorting in the paged query. Currently, the GmtCreateTime field is used for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li><p>If the source type is Custom, this parameter is not restricted.</p>
     * </li>
     * <li><p>If the source is PAIFlow or TrainingService, the format is as follows:</p>
     * </li>
     * </ul>
     * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
     * </code></pre>
     * <p>where:</p>
     * <ul>
     * <li><p>region is the Alibaba Cloud region ID.</p>
     * </li>
     * <li><p>workspaceId is the workspace ID.</p>
     * </li>
     * <li><p>kind: the type. Valid values: PipelineRun (PAIFlow pipeline) and ServiceJob (training service).</p>
     * </li>
     * <li><p>id: the unique identifier.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>region=cn-shanghai,workspaceId=13**,kind=PipelineRun,id=run-sakdb****jdf</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type of the model. This parameter is used to filter the model version list. Valid values:</p>
     * <ul>
     * <li><p>Custom (default): a custom model.</p>
     * </li>
     * <li><p>PAIFlow: a model from a PAI pipeline.</p>
     * </li>
     * <li><p>TrainingService: a model from a PAI training service.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAIFlow</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The model version name. This parameter is used to filter the model version list.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static ListModelVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelVersionsRequest self = new ListModelVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelVersionsRequest setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public ListModelVersionsRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public ListModelVersionsRequest setFrameworkType(String frameworkType) {
        this.frameworkType = frameworkType;
        return this;
    }
    public String getFrameworkType() {
        return this.frameworkType;
    }

    public ListModelVersionsRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ListModelVersionsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelVersionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListModelVersionsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ListModelVersionsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListModelVersionsRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
