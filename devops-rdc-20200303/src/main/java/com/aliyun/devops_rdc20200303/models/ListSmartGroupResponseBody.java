// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListSmartGroupResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public java.util.List<ListSmartGroupResponseBodyObject> object;

    public static ListSmartGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmartGroupResponseBody self = new ListSmartGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmartGroupResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListSmartGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSmartGroupResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public ListSmartGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSmartGroupResponseBody setObject(java.util.List<ListSmartGroupResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<ListSmartGroupResponseBodyObject> getObject() {
        return this.object;
    }

    public static class ListSmartGroupResponseBodyObject extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Id")
        public String id;

        public static ListSmartGroupResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListSmartGroupResponseBodyObject self = new ListSmartGroupResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListSmartGroupResponseBodyObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSmartGroupResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
