// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveProducerUsageDataResponseBody extends TeaModel {
    /**
     * <p>The production studio usage data.</p>
     */
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
        /**
         * <p>The domain name. If domain is specified by the SplitBy parameter, the usage data is returned based on different domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The production studio instance. If instance is specified by the SplitBy parameter, the usage data is returned based on different production studio instances.</p>
         * 
         * <strong>example:</strong>
         * <p>a17d0184-462d-4630-b2a6-8c26dde2****</p>
         */
        @NameInMap("Instance")
        public String instance;

        /**
         * <p>The duration of high definition streaming. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("OutputHdDuration")
        public Long outputHdDuration;

        /**
         * <p>The duration of low definition streaming. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("OutputLdDuration")
        public Long outputLdDuration;

        /**
         * <p>The duration of standard definition streaming. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("OutputSdDuration")
        public Long outputSdDuration;

        /**
         * <p>The region. If region is specified by the SplitBy parameter, the usage data is returned based on different regions.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The timestamp of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-30T00:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The duration of high definition transcoding. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>6777</p>
         */
        @NameInMap("TranHdDuration")
        public Long tranHdDuration;

        /**
         * <p>The duration of low definition transcoding. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("TranLdDuration")
        public Long tranLdDuration;

        /**
         * <p>The duration of standard definition transcoding. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>666</p>
         */
        @NameInMap("TranSdDuration")
        public Long tranSdDuration;

        /**
         * <p>The type of the production studio. If type is specified by the SplitBy parameter, the usage data is returned based on different types of production studios.</p>
         * 
         * <strong>example:</strong>
         * <p>slidelive</p>
         */
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
