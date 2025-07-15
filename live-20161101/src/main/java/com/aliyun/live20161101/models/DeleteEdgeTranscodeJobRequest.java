// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteEdgeTranscodeJobRequest extends TeaModel {
    /**
     * <p>The ID of the data center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3b-4d18-395c-8106-ff21a6</strong></strong></strong></p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the edge transcoding task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEdgeTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeTranscodeJobRequest self = new DeleteEdgeTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeTranscodeJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteEdgeTranscodeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DeleteEdgeTranscodeJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteEdgeTranscodeJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
