// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRecordDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordDataInfos")
    @Validation(required = true)
    public DescribeLiveDomainRecordDataResponseRecordDataInfos recordDataInfos;

    public static DescribeLiveDomainRecordDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRecordDataResponse self = new DescribeLiveDomainRecordDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRecordDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRecordDataResponse setRecordDataInfos(DescribeLiveDomainRecordDataResponseRecordDataInfos recordDataInfos) {
        this.recordDataInfos = recordDataInfos;
        return this;
    }
    public DescribeLiveDomainRecordDataResponseRecordDataInfos getRecordDataInfos() {
        return this.recordDataInfos;
    }

    public static class DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail extends TeaModel {
        @NameInMap("MP4")
        @Validation(required = true)
        public Integer MP4;

        @NameInMap("FLV")
        @Validation(required = true)
        public Integer FLV;

        @NameInMap("TS")
        @Validation(required = true)
        public Integer TS;

        public static DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail self = new DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail setMP4(Integer MP4) {
            this.MP4 = MP4;
            return this;
        }
        public Integer getMP4() {
            return this.MP4;
        }

        public DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail setFLV(Integer FLV) {
            this.FLV = FLV;
            return this;
        }
        public Integer getFLV() {
            return this.FLV;
        }

        public DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail setTS(Integer TS) {
            this.TS = TS;
            return this;
        }
        public Integer getTS() {
            return this.TS;
        }

    }

    public static class DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Detail")
        @Validation(required = true)
        public DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail detail;

        public static DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo self = new DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo setDetail(DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail detail) {
            this.detail = detail;
            return this;
        }
        public DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfoDetail getDetail() {
            return this.detail;
        }

    }

    public static class DescribeLiveDomainRecordDataResponseRecordDataInfos extends TeaModel {
        @NameInMap("RecordDataInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo> recordDataInfo;

        public static DescribeLiveDomainRecordDataResponseRecordDataInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordDataResponseRecordDataInfos self = new DescribeLiveDomainRecordDataResponseRecordDataInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordDataResponseRecordDataInfos setRecordDataInfo(java.util.List<DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo> recordDataInfo) {
            this.recordDataInfo = recordDataInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainRecordDataResponseRecordDataInfosRecordDataInfo> getRecordDataInfo() {
            return this.recordDataInfo;
        }

    }

}
