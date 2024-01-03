// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribePairDrillsResponseBody extends TeaModel {
    /**
     * <p>The information of disaster recovery drills that were performed on the replication pair.</p>
     */
    @NameInMap("Drills")
    public java.util.List<DescribePairDrillsResponseBodyDrills> drills;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePairDrillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePairDrillsResponseBody self = new DescribePairDrillsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePairDrillsResponseBody setDrills(java.util.List<DescribePairDrillsResponseBodyDrills> drills) {
        this.drills = drills;
        return this;
    }
    public java.util.List<DescribePairDrillsResponseBodyDrills> getDrills() {
        return this.drills;
    }

    public DescribePairDrillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePairDrillsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePairDrillsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePairDrillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePairDrillsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePairDrillsResponseBodyDrills extends TeaModel {
        /**
         * <p>The ID of the drill disk.</p>
         */
        @NameInMap("DrillDiskId")
        public String drillDiskId;

        /**
         * <p>The status of the drill disk. Valid values:</p>
         * <br>
         * <p>*   created</p>
         * <p>*   deleted</p>
         * <p>*   creating</p>
         * <p>*   deleting</p>
         * <br>
         * <p>>  This parameter can also display error code details if your drill disk fails to be created or deleted.</p>
         */
        @NameInMap("DrillDiskStatus")
        public String drillDiskStatus;

        /**
         * <p>The ID of the drill.</p>
         */
        @NameInMap("DrillId")
        public String drillId;

        /**
         * <p>The recovery point of the drill. The value of this parameter is a timestamp. Unit: seconds.</p>
         */
        @NameInMap("RecoverPoint")
        public Long recoverPoint;

        /**
         * <p>The beginning time of the drill. The value of this parameter is a timestamp. Unit: seconds.</p>
         */
        @NameInMap("StartAt")
        public Long startAt;

        /**
         * <p>The status of the drill. Valid values:</p>
         * <br>
         * <p>*   execute_failed</p>
         * <p>*   executed</p>
         * <p>*   executing</p>
         * <p>*   clear_failed</p>
         * <p>*   clearing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The error message that was displayed if the drill failed to be executed.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        public static DescribePairDrillsResponseBodyDrills build(java.util.Map<String, ?> map) throws Exception {
            DescribePairDrillsResponseBodyDrills self = new DescribePairDrillsResponseBodyDrills();
            return TeaModel.build(map, self);
        }

        public DescribePairDrillsResponseBodyDrills setDrillDiskId(String drillDiskId) {
            this.drillDiskId = drillDiskId;
            return this;
        }
        public String getDrillDiskId() {
            return this.drillDiskId;
        }

        public DescribePairDrillsResponseBodyDrills setDrillDiskStatus(String drillDiskStatus) {
            this.drillDiskStatus = drillDiskStatus;
            return this;
        }
        public String getDrillDiskStatus() {
            return this.drillDiskStatus;
        }

        public DescribePairDrillsResponseBodyDrills setDrillId(String drillId) {
            this.drillId = drillId;
            return this;
        }
        public String getDrillId() {
            return this.drillId;
        }

        public DescribePairDrillsResponseBodyDrills setRecoverPoint(Long recoverPoint) {
            this.recoverPoint = recoverPoint;
            return this;
        }
        public Long getRecoverPoint() {
            return this.recoverPoint;
        }

        public DescribePairDrillsResponseBodyDrills setStartAt(Long startAt) {
            this.startAt = startAt;
            return this;
        }
        public Long getStartAt() {
            return this.startAt;
        }

        public DescribePairDrillsResponseBodyDrills setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePairDrillsResponseBodyDrills setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

}
