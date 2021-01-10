// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetServiceConfigurationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetServiceConfigurationResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetServiceConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConfigurationResponseBody self = new GetServiceConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceConfigurationResponseBody setData(GetServiceConfigurationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceConfigurationResponseBodyData getData() {
        return this.data;
    }

    public GetServiceConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetServiceConfigurationResponseBodyData extends TeaModel {
        @NameInMap("LiveRecordAll")
        public Boolean liveRecordAll;

        @NameInMap("LiveRecordLayout")
        public Integer liveRecordLayout;

        @NameInMap("LiveRecordMaxClient")
        public Integer liveRecordMaxClient;

        @NameInMap("LiveRecordEveryOne")
        public Boolean liveRecordEveryOne;

        @NameInMap("LiveRecordTaskProfile")
        public String liveRecordTaskProfile;

        @NameInMap("LiveRecordVideoResolution")
        public Integer liveRecordVideoResolution;

        @NameInMap("TaskItemQueueSize")
        public Integer taskItemQueueSize;

        @NameInMap("ClientQueueSize")
        public Integer clientQueueSize;

        public static GetServiceConfigurationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConfigurationResponseBodyData self = new GetServiceConfigurationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceConfigurationResponseBodyData setLiveRecordAll(Boolean liveRecordAll) {
            this.liveRecordAll = liveRecordAll;
            return this;
        }
        public Boolean getLiveRecordAll() {
            return this.liveRecordAll;
        }

        public GetServiceConfigurationResponseBodyData setLiveRecordLayout(Integer liveRecordLayout) {
            this.liveRecordLayout = liveRecordLayout;
            return this;
        }
        public Integer getLiveRecordLayout() {
            return this.liveRecordLayout;
        }

        public GetServiceConfigurationResponseBodyData setLiveRecordMaxClient(Integer liveRecordMaxClient) {
            this.liveRecordMaxClient = liveRecordMaxClient;
            return this;
        }
        public Integer getLiveRecordMaxClient() {
            return this.liveRecordMaxClient;
        }

        public GetServiceConfigurationResponseBodyData setLiveRecordEveryOne(Boolean liveRecordEveryOne) {
            this.liveRecordEveryOne = liveRecordEveryOne;
            return this;
        }
        public Boolean getLiveRecordEveryOne() {
            return this.liveRecordEveryOne;
        }

        public GetServiceConfigurationResponseBodyData setLiveRecordTaskProfile(String liveRecordTaskProfile) {
            this.liveRecordTaskProfile = liveRecordTaskProfile;
            return this;
        }
        public String getLiveRecordTaskProfile() {
            return this.liveRecordTaskProfile;
        }

        public GetServiceConfigurationResponseBodyData setLiveRecordVideoResolution(Integer liveRecordVideoResolution) {
            this.liveRecordVideoResolution = liveRecordVideoResolution;
            return this;
        }
        public Integer getLiveRecordVideoResolution() {
            return this.liveRecordVideoResolution;
        }

        public GetServiceConfigurationResponseBodyData setTaskItemQueueSize(Integer taskItemQueueSize) {
            this.taskItemQueueSize = taskItemQueueSize;
            return this;
        }
        public Integer getTaskItemQueueSize() {
            return this.taskItemQueueSize;
        }

        public GetServiceConfigurationResponseBodyData setClientQueueSize(Integer clientQueueSize) {
            this.clientQueueSize = clientQueueSize;
            return this;
        }
        public Integer getClientQueueSize() {
            return this.clientQueueSize;
        }

    }

}
