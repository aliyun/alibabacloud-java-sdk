// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTimeShiftDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TimeShiftData")
    @Validation(required = true)
    public DescribeLiveDomainTimeShiftDataResponseTimeShiftData timeShiftData;

    public static DescribeLiveDomainTimeShiftDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTimeShiftDataResponse self = new DescribeLiveDomainTimeShiftDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTimeShiftDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainTimeShiftDataResponse setTimeShiftData(DescribeLiveDomainTimeShiftDataResponseTimeShiftData timeShiftData) {
        this.timeShiftData = timeShiftData;
        return this;
    }
    public DescribeLiveDomainTimeShiftDataResponseTimeShiftData getTimeShiftData() {
        return this.timeShiftData;
    }

    public static class DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Size")
        @Validation(required = true)
        public String size;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule self = new DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeLiveDomainTimeShiftDataResponseTimeShiftData extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule> dataModule;

        public static DescribeLiveDomainTimeShiftDataResponseTimeShiftData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTimeShiftDataResponseTimeShiftData self = new DescribeLiveDomainTimeShiftDataResponseTimeShiftData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTimeShiftDataResponseTimeShiftData setDataModule(java.util.List<DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainTimeShiftDataResponseTimeShiftDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
