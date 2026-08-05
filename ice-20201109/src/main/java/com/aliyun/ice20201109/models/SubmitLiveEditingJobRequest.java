// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingJobRequest extends TeaModel {
    /**
     * <p>The list of clip segments. The output is produced by concatenating the segments in the list in order. JSON Array.</p>
     * <p>Each segment contains a start time and an end time. If no live stream parameters are specified, the outer-level live stream configuration is used. Both start and end timestamps are in UTC. For parameter details, see the Clip data structure below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:01:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:03:00Z\&quot; ,  &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;},  {\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:05:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:09:00Z\&quot; }]</p>
     */
    @NameInMap("Clips")
    public String clips;

    /**
     * <p>The live stream configuration. JSON Object. The following configuration items are required:</p>
     * <ul>
     * <li><p>AppName: the name of the application to which the stream belongs. </p>
     * </li>
     * <li><p>DomainName: the domain name.</p>
     * </li>
     * <li><p>StreamName: the name of the live stream.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;  }</p>
     */
    @NameInMap("LiveStreamConfig")
    public String liveStreamConfig;

    /**
     * <p>The composition configuration for generating segments, in JSON format. Mode specifies the editing mode. Valid values:</p>
     * <ul>
     * <li><strong>AccurateFast</strong> (default): fast accurate editing. This mode is faster than the Accurate mode. The output file resolution is the same as the source stream resolution. Custom output width and height are not supported.</li>
     * <li><strong>Accurate</strong>: accurate editing. You can specify the output width and height.</li>
     * <li><strong>Rough</strong>: rough editing. The minimum precision is one TS segment. The output contains all segments within the specified start and end time. You can specify the output width and height.</li>
     * <li><strong>RoughFast</strong>: fast rough editing. This mode is faster than the Accurate mode. The minimum precision is one TS segment. The output contains all segments within the specified start and end time. The output file resolution is the same as the source stream resolution. Custom output width and height are not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Mode&quot;: &quot;AccurateFast&quot;}</p>
     */
    @NameInMap("MediaProduceConfig")
    public String mediaProduceConfig;

    /**
     * <p>The destination configuration for the output. JSON Object. You can specify the URL of the output on OSS or the storage location in a VOD bucket.</p>
     * <ul>
     * <li>When outputting to OSS, the MediaURL of the output destination is required.</li>
     * <li>When outputting to VOD, the StorageLocation and FileName parameters are required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;MediaURL&quot;: &quot;<a href="https://ice-auto-test.oss-cn-shanghai.aliyuncs.com/testfile.mp4">https://ice-auto-test.oss-cn-shanghai.aliyuncs.com/testfile.mp4</a>&quot; }, or { &quot;StorageLocation&quot;: &quot;bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;FileName&quot;: &quot;output.mp4&quot; }</p>
     */
    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    /**
     * <p>The target type of the output. Valid values:</p>
     * <ul>
     * <li>oss-object: an OSS object in an Alibaba Cloud OSS bucket.</li>
     * <li>vod-media: a media asset in Alibaba Cloud VOD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss-object</p>
     */
    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    /**
     * <p>The ID of the live editing project. If this parameter is not empty, the storage configuration associated with the project is used. If this parameter is empty, the storage configuration specified in the request parameters is used.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The custom settings. JSON Object. Maximum length: 512 bytes.</p>
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
