// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobStatusListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of data synchronization instances displayed on one page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The status of the data synchronization tasks.</p>
     */
    @NameInMap("SynchronizationJobListStatusList")
    public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList> synchronizationJobListStatusList;

    /**
     * <p>The total number of data synchronization instances.</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeSynchronizationJobStatusListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobStatusListResponseBody self = new DescribeSynchronizationJobStatusListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobStatusListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSynchronizationJobStatusListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSynchronizationJobStatusListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSynchronizationJobStatusListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSynchronizationJobStatusListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobStatusListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSynchronizationJobStatusListResponseBody setSynchronizationJobListStatusList(java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList> synchronizationJobListStatusList) {
        this.synchronizationJobListStatusList = synchronizationJobListStatusList;
        return this;
    }
    public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList> getSynchronizationJobListStatusList() {
        return this.synchronizationJobListStatusList;
    }

    public DescribeSynchronizationJobStatusListResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList extends TeaModel {
        /**
         * <p>The UNIX timestamp generated when the latest data record was synchronized.</p>
         * <br>
         * <p>>  You can use a search engine to obtain a UNIX timestamp converter.</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The status of the data synchronization task in this direction. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: The task is not started.</p>
         * <p>*   **Prechecking**: The task is being prechecked.</p>
         * <p>*   **PrecheckFailed**: The task failed to pass the precheck.</p>
         * <p>*   **Initializing**: The task is performing initial synchronization.</p>
         * <p>*   **InitializeFailed**: Initial synchronization failed.</p>
         * <p>*   **Synchronizing**: The task is synchronizing data.</p>
         * <p>*   **Failed**: The task failed to synchronize data.</p>
         * <p>*   **Suspending**: The task is paused.</p>
         * <p>*   **Modifying**: The objects in the task are being modified.</p>
         * <p>*   **Finished**: The task is completed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <br>
         * <p>*   **Forward**</p>
         * <p>*   **Reverse**</p>
         */
        @NameInMap("SynchronizationDirection")
        public String synchronizationDirection;

        public static DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList self = new DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList setSynchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

    }

    public static class DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList extends TeaModel {
        /**
         * <p>The details of data synchronization tasks in each direction.</p>
         */
        @NameInMap("SynchronizationDirectionInfoList")
        public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList> synchronizationDirectionInfoList;

        /**
         * <p>The ID of the data synchronization instance.</p>
         */
        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        public static DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList self = new DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList setSynchronizationDirectionInfoList(java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList> synchronizationDirectionInfoList) {
            this.synchronizationDirectionInfoList = synchronizationDirectionInfoList;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList> getSynchronizationDirectionInfoList() {
            return this.synchronizationDirectionInfoList;
        }

        public DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

    }

}
