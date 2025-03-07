// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionWithScheduleResponseBody extends TeaModel {
    /**
     * <p>The code that is returned by the backend server.</p>
     * 
     * <strong>example:</strong>
     * <p>1400009</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public UpdateProcessDefinitionWithScheduleResponseBodyData data;

    /**
     * <p>Indicates whether the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("failed")
    public String failed;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The description of the returned code.</p>
     * 
     * <strong>example:</strong>
     * <p>No permission for resource action</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static UpdateProcessDefinitionWithScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProcessDefinitionWithScheduleResponseBody self = new UpdateProcessDefinitionWithScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProcessDefinitionWithScheduleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateProcessDefinitionWithScheduleResponseBody setData(UpdateProcessDefinitionWithScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateProcessDefinitionWithScheduleResponseBodyData getData() {
        return this.data;
    }

    public UpdateProcessDefinitionWithScheduleResponseBody setFailed(String failed) {
        this.failed = failed;
        return this;
    }
    public String getFailed() {
        return this.failed;
    }

    public UpdateProcessDefinitionWithScheduleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateProcessDefinitionWithScheduleResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UpdateProcessDefinitionWithScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProcessDefinitionWithScheduleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UpdateProcessDefinitionWithScheduleResponseBodyData extends TeaModel {
        /**
         * <p>The email address to receive alerts.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
         */
        @NameInMap("alertEmailAddress")
        public String alertEmailAddress;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_ack_one_cluster</p>
         */
        @NameInMap("bizId")
        public String bizId;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12***********</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The time when the workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-05T02:03:19Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The CRON expression that is used for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 * * ?</p>
         */
        @NameInMap("crontab")
        public String crontab;

        /**
         * <p>The node description.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The end of the end time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1710432000000</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The execution policy.</p>
         * 
         * <strong>example:</strong>
         * <p>SERIAL</p>
         */
        @NameInMap("executionType")
        public String executionType;

        /**
         * <p>The serial number of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>123223</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_batch_workflow</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the project to which the workflow belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>w-********</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The status of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("releaseState")
        public String releaseState;

        /**
         * <p>The start time of the scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The ID of the time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezoneId")
        public String timezoneId;

        /**
         * <p>The time when the workflow was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05T06:24:27Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The ID of the user that is used to initiate a scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>113*********</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The name of the user that is used to initiate a scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>w-********</p>
         */
        @NameInMap("userName")
        public String userName;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        /**
         * <p>The hash code of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>dwerf*********</p>
         */
        @NameInMap("versionHashCode")
        public String versionHashCode;

        public static UpdateProcessDefinitionWithScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionWithScheduleResponseBodyData self = new UpdateProcessDefinitionWithScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setAlertEmailAddress(String alertEmailAddress) {
            this.alertEmailAddress = alertEmailAddress;
            return this;
        }
        public String getAlertEmailAddress() {
            return this.alertEmailAddress;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setCrontab(String crontab) {
            this.crontab = crontab;
            return this;
        }
        public String getCrontab() {
            return this.crontab;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setExecutionType(String executionType) {
            this.executionType = executionType;
            return this;
        }
        public String getExecutionType() {
            return this.executionType;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setReleaseState(String releaseState) {
            this.releaseState = releaseState;
            return this;
        }
        public String getReleaseState() {
            return this.releaseState;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setTimezoneId(String timezoneId) {
            this.timezoneId = timezoneId;
            return this;
        }
        public String getTimezoneId() {
            return this.timezoneId;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public UpdateProcessDefinitionWithScheduleResponseBodyData setVersionHashCode(String versionHashCode) {
            this.versionHashCode = versionHashCode;
            return this;
        }
        public String getVersionHashCode() {
            return this.versionHashCode;
        }

    }

}
