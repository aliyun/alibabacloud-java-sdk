// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateCommonGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public UpdateCommonGroupResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static UpdateCommonGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommonGroupResponseBody self = new UpdateCommonGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCommonGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCommonGroupResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateCommonGroupResponseBody setObject(UpdateCommonGroupResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public UpdateCommonGroupResponseBodyObject getObject() {
        return this.object;
    }

    public UpdateCommonGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateCommonGroupResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class UpdateCommonGroupResponseBodyObject extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static UpdateCommonGroupResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            UpdateCommonGroupResponseBodyObject self = new UpdateCommonGroupResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public UpdateCommonGroupResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
