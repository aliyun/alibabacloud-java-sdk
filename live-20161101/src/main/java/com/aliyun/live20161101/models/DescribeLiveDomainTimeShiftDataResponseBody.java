// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTimeShiftDataResponseBody extends TeaModel {
    @NameInMap("TimeShiftData")
    public DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftData timeShiftData;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainTimeShiftDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTimeShiftDataResponseBody self = new DescribeLiveDomainTimeShiftDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTimeShiftDataResponseBody setTimeShiftData(DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftData timeShiftData) {
        this.timeShiftData = timeShiftData;
        return this;
    }
    public DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftData getTimeShiftData() {
        return this.timeShiftData;
    }

    public DescribeLiveDomainTimeShiftDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Size")
        public String size;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule self = new DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftData extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule> dataModule;

        public static DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftData self = new DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftData setDataModule(java.util.List<DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeLiveDomainTimeShiftDataResponseBodyTimeShiftDataDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
