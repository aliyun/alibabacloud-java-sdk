// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDeploymentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("Data")
    @Validation(required = true)
    public GetDeploymentResponseData data;

    public static GetDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponse self = new GetDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public static class GetDeploymentResponseDataDeployment extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CreatorId")
        @Validation(required = true)
        public String creatorId;

        @NameInMap("HandlerId")
        @Validation(required = true)
        public String handlerId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ExecuteTime")
        @Validation(required = true)
        public Long executeTime;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("FromEnvironment")
        @Validation(required = true)
        public Integer fromEnvironment;

        @NameInMap("ToEnvironment")
        @Validation(required = true)
        public Integer toEnvironment;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        public static GetDeploymentResponseDataDeployment build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseDataDeployment self = new GetDeploymentResponseDataDeployment();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDeploymentResponseData extends TeaModel {
        @NameInMap("Deployment")
        @Validation(required = true)
        public GetDeploymentResponseDataDeployment deployment;

        public static GetDeploymentResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseData self = new GetDeploymentResponseData();
            return TeaModel.build(map, self);
        }

    }

}
