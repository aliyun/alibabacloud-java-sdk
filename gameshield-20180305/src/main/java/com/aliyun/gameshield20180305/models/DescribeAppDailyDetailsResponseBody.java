// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAppDailyDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppDailyDetails")
    public java.util.List<DescribeAppDailyDetailsResponseBodyAppDailyDetails> appDailyDetails;

    public static DescribeAppDailyDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDailyDetailsResponseBody self = new DescribeAppDailyDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppDailyDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppDailyDetailsResponseBody setAppDailyDetails(java.util.List<DescribeAppDailyDetailsResponseBodyAppDailyDetails> appDailyDetails) {
        this.appDailyDetails = appDailyDetails;
        return this;
    }
    public java.util.List<DescribeAppDailyDetailsResponseBodyAppDailyDetails> getAppDailyDetails() {
        return this.appDailyDetails;
    }

    public static class DescribeAppDailyDetailsResponseBodyAppDailyDetails extends TeaModel {
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

        public static DescribeAppDailyDetailsResponseBodyAppDailyDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppDailyDetailsResponseBodyAppDailyDetails self = new DescribeAppDailyDetailsResponseBodyAppDailyDetails();
            return TeaModel.build(map, self);
        }

        public DescribeAppDailyDetailsResponseBodyAppDailyDetails setIosActiveCount(Long iosActiveCount) {
            this.iosActiveCount = iosActiveCount;
            return this;
        }
        public Long getIosActiveCount() {
            return this.iosActiveCount;
        }

        public DescribeAppDailyDetailsResponseBodyAppDailyDetails setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeAppDailyDetailsResponseBodyAppDailyDetails setAndroidCount(Long androidCount) {
            this.androidCount = androidCount;
            return this;
        }
        public Long getAndroidCount() {
            return this.androidCount;
        }

        public DescribeAppDailyDetailsResponseBodyAppDailyDetails setIosCount(Long iosCount) {
            this.iosCount = iosCount;
            return this;
        }
        public Long getIosCount() {
            return this.iosCount;
        }

        public DescribeAppDailyDetailsResponseBodyAppDailyDetails setNewCount(Long newCount) {
            this.newCount = newCount;
            return this;
        }
        public Long getNewCount() {
            return this.newCount;
        }

        public DescribeAppDailyDetailsResponseBodyAppDailyDetails setIpActiveCount(Long ipActiveCount) {
            this.ipActiveCount = ipActiveCount;
            return this;
        }
        public Long getIpActiveCount() {
            return this.ipActiveCount;
        }

        public DescribeAppDailyDetailsResponseBodyAppDailyDetails setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public DescribeAppDailyDetailsResponseBodyAppDailyDetails setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeAppDailyDetailsResponseBodyAppDailyDetails setAndroidActiveCount(Long androidActiveCount) {
            this.androidActiveCount = androidActiveCount;
            return this;
        }
        public Long getAndroidActiveCount() {
            return this.androidActiveCount;
        }

    }

}
