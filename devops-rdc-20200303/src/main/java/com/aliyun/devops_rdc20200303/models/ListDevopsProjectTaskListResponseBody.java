// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTaskListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public ListDevopsProjectTaskListResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static ListDevopsProjectTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTaskListResponseBody self = new ListDevopsProjectTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevopsProjectTaskListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDevopsProjectTaskListResponseBody setObject(ListDevopsProjectTaskListResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public ListDevopsProjectTaskListResponseBodyObject getObject() {
        return this.object;
    }

    public ListDevopsProjectTaskListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDevopsProjectTaskListResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class ListDevopsProjectTaskListResponseBodyObjectResult extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static ListDevopsProjectTaskListResponseBodyObjectResult build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsProjectTaskListResponseBodyObjectResult self = new ListDevopsProjectTaskListResponseBodyObjectResult();
            return TeaModel.build(map, self);
        }

        public ListDevopsProjectTaskListResponseBodyObjectResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListDevopsProjectTaskListResponseBodyObject extends TeaModel {
        @NameInMap("Result")
        public java.util.List<ListDevopsProjectTaskListResponseBodyObjectResult> result;

        public static ListDevopsProjectTaskListResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsProjectTaskListResponseBodyObject self = new ListDevopsProjectTaskListResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListDevopsProjectTaskListResponseBodyObject setResult(java.util.List<ListDevopsProjectTaskListResponseBodyObjectResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListDevopsProjectTaskListResponseBodyObjectResult> getResult() {
            return this.result;
        }

    }

}
