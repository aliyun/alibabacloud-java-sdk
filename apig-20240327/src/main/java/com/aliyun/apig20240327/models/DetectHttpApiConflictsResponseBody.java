// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DetectHttpApiConflictsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public DetectHttpApiConflictsResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static DetectHttpApiConflictsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectHttpApiConflictsResponseBody self = new DetectHttpApiConflictsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectHttpApiConflictsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetectHttpApiConflictsResponseBody setData(DetectHttpApiConflictsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectHttpApiConflictsResponseBodyData getData() {
        return this.data;
    }

    public DetectHttpApiConflictsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectHttpApiConflictsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectHttpApiConflictsResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ApiRouteConflictInfo> items;

        public static DetectHttpApiConflictsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectHttpApiConflictsResponseBodyData self = new DetectHttpApiConflictsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectHttpApiConflictsResponseBodyData setItems(java.util.List<ApiRouteConflictInfo> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ApiRouteConflictInfo> getItems() {
            return this.items;
        }

    }

}
