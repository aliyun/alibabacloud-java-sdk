// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveProducerUsageDataResponseBody extends TeaModel {
    @NameInMap("BillProducerData")
    public DescribeLiveProducerUsageDataResponseBodyBillProducerData billProducerData;

    /**
     * <p>The end of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-09-30T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range for which the data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-10-31T15:59:59Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveProducerUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveProducerUsageDataResponseBody self = new DescribeLiveProducerUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveProducerUsageDataResponseBody setBillProducerData(DescribeLiveProducerUsageDataResponseBodyBillProducerData billProducerData) {
        this.billProducerData = billProducerData;
        return this;
    }
    public DescribeLiveProducerUsageDataResponseBodyBillProducerData getBillProducerData() {
        return this.billProducerData;
    }

    public DescribeLiveProducerUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveProducerUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveProducerUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Instance")
        public String instance;

        @NameInMap("OutputHdDuration")
        public Long outputHdDuration;

        @NameInMap("OutputLdDuration")
        public Long outputLdDuration;

        @NameInMap("OutputSdDuration")
        public Long outputSdDuration;

        @NameInMap("Region")
        public String region;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TranHdDuration")
        public Long tranHdDuration;

        @NameInMap("TranLdDuration")
        public Long tranLdDuration;

        @NameInMap("TranSdDuration")
        public Long tranSdDuration;

        @NameInMap("Type")
        public String type;

        public static DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem self = new DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setOutputHdDuration(Long outputHdDuration) {
            this.outputHdDuration = outputHdDuration;
            return this;
        }
        public Long getOutputHdDuration() {
            return this.outputHdDuration;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setOutputLdDuration(Long outputLdDuration) {
            this.outputLdDuration = outputLdDuration;
            return this;
        }
        public Long getOutputLdDuration() {
            return this.outputLdDuration;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setOutputSdDuration(Long outputSdDuration) {
            this.outputSdDuration = outputSdDuration;
            return this;
        }
        public Long getOutputSdDuration() {
            return this.outputSdDuration;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setTranHdDuration(Long tranHdDuration) {
            this.tranHdDuration = tranHdDuration;
            return this;
        }
        public Long getTranHdDuration() {
            return this.tranHdDuration;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setTranLdDuration(Long tranLdDuration) {
            this.tranLdDuration = tranLdDuration;
            return this;
        }
        public Long getTranLdDuration() {
            return this.tranLdDuration;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setTranSdDuration(Long tranSdDuration) {
            this.tranSdDuration = tranSdDuration;
            return this;
        }
        public Long getTranSdDuration() {
            return this.tranSdDuration;
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeLiveProducerUsageDataResponseBodyBillProducerData extends TeaModel {
        @NameInMap("BillProducerDataItem")
        public java.util.List<DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem> billProducerDataItem;

        public static DescribeLiveProducerUsageDataResponseBodyBillProducerData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveProducerUsageDataResponseBodyBillProducerData self = new DescribeLiveProducerUsageDataResponseBodyBillProducerData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveProducerUsageDataResponseBodyBillProducerData setBillProducerDataItem(java.util.List<DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem> billProducerDataItem) {
            this.billProducerDataItem = billProducerDataItem;
            return this;
        }
        public java.util.List<DescribeLiveProducerUsageDataResponseBodyBillProducerDataBillProducerDataItem> getBillProducerDataItem() {
            return this.billProducerDataItem;
        }

    }

}
