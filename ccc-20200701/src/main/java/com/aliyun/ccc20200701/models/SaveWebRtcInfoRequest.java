// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveWebRtcInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e13c9740-1e37-123b-21b6-00163e352f9</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;media_source&quot;:{},&quot;remote_inbound_rtp&quot;:{},&quot;outbound_rtp&quot;:{},&quot;inbound_rtp&quot;:{},&quot;remote_outbound_rtp&quot;:{},&quot;candidate&quot;:{},&quot;basic&quot;:{&quot;callId&quot;:&quot;e13c9740-1e37-123b-21b6-00163e352f9&quot;,&quot;timestamp&quot;:&quot;1647262108395&quot;,&quot;callStartTime&quot;:&quot;1647262108393&quot;,&quot;uid&quot;:&quot;user-test&quot;,&quot;access_point&quot;:&quot;shanghai&quot;,&quot;browser&quot;:&quot;90&quot;,&quot;ip&quot;:&quot;127.0.0.1&quot;}}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-b8b0ca63-330c-4e65-8ae3-9de2c7ce7683</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static SaveWebRtcInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWebRtcInfoRequest self = new SaveWebRtcInfoRequest();
        return TeaModel.build(map, self);
    }

    public SaveWebRtcInfoRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SaveWebRtcInfoRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveWebRtcInfoRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SaveWebRtcInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveWebRtcInfoRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
