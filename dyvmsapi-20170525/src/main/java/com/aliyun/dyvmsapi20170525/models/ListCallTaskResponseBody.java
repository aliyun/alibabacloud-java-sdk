// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
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
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of tasks.</p>
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
         * <br>
         * <p>*   **VMS_VOICE_TTS**: the TTS notification template.</p>
         * <p>*   **VMS_VOICE_CODE**: the voice notification template.</p>
         * <p>*   **VMS_TTS**: the voice verification code template.</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The time when the task was completed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The number of tasks that were complete.</p>
         */
        @NameInMap("CompletedCount")
        public Long completedCount;

        /**
         * <p>The task progress.</p>
         */
        @NameInMap("CompletedRate")
        public Integer completedRate;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The type of the called number.</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The time when the scheduled task was started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("FireTime")
        public String fireTime;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The calling number.</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The task state. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task was in the initial state.</p>
         * <p>*   **RELEASE**: The task was being parsed.</p>
         * <p>*   **RUNNING**: The task was running.</p>
         * <p>*   **STOP**: The task was manually suspended.</p>
         * <p>*   **SYSTEM_STOP**: The task was suspended by the system.</p>
         * <p>*   **CANCEL**: The task was manually canceled.</p>
         * <p>*   **SYSTEM_CANCEL**: The task was canceled by the system.</p>
         * <p>*   **DONE**: The task was complete.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The task name.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The ID of the voice template.</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The template name.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The total number of called numbers.</p>
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
