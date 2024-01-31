// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeUrlModerationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeUrlModerationResultResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

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
        @NameInMap("IcpNo")
        public String icpNo;

        @NameInMap("IcpType")
        public String icpType;

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

    }

    public static class DescribeUrlModerationResultResponseBodyDataResult extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

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
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("ExtraInfo")
        public DescribeUrlModerationResultResponseBodyDataExtraInfo extraInfo;

        @NameInMap("ReqId")
        public String reqId;

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
