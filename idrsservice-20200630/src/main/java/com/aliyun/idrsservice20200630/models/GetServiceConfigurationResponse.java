// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetServiceConfigurationResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetServiceConfigurationResponseData data;

    public static GetServiceConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConfigurationResponse self = new GetServiceConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceConfigurationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceConfigurationResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceConfigurationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceConfigurationResponse setData(GetServiceConfigurationResponseData data) {
        this.data = data;
        return this;
    }
    public GetServiceConfigurationResponseData getData() {
        return this.data;
    }

    public static class GetServiceConfigurationResponseData extends TeaModel {
        @NameInMap("ClientQueueSize")
        @Validation(required = true)
        public Integer clientQueueSize;

        @NameInMap("LiveRecordAll")
        @Validation(required = true)
        public Boolean liveRecordAll;

        @NameInMap("LiveRecordEveryOne")
        @Validation(required = true)
        public Boolean liveRecordEveryOne;

        @NameInMap("LiveRecordLayout")
        @Validation(required = true)
        public Integer liveRecordLayout;

        @NameInMap("LiveRecordTaskProfile")
        @Validation(required = true)
        public String liveRecordTaskProfile;

        @NameInMap("TaskItemQueueSize")
        @Validation(required = true)
        public Integer taskItemQueueSize;

        public static GetServiceConfigurationResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConfigurationResponseData self = new GetServiceConfigurationResponseData();
            return TeaModel.build(map, self);
        }

        public GetServiceConfigurationResponseData setClientQueueSize(Integer clientQueueSize) {
            this.clientQueueSize = clientQueueSize;
            return this;
        }
        public Integer getClientQueueSize() {
            return this.clientQueueSize;
        }

        public GetServiceConfigurationResponseData setLiveRecordAll(Boolean liveRecordAll) {
            this.liveRecordAll = liveRecordAll;
            return this;
        }
        public Boolean getLiveRecordAll() {
            return this.liveRecordAll;
        }

        public GetServiceConfigurationResponseData setLiveRecordEveryOne(Boolean liveRecordEveryOne) {
            this.liveRecordEveryOne = liveRecordEveryOne;
            return this;
        }
        public Boolean getLiveRecordEveryOne() {
            return this.liveRecordEveryOne;
        }

        public GetServiceConfigurationResponseData setLiveRecordLayout(Integer liveRecordLayout) {
            this.liveRecordLayout = liveRecordLayout;
            return this;
        }
        public Integer getLiveRecordLayout() {
            return this.liveRecordLayout;
        }

        public GetServiceConfigurationResponseData setLiveRecordTaskProfile(String liveRecordTaskProfile) {
            this.liveRecordTaskProfile = liveRecordTaskProfile;
            return this;
        }
        public String getLiveRecordTaskProfile() {
            return this.liveRecordTaskProfile;
        }

        public GetServiceConfigurationResponseData setTaskItemQueueSize(Integer taskItemQueueSize) {
            this.taskItemQueueSize = taskItemQueueSize;
            return this;
        }
        public Integer getTaskItemQueueSize() {
            return this.taskItemQueueSize;
        }

    }

}
