// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteCommonGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public DeleteCommonGroupResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static DeleteCommonGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommonGroupResponseBody self = new DeleteCommonGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCommonGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCommonGroupResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteCommonGroupResponseBody setObject(DeleteCommonGroupResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public DeleteCommonGroupResponseBodyObject getObject() {
        return this.object;
    }

    public DeleteCommonGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteCommonGroupResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class DeleteCommonGroupResponseBodyObject extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static DeleteCommonGroupResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            DeleteCommonGroupResponseBodyObject self = new DeleteCommonGroupResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public DeleteCommonGroupResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
