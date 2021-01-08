// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTaskFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public java.util.List<ListDevopsProjectTaskFlowResponseBodyObject> object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static ListDevopsProjectTaskFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTaskFlowResponseBody self = new ListDevopsProjectTaskFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTaskFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevopsProjectTaskFlowResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDevopsProjectTaskFlowResponseBody setObject(java.util.List<ListDevopsProjectTaskFlowResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<ListDevopsProjectTaskFlowResponseBodyObject> getObject() {
        return this.object;
    }

    public ListDevopsProjectTaskFlowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDevopsProjectTaskFlowResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class ListDevopsProjectTaskFlowResponseBodyObject extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListDevopsProjectTaskFlowResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsProjectTaskFlowResponseBodyObject self = new ListDevopsProjectTaskFlowResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListDevopsProjectTaskFlowResponseBodyObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDevopsProjectTaskFlowResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDevopsProjectTaskFlowResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
