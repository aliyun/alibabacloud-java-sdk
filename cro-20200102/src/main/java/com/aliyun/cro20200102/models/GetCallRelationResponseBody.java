// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetCallRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetCallRelationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCallRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallRelationResponseBody self = new GetCallRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallRelationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCallRelationResponseBody setData(GetCallRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCallRelationResponseBodyData getData() {
        return this.data;
    }

    public GetCallRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCallRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCallRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCallRelationResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("CallAppList")
        public String callAppList;

        @NameInMap("CalledAppList")
        public String calledAppList;

        public static GetCallRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCallRelationResponseBodyData self = new GetCallRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCallRelationResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetCallRelationResponseBodyData setCallAppList(String callAppList) {
            this.callAppList = callAppList;
            return this;
        }
        public String getCallAppList() {
            return this.callAppList;
        }

        public GetCallRelationResponseBodyData setCalledAppList(String calledAppList) {
            this.calledAppList = calledAppList;
            return this;
        }
        public String getCalledAppList() {
            return this.calledAppList;
        }

    }

}
