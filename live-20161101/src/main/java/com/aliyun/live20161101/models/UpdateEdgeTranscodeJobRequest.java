// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateEdgeTranscodeJobRequest extends TeaModel {
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

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>task1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The URL of the input stream.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://mydomain/app/stream1</p>
     */
    @NameInMap("StreamInput")
    public String streamInput;

    /**
     * <p>The URL of the output stream.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://testdomain/app/stream2</p>
     */
    @NameInMap("StreamOutput")
    public String streamOutput;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateEdgeTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeTranscodeJobRequest self = new UpdateEdgeTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeTranscodeJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateEdgeTranscodeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateEdgeTranscodeJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEdgeTranscodeJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateEdgeTranscodeJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateEdgeTranscodeJobRequest setStreamInput(String streamInput) {
        this.streamInput = streamInput;
        return this;
    }
    public String getStreamInput() {
        return this.streamInput;
    }

    public UpdateEdgeTranscodeJobRequest setStreamOutput(String streamOutput) {
        this.streamOutput = streamOutput;
        return this;
    }
    public String getStreamOutput() {
        return this.streamOutput;
    }

    public UpdateEdgeTranscodeJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
