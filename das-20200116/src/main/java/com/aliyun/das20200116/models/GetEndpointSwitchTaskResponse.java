// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEndpointSwitchTaskResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Synchro")
    @Validation(required = true)
    public String synchro;

    @NameInMap("Data")
    @Validation(required = true)
    public GetEndpointSwitchTaskResponseData data;

    public static GetEndpointSwitchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointSwitchTaskResponse self = new GetEndpointSwitchTaskResponse();
        return TeaModel.build(map, self);
    }

    public static class GetEndpointSwitchTaskResponseData extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("DbLinkId")
        @Validation(required = true)
        public Long dbLinkId;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("OriUuid")
        @Validation(required = true)
        public String oriUuid;

        @NameInMap("Uuid")
        @Validation(required = true)
        public String uuid;

        @NameInMap("ErrMsg")
        @Validation(required = true)
        public String errMsg;

        public static GetEndpointSwitchTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetEndpointSwitchTaskResponseData self = new GetEndpointSwitchTaskResponseData();
            return TeaModel.build(map, self);
        }

    }

}
