// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountActivatedOrNewRegistrationDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public CountActivatedOrNewRegistrationDeviceResponseBodyStatistics statistics;

    public static CountActivatedOrNewRegistrationDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountActivatedOrNewRegistrationDeviceResponseBody self = new CountActivatedOrNewRegistrationDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CountActivatedOrNewRegistrationDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountActivatedOrNewRegistrationDeviceResponseBody setStatistics(CountActivatedOrNewRegistrationDeviceResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public CountActivatedOrNewRegistrationDeviceResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public static class CountActivatedOrNewRegistrationDeviceResponseBodyStatisticsSeries extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("Name")
        public String name;

        public static CountActivatedOrNewRegistrationDeviceResponseBodyStatisticsSeries build(java.util.Map<String, ?> map) throws Exception {
            CountActivatedOrNewRegistrationDeviceResponseBodyStatisticsSeries self = new CountActivatedOrNewRegistrationDeviceResponseBodyStatisticsSeries();
            return TeaModel.build(map, self);
        }

        public CountActivatedOrNewRegistrationDeviceResponseBodyStatisticsSeries setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public CountActivatedOrNewRegistrationDeviceResponseBodyStatisticsSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CountActivatedOrNewRegistrationDeviceResponseBodyStatistics extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("Series")
        public java.util.List<CountActivatedOrNewRegistrationDeviceResponseBodyStatisticsSeries> series;

        public static CountActivatedOrNewRegistrationDeviceResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            CountActivatedOrNewRegistrationDeviceResponseBodyStatistics self = new CountActivatedOrNewRegistrationDeviceResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public CountActivatedOrNewRegistrationDeviceResponseBodyStatistics setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public CountActivatedOrNewRegistrationDeviceResponseBodyStatistics setSeries(java.util.List<CountActivatedOrNewRegistrationDeviceResponseBodyStatisticsSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<CountActivatedOrNewRegistrationDeviceResponseBodyStatisticsSeries> getSeries() {
            return this.series;
        }

    }

}
