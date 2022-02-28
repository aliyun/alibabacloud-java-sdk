// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeTestFailoverStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LatestSuccessfulCount")
    public Integer latestSuccessfulCount;

    @NameInMap("LatestTotalCount")
    public Integer latestTotalCount;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TestRecommended")
    public Integer testRecommended;

    public static DescribeTestFailoverStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTestFailoverStatisticsResponseBody self = new DescribeTestFailoverStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTestFailoverStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTestFailoverStatisticsResponseBody setLatestSuccessfulCount(Integer latestSuccessfulCount) {
        this.latestSuccessfulCount = latestSuccessfulCount;
        return this;
    }
    public Integer getLatestSuccessfulCount() {
        return this.latestSuccessfulCount;
    }

    public DescribeTestFailoverStatisticsResponseBody setLatestTotalCount(Integer latestTotalCount) {
        this.latestTotalCount = latestTotalCount;
        return this;
    }
    public Integer getLatestTotalCount() {
        return this.latestTotalCount;
    }

    public DescribeTestFailoverStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTestFailoverStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTestFailoverStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTestFailoverStatisticsResponseBody setTestRecommended(Integer testRecommended) {
        this.testRecommended = testRecommended;
        return this;
    }
    public Integer getTestRecommended() {
        return this.testRecommended;
    }

}
