// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserProvisioningStatistics")
    public GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics userProvisioningStatistics;

    public static GetUserProvisioningStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningStatisticsResponseBody self = new GetUserProvisioningStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserProvisioningStatisticsResponseBody setUserProvisioningStatistics(GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics userProvisioningStatistics) {
        this.userProvisioningStatistics = userProvisioningStatistics;
        return this;
    }
    public GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics getUserProvisioningStatistics() {
        return this.userProvisioningStatistics;
    }

    public static class GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics extends TeaModel {
        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("FailedEventCount")
        public Long failedEventCount;

        @NameInMap("LatestAsyncTime")
        public String latestAsyncTime;

        @NameInMap("OwnerPk")
        public String ownerPk;

        @NameInMap("Type")
        public String type;

        public static GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics self = new GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics();
            return TeaModel.build(map, self);
        }

        public GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics setFailedEventCount(Long failedEventCount) {
            this.failedEventCount = failedEventCount;
            return this;
        }
        public Long getFailedEventCount() {
            return this.failedEventCount;
        }

        public GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics setLatestAsyncTime(String latestAsyncTime) {
            this.latestAsyncTime = latestAsyncTime;
            return this;
        }
        public String getLatestAsyncTime() {
            return this.latestAsyncTime;
        }

        public GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics setOwnerPk(String ownerPk) {
            this.ownerPk = ownerPk;
            return this;
        }
        public String getOwnerPk() {
            return this.ownerPk;
        }

        public GetUserProvisioningStatisticsResponseBodyUserProvisioningStatistics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
