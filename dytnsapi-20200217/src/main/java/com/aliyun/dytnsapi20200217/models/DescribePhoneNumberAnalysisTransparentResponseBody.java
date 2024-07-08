// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisTransparentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneNumberAnalysisTransparentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Device_risk")
        public String deviceRisk;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Ip_risk")
        public String ipRisk;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Score1")
        public String score1;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Score2")
        public String score2;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
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
