// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeReplicationStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Critical")
    public Integer critical;

    @NameInMap("Healthy")
    public Integer healthy;

    @NameInMap("Message")
    public String message;

    @NameInMap("NotApplicable")
    public Integer notApplicable;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Warning")
    public Integer warning;

    public static DescribeReplicationStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationStatisticsResponseBody self = new DescribeReplicationStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeReplicationStatisticsResponseBody setCritical(Integer critical) {
        this.critical = critical;
        return this;
    }
    public Integer getCritical() {
        return this.critical;
    }

    public DescribeReplicationStatisticsResponseBody setHealthy(Integer healthy) {
        this.healthy = healthy;
        return this;
    }
    public Integer getHealthy() {
        return this.healthy;
    }

    public DescribeReplicationStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeReplicationStatisticsResponseBody setNotApplicable(Integer notApplicable) {
        this.notApplicable = notApplicable;
        return this;
    }
    public Integer getNotApplicable() {
        return this.notApplicable;
    }

    public DescribeReplicationStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReplicationStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeReplicationStatisticsResponseBody setWarning(Integer warning) {
        this.warning = warning;
        return this;
    }
    public Integer getWarning() {
        return this.warning;
    }

}
