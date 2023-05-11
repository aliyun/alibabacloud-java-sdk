// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorDataResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The pagination cursor.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned data contains a JSON string that may consist of several or all of the following parameters:</p>
     * <br>
     * <p>*   Error4XXRate: the percentage of detection results with 4XX status codes.</p>
     * <p>*   Error6XXRate: the percentage of detection results with 6XX status codes.</p>
     * <p>*   Error5XXRate: the percentage of detection results with 5XX status codes.</p>
     * <p>*   Error4XXNumber: the number of detection results with 4XX status codes.</p>
     * <p>*   Error5XXNumber: the number of detection results with 5XX status codes.</p>
     * <p>*   Error6XXNumber: the number of detection results with 6XX status codes.</p>
     * <p>*   Over5totalTime: the percentage of detection requests to which the response time exceeds 5,000 ms.</p>
     * <p>*   Over3totalTime: the percentage of detection requests to which the response time exceeds 3,000 ms.</p>
     * <p>*   Over2totalTime: the percentage of detection requests to which the response time exceeds 2,000 ms.</p>
     * <p>*   Over10FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 10%.</p>
     * <p>*   Over100FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 99%.</p>
     * <p>*   Over30FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 30%.</p>
     * <p>*   Over50FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 50%.</p>
     * <p>*   Over80FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 80%.</p>
     * <p>*   Over90FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 90%.</p>
     * <p>*   Over400NumberRate: the percentage of detection results with status codes that are greater than 400.</p>
     * <p>*   Over400NumberRate: the percentage of detection results with status codes that are greater than 500.</p>
     * <p>*   AvailableNumber: the number of detection results in which the status code is smaller than 400.</p>
     * <p>*   UnavailableNumber: the number of detection results in which the status code is greater than 399.</p>
     * <p>*   Availability: the percentage of detection results in which the status code is smaller than 400.</p>
     * <p>*   Unavailability: the percentage of detection results in which the status code is greater than 399.</p>
     * <p>*   ErrorCodeMaximum: the maximum error code in the detection results that were returned in a specific period. Assume that five status codes are returned in a minute after detection requests are sent from five detection points. The status code in four detection results is 200 and that in one detection result is 404. In this case, the maximum error code is 404.</p>
     * <p>*   ErrorCodeMinimum: the minimum error code in the detection results returned in a monitoring period. Assume that five status codes are returned in a minute after detection requests are sent from five detection points. The status code in four detection results is 200 and that in one detection result is 404. In this case, the minimum error code is 200.</p>
     * <br>
     * <p>>  We recommend that you use the AvailableNumber, UnavailableNumber, Availability, Unavailability, ErrorCodeMaximum, or ErrorCodeMinimum metric, whose value is easy to calculate.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSiteMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorDataResponseBody self = new DescribeSiteMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSiteMonitorDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeSiteMonitorDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSiteMonitorDataResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSiteMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteMonitorDataResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
