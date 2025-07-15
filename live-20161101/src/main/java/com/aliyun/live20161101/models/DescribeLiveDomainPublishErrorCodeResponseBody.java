// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPublishErrorCodeResponseBody extends TeaModel {
    /**
     * <p>The time granularity of the query. Unit: seconds. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The ingest domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T09:10:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The proportions of error codes at each time interval.</p>
     */
    @NameInMap("RealTimeCodeData")
    public java.util.List<DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeData> realTimeCodeData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T09:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainPublishErrorCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPublishErrorCodeResponseBody self = new DescribeLiveDomainPublishErrorCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPublishErrorCodeResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainPublishErrorCodeResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainPublishErrorCodeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainPublishErrorCodeResponseBody setRealTimeCodeData(java.util.List<DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeData> realTimeCodeData) {
        this.realTimeCodeData = realTimeCodeData;
        return this;
    }
    public java.util.List<DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeData> getRealTimeCodeData() {
        return this.realTimeCodeData;
    }

    public DescribeLiveDomainPublishErrorCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainPublishErrorCodeResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData extends TeaModel {
        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li>3: The data read timed out.</li>
         * <li>4: A data write error occurred.</li>
         * <li>6: The data write timed out.</li>
         * <li>200: The request is successful.</li>
         * <li>500: An unknown internal error occurred.</li>
         * <li>501: The stream ingest failed.</li>
         * <li>502: The signaling operation timed out.</li>
         * <li>401: A stream ingest parameter is invalid.</li>
         * <li>403: The stream ingest authentication failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The number of times the HTTP status code was returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The proportion of the HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>66.04</p>
         */
        @NameInMap("Proportion")
        public String proportion;

        public static DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData self = new DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

    }

    public static class DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeData extends TeaModel {
        /**
         * <p>The proportions of error codes.</p>
         */
        @NameInMap("CodeData")
        public java.util.List<DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData> codeData;

        /**
         * <p>The timestamp of the data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T09:01:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeData self = new DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeData setCodeData(java.util.List<DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData> codeData) {
            this.codeData = codeData;
            return this;
        }
        public java.util.List<DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeDataCodeData> getCodeData() {
            return this.codeData;
        }

        public DescribeLiveDomainPublishErrorCodeResponseBodyRealTimeCodeData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
