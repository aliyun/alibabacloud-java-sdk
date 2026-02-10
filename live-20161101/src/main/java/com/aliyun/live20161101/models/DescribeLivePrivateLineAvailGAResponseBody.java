// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePrivateLineAvailGAResponseBody extends TeaModel {
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
        @NameInMap("AccelerationArea")
        public String accelerationArea;

        @NameInMap("AccelerationType")
        public String accelerationType;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("BindingStatus")
        public String bindingStatus;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Uid")
        public String uid;

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
