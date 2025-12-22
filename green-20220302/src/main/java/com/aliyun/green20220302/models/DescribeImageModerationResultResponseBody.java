// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeImageModerationResultResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The image moderation results.</p>
     */
    @NameInMap("Data")
    public DescribeImageModerationResultResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2881AD4F-638B-52A3-BA20-F74C5B1CEAE3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageModerationResultResponseBody self = new DescribeImageModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageModerationResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeImageModerationResultResponseBody setData(DescribeImageModerationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageModerationResultResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageModerationResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeImageModerationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageModerationResultResponseBodyDataResult extends TeaModel {
        /**
         * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The description of the result.</p>
         * 
         * <strong>example:</strong>
         * <p>no risk</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The labels returned after the image moderation.</p>
         * 
         * <strong>example:</strong>
         * <p>violent_explosion</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Risk Level</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeImageModerationResultResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageModerationResultResponseBodyDataResult self = new DescribeImageModerationResultResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DescribeImageModerationResultResponseBodyDataResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DescribeImageModerationResultResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImageModerationResultResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeImageModerationResultResponseBodyDataResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeImageModerationResultResponseBodyData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The value of dataId that is specified in the API request. If this parameter is not specified in the API request, this field is not available in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>2a5389eb-4ff8-4584-ac99-644e2a539aa1</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The information about the captured frames.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;result&quot;:[{&quot;confidence&quot;:81.22,&quot;label&quot;:&quot;violent_explosion&quot;}]}]</p>
         */
        @NameInMap("Frame")
        public String frame;

        /**
         * <p>The number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FrameNum")
        public Integer frameNum;

        @NameInMap("ManualTaskId")
        public String manualTaskId;

        /**
         * <p>The reqId field returned by the Image Async Moderation API.</p>
         * 
         * <strong>example:</strong>
         * <p>B0963D30-BAB4-562F-9ED0-7A23AEC51C7C</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        /**
         * <p>The results of image moderation parameters such as the label parameter and the confidence parameter.</p>
         */
        @NameInMap("Result")
        public java.util.List<DescribeImageModerationResultResponseBodyDataResult> result;

        /**
         * <p>Risk Level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeImageModerationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageModerationResultResponseBodyData self = new DescribeImageModerationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageModerationResultResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeImageModerationResultResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeImageModerationResultResponseBodyData setFrame(String frame) {
            this.frame = frame;
            return this;
        }
        public String getFrame() {
            return this.frame;
        }

        public DescribeImageModerationResultResponseBodyData setFrameNum(Integer frameNum) {
            this.frameNum = frameNum;
            return this;
        }
        public Integer getFrameNum() {
            return this.frameNum;
        }

        public DescribeImageModerationResultResponseBodyData setManualTaskId(String manualTaskId) {
            this.manualTaskId = manualTaskId;
            return this;
        }
        public String getManualTaskId() {
            return this.manualTaskId;
        }

        public DescribeImageModerationResultResponseBodyData setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

        public DescribeImageModerationResultResponseBodyData setResult(java.util.List<DescribeImageModerationResultResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeImageModerationResultResponseBodyDataResult> getResult() {
            return this.result;
        }

        public DescribeImageModerationResultResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
