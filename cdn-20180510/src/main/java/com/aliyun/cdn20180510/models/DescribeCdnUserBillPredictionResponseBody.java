// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillPredictionResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BillType")
    public String billType;

    @NameInMap("BillPredictionData")
    public DescribeCdnUserBillPredictionResponseBodyBillPredictionData billPredictionData;

    public static DescribeCdnUserBillPredictionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillPredictionResponseBody self = new DescribeCdnUserBillPredictionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillPredictionResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCdnUserBillPredictionResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCdnUserBillPredictionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnUserBillPredictionResponseBody setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public DescribeCdnUserBillPredictionResponseBody setBillPredictionData(DescribeCdnUserBillPredictionResponseBodyBillPredictionData billPredictionData) {
        this.billPredictionData = billPredictionData;
        return this;
    }
    public DescribeCdnUserBillPredictionResponseBodyBillPredictionData getBillPredictionData() {
        return this.billPredictionData;
    }

    public static class DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem extends TeaModel {
        @NameInMap("Value")
        public Float value;

        @NameInMap("TimeStp")
        public String timeStp;

        @NameInMap("Area")
        public String area;

        public static DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem self = new DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem setTimeStp(String timeStp) {
            this.timeStp = timeStp;
            return this;
        }
        public String getTimeStp() {
            return this.timeStp;
        }

        public DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

    }

    public static class DescribeCdnUserBillPredictionResponseBodyBillPredictionData extends TeaModel {
        @NameInMap("BillPredictionDataItem")
        public java.util.List<DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem> billPredictionDataItem;

        public static DescribeCdnUserBillPredictionResponseBodyBillPredictionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserBillPredictionResponseBodyBillPredictionData self = new DescribeCdnUserBillPredictionResponseBodyBillPredictionData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserBillPredictionResponseBodyBillPredictionData setBillPredictionDataItem(java.util.List<DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem> billPredictionDataItem) {
            this.billPredictionDataItem = billPredictionDataItem;
            return this;
        }
        public java.util.List<DescribeCdnUserBillPredictionResponseBodyBillPredictionDataBillPredictionDataItem> getBillPredictionDataItem() {
            return this.billPredictionDataItem;
        }

    }

}
