// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficDataResponseBody extends TeaModel {
    /**
     * <p>The returned downlink traffic data of API calls. It is an array consisting of MonitorItem data.</p>
     */
    @NameInMap("CallDownloads")
    public DescribeApiTrafficDataResponseBodyCallDownloads callDownloads;

    /**
     * <p>The returned uplink traffic data of API calls. It is an array consisting of MonitorItem data.</p>
     */
    @NameInMap("CallUploads")
    public DescribeApiTrafficDataResponseBodyCallUploads callUploads;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApiTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficDataResponseBody self = new DescribeApiTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficDataResponseBody setCallDownloads(DescribeApiTrafficDataResponseBodyCallDownloads callDownloads) {
        this.callDownloads = callDownloads;
        return this;
    }
    public DescribeApiTrafficDataResponseBodyCallDownloads getCallDownloads() {
        return this.callDownloads;
    }

    public DescribeApiTrafficDataResponseBody setCallUploads(DescribeApiTrafficDataResponseBodyCallUploads callUploads) {
        this.callUploads = callUploads;
        return this;
    }
    public DescribeApiTrafficDataResponseBodyCallUploads getCallUploads() {
        return this.callUploads;
    }

    public DescribeApiTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem extends TeaModel {
        /**
         * <p>The time of the monitoring metric. The time format follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The value corresponding to the monitoring metric.</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem self = new DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeApiTrafficDataResponseBodyCallDownloads extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem> monitorItem;

        public static DescribeApiTrafficDataResponseBodyCallDownloads build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficDataResponseBodyCallDownloads self = new DescribeApiTrafficDataResponseBodyCallDownloads();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficDataResponseBodyCallDownloads setMonitorItem(java.util.List<DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

    public static class DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem extends TeaModel {
        /**
         * <p>The time of the monitoring metric. The time format follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The value corresponding to the monitoring metric.</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem self = new DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeApiTrafficDataResponseBodyCallUploads extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem> monitorItem;

        public static DescribeApiTrafficDataResponseBodyCallUploads build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficDataResponseBodyCallUploads self = new DescribeApiTrafficDataResponseBodyCallUploads();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficDataResponseBodyCallUploads setMonitorItem(java.util.List<DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
