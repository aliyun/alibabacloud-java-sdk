// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QuerySpaceUsageResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("SpaceUsageDataList")
    public java.util.List<QuerySpaceUsageResponseBodySpaceUsageDataList> spaceUsageDataList;

    @NameInMap("StartTime")
    public String startTime;

    public static QuerySpaceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpaceUsageResponseBody self = new QuerySpaceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpaceUsageResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySpaceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpaceUsageResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public QuerySpaceUsageResponseBody setSpaceUsageDataList(java.util.List<QuerySpaceUsageResponseBodySpaceUsageDataList> spaceUsageDataList) {
        this.spaceUsageDataList = spaceUsageDataList;
        return this;
    }
    public java.util.List<QuerySpaceUsageResponseBodySpaceUsageDataList> getSpaceUsageDataList() {
        return this.spaceUsageDataList;
    }

    public QuerySpaceUsageResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage extends TeaModel {
        @NameInMap("CdnTraffic")
        public Long cdnTraffic;

        @NameInMap("DownloadCount")
        public Long downloadCount;

        @NameInMap("StorageSize")
        public Long storageSize;

        @NameInMap("UploadCount")
        public Long uploadCount;

        public static QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage build(java.util.Map<String, ?> map) throws Exception {
            QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage self = new QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage();
            return TeaModel.build(map, self);
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage setCdnTraffic(Long cdnTraffic) {
            this.cdnTraffic = cdnTraffic;
            return this;
        }
        public Long getCdnTraffic() {
            return this.cdnTraffic;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage setUploadCount(Long uploadCount) {
            this.uploadCount = uploadCount;
            return this;
        }
        public Long getUploadCount() {
            return this.uploadCount;
        }

    }

    public static class QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage extends TeaModel {
        @NameInMap("ReadCount")
        public Long readCount;

        @NameInMap("StorageSize")
        public Long storageSize;

        @NameInMap("WriteCount")
        public Long writeCount;

        public static QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage build(java.util.Map<String, ?> map) throws Exception {
            QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage self = new QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage();
            return TeaModel.build(map, self);
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage setReadCount(Long readCount) {
            this.readCount = readCount;
            return this;
        }
        public Long getReadCount() {
            return this.readCount;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage setWriteCount(Long writeCount) {
            this.writeCount = writeCount;
            return this;
        }
        public Long getWriteCount() {
            return this.writeCount;
        }

    }

    public static class QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage extends TeaModel {
        @NameInMap("Cost")
        public Long cost;

        @NameInMap("RequestCount")
        public Long requestCount;

        @NameInMap("TxTraffic")
        public Long txTraffic;

        public static QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage build(java.util.Map<String, ?> map) throws Exception {
            QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage self = new QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage();
            return TeaModel.build(map, self);
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage setTxTraffic(Long txTraffic) {
            this.txTraffic = txTraffic;
            return this;
        }
        public Long getTxTraffic() {
            return this.txTraffic;
        }

    }

    public static class QuerySpaceUsageResponseBodySpaceUsageDataListWhUsage extends TeaModel {
        @NameInMap("CdnTraffic")
        public Long cdnTraffic;

        @NameInMap("StorageSize")
        public Long storageSize;

        public static QuerySpaceUsageResponseBodySpaceUsageDataListWhUsage build(java.util.Map<String, ?> map) throws Exception {
            QuerySpaceUsageResponseBodySpaceUsageDataListWhUsage self = new QuerySpaceUsageResponseBodySpaceUsageDataListWhUsage();
            return TeaModel.build(map, self);
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListWhUsage setCdnTraffic(Long cdnTraffic) {
            this.cdnTraffic = cdnTraffic;
            return this;
        }
        public Long getCdnTraffic() {
            return this.cdnTraffic;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataListWhUsage setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

    }

    public static class QuerySpaceUsageResponseBodySpaceUsageDataList extends TeaModel {
        @NameInMap("CsUsage")
        public QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage csUsage;

        @NameInMap("DbUsage")
        public QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage dbUsage;

        /**
         * <p>标记该数据是否出账。</p>
         * <p>- true：正常出账。</p>
         * <p>- false：不出账，例如在空间停服的情况下，用量数据不用于出账。</p>
         */
        @NameInMap("EffectiveBillFlag")
        public Boolean effectiveBillFlag;

        @NameInMap("FcUsage")
        public QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage fcUsage;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("WhUsage")
        public QuerySpaceUsageResponseBodySpaceUsageDataListWhUsage whUsage;

        public static QuerySpaceUsageResponseBodySpaceUsageDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpaceUsageResponseBodySpaceUsageDataList self = new QuerySpaceUsageResponseBodySpaceUsageDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataList setCsUsage(QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage csUsage) {
            this.csUsage = csUsage;
            return this;
        }
        public QuerySpaceUsageResponseBodySpaceUsageDataListCsUsage getCsUsage() {
            return this.csUsage;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataList setDbUsage(QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage dbUsage) {
            this.dbUsage = dbUsage;
            return this;
        }
        public QuerySpaceUsageResponseBodySpaceUsageDataListDbUsage getDbUsage() {
            return this.dbUsage;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataList setEffectiveBillFlag(Boolean effectiveBillFlag) {
            this.effectiveBillFlag = effectiveBillFlag;
            return this;
        }
        public Boolean getEffectiveBillFlag() {
            return this.effectiveBillFlag;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataList setFcUsage(QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage fcUsage) {
            this.fcUsage = fcUsage;
            return this;
        }
        public QuerySpaceUsageResponseBodySpaceUsageDataListFcUsage getFcUsage() {
            return this.fcUsage;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public QuerySpaceUsageResponseBodySpaceUsageDataList setWhUsage(QuerySpaceUsageResponseBodySpaceUsageDataListWhUsage whUsage) {
            this.whUsage = whUsage;
            return this;
        }
        public QuerySpaceUsageResponseBodySpaceUsageDataListWhUsage getWhUsage() {
            return this.whUsage;
        }

    }

}
