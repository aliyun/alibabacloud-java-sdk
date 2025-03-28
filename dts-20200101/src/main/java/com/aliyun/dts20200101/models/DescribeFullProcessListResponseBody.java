// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeFullProcessListResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The throttling configuration. Valid values:</p>
     * <ul>
     * <li><strong>dts.datamove.blaster.qps.max</strong>: The rate at which queries are made to the source database per second.</li>
     * <li><strong>dts.datamove.source.rps.max</strong>: the number of rows that are fully synchronized or migrated per second.</li>
     * <li><strong>dts.datamove.source.bps.max</strong>: the amount of data processed per second for full synchronization or migration. Unit: Byte/s.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>When you set the <strong>JobCode</strong> parameter to <strong>03</strong>, you need to specify the <strong>EnableLimit</strong> parameter as <strong>true</strong>. Otherwise, the configuration cannot take effect.</p>
     * </li>
     * <li><p>When you set the <strong>JobCode</strong> parameter to <strong>04</strong> or <strong>07</strong>, you only need to specify the <strong>dts.datamove.source.rps.max</strong> and <strong>dts.datamove.source.bps.max</strong> parameters.</p>
     * </li>
     * <li><p>A value of \<em>\</em>-1\<em>\</em> indicates no rate limit.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;dts.datamove.source.rps.max&quot;: 5000,
     *       &quot;dts.datamove.source.bps.max&quot;: 10485760
     * }</p>
     */
    @NameInMap("ConfigList")
    public java.util.Map<String, ?> configList;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>i03e3zty16i****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \<em>\</em>%s\<em>\</em> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p> The request parameter <strong>DtsJobId</strong> is invalid if <strong>The Value of Input Parameter %s is not valid</strong> is returned for <strong>ErrMessage</strong> and <strong>DtsJobId</strong> is returned for <strong>DynamicMessage</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DtsJobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned when the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned when the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The details of the GA instances.</p>
     */
    @NameInMap("FullProcessList")
    public java.util.List<DescribeFullProcessListResponseBodyFullProcessList> fullProcessList;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C166D79D-436B-45F0-B5A5-25E1959F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeFullProcessListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullProcessListResponseBody self = new DescribeFullProcessListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFullProcessListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFullProcessListResponseBody setConfigList(java.util.Map<String, ?> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.Map<String, ?> getConfigList() {
        return this.configList;
    }

    public DescribeFullProcessListResponseBody setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeFullProcessListResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeFullProcessListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeFullProcessListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeFullProcessListResponseBody setFullProcessList(java.util.List<DescribeFullProcessListResponseBodyFullProcessList> fullProcessList) {
        this.fullProcessList = fullProcessList;
        return this;
    }
    public java.util.List<DescribeFullProcessListResponseBodyFullProcessList> getFullProcessList() {
        return this.fullProcessList;
    }

    public DescribeFullProcessListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeFullProcessListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFullProcessListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFullProcessListResponseBodyFullProcessList extends TeaModel {
        /**
         * <p>Details</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The abnormal status of the task. Valid values:<strong>notstarted</strong>. -<strong>checking</strong>. -<strong>failed</strong>. -<strong>finished</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>notstarted</p>
         */
        @NameInMap("Exception")
        public String exception;

        /**
         * <p>The name of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>universer</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The type of the process. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: trusted</li>
         * <li><strong>2</strong>: suspicious</li>
         * <li><strong>3</strong>: malicious</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProcessType")
        public String processType;

        /**
         * <p>SQL that is running</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RunningSQL")
        public String runningSQL;

        /**
         * <p>The log status.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskD4E5F6</p>
         */
        @NameInMap("TaskID")
        public String taskID;

        /**
         * <p>The time when the logs were collected. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1729650129452</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeFullProcessListResponseBodyFullProcessList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFullProcessListResponseBodyFullProcessList self = new DescribeFullProcessListResponseBodyFullProcessList();
            return TeaModel.build(map, self);
        }

        public DescribeFullProcessListResponseBodyFullProcessList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeFullProcessListResponseBodyFullProcessList setException(String exception) {
            this.exception = exception;
            return this;
        }
        public String getException() {
            return this.exception;
        }

        public DescribeFullProcessListResponseBodyFullProcessList setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public DescribeFullProcessListResponseBodyFullProcessList setProcessType(String processType) {
            this.processType = processType;
            return this;
        }
        public String getProcessType() {
            return this.processType;
        }

        public DescribeFullProcessListResponseBodyFullProcessList setRunningSQL(String runningSQL) {
            this.runningSQL = runningSQL;
            return this;
        }
        public String getRunningSQL() {
            return this.runningSQL;
        }

        public DescribeFullProcessListResponseBodyFullProcessList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFullProcessListResponseBodyFullProcessList setTaskID(String taskID) {
            this.taskID = taskID;
            return this;
        }
        public String getTaskID() {
            return this.taskID;
        }

        public DescribeFullProcessListResponseBodyFullProcessList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
