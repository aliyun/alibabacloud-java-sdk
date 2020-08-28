// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicInfluenceResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetTopicInfluenceResponseData data;

    public static GetTopicInfluenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicInfluenceResponse self = new GetTopicInfluenceResponse();
        return TeaModel.build(map, self);
    }

    public static class GetTopicInfluenceResponseDataInfluences extends TeaModel {
        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("Buffer")
        @Validation(required = true)
        public Long buffer;

        public static GetTopicInfluenceResponseDataInfluences build(java.util.Map<String, ?> map) throws Exception {
            GetTopicInfluenceResponseDataInfluences self = new GetTopicInfluenceResponseDataInfluences();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTopicInfluenceResponseData extends TeaModel {
        @NameInMap("TopicId")
        @Validation(required = true)
        public Long topicId;

        @NameInMap("Influences")
        @Validation(required = true)
        public java.util.List<GetTopicInfluenceResponseDataInfluences> influences;

        public static GetTopicInfluenceResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicInfluenceResponseData self = new GetTopicInfluenceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
