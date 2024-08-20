// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeUrlModerationResultResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeUrlModerationResultResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01F9144A-2088-5D87-935B-2DB865284B1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUrlModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUrlModerationResultResponseBody self = new DescribeUrlModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUrlModerationResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeUrlModerationResultResponseBody setData(DescribeUrlModerationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUrlModerationResultResponseBodyData getData() {
        return this.data;
    }

    public DescribeUrlModerationResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeUrlModerationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUrlModerationResultResponseBodyDataExtraInfo extends TeaModel {
        /**
         * <p>The ICP number.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("IcpNo")
        public String icpNo;

        /**
         * <p>The type of the ICP filing.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("IcpType")
        public String icpType;

        /**
         * <p>The type of site</p>
         * 
         * <strong>example:</strong>
         * <p>game</p>
         */
        @NameInMap("SiteType")
        public String siteType;

        public static DescribeUrlModerationResultResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUrlModerationResultResponseBodyDataExtraInfo self = new DescribeUrlModerationResultResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUrlModerationResultResponseBodyDataExtraInfo setIcpNo(String icpNo) {
            this.icpNo = icpNo;
            return this;
        }
        public String getIcpNo() {
            return this.icpNo;
        }

        public DescribeUrlModerationResultResponseBodyDataExtraInfo setIcpType(String icpType) {
            this.icpType = icpType;
            return this;
        }
        public String getIcpType() {
            return this.icpType;
        }

        public DescribeUrlModerationResultResponseBodyDataExtraInfo setSiteType(String siteType) {
            this.siteType = siteType;
            return this;
        }
        public String getSiteType() {
            return this.siteType;
        }

    }

    public static class DescribeUrlModerationResultResponseBodyDataResult extends TeaModel {
        /**
         * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The labels returned after the asynchronous URL moderation.</p>
         * 
         * <strong>example:</strong>
         * <p>sexual_url</p>
         */
        @NameInMap("Label")
        public String label;

        public static DescribeUrlModerationResultResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeUrlModerationResultResponseBodyDataResult self = new DescribeUrlModerationResultResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DescribeUrlModerationResultResponseBodyDataResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DescribeUrlModerationResultResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeUrlModerationResultResponseBodyData extends TeaModel {
        /**
         * <p>The value of dataId that is specified in the API request. If this parameter is not specified in the API request, this field is not available in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>26769ada6e264e7ba9aa048241e12be9</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The supplementary information.</p>
         */
        @NameInMap("ExtraInfo")
        public DescribeUrlModerationResultResponseBodyDataExtraInfo extraInfo;

        /**
         * <p>The ReqId field returned by an asynchronous URL moderation operation.</p>
         * 
         * <strong>example:</strong>
         * <p>B0963D30-BAB4-562F-9ED0-7A23AEC51C7C</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        /**
         * <p>The returned results.</p>
         */
        @NameInMap("Result")
        public java.util.List<DescribeUrlModerationResultResponseBodyDataResult> result;

        public static DescribeUrlModerationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUrlModerationResultResponseBodyData self = new DescribeUrlModerationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUrlModerationResultResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeUrlModerationResultResponseBodyData setExtraInfo(DescribeUrlModerationResultResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeUrlModerationResultResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeUrlModerationResultResponseBodyData setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

        public DescribeUrlModerationResultResponseBodyData setResult(java.util.List<DescribeUrlModerationResultResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeUrlModerationResultResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
