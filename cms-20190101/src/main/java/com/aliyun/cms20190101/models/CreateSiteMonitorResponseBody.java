// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateSiteMonitorResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     * <p>If a site monitoring task is created, the result is returned. If a site monitoring task fails to be created, no result is returned.</p>
     */
    @NameInMap("CreateResultList")
    public CreateSiteMonitorResponseBodyCreateResultList createResultList;

    /**
     * <p>The result of the site monitoring task.</p>
     */
    @NameInMap("Data")
    public CreateSiteMonitorResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68192f5d-0d45-4b98-9724-892813f86c71</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateSiteMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteMonitorResponseBody self = new CreateSiteMonitorResponseBody();
        return TeaModel.build(map, self);
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

    public CreateSiteMonitorResponseBody setData(CreateSiteMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSiteMonitorResponseBodyData getData() {
        return this.data;
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

    public CreateSiteMonitorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateSiteMonitorResponseBodyCreateResultListCreateResultList extends TeaModel {
        /**
         * <p>The ID of the site monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>2c8dbdf9-a3ab-46a1-85a4-f094965e****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the site monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>HanZhou_ECS1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static CreateSiteMonitorResponseBodyCreateResultListCreateResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyCreateResultListCreateResultList self = new CreateSiteMonitorResponseBodyCreateResultListCreateResultList();
            return TeaModel.build(map, self);
        }

        public CreateSiteMonitorResponseBodyCreateResultListCreateResultList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateSiteMonitorResponseBodyCreateResultListCreateResultList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
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

    public static class CreateSiteMonitorResponseBodyDataAttachAlertResultContact extends TeaModel {
        /**
         * <p>The status code that is returned after you associate the existing alert rule with the site monitoring task.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The message that is returned after you associate the existing alert rule with the site monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the request that was sent to associate the existing alert rule with the site monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>5dd33455-4f65-4b0c-9200-33d66f3f340b</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDefault_acs_ecs_dashboard_InternetOutRate_Percent</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>Indicates whether the existing alert rule was associated with the site monitoring task. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public String success;

        public static CreateSiteMonitorResponseBodyDataAttachAlertResultContact build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteMonitorResponseBodyDataAttachAlertResultContact self = new CreateSiteMonitorResponseBodyDataAttachAlertResultContact();
            return TeaModel.build(map, self);
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

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateSiteMonitorResponseBodyDataAttachAlertResultContact setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
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
        /**
         * <p>The result that is returned after you associate the existing alert rule with the site monitoring task.</p>
         */
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

}
