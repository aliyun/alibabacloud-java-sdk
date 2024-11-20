// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingJobRequest extends TeaModel {
    /**
     * <p>The clips in the JSON array format. The output video is created by merging these clips sequentially.</p>
     * <p>Each clip has a start time and an end time. If no live stream parameters are specified, the outer live stream configurations apply. The start and end timestamps are in UTC. For more information about the parameters, see the &quot;Clip&quot; section of this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:01:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:03:00Z\&quot; ,  &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;},  {\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:05:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:09:00Z\&quot; }]</p>
     */
    @NameInMap("Clips")
    public String clips;

    /**
     * <p>The live stream configurations, in the JSON format. The configurations must include the following parameters:</p>
     * <ul>
     * <li>AppName: the name of the application to which the live stream belongs.</li>
     * <li>DomainName: the domain name of the application.</li>
     * <li>StreamName: the name of the live stream.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;  }</p>
     */
    @NameInMap("LiveStreamConfig")
    public String liveStreamConfig;

    /**
     * <p>The production configurations, in the JSON format. Mode specifies the editing mode. Valid values:</p>
     * <ul>
     * <li><strong>AccurateFast</strong> (default): fast editing. It is faster than the Accurate mode. The resolution of the output file is the same as that of the source stream. You cannot specify the width and height of the output file.</li>
     * <li><strong>Accurate</strong>: accurate editing. In this mode, you can specify the width and height of the output file.</li>
     * <li><strong>Rough</strong>: rough editing. The minimum precision is one TS segment. The output file comprises all segments within the specified time range. You can specify the width and height of the output file.</li>
     * <li><strong>RoughFast</strong>: fast rough editing. It is faster than the Accurate mode. The minimum precision is one TS segment. The output file comprises all segments within the specified time range. The resolution of the output file is the same as that of the source stream. You cannot specify the width and height of the output file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Mode&quot;: &quot;AccurateFast&quot;}</p>
     */
    @NameInMap("MediaProduceConfig")
    public String mediaProduceConfig;

    /**
     * <p>The configurations of the output file, in the JSON format. You can specify an OSS URL or a storage location in a storage bucket of ApsaraVideo VOD.</p>
     * <ul>
     * <li>To store the output file in OSS, you must specify MediaURL.</li>
     * <li>To store the output file in ApsaraVideo VOD, you must specify StorageLocation and FileName.</li>
     * </ul>
     */
    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    /**
     * <p>The type of the output file. Valid values:</p>
     * <ul>
     * <li>oss-object: OSS object in an OSS bucket.</li>
     * <li>vod-media: media asset in Alibaba Cloud VOD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss-object</p>
     */
    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    /**
     * <p>The ID of the live editing project. If this parameter is specified, the system reads the storage configurations of the project. If this parameter is not specified, the specified storage configurations take precedence.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitLiveEditingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveEditingJobRequest self = new SubmitLiveEditingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLiveEditingJobRequest setClips(String clips) {
        this.clips = clips;
        return this;
    }
    public String getClips() {
        return this.clips;
    }

    public SubmitLiveEditingJobRequest setLiveStreamConfig(String liveStreamConfig) {
        this.liveStreamConfig = liveStreamConfig;
        return this;
    }
    public String getLiveStreamConfig() {
        return this.liveStreamConfig;
    }

    public SubmitLiveEditingJobRequest setMediaProduceConfig(String mediaProduceConfig) {
        this.mediaProduceConfig = mediaProduceConfig;
        return this;
    }
    public String getMediaProduceConfig() {
        return this.mediaProduceConfig;
    }

    public SubmitLiveEditingJobRequest setOutputMediaConfig(String outputMediaConfig) {
        this.outputMediaConfig = outputMediaConfig;
        return this;
    }
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    public SubmitLiveEditingJobRequest setOutputMediaTarget(String outputMediaTarget) {
        this.outputMediaTarget = outputMediaTarget;
        return this;
    }
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    public SubmitLiveEditingJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitLiveEditingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
