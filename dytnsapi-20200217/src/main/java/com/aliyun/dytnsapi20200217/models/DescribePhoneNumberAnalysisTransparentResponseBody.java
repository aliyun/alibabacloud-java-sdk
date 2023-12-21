// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisTransparentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneNumberAnalysisTransparentResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberAnalysisTransparentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisTransparentResponseBody self = new DescribePhoneNumberAnalysisTransparentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisTransparentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePhoneNumberAnalysisTransparentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberAnalysisTransparentResponseBody setData(DescribePhoneNumberAnalysisTransparentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneNumberAnalysisTransparentResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneNumberAnalysisTransparentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberAnalysisTransparentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneNumberAnalysisTransparentResponseBodyData extends TeaModel {
        @NameInMap("Device_risk")
        public String deviceRisk;

        @NameInMap("Ip_risk")
        public String ipRisk;

        @NameInMap("Score1")
        public String score1;

        @NameInMap("Score2")
        public String score2;

        @NameInMap("Score3")
        public String score3;

        public static DescribePhoneNumberAnalysisTransparentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberAnalysisTransparentResponseBodyData self = new DescribePhoneNumberAnalysisTransparentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberAnalysisTransparentResponseBodyData setDeviceRisk(String deviceRisk) {
            this.deviceRisk = deviceRisk;
            return this;
        }
        public String getDeviceRisk() {
            return this.deviceRisk;
        }

        public DescribePhoneNumberAnalysisTransparentResponseBodyData setIpRisk(String ipRisk) {
            this.ipRisk = ipRisk;
            return this;
        }
        public String getIpRisk() {
            return this.ipRisk;
        }

        public DescribePhoneNumberAnalysisTransparentResponseBodyData setScore1(String score1) {
            this.score1 = score1;
            return this;
        }
        public String getScore1() {
            return this.score1;
        }

        public DescribePhoneNumberAnalysisTransparentResponseBodyData setScore2(String score2) {
            this.score2 = score2;
            return this;
        }
        public String getScore2() {
            return this.score2;
        }

        public DescribePhoneNumberAnalysisTransparentResponseBodyData setScore3(String score3) {
            this.score3 = score3;
            return this;
        }
        public String getScore3() {
            return this.score3;
        }

    }

}
