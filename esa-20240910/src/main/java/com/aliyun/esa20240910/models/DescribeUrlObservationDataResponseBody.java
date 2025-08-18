// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeUrlObservationDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-04-19T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2022-11-06T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("UrlDetailData")
    public java.util.List<DescribeUrlObservationDataResponseBodyUrlDetailData> urlDetailData;

    public static DescribeUrlObservationDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUrlObservationDataResponseBody self = new DescribeUrlObservationDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUrlObservationDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUrlObservationDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUrlObservationDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeUrlObservationDataResponseBody setUrlDetailData(java.util.List<DescribeUrlObservationDataResponseBodyUrlDetailData> urlDetailData) {
        this.urlDetailData = urlDetailData;
        return this;
    }
    public java.util.List<DescribeUrlObservationDataResponseBodyUrlDetailData> getUrlDetailData() {
        return this.urlDetailData;
    }

    public static class DescribeUrlObservationDataResponseBodyUrlDetailData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CLS")
        public Float CLS;

        /**
         * <strong>example:</strong>
         * <p>PC</p>
         */
        @NameInMap("ClientPlatform")
        public String clientPlatform;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FCP")
        public Float FCP;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FID")
        public Float FID;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("INP")
        public Float INP;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("LCP")
        public Float LCP;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TTFB")
        public Float TTFB;

        /**
         * <strong>example:</strong>
         * <p>example.com/test</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeUrlObservationDataResponseBodyUrlDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUrlObservationDataResponseBodyUrlDetailData self = new DescribeUrlObservationDataResponseBodyUrlDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeUrlObservationDataResponseBodyUrlDetailData setCLS(Float CLS) {
            this.CLS = CLS;
            return this;
        }
        public Float getCLS() {
            return this.CLS;
        }

        public DescribeUrlObservationDataResponseBodyUrlDetailData setClientPlatform(String clientPlatform) {
            this.clientPlatform = clientPlatform;
            return this;
        }
        public String getClientPlatform() {
            return this.clientPlatform;
        }

        public DescribeUrlObservationDataResponseBodyUrlDetailData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeUrlObservationDataResponseBodyUrlDetailData setFCP(Float FCP) {
            this.FCP = FCP;
            return this;
        }
        public Float getFCP() {
            return this.FCP;
        }

        public DescribeUrlObservationDataResponseBodyUrlDetailData setFID(Float FID) {
            this.FID = FID;
            return this;
        }
        public Float getFID() {
            return this.FID;
        }

        public DescribeUrlObservationDataResponseBodyUrlDetailData setINP(Float INP) {
            this.INP = INP;
            return this;
        }
        public Float getINP() {
            return this.INP;
        }

        public DescribeUrlObservationDataResponseBodyUrlDetailData setLCP(Float LCP) {
            this.LCP = LCP;
            return this;
        }
        public Float getLCP() {
            return this.LCP;
        }

        public DescribeUrlObservationDataResponseBodyUrlDetailData setTTFB(Float TTFB) {
            this.TTFB = TTFB;
            return this;
        }
        public Float getTTFB() {
            return this.TTFB;
        }

        public DescribeUrlObservationDataResponseBodyUrlDetailData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
