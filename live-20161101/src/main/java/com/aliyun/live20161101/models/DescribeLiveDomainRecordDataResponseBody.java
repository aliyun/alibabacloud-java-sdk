// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRecordDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordDataInfos")
    public DescribeLiveDomainRecordDataResponseBodyRecordDataInfos recordDataInfos;

    public static DescribeLiveDomainRecordDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRecordDataResponseBody self = new DescribeLiveDomainRecordDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRecordDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRecordDataResponseBody setRecordDataInfos(DescribeLiveDomainRecordDataResponseBodyRecordDataInfos recordDataInfos) {
        this.recordDataInfos = recordDataInfos;
        return this;
    }
    public DescribeLiveDomainRecordDataResponseBodyRecordDataInfos getRecordDataInfos() {
        return this.recordDataInfos;
    }

    public static class DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail extends TeaModel {
        @NameInMap("FLV")
        public Integer FLV;

        @NameInMap("TS")
        public Integer TS;

        @NameInMap("MP4")
        public Integer MP4;

        public static DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail self = new DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail setFLV(Integer FLV) {
            this.FLV = FLV;
            return this;
        }
        public Integer getFLV() {
            return this.FLV;
        }

        public DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail setTS(Integer TS) {
            this.TS = TS;
            return this;
        }
        public Integer getTS() {
            return this.TS;
        }

        public DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail setMP4(Integer MP4) {
            this.MP4 = MP4;
            return this;
        }
        public Integer getMP4() {
            return this.MP4;
        }

    }

    public static class DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Detail")
        public DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail detail;

        public static DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo self = new DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo setDetail(DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail detail) {
            this.detail = detail;
            return this;
        }
        public DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfoDetail getDetail() {
            return this.detail;
        }

    }

    public static class DescribeLiveDomainRecordDataResponseBodyRecordDataInfos extends TeaModel {
        @NameInMap("RecordDataInfo")
        public java.util.List<DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo> recordDataInfo;

        public static DescribeLiveDomainRecordDataResponseBodyRecordDataInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordDataResponseBodyRecordDataInfos self = new DescribeLiveDomainRecordDataResponseBodyRecordDataInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordDataResponseBodyRecordDataInfos setRecordDataInfo(java.util.List<DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo> recordDataInfo) {
            this.recordDataInfo = recordDataInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainRecordDataResponseBodyRecordDataInfosRecordDataInfo> getRecordDataInfo() {
            return this.recordDataInfo;
        }

    }

}
