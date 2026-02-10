// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainSnapshotDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B955107D-E658-4E77-B913-E0AC3D31693F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotDataInfos")
    public DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfos snapshotDataInfos;

    public static DescribeLiveDomainSnapshotDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainSnapshotDataResponseBody self = new DescribeLiveDomainSnapshotDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainSnapshotDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainSnapshotDataResponseBody setSnapshotDataInfos(DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfos snapshotDataInfos) {
        this.snapshotDataInfos = snapshotDataInfos;
        return this;
    }
    public DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfos getSnapshotDataInfos() {
        return this.snapshotDataInfos;
    }

    public static class DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfosSnapshotDataInfo extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("Total")
        public Integer total;

        public static DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfosSnapshotDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfosSnapshotDataInfo self = new DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfosSnapshotDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfosSnapshotDataInfo setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfosSnapshotDataInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfos extends TeaModel {
        @NameInMap("SnapshotDataInfo")
        public java.util.List<DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfosSnapshotDataInfo> snapshotDataInfo;

        public static DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfos self = new DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfos setSnapshotDataInfo(java.util.List<DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfosSnapshotDataInfo> snapshotDataInfo) {
            this.snapshotDataInfo = snapshotDataInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainSnapshotDataResponseBodySnapshotDataInfosSnapshotDataInfo> getSnapshotDataInfo() {
            return this.snapshotDataInfo;
        }

    }

}
