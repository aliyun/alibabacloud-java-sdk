// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteDistributeUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteDistributeUserResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDistributeUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDistributeUserResponseBody self = new DeleteDistributeUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDistributeUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDistributeUserResponseBody setData(DeleteDistributeUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDistributeUserResponseBodyData getData() {
        return this.data;
    }

    public DeleteDistributeUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDistributeUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDistributeUserResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static DeleteDistributeUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDistributeUserResponseBodyData self = new DeleteDistributeUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDistributeUserResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
