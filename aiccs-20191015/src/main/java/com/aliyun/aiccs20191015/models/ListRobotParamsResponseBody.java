// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotParamsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListRobotParamsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRobotParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRobotParamsResponseBody self = new ListRobotParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRobotParamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRobotParamsResponseBody setData(java.util.List<ListRobotParamsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRobotParamsResponseBodyData> getData() {
        return this.data;
    }

    public ListRobotParamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRobotParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRobotParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRobotParamsResponseBodyData extends TeaModel {
        @NameInMap("IsEmpty")
        public Integer isEmpty;

        @NameInMap("ParamCode")
        public String paramCode;

        @NameInMap("ParamName")
        public String paramName;

        public static ListRobotParamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRobotParamsResponseBodyData self = new ListRobotParamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRobotParamsResponseBodyData setIsEmpty(Integer isEmpty) {
            this.isEmpty = isEmpty;
            return this;
        }
        public Integer getIsEmpty() {
            return this.isEmpty;
        }

        public ListRobotParamsResponseBodyData setParamCode(String paramCode) {
            this.paramCode = paramCode;
            return this;
        }
        public String getParamCode() {
            return this.paramCode;
        }

        public ListRobotParamsResponseBodyData setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

    }

}
