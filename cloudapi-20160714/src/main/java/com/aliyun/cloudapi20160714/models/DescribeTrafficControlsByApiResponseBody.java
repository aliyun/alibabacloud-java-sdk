// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeTrafficControlsByApiResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned throttling policy information. It is an array consisting of TrafficControlItem data.</p>
     */
    @NameInMap("TrafficControlItems")
    public DescribeTrafficControlsByApiResponseBodyTrafficControlItems trafficControlItems;

    public static DescribeTrafficControlsByApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficControlsByApiResponseBody self = new DescribeTrafficControlsByApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficControlsByApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrafficControlsByApiResponseBody setTrafficControlItems(DescribeTrafficControlsByApiResponseBodyTrafficControlItems trafficControlItems) {
        this.trafficControlItems = trafficControlItems;
        return this;
    }
    public DescribeTrafficControlsByApiResponseBodyTrafficControlItems getTrafficControlItems() {
        return this.trafficControlItems;
    }

    public static class DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem extends TeaModel {
        /**
         * <p>The binding time of the policy.</p>
         */
        @NameInMap("BoundTime")
        public String boundTime;

        /**
         * <p>The ID of the throttling policy.</p>
         */
        @NameInMap("TrafficControlItemId")
        public String trafficControlItemId;

        /**
         * <p>The name of the throttling policy.</p>
         */
        @NameInMap("TrafficControlItemName")
        public String trafficControlItemName;

        public static DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem self = new DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem setTrafficControlItemId(String trafficControlItemId) {
            this.trafficControlItemId = trafficControlItemId;
            return this;
        }
        public String getTrafficControlItemId() {
            return this.trafficControlItemId;
        }

        public DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem setTrafficControlItemName(String trafficControlItemName) {
            this.trafficControlItemName = trafficControlItemName;
            return this;
        }
        public String getTrafficControlItemName() {
            return this.trafficControlItemName;
        }

    }

    public static class DescribeTrafficControlsByApiResponseBodyTrafficControlItems extends TeaModel {
        @NameInMap("TrafficControlItem")
        public java.util.List<DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem> trafficControlItem;

        public static DescribeTrafficControlsByApiResponseBodyTrafficControlItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficControlsByApiResponseBodyTrafficControlItems self = new DescribeTrafficControlsByApiResponseBodyTrafficControlItems();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficControlsByApiResponseBodyTrafficControlItems setTrafficControlItem(java.util.List<DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem> trafficControlItem) {
            this.trafficControlItem = trafficControlItem;
            return this;
        }
        public java.util.List<DescribeTrafficControlsByApiResponseBodyTrafficControlItemsTrafficControlItem> getTrafficControlItem() {
            return this.trafficControlItem;
        }

    }

}
