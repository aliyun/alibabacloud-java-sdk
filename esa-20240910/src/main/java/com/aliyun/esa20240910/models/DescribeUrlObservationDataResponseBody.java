// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeUrlObservationDataResponseBody extends TeaModel {
    /**
     * <p>The end of the time range during which data was queried.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-19T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The create time. The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-06T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The objects that are returned.</p>
     */
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
         * <p>Measures the maximum layout mutation score for every unexpected layout change that occurs throughout the life of the page.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CLS")
        public Float CLS;

        /**
         * <p>The platform of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>PC</p>
         */
        @NameInMap("ClientPlatform")
        public String clientPlatform;

        /**
         * <p>The country or region to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>Measures the time between when the page is loaded and when any part of the page\&quot;s content is rendered on the screen. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FCP")
        public Float FCP;

        /**
         * <p>Measures the time between when the user first interacts with the page and when the browser is actually able to start processing an event handler in response to that interaction. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FID")
        public Float FID;

        /**
         * <p>Measures the responsiveness of the page, or how long it takes for the page to respond to user input visibly. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("INP")
        public Float INP;

        /**
         * <p>Reports the rendering time of the largest image or text block visible in the viewport. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("LCP")
        public Float LCP;

        /**
         * <p>This metric measures the time between when a resource initiates a request and when the first byte of the response starts to arrive. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TTFB")
        public Float TTFB;

        /**
         * <p>The URL of the web page to monitor.</p>
         * 
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
