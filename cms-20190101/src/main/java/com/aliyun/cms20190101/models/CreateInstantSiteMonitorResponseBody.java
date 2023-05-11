// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateInstantSiteMonitorResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * <br>
     * <p>> The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The results for creating the instant test task.</p>
     */
    @NameInMap("CreateResultList")
    public java.util.List<CreateInstantSiteMonitorResponseBodyCreateResultList> createResultList;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateInstantSiteMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstantSiteMonitorResponseBody self = new CreateInstantSiteMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstantSiteMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateInstantSiteMonitorResponseBody setCreateResultList(java.util.List<CreateInstantSiteMonitorResponseBodyCreateResultList> createResultList) {
        this.createResultList = createResultList;
        return this;
    }
    public java.util.List<CreateInstantSiteMonitorResponseBodyCreateResultList> getCreateResultList() {
        return this.createResultList;
    }

    public CreateInstantSiteMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateInstantSiteMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstantSiteMonitorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateInstantSiteMonitorResponseBodyCreateResultList extends TeaModel {
        /**
         * <p>The ID of the instant test task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the instant test task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static CreateInstantSiteMonitorResponseBodyCreateResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateInstantSiteMonitorResponseBodyCreateResultList self = new CreateInstantSiteMonitorResponseBodyCreateResultList();
            return TeaModel.build(map, self);
        }

        public CreateInstantSiteMonitorResponseBodyCreateResultList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateInstantSiteMonitorResponseBodyCreateResultList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
