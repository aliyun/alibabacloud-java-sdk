// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRecordUsageDataResponseBody extends TeaModel {
    @NameInMap("RecordUsageData")
    public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData recordUsageData;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainRecordUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRecordUsageDataResponseBody self = new DescribeLiveDomainRecordUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRecordUsageDataResponseBody setRecordUsageData(DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData recordUsageData) {
        this.recordUsageData = recordUsageData;
        return this;
    }
    public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData getRecordUsageData() {
        return this.recordUsageData;
    }

    public DescribeLiveDomainRecordUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Type")
        public String type;

        public static DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule self = new DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule> dataModule;

        public static DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData self = new DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageData setDataModule(java.util.List<DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainRecordUsageDataResponseBodyRecordUsageDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
