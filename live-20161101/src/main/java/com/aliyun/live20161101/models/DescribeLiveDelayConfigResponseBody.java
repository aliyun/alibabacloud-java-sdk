// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDelayConfigResponseBody extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The duration for which the playback of the live stream is delayed.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DelayTime")
    public String delayTime;

    /**
     * <p>The main streaming domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the live stream.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("Stream")
    public String stream;

    /**
     * <p>The trigger mode. Valid values:</p>
     * <ul>
     * <li><strong>PUBLISH_ONLY</strong>: Stream delay can be triggered only by specifying the stream delay parameter in the ingest URL.</li>
     * <li><strong>CONFIG_ONLY</strong>: Stream delay can be triggered only by the stream delay configuration.</li>
     * <li><strong>PUBLISH_CONFIG</strong>: Stream delay can be triggered by the stream delay parameter in the ingest URL or the stream delay configuration. The stream delay parameter takes precedence over the stream delay configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLISH_ONLY</p>
     */
    @NameInMap("TaskTriggerMode")
    public String taskTriggerMode;

    public static DescribeLiveDelayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDelayConfigResponseBody self = new DescribeLiveDelayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDelayConfigResponseBody setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeLiveDelayConfigResponseBody setDelayTime(String delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public String getDelayTime() {
        return this.delayTime;
    }

    public DescribeLiveDelayConfigResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeLiveDelayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDelayConfigResponseBody setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

    public DescribeLiveDelayConfigResponseBody setTaskTriggerMode(String taskTriggerMode) {
        this.taskTriggerMode = taskTriggerMode;
        return this;
    }
    public String getTaskTriggerMode() {
        return this.taskTriggerMode;
    }

}
