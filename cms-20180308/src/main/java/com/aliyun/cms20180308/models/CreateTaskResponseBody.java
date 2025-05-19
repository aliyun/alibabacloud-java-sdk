// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class CreateTaskResponseBody extends TeaModel {
    @NameInMap("AlertRule")
    public String alertRule;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("CreateResultList")
    public CreateTaskResponseBodyCreateResultList createResultList;

    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>successfull</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>a4e6f550-7eac-4a13-b11f-6742aa2d42d1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskResponseBody self = new CreateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskResponseBody setAlertRule(String alertRule) {
        this.alertRule = alertRule;
        return this;
    }
    public String getAlertRule() {
        return this.alertRule;
    }

    public CreateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTaskResponseBody setCreateResultList(CreateTaskResponseBodyCreateResultList createResultList) {
        this.createResultList = createResultList;
        return this;
    }
    public CreateTaskResponseBodyCreateResultList getCreateResultList() {
        return this.createResultList;
    }

    public CreateTaskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateTaskResponseBodyCreateResultListContact extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static CreateTaskResponseBodyCreateResultListContact build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskResponseBodyCreateResultListContact self = new CreateTaskResponseBodyCreateResultListContact();
            return TeaModel.build(map, self);
        }

        public CreateTaskResponseBodyCreateResultListContact setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateTaskResponseBodyCreateResultListContact setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class CreateTaskResponseBodyCreateResultList extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<CreateTaskResponseBodyCreateResultListContact> contact;

        public static CreateTaskResponseBodyCreateResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskResponseBodyCreateResultList self = new CreateTaskResponseBodyCreateResultList();
            return TeaModel.build(map, self);
        }

        public CreateTaskResponseBodyCreateResultList setContact(java.util.List<CreateTaskResponseBodyCreateResultListContact> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<CreateTaskResponseBodyCreateResultListContact> getContact() {
            return this.contact;
        }

    }

}
