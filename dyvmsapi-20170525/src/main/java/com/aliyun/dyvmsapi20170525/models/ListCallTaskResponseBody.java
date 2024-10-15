// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task information.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCallTaskResponseBodyData> data;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5B0F201F-DCDA-45C2-AA92-1AE177F94991</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListCallTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallTaskResponseBody self = new ListCallTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallTaskResponseBody setData(java.util.List<ListCallTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCallTaskResponseBodyData> getData() {
        return this.data;
    }

    public ListCallTaskResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCallTaskResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCallTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallTaskResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListCallTaskResponseBodyData extends TeaModel {
        /**
         * <p>The type of the task template. Valid values:</p>
         * <ul>
         * <li><strong>VMS_VOICE_TTS</strong>: the TTS notification template.</li>
         * <li><strong>VMS_VOICE_CODE</strong>: the voice notification template.</li>
         * <li><strong>VMS_TTS</strong>: the voice verification code template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VMS_VOICE_TTS</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The time when the task was completed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1614330986000</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The number of tasks that were complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CompletedCount")
        public Long completedCount;

        /**
         * <p>The task progress.</p>
         * 
         * <strong>example:</strong>
         * <p>26%</p>
         */
        @NameInMap("CompletedRate")
        public Integer completedRate;

        /**
         * <p>This parameter is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The type of the called number.</p>
         * 
         * <strong>example:</strong>
         * <p>LIST</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The time when the scheduled task was started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1614330978000</p>
         */
        @NameInMap("FireTime")
        public String fireTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123879546214</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>0571000****</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The task state. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task was in the initial state.</li>
         * <li><strong>RELEASE</strong>: The task was being parsed.</li>
         * <li><strong>RUNNING</strong>: The task was running.</li>
         * <li><strong>STOP</strong>: The task was manually suspended.</li>
         * <li><strong>SYSTEM_STOP</strong>: The task was suspended by the system.</li>
         * <li><strong>CANCEL</strong>: The task was manually canceled.</li>
         * <li><strong>SYSTEM_CANCEL</strong>: The task was canceled by the system.</li>
         * <li><strong>DONE</strong>: The task was complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>This parameter is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The ID of the voice template.</p>
         * 
         * <strong>example:</strong>
         * <p>TTS_2100****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Template</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The total number of called numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCallTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallTaskResponseBodyData self = new ListCallTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallTaskResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListCallTaskResponseBodyData setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListCallTaskResponseBodyData setCompletedCount(Long completedCount) {
            this.completedCount = completedCount;
            return this;
        }
        public Long getCompletedCount() {
            return this.completedCount;
        }

        public ListCallTaskResponseBodyData setCompletedRate(Integer completedRate) {
            this.completedRate = completedRate;
            return this;
        }
        public Integer getCompletedRate() {
            return this.completedRate;
        }

        public ListCallTaskResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListCallTaskResponseBodyData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListCallTaskResponseBodyData setFireTime(String fireTime) {
            this.fireTime = fireTime;
            return this;
        }
        public String getFireTime() {
            return this.fireTime;
        }

        public ListCallTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCallTaskResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListCallTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCallTaskResponseBodyData setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public ListCallTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListCallTaskResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListCallTaskResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListCallTaskResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
