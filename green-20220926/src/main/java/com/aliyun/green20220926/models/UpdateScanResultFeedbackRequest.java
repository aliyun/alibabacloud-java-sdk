// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateScanResultFeedbackRequest extends TeaModel {
    /**
     * <p>Feedback</p>
     * 
     * <strong>example:</strong>
     * <p>missOut</p>
     */
    @NameInMap("Feedback")
    public String feedback;

    /**
     * <p>Labels.</p>
     * 
     * <strong>example:</strong>
     * <p>abuse</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>46232656-984E-****-A648-B1D0667B6C3E</p>
     */
    @NameInMap("QueryRequestId")
    public String queryRequestId;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource Type</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Risk Level</p>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    public static UpdateScanResultFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScanResultFeedbackRequest self = new UpdateScanResultFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScanResultFeedbackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public UpdateScanResultFeedbackRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public UpdateScanResultFeedbackRequest setQueryRequestId(String queryRequestId) {
        this.queryRequestId = queryRequestId;
        return this;
    }
    public String getQueryRequestId() {
        return this.queryRequestId;
    }

    public UpdateScanResultFeedbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateScanResultFeedbackRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateScanResultFeedbackRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

}
