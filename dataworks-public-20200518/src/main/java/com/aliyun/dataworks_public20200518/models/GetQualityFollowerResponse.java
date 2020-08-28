// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityFollowerResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

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
    public java.util.List<GetQualityFollowerResponseData> data;

    public static GetQualityFollowerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityFollowerResponse self = new GetQualityFollowerResponse();
        return TeaModel.build(map, self);
    }

    public static class GetQualityFollowerResponseData extends TeaModel {
        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        @NameInMap("Follower")
        @Validation(required = true)
        public String follower;

        @NameInMap("AlarmMode")
        @Validation(required = true)
        public Integer alarmMode;

        public static GetQualityFollowerResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityFollowerResponseData self = new GetQualityFollowerResponseData();
            return TeaModel.build(map, self);
        }

    }

}
