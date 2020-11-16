// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainSnapshotDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SnapshotDataInfos")
    @Validation(required = true)
    public DescribeLiveDomainSnapshotDataResponseSnapshotDataInfos snapshotDataInfos;

    public static DescribeLiveDomainSnapshotDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainSnapshotDataResponse self = new DescribeLiveDomainSnapshotDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainSnapshotDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainSnapshotDataResponse setSnapshotDataInfos(DescribeLiveDomainSnapshotDataResponseSnapshotDataInfos snapshotDataInfos) {
        this.snapshotDataInfos = snapshotDataInfos;
        return this;
    }
    public DescribeLiveDomainSnapshotDataResponseSnapshotDataInfos getSnapshotDataInfos() {
        return this.snapshotDataInfos;
    }

    public static class DescribeLiveDomainSnapshotDataResponseSnapshotDataInfosSnapshotDataInfo extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        public static DescribeLiveDomainSnapshotDataResponseSnapshotDataInfosSnapshotDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainSnapshotDataResponseSnapshotDataInfosSnapshotDataInfo self = new DescribeLiveDomainSnapshotDataResponseSnapshotDataInfosSnapshotDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainSnapshotDataResponseSnapshotDataInfosSnapshotDataInfo setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeLiveDomainSnapshotDataResponseSnapshotDataInfosSnapshotDataInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeLiveDomainSnapshotDataResponseSnapshotDataInfos extends TeaModel {
        @NameInMap("SnapshotDataInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainSnapshotDataResponseSnapshotDataInfosSnapshotDataInfo> snapshotDataInfo;

        public static DescribeLiveDomainSnapshotDataResponseSnapshotDataInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainSnapshotDataResponseSnapshotDataInfos self = new DescribeLiveDomainSnapshotDataResponseSnapshotDataInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainSnapshotDataResponseSnapshotDataInfos setSnapshotDataInfo(java.util.List<DescribeLiveDomainSnapshotDataResponseSnapshotDataInfosSnapshotDataInfo> snapshotDataInfo) {
            this.snapshotDataInfo = snapshotDataInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainSnapshotDataResponseSnapshotDataInfosSnapshotDataInfo> getSnapshotDataInfo() {
            return this.snapshotDataInfo;
        }

    }

}
