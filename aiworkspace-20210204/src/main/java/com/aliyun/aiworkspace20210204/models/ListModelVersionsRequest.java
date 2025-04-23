// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListModelVersionsRequest extends TeaModel {
    /**
     * <p>The approval status based on which the model versions are queried. Valid values:</p>
     * <ul>
     * <li>Pending</li>
     * <li>Approved</li>
     * <li>Rejected</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    /**
     * <p>The model format used to filter model versions. Valid values:</p>
     * <ul>
     * <li>OfflineModel</li>
     * <li>SavedModel</li>
     * <li>Keras H5</li>
     * <li>Frozen Pb</li>
     * <li>Caffe Prototxt</li>
     * <li>TorchScript</li>
     * <li>XGBoost</li>
     * <li>PMML</li>
     * <li>AlinkModel</li>
     * <li>ONNX</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SavedModel</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The framework used to filter model versions.</p>
     * <ul>
     * <li>Pytorch -XGBoost</li>
     * <li>Keras</li>
     * <li>Caffe</li>
     * <li>Alink</li>
     * <li>Xflow</li>
     * <li>TensorFlow</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TensorFlow</p>
     */
    @NameInMap("FrameworkType")
    public String frameworkType;

    /**
     * <p>The label. Model versions whose label key or label value contains a specific label are filtered.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The order in which the entries are sorted by the specific field on the returned page. Default value: ASC.</p>
     * <ul>
     * <li>ASC</li>
     * <li>DESC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field used to sort the results. The GmtCreateTime field is used for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li>If the source type is Custom, this field is not limited.</li>
     * <li>If the source type is PAIFlow or TrainingService, the format is:</li>
     * </ul>
     * <!---->
     * 
     * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
     * </code></pre>
     * <p>Take note of the following parameters:</p>
     * <ul>
     * <li>region is the region ID.</li>
     * <li>workspaceId is the ID of the workspace.</li>
     * <li>kind is the type. Valid values: PipelineRun (PAIFlow) and ServiceJob (training service).</li>
     * <li>id is a unique identifier.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>region=cn-shanghai,workspaceId=13**,kind=PipelineRun,id=run-sakdb****jdf</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type used to filter model versions. Valid values:</p>
     * <ul>
     * <li>Custom (default)</li>
     * <li>PAIFlow</li>
     * <li>TrainingService</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAIFlow</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The model version used to filter model versions.</p>
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
