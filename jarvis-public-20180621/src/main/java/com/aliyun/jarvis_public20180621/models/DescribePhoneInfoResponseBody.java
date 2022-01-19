// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribePhoneInfoResponseBody extends TeaModel {
    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("detectTime")
    public String detectTime;

    @NameInMap("phoneNum")
    public Long phoneNum;

    @NameInMap("riskLevel")
    public Long riskLevel;

    public static DescribePhoneInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneInfoResponseBody self = new DescribePhoneInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneInfoResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribePhoneInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhoneInfoResponseBody setDetectTime(String detectTime) {
        this.detectTime = detectTime;
        return this;
    }
    public String getDetectTime() {
        return this.detectTime;
    }

    public DescribePhoneInfoResponseBody setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public Long getPhoneNum() {
        return this.phoneNum;
    }

    public DescribePhoneInfoResponseBody setRiskLevel(Long riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Long getRiskLevel() {
        return this.riskLevel;
    }

}
