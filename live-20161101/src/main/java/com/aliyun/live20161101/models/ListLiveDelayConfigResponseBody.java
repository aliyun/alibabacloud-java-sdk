// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveDelayConfigResponseBody extends TeaModel {
    /**
     * <p>The stream delay configurations.</p>
     */
    @NameInMap("DelayConfigList")
    public ListLiveDelayConfigResponseBodyDelayConfigList delayConfigList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of stream delay configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListLiveDelayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveDelayConfigResponseBody self = new ListLiveDelayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveDelayConfigResponseBody setDelayConfigList(ListLiveDelayConfigResponseBodyDelayConfigList delayConfigList) {
        this.delayConfigList = delayConfigList;
        return this;
    }
    public ListLiveDelayConfigResponseBodyDelayConfigList getDelayConfigList() {
        return this.delayConfigList;
    }

    public ListLiveDelayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveDelayConfigResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig extends TeaModel {
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The duration for which the playback of the live stream is delayed. Unit: seconds.</p>
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

        public static ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig self = new ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig();
            return TeaModel.build(map, self);
        }

        public ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig setDelayTime(String delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public String getDelayTime() {
            return this.delayTime;
        }

        public ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

        public ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig setTaskTriggerMode(String taskTriggerMode) {
            this.taskTriggerMode = taskTriggerMode;
            return this;
        }
        public String getTaskTriggerMode() {
            return this.taskTriggerMode;
        }

    }

    public static class ListLiveDelayConfigResponseBodyDelayConfigList extends TeaModel {
        @NameInMap("DelayConfig")
        public java.util.List<ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig> delayConfig;

        public static ListLiveDelayConfigResponseBodyDelayConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveDelayConfigResponseBodyDelayConfigList self = new ListLiveDelayConfigResponseBodyDelayConfigList();
            return TeaModel.build(map, self);
        }

        public ListLiveDelayConfigResponseBodyDelayConfigList setDelayConfig(java.util.List<ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig> delayConfig) {
            this.delayConfig = delayConfig;
            return this;
        }
        public java.util.List<ListLiveDelayConfigResponseBodyDelayConfigListDelayConfig> getDelayConfig() {
            return this.delayConfig;
        }

    }

}
