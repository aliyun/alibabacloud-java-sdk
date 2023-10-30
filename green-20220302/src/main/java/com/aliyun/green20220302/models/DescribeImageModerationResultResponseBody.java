// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeImageModerationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeImageModerationResultResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageModerationResultResponseBody self = new DescribeImageModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageModerationResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
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
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Label")
        public String label;

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

        public DescribeImageModerationResultResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeImageModerationResultResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Frame")
        public String frame;

        @NameInMap("FrameNum")
        public Integer frameNum;

        @NameInMap("Result")
        public java.util.List<DescribeImageModerationResultResponseBodyDataResult> result;

        public static DescribeImageModerationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageModerationResultResponseBodyData self = new DescribeImageModerationResultResponseBodyData();
            return TeaModel.build(map, self);
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

        public DescribeImageModerationResultResponseBodyData setResult(java.util.List<DescribeImageModerationResultResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeImageModerationResultResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
