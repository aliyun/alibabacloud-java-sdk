// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CallUploads")
    public DescribeApiTrafficDataResponseBodyCallUploads callUploads;

    @NameInMap("CallDownloads")
    public DescribeApiTrafficDataResponseBodyCallDownloads callDownloads;

    public static DescribeApiTrafficDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficDataResponseBody self = new DescribeApiTrafficDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiTrafficDataResponseBody setCallUploads(DescribeApiTrafficDataResponseBodyCallUploads callUploads) {
        this.callUploads = callUploads;
        return this;
    }
    public DescribeApiTrafficDataResponseBodyCallUploads getCallUploads() {
        return this.callUploads;
    }

    public DescribeApiTrafficDataResponseBody setCallDownloads(DescribeApiTrafficDataResponseBodyCallDownloads callDownloads) {
        this.callDownloads = callDownloads;
        return this;
    }
    public DescribeApiTrafficDataResponseBodyCallDownloads getCallDownloads() {
        return this.callDownloads;
    }

    public static class DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem self = new DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeApiTrafficDataResponseBodyCallUploadsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
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

    public static class DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem self = new DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeApiTrafficDataResponseBodyCallDownloadsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
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

}
