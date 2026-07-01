// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingJobRequest extends TeaModel {
    /**
     * <p>A JSON array that specifies the clips to edit. The job creates the output file by concatenating these clips in the specified order.</p>
     * <p>Each clip includes a start and end time. If live stream parameters are not specified for a clip, the system uses the global <code>LiveStreamConfig</code> settings. The start and end timestamps must be in UTC. For more details, see the Clip data structure below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:01:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:03:00Z\&quot; ,  &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;},  {\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:05:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:09:00Z\&quot; }]</p>
     */
    @NameInMap("Clips")
    public String clips;

    /**
     * <p>The configuration of the source live stream, specified as a JSON object. It includes the following parameters:</p>
     * <ul>
     * <li><p><code>AppName</code>: The name of the application to which the stream belongs.</p>
     * </li>
     * <li><p><code>DomainName</code>: The domain name of the stream.</p>
     * </li>
     * <li><p><code>StreamName</code>: The name of the live stream.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;  }</p>
     */
    @NameInMap("LiveStreamConfig")
    public String liveStreamConfig;

    /**
     * <p>The production configuration for the output file, specified as a JSON object. The <code>Mode</code> parameter specifies the editing mode. Valid values are:</p>
     * <ul>
     * <li><p><strong>AccurateFast</strong> (Default): Fast and precise editing. It offers faster processing compared to the <code>Accurate</code> mode. The output file has the same resolution as the source stream. You cannot specify a custom width and height for the output file.</p>
     * </li>
     * <li><p><strong>Accurate</strong>: Precise editing. This mode lets you specify a custom width and height for the output file.</p>
     * </li>
     * <li><p><strong>Rough</strong>: Rough editing with a precision of a single TS segment. The output file includes all segments between the specified start and end times. You can specify a custom width and height for the output file.</p>
     * </li>
     * <li><p><strong>RoughFast</strong>: Fast rough-cut editing, which is faster than the <code>Accurate</code> mode. It has a precision of a single TS segment, and the output file includes all segments between the specified start and end times. The output file has the same resolution as the source stream. You cannot specify a custom width and height for the output file.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Mode&quot;: &quot;AccurateFast&quot;}</p>
     */
    @NameInMap("MediaProduceConfig")
    public String mediaProduceConfig;

    /**
     * <p>The destination configuration for the output file, specified as a JSON object. You can specify either a URL on OSS or a storage location in a VOD bucket.</p>
     * <ul>
     * <li><p>To output to OSS, the <code>MediaURL</code> parameter is required.</p>
     * </li>
     * <li><p>To output to VOD, the <code>StorageLocation</code> and <code>FileName</code> parameters are required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;MediaURL&quot;: &quot;<a href="https://ice-auto-test.oss-cn-shanghai.aliyuncs.com/testfile.mp4">https://ice-auto-test.oss-cn-shanghai.aliyuncs.com/testfile.mp4</a>&quot; }, or { &quot;StorageLocation&quot;: &quot;bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;FileName&quot;: &quot;output.mp4&quot; }</p>
     */
    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    /**
     * <p>The destination type for the output file. Valid values:</p>
     * <ul>
     * <li><p><code>oss-object</code>: An object in an Alibaba Cloud OSS bucket.</p>
     * </li>
     * <li><p><code>vod-media</code>: A media asset in Alibaba Cloud VOD.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss-object</p>
     */
    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    /**
     * <p>The ID of the live editing project. If you specify this parameter, the system uses the storage settings from the project. If left empty, the system uses the storage settings provided in the request instead.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Custom user data, provided as a JSON object. The maximum length is 512 bytes.</p>
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
