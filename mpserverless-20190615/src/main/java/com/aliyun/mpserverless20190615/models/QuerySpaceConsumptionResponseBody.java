// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QuerySpaceConsumptionResponseBody extends TeaModel {
    @NameInMap("CsUsage")
    public QuerySpaceConsumptionResponseBodyCsUsage csUsage;

    @NameInMap("CycleEndTime")
    public Long cycleEndTime;

    @NameInMap("CycleStartTime")
    public Long cycleStartTime;

    @NameInMap("DbUsage")
    public QuerySpaceConsumptionResponseBodyDbUsage dbUsage;

    @NameInMap("FcUsage")
    public QuerySpaceConsumptionResponseBodyFcUsage fcUsage;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("SpecCode")
    public String specCode;

    @NameInMap("WhUsage")
    public QuerySpaceConsumptionResponseBodyWhUsage whUsage;

    public static QuerySpaceConsumptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpaceConsumptionResponseBody self = new QuerySpaceConsumptionResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpaceConsumptionResponseBody setCsUsage(QuerySpaceConsumptionResponseBodyCsUsage csUsage) {
        this.csUsage = csUsage;
        return this;
    }
    public QuerySpaceConsumptionResponseBodyCsUsage getCsUsage() {
        return this.csUsage;
    }

    public QuerySpaceConsumptionResponseBody setCycleEndTime(Long cycleEndTime) {
        this.cycleEndTime = cycleEndTime;
        return this;
    }
    public Long getCycleEndTime() {
        return this.cycleEndTime;
    }

    public QuerySpaceConsumptionResponseBody setCycleStartTime(Long cycleStartTime) {
        this.cycleStartTime = cycleStartTime;
        return this;
    }
    public Long getCycleStartTime() {
        return this.cycleStartTime;
    }

    public QuerySpaceConsumptionResponseBody setDbUsage(QuerySpaceConsumptionResponseBodyDbUsage dbUsage) {
        this.dbUsage = dbUsage;
        return this;
    }
    public QuerySpaceConsumptionResponseBodyDbUsage getDbUsage() {
        return this.dbUsage;
    }

    public QuerySpaceConsumptionResponseBody setFcUsage(QuerySpaceConsumptionResponseBodyFcUsage fcUsage) {
        this.fcUsage = fcUsage;
        return this;
    }
    public QuerySpaceConsumptionResponseBodyFcUsage getFcUsage() {
        return this.fcUsage;
    }

    public QuerySpaceConsumptionResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QuerySpaceConsumptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpaceConsumptionResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public QuerySpaceConsumptionResponseBody setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public QuerySpaceConsumptionResponseBody setWhUsage(QuerySpaceConsumptionResponseBodyWhUsage whUsage) {
        this.whUsage = whUsage;
        return this;
    }
    public QuerySpaceConsumptionResponseBodyWhUsage getWhUsage() {
        return this.whUsage;
    }

    public static class QuerySpaceConsumptionResponseBodyCsUsage extends TeaModel {
        @NameInMap("CdnTraffic")
        public Long cdnTraffic;

        @NameInMap("DownloadCount")
        public Long downloadCount;

        @NameInMap("StorageSize")
        public Long storageSize;

        @NameInMap("UploadCount")
        public Long uploadCount;

        public static QuerySpaceConsumptionResponseBodyCsUsage build(java.util.Map<String, ?> map) throws Exception {
            QuerySpaceConsumptionResponseBodyCsUsage self = new QuerySpaceConsumptionResponseBodyCsUsage();
            return TeaModel.build(map, self);
        }

        public QuerySpaceConsumptionResponseBodyCsUsage setCdnTraffic(Long cdnTraffic) {
            this.cdnTraffic = cdnTraffic;
            return this;
        }
        public Long getCdnTraffic() {
            return this.cdnTraffic;
        }

        public QuerySpaceConsumptionResponseBodyCsUsage setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        public QuerySpaceConsumptionResponseBodyCsUsage setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public QuerySpaceConsumptionResponseBodyCsUsage setUploadCount(Long uploadCount) {
            this.uploadCount = uploadCount;
            return this;
        }
        public Long getUploadCount() {
            return this.uploadCount;
        }

    }

    public static class QuerySpaceConsumptionResponseBodyDbUsage extends TeaModel {
        @NameInMap("ReadCount")
        public Long readCount;

        @NameInMap("StorageSize")
        public Long storageSize;

        @NameInMap("WriteCount")
        public Long writeCount;

        public static QuerySpaceConsumptionResponseBodyDbUsage build(java.util.Map<String, ?> map) throws Exception {
            QuerySpaceConsumptionResponseBodyDbUsage self = new QuerySpaceConsumptionResponseBodyDbUsage();
            return TeaModel.build(map, self);
        }

        public QuerySpaceConsumptionResponseBodyDbUsage setReadCount(Long readCount) {
            this.readCount = readCount;
            return this;
        }
        public Long getReadCount() {
            return this.readCount;
        }

        public QuerySpaceConsumptionResponseBodyDbUsage setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public QuerySpaceConsumptionResponseBodyDbUsage setWriteCount(Long writeCount) {
            this.writeCount = writeCount;
            return this;
        }
        public Long getWriteCount() {
            return this.writeCount;
        }

    }

    public static class QuerySpaceConsumptionResponseBodyFcUsage extends TeaModel {
        @NameInMap("Cost")
        public Long cost;

        @NameInMap("RequestCount")
        public Long requestCount;

        @NameInMap("TxTraffic")
        public Long txTraffic;

        public static QuerySpaceConsumptionResponseBodyFcUsage build(java.util.Map<String, ?> map) throws Exception {
            QuerySpaceConsumptionResponseBodyFcUsage self = new QuerySpaceConsumptionResponseBodyFcUsage();
            return TeaModel.build(map, self);
        }

        public QuerySpaceConsumptionResponseBodyFcUsage setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public QuerySpaceConsumptionResponseBodyFcUsage setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public QuerySpaceConsumptionResponseBodyFcUsage setTxTraffic(Long txTraffic) {
            this.txTraffic = txTraffic;
            return this;
        }
        public Long getTxTraffic() {
            return this.txTraffic;
        }

    }

    public static class QuerySpaceConsumptionResponseBodyWhUsage extends TeaModel {
        @NameInMap("CdnTraffic")
        public Long cdnTraffic;

        @NameInMap("StorageSize")
        public Long storageSize;

        public static QuerySpaceConsumptionResponseBodyWhUsage build(java.util.Map<String, ?> map) throws Exception {
            QuerySpaceConsumptionResponseBodyWhUsage self = new QuerySpaceConsumptionResponseBodyWhUsage();
            return TeaModel.build(map, self);
        }

        public QuerySpaceConsumptionResponseBodyWhUsage setCdnTraffic(Long cdnTraffic) {
            this.cdnTraffic = cdnTraffic;
            return this;
        }
        public Long getCdnTraffic() {
            return this.cdnTraffic;
        }

        public QuerySpaceConsumptionResponseBodyWhUsage setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

    }

}
