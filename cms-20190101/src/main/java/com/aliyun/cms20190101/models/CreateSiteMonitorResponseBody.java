// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateSiteMonitorResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateSiteMonitorResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("CreateResultList")
    public CreateSiteMonitorResponseBodyCreateResultList createResultList;

    @NameInMap("Success")
    public String success;

    public static CreateSiteMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteMonitorResponseBody self = new CreateSiteMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSiteMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSiteMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSiteMonitorResponseBody setData(CreateSiteMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSiteMonitorResponseBodyData getData() {
        return this.data;
    }

    public CreateSiteMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSiteMonitorResponseBody setCreateResultList(CreateSiteMonitorResponseBodyCreateResultList createResultList) {
        this.createResultList = createResultList;
        return this;
    }
    public CreateSiteMonitorResponseBodyCreateResultList getCreateResultList() {
        return this.createResultList;
    }

    public CreateSiteMonitorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateSiteMonitorResponseBodyDataAttachAlertResultContact extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public String success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("RuleId")
        public String ruleId;

        public static CreateSiteMonitorResponseBodyDataAttachAlertResultContact build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyDataAttachAlertResultContact self = new CreateSiteMonitorResponseBodyDataAttachAlertResultContact();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class CreateSiteMonitorResponseBodyDataAttachAlertResult extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<CreateSiteMonitorResponseBodyDataAttachAlertResultContact> contact;

        public static CreateSiteMonitorResponseBodyDataAttachAlertResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyDataAttachAlertResult self = new CreateSiteMonitorResponseBodyDataAttachAlertResult();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResult setContact(java.util.List<CreateSiteMonitorResponseBodyDataAttachAlertResultContact> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<CreateSiteMonitorResponseBodyDataAttachAlertResultContact> getContact() {
            return this.contact;
        }

    }

    public static class CreateSiteMonitorResponseBodyData extends TeaModel {
        @NameInMap("AttachAlertResult")
        public CreateSiteMonitorResponseBodyDataAttachAlertResult attachAlertResult;

        public static CreateSiteMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyData self = new CreateSiteMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyData setAttachAlertResult(CreateSiteMonitorResponseBodyDataAttachAlertResult attachAlertResult) {
            this.attachAlertResult = attachAlertResult;
            return this;
        }
        public CreateSiteMonitorResponseBodyDataAttachAlertResult getAttachAlertResult() {
            return this.attachAlertResult;
        }

    }

    public static class CreateSiteMonitorResponseBodyCreateResultListCreateResultList extends TeaModel {
        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskId")
        public String taskId;

        public static CreateSiteMonitorResponseBodyCreateResultListCreateResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyCreateResultListCreateResultList self = new CreateSiteMonitorResponseBodyCreateResultListCreateResultList();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyCreateResultListCreateResultList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateSiteMonitorResponseBodyCreateResultListCreateResultList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class CreateSiteMonitorResponseBodyCreateResultList extends TeaModel {
        @NameInMap("CreateResultList")
        public java.util.List<CreateSiteMonitorResponseBodyCreateResultListCreateResultList> createResultList;

        public static CreateSiteMonitorResponseBodyCreateResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyCreateResultList self = new CreateSiteMonitorResponseBodyCreateResultList();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyCreateResultList setCreateResultList(java.util.List<CreateSiteMonitorResponseBodyCreateResultListCreateResultList> createResultList) {
            this.createResultList = createResultList;
            return this;
        }
        public java.util.List<CreateSiteMonitorResponseBodyCreateResultListCreateResultList> getCreateResultList() {
            return this.createResultList;
        }

    }

}
