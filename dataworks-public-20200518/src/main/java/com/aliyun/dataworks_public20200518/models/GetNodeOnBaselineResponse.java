// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeOnBaselineResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public String success;

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
    public java.util.List<GetNodeOnBaselineResponseData> data;

    public static GetNodeOnBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOnBaselineResponse self = new GetNodeOnBaselineResponse();
        return TeaModel.build(map, self);
    }

    public static class GetNodeOnBaselineResponseData extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static GetNodeOnBaselineResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeOnBaselineResponseData self = new GetNodeOnBaselineResponseData();
            return TeaModel.build(map, self);
        }

    }

}
