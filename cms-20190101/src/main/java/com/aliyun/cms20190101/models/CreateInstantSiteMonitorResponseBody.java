// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateInstantSiteMonitorResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the call was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>68192f5d-0d45-4b98-9724-892813f86c71</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>2c8dbdf9-a3ab-46a1-85a4-f094965e****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the instant test task.</p>
         * 
         * <strong>example:</strong>
         * <p>task1</p>
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
