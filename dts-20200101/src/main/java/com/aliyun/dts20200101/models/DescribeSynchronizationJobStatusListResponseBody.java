// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobStatusListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of synchronization instances returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1413460B-138A-48D1-836C-B24EDDC1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The list of synchronization job statuses.</p>
     */
    @NameInMap("SynchronizationJobListStatusList")
    public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList> synchronizationJobListStatusList;

    /**
     * <p>The total number of queried synchronization instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The timestamp when the latest data record is synchronized. The value is a UNIX timestamp.</p>
         * <blockquote>
         * <p>You can use a search engine to find a UNIX timestamp conversion tool.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1610524452</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The synchronization status of the synchronization instance in the specified direction. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Not started.</li>
         * <li><strong>Prechecking</strong>: Prechecking.</li>
         * <li><strong>PrecheckFailed</strong>: Precheck failed.</li>
         * <li><strong>Initializing</strong>: Initial synchronization.</li>
         * <li><strong>InitializeFailed</strong>: Initial synchronization failed.</li>
         * <li><strong>Synchronizing</strong>: Synchronizing.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Suspending</strong>: Suspending.</li>
         * <li><strong>Modifying</strong>: Modifying synchronization objects.</li>
         * <li><strong>Finished</strong>: Finished.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InitializeFailed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong>: Forward.</li>
         * <li><strong>Reverse</strong>: Reverse.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
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
         * <p>The list of synchronization direction details.</p>
         */
        @NameInMap("SynchronizationDirectionInfoList")
        public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList> synchronizationDirectionInfoList;

        /**
         * <p>The instance ID of the data synchronization instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsexjk1alb116****</p>
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
