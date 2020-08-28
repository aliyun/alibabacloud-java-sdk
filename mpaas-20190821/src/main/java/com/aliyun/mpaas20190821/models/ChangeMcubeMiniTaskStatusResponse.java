// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ChangeMcubeMiniTaskStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ChangeMiniTaskStatusResult")
    @Validation(required = true)
    public ChangeMcubeMiniTaskStatusResponseChangeMiniTaskStatusResult changeMiniTaskStatusResult;

    public static ChangeMcubeMiniTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubeMiniTaskStatusResponse self = new ChangeMcubeMiniTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public static class ChangeMcubeMiniTaskStatusResponseChangeMiniTaskStatusResult extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static ChangeMcubeMiniTaskStatusResponseChangeMiniTaskStatusResult build(java.util.Map<String, ?> map) throws Exception {
            ChangeMcubeMiniTaskStatusResponseChangeMiniTaskStatusResult self = new ChangeMcubeMiniTaskStatusResponseChangeMiniTaskStatusResult();
            return TeaModel.build(map, self);
        }

    }

}
