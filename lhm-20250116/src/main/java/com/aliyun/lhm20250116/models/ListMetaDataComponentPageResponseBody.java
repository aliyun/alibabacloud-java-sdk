// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaDataComponentPageResponseBody extends TeaModel {
    /**
     * <p>The data list returned by the operation. For the structure of each element, see the child parameters.</p>
     */
    @NameInMap("data")
    public java.util.List<ListMetaDataComponentPageResponseBodyData> data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The page size, which is the number of records returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed. Check errCode and errMessage for details.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that meet the query conditions. This parameter is used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListMetaDataComponentPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDataComponentPageResponseBody self = new ListMetaDataComponentPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaDataComponentPageResponseBody setData(java.util.List<ListMetaDataComponentPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMetaDataComponentPageResponseBodyData> getData() {
        return this.data;
    }

    public ListMetaDataComponentPageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListMetaDataComponentPageResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListMetaDataComponentPageResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaDataComponentPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaDataComponentPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetaDataComponentPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetaDataComponentPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetaDataComponentPageResponseBodyDataProfilingJob extends TeaModel {
        /**
         * <p>The component ID, which is the primary key of the data source component.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("componentId")
        public Long componentId;

        /**
         * <p>The creation time of the table or partition.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The primary key ID that uniquely identifies a record.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The description of the profiling task.</p>
         * 
         * <strong>example:</strong>
         * <p>Profiling task description</p>
         */
        @NameInMap("jobDesc")
        public String jobDesc;

        /**
         * <p>The name of the profiling task.</p>
         * 
         * <strong>example:</strong>
         * <p>job_name</p>
         */
        @NameInMap("jobName")
        public String jobName;

        /**
         * <p>The ID of the most recent profiling task batch.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("lastBatchId")
        public String lastBatchId;

        /**
         * <p>The profiling task status. Valid values:</p>
         * <ul>
         * <li>0: Not started.</li>
         * <li>1: Running.</li>
         * <li>2: Stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("profilingEnable")
        public Integer profilingEnable;

        /**
         * <p>The profiling permission. Valid values:</p>
         * <ul>
         * <li>0: read-only link</li>
         * <li>1: client</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("profilingPermission")
        public Integer profilingPermission;

        /**
         * <p>The cron expression for scheduled profiling. This parameter takes effect only when profilingType is set to CRON.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("profilingRule")
        public String profilingRule;

        /**
         * <p>The profiling policy (scheduling type). Valid values:</p>
         * <ul>
         * <li>0: daily</li>
         * <li>1: CRON</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("profilingType")
        public Integer profilingType;

        /**
         * <p>The scheduling ID, which uniquely identifies the profiling task on the scheduling side.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("schedulerToken")
        public String schedulerToken;

        public static ListMetaDataComponentPageResponseBodyDataProfilingJob build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDataComponentPageResponseBodyDataProfilingJob self = new ListMetaDataComponentPageResponseBodyDataProfilingJob();
            return TeaModel.build(map, self);
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setComponentId(Long componentId) {
            this.componentId = componentId;
            return this;
        }
        public Long getComponentId() {
            return this.componentId;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setJobDesc(String jobDesc) {
            this.jobDesc = jobDesc;
            return this;
        }
        public String getJobDesc() {
            return this.jobDesc;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setLastBatchId(String lastBatchId) {
            this.lastBatchId = lastBatchId;
            return this;
        }
        public String getLastBatchId() {
            return this.lastBatchId;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setProfilingEnable(Integer profilingEnable) {
            this.profilingEnable = profilingEnable;
            return this;
        }
        public Integer getProfilingEnable() {
            return this.profilingEnable;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setProfilingPermission(Integer profilingPermission) {
            this.profilingPermission = profilingPermission;
            return this;
        }
        public Integer getProfilingPermission() {
            return this.profilingPermission;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setProfilingRule(String profilingRule) {
            this.profilingRule = profilingRule;
            return this;
        }
        public String getProfilingRule() {
            return this.profilingRule;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setProfilingType(Integer profilingType) {
            this.profilingType = profilingType;
            return this;
        }
        public Integer getProfilingType() {
            return this.profilingType;
        }

        public ListMetaDataComponentPageResponseBodyDataProfilingJob setSchedulerToken(String schedulerToken) {
            this.schedulerToken = schedulerToken;
            return this;
        }
        public String getSchedulerToken() {
            return this.schedulerToken;
        }

    }

    public static class ListMetaDataComponentPageResponseBodyData extends TeaModel {
        /**
         * <p>The entry component type. In some operations, this parameter is used as a backward compatible field for version 1.1.0. Valid values:</p>
         * <ul>
         * <li>0: source</li>
         * <li>1: destination</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("componentType")
        public Long componentType;

        /**
         * <p>The creation time of the table or partition.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The datasource config in JSON string format. The structure is defined by each dsType. Parse the JSON string before use. Sensitive fields such as tokens are masked in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;endpoint&quot;:&quot;...&quot;,&quot;token&quot;:&quot;******&quot;}</p>
         */
        @NameInMap("dsConfig")
        public String dsConfig;

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Data source description</p>
         */
        @NameInMap("dsDesc")
        public String dsDesc;

        /**
         * <p>The business ID of the data source (external ID, which may be the same as the primary key ID).</p>
         * 
         * <strong>example:</strong>
         * <p>290</p>
         */
        @NameInMap("dsId")
        public String dsId;

        /**
         * <p>The data source name. Exact match and fuzzy match are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test_ds318_hangzhou_0428</p>
         */
        @NameInMap("dsName")
        public String dsName;

        /**
         * <p>The connectivity status of the data source. Valid values:</p>
         * <ul>
         * <li>0: Not tested.</li>
         * <li>1: Connected.</li>
         * <li>2: Connection failed.</li>
         * <li>-1: Connectivity test not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dsStatus")
        public Integer dsStatus;

        /**
         * <p>The data source type, such as Hive or MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("dsType")
        public String dsType;

        /**
         * <p>The version number of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>3.2.0</p>
         */
        @NameInMap("dsVersion")
        public String dsVersion;

        /**
         * <p>Indicates whether the data source has expired. Valid values:</p>
         * <ul>
         * <li>true: Expired.</li>
         * <li>false: Not expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("expired")
        public Boolean expired;

        /**
         * <p>The primary key ID that uniquely identifies a record.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The profiling task information, including the task status, scheduling ID, profiling rule, and profiling type. This field is empty if the data source is not associated with a profiling task.</p>
         */
        @NameInMap("profilingJob")
        public ListMetaDataComponentPageResponseBodyDataProfilingJob profilingJob;

        public static ListMetaDataComponentPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetaDataComponentPageResponseBodyData self = new ListMetaDataComponentPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetaDataComponentPageResponseBodyData setComponentType(Long componentType) {
            this.componentType = componentType;
            return this;
        }
        public Long getComponentType() {
            return this.componentType;
        }

        public ListMetaDataComponentPageResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMetaDataComponentPageResponseBodyData setDsConfig(String dsConfig) {
            this.dsConfig = dsConfig;
            return this;
        }
        public String getDsConfig() {
            return this.dsConfig;
        }

        public ListMetaDataComponentPageResponseBodyData setDsDesc(String dsDesc) {
            this.dsDesc = dsDesc;
            return this;
        }
        public String getDsDesc() {
            return this.dsDesc;
        }

        public ListMetaDataComponentPageResponseBodyData setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public ListMetaDataComponentPageResponseBodyData setDsName(String dsName) {
            this.dsName = dsName;
            return this;
        }
        public String getDsName() {
            return this.dsName;
        }

        public ListMetaDataComponentPageResponseBodyData setDsStatus(Integer dsStatus) {
            this.dsStatus = dsStatus;
            return this;
        }
        public Integer getDsStatus() {
            return this.dsStatus;
        }

        public ListMetaDataComponentPageResponseBodyData setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public ListMetaDataComponentPageResponseBodyData setDsVersion(String dsVersion) {
            this.dsVersion = dsVersion;
            return this;
        }
        public String getDsVersion() {
            return this.dsVersion;
        }

        public ListMetaDataComponentPageResponseBodyData setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListMetaDataComponentPageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMetaDataComponentPageResponseBodyData setProfilingJob(ListMetaDataComponentPageResponseBodyDataProfilingJob profilingJob) {
            this.profilingJob = profilingJob;
            return this;
        }
        public ListMetaDataComponentPageResponseBodyDataProfilingJob getProfilingJob() {
            return this.profilingJob;
        }

    }

}
