// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTranscodeDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeDataInfos")
    @Validation(required = true)
    public DescribeLiveDomainTranscodeDataResponseTranscodeDataInfos transcodeDataInfos;

    public static DescribeLiveDomainTranscodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTranscodeDataResponse self = new DescribeLiveDomainTranscodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTranscodeDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainTranscodeDataResponse setTranscodeDataInfos(DescribeLiveDomainTranscodeDataResponseTranscodeDataInfos transcodeDataInfos) {
        this.transcodeDataInfos = transcodeDataInfos;
        return this;
    }
    public DescribeLiveDomainTranscodeDataResponseTranscodeDataInfos getTranscodeDataInfos() {
        return this.transcodeDataInfos;
    }

    public static class DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Detail")
        @Validation(required = true)
        public String detail;

        public static DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo self = new DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

    public static class DescribeLiveDomainTranscodeDataResponseTranscodeDataInfos extends TeaModel {
        @NameInMap("TranscodeDataInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo> transcodeDataInfo;

        public static DescribeLiveDomainTranscodeDataResponseTranscodeDataInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTranscodeDataResponseTranscodeDataInfos self = new DescribeLiveDomainTranscodeDataResponseTranscodeDataInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTranscodeDataResponseTranscodeDataInfos setTranscodeDataInfo(java.util.List<DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo> transcodeDataInfo) {
            this.transcodeDataInfo = transcodeDataInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainTranscodeDataResponseTranscodeDataInfosTranscodeDataInfo> getTranscodeDataInfo() {
            return this.transcodeDataInfo;
        }

    }

}
