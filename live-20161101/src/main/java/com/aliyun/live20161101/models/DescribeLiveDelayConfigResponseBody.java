// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDelayConfigResponseBody extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The playback latency of the stream.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DelayTime")
    public String delayTime;

    /**
     * <p>The streaming domain.</p>
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
     * <p>The stream name.</p>
     * 
     * <strong>example:</strong>
     * <p>liveStream****</p>
     */
    @NameInMap("Stream")
    public String stream;

    /**
     * <p>The trigger mode for the task. Valid values:</p>
     * <ul>
     * <li><strong>PUBLISH_ONLY</strong>: The task is triggered only when stream ingest parameters for delayed playback are specified.</li>
     * <li><strong>CONFIG_ONLY</strong>: The task is triggered only by the configuration. Stream ingest parameters are ignored.</li>
     * <li><strong>PUBLISH_CONFIG</strong>: The task can be triggered by both stream ingest parameters and the configuration. Stream ingest parameters have a higher priority than the configuration.</li>
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
