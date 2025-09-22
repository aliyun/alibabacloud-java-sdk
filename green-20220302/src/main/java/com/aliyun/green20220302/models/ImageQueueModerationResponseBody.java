// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageQueueModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImageQueueModerationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImageQueueModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageQueueModerationResponseBody self = new ImageQueueModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageQueueModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImageQueueModerationResponseBody setData(ImageQueueModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageQueueModerationResponseBodyData getData() {
        return this.data;
    }

    public ImageQueueModerationResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ImageQueueModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImageQueueModerationResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>未检测出风险</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>violent_explosion</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static ImageQueueModerationResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyDataResult self = new ImageQueueModerationResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyDataResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ImageQueueModerationResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ImageQueueModerationResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImageQueueModerationResponseBodyDataResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ImageQueueModerationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>data1234</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;result&quot;:[{&quot;confidence&quot;:81.22,&quot;label&quot;:&quot;violent_explosion&quot;}]}]</p>
         */
        @NameInMap("Frame")
        public String frame;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FrameNum")
        public Integer frameNum;

        @NameInMap("Result")
        public java.util.List<ImageQueueModerationResponseBodyDataResult> result;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static ImageQueueModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageQueueModerationResponseBodyData self = new ImageQueueModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageQueueModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImageQueueModerationResponseBodyData setFrame(String frame) {
            this.frame = frame;
            return this;
        }
        public String getFrame() {
            return this.frame;
        }

        public ImageQueueModerationResponseBodyData setFrameNum(Integer frameNum) {
            this.frameNum = frameNum;
            return this;
        }
        public Integer getFrameNum() {
            return this.frameNum;
        }

        public ImageQueueModerationResponseBodyData setResult(java.util.List<ImageQueueModerationResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImageQueueModerationResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ImageQueueModerationResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
