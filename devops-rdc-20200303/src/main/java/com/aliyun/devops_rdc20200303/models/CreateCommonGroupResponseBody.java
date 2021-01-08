// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateCommonGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public CreateCommonGroupResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static CreateCommonGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommonGroupResponseBody self = new CreateCommonGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommonGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommonGroupResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateCommonGroupResponseBody setObject(CreateCommonGroupResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public CreateCommonGroupResponseBodyObject getObject() {
        return this.object;
    }

    public CreateCommonGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateCommonGroupResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class CreateCommonGroupResponseBodyObject extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateCommonGroupResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            CreateCommonGroupResponseBodyObject self = new CreateCommonGroupResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public CreateCommonGroupResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
