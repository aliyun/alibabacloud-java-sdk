// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDIJobRequest extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> This field is deprecated. Use the Id field instead.</p>
     * 
     * <strong>example:</strong>
     * <p>11588</p>
     */
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11588</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The DataWorks workspace ID. You can call the ListProjects operation to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Specifies whether to return detailed configuration information, which includes TransformationRules, TableMappings, and JobSettings. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithDetails")
    public Boolean withDetails;

    public static GetDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobRequest self = new GetDIJobRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public GetDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public GetDIJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDIJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDIJobRequest setWithDetails(Boolean withDetails) {
        this.withDetails = withDetails;
        return this;
    }
    public Boolean getWithDetails() {
        return this.withDetails;
    }

}
