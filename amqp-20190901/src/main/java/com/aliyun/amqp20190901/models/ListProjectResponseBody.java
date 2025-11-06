// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListProjectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectResponseBody self = new ListProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListProjectResponseBody setData(ListProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProjectResponseBodyData getData() {
        return this.data;
    }

    public ListProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectResponseBodyData extends TeaModel {
        @NameInMap("Projects")
        public java.util.List<String> projects;

        public static ListProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyData self = new ListProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyData setProjects(java.util.List<String> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<String> getProjects() {
            return this.projects;
        }

    }

}
