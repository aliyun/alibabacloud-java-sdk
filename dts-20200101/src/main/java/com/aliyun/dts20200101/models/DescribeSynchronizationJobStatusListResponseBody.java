// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobStatusListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SynchronizationJobListStatusList")
    public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList> synchronizationJobListStatusList;

    public static DescribeSynchronizationJobStatusListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobStatusListResponseBody self = new DescribeSynchronizationJobStatusListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobStatusListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobStatusListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSynchronizationJobStatusListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSynchronizationJobStatusListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSynchronizationJobStatusListResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
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

    public DescribeSynchronizationJobStatusListResponseBody setSynchronizationJobListStatusList(java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList> synchronizationJobListStatusList) {
        this.synchronizationJobListStatusList = synchronizationJobListStatusList;
        return this;
    }
    public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList> getSynchronizationJobListStatusList() {
        return this.synchronizationJobListStatusList;
    }

    public static class DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SynchronizationDirection")
        public String synchronizationDirection;

        @NameInMap("Checkpoint")
        public String checkpoint;

        public static DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList self = new DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList();
            return TeaModel.build(map, self);
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

        public DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

    }

    public static class DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList extends TeaModel {
        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        @NameInMap("SynchronizationDirectionInfoList")
        public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList> synchronizationDirectionInfoList;

        public static DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList self = new DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusList setSynchronizationDirectionInfoList(java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList> synchronizationDirectionInfoList) {
            this.synchronizationDirectionInfoList = synchronizationDirectionInfoList;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobStatusListResponseBodySynchronizationJobListStatusListSynchronizationDirectionInfoList> getSynchronizationDirectionInfoList() {
            return this.synchronizationDirectionInfoList;
        }

    }

}
