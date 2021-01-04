// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeDailyDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DailyDetails")
    public java.util.List<DescribeDailyDetailsResponseBodyDailyDetails> dailyDetails;

    public static DescribeDailyDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDailyDetailsResponseBody self = new DescribeDailyDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDailyDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDailyDetailsResponseBody setDailyDetails(java.util.List<DescribeDailyDetailsResponseBodyDailyDetails> dailyDetails) {
        this.dailyDetails = dailyDetails;
        return this;
    }
    public java.util.List<DescribeDailyDetailsResponseBodyDailyDetails> getDailyDetails() {
        return this.dailyDetails;
    }

    public static class DescribeDailyDetailsResponseBodyDailyDetails extends TeaModel {
        @NameInMap("IosActiveCount")
        public Long iosActiveCount;

        @NameInMap("Index")
        public Long index;

        @NameInMap("AndroidCount")
        public Long androidCount;

        @NameInMap("IosCount")
        public Long iosCount;

        @NameInMap("NewCount")
        public Long newCount;

        @NameInMap("IpActiveCount")
        public Long ipActiveCount;

        @NameInMap("ActiveCount")
        public Long activeCount;

        @NameInMap("Count")
        public Long count;

        @NameInMap("AndroidActiveCount")
        public Long androidActiveCount;

        public static DescribeDailyDetailsResponseBodyDailyDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDailyDetailsResponseBodyDailyDetails self = new DescribeDailyDetailsResponseBodyDailyDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDailyDetailsResponseBodyDailyDetails setIosActiveCount(Long iosActiveCount) {
            this.iosActiveCount = iosActiveCount;
            return this;
        }
        public Long getIosActiveCount() {
            return this.iosActiveCount;
        }

        public DescribeDailyDetailsResponseBodyDailyDetails setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeDailyDetailsResponseBodyDailyDetails setAndroidCount(Long androidCount) {
            this.androidCount = androidCount;
            return this;
        }
        public Long getAndroidCount() {
            return this.androidCount;
        }

        public DescribeDailyDetailsResponseBodyDailyDetails setIosCount(Long iosCount) {
            this.iosCount = iosCount;
            return this;
        }
        public Long getIosCount() {
            return this.iosCount;
        }

        public DescribeDailyDetailsResponseBodyDailyDetails setNewCount(Long newCount) {
            this.newCount = newCount;
            return this;
        }
        public Long getNewCount() {
            return this.newCount;
        }

        public DescribeDailyDetailsResponseBodyDailyDetails setIpActiveCount(Long ipActiveCount) {
            this.ipActiveCount = ipActiveCount;
            return this;
        }
        public Long getIpActiveCount() {
            return this.ipActiveCount;
        }

        public DescribeDailyDetailsResponseBodyDailyDetails setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public DescribeDailyDetailsResponseBodyDailyDetails setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDailyDetailsResponseBodyDailyDetails setAndroidActiveCount(Long androidActiveCount) {
            this.androidActiveCount = androidActiveCount;
            return this;
        }
        public Long getAndroidActiveCount() {
            return this.androidActiveCount;
        }

    }

}
