// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityEntityResponse extends TeaModel {
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
    public java.util.List<GetQualityEntityResponseData> data;

    public static GetQualityEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityEntityResponse self = new GetQualityEntityResponse();
        return TeaModel.build(map, self);
    }

    public static class GetQualityEntityResponseData extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("EnvType")
        @Validation(required = true)
        public String envType;

        @NameInMap("MatchExpression")
        @Validation(required = true)
        public String matchExpression;

        @NameInMap("EntityLevel")
        @Validation(required = true)
        public Integer entityLevel;

        @NameInMap("OnDuty")
        @Validation(required = true)
        public String onDuty;

        @NameInMap("ModifyUser")
        @Validation(required = true)
        public String modifyUser;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public Long modifyTime;

        @NameInMap("Sql")
        @Validation(required = true)
        public Integer sql;

        @NameInMap("Task")
        @Validation(required = true)
        public Integer task;

        @NameInMap("Followers")
        @Validation(required = true)
        public String followers;

        @NameInMap("HasRelativeNode")
        @Validation(required = true)
        public Boolean hasRelativeNode;

        @NameInMap("RelativeNode")
        @Validation(required = true)
        public String relativeNode;

        public static GetQualityEntityResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityEntityResponseData self = new GetQualityEntityResponseData();
            return TeaModel.build(map, self);
        }

    }

}
