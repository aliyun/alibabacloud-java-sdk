// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePrivateLineAvailGAResponseBody extends TeaModel {
    /**
     * <p>The GA instance configuration details.</p>
     */
    @NameInMap("LivePrivateLineAvailGAs")
    public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAs livePrivateLineAvailGAs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C4865B85-664B-19D3-BB16-C62FB83C8226</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLivePrivateLineAvailGAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePrivateLineAvailGAResponseBody self = new DescribeLivePrivateLineAvailGAResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePrivateLineAvailGAResponseBody setLivePrivateLineAvailGAs(DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAs livePrivateLineAvailGAs) {
        this.livePrivateLineAvailGAs = livePrivateLineAvailGAs;
        return this;
    }
    public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAs getLivePrivateLineAvailGAs() {
        return this.livePrivateLineAvailGAs;
    }

    public DescribeLivePrivateLineAvailGAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA extends TeaModel {
        /**
         * <p>The acceleration channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("AccelerationArea")
        public String accelerationArea;

        /**
         * <p>The acceleration type. Valid values:</p>
         * <ul>
         * <li>play: streaming acceleration</li>
         * <li>publish: stream ingest acceleration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>play</p>
         */
        @NameInMap("AccelerationType")
        public String accelerationType;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Indicates whether the GA instance is bound to an acceleration circuit. Valid values:</p>
         * <ul>
         * <li>yes</li>
         * <li>no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("BindingStatus")
        public String bindingStatus;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The accelerated IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1iovsdpf01ym9su****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the GA instance. Valid values:</p>
         * <ul>
         * <li>active: The GA instance is available.</li>
         * <li>inactive: The GA instance is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>testStream</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The user ID (UID).</p>
         * 
         * <strong>example:</strong>
         * <p>1833220971116****</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The live center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("VideoCenter")
        public String videoCenter;

        public static DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA self = new DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA();
            return TeaModel.build(map, self);
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setAccelerationArea(String accelerationArea) {
            this.accelerationArea = accelerationArea;
            return this;
        }
        public String getAccelerationArea() {
            return this.accelerationArea;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setAccelerationType(String accelerationType) {
            this.accelerationType = accelerationType;
            return this;
        }
        public String getAccelerationType() {
            return this.accelerationType;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setBindingStatus(String bindingStatus) {
            this.bindingStatus = bindingStatus;
            return this;
        }
        public String getBindingStatus() {
            return this.bindingStatus;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA setVideoCenter(String videoCenter) {
            this.videoCenter = videoCenter;
            return this;
        }
        public String getVideoCenter() {
            return this.videoCenter;
        }

    }

    public static class DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAs extends TeaModel {
        @NameInMap("LivePrivateLineAvailGA")
        public java.util.List<DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA> livePrivateLineAvailGA;

        public static DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAs self = new DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAs();
            return TeaModel.build(map, self);
        }

        public DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAs setLivePrivateLineAvailGA(java.util.List<DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA> livePrivateLineAvailGA) {
            this.livePrivateLineAvailGA = livePrivateLineAvailGA;
            return this;
        }
        public java.util.List<DescribeLivePrivateLineAvailGAResponseBodyLivePrivateLineAvailGAsLivePrivateLineAvailGA> getLivePrivateLineAvailGA() {
            return this.livePrivateLineAvailGA;
        }

    }

}
