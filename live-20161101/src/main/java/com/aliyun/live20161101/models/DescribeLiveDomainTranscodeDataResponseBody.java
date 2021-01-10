// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTranscodeDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TranscodeDataInfos")
    public DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfos transcodeDataInfos;

    public static DescribeLiveDomainTranscodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTranscodeDataResponseBody self = new DescribeLiveDomainTranscodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTranscodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainTranscodeDataResponseBody setTranscodeDataInfos(DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfos transcodeDataInfos) {
        this.transcodeDataInfos = transcodeDataInfos;
        return this;
    }
    public DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfos getTranscodeDataInfos() {
        return this.transcodeDataInfos;
    }

    public static class DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Detail")
        public String detail;

        public static DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo self = new DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

    public static class DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfos extends TeaModel {
        @NameInMap("TranscodeDataInfo")
        public java.util.List<DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo> transcodeDataInfo;

        public static DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfos self = new DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfos setTranscodeDataInfo(java.util.List<DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo> transcodeDataInfo) {
            this.transcodeDataInfo = transcodeDataInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainTranscodeDataResponseBodyTranscodeDataInfosTranscodeDataInfo> getTranscodeDataInfo() {
            return this.transcodeDataInfo;
        }

    }

}
