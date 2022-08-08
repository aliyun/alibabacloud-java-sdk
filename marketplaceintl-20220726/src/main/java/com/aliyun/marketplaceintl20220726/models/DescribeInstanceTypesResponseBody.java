// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeInstanceTypesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypesResponseBody self = new DescribeInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeInstanceTypesResponseBody setData(DescribeInstanceTypesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceTypesResponseBodyData getData() {
        return this.data;
    }

    public DescribeInstanceTypesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeInstanceTypesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceTypesResponseBodyDataCustomizeFamily extends TeaModel {
        @NameInMap("GlobalKey")
        public String globalKey;

        @NameInMap("Text")
        public String text;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceTypesResponseBodyDataCustomizeFamily build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyDataCustomizeFamily self = new DescribeInstanceTypesResponseBodyDataCustomizeFamily();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyDataCustomizeFamily setGlobalKey(String globalKey) {
            this.globalKey = globalKey;
            return this;
        }
        public String getGlobalKey() {
            return this.globalKey;
        }

        public DescribeInstanceTypesResponseBodyDataCustomizeFamily setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeInstanceTypesResponseBodyDataCustomizeFamily setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstanceTypesResponseBodyDataInstanceTypes extends TeaModel {
        @NameInMap("Text")
        public String text;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceTypesResponseBodyDataInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyDataInstanceTypes self = new DescribeInstanceTypesResponseBodyDataInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyDataInstanceTypes setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeInstanceTypesResponseBodyDataInstanceTypes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstanceTypesResponseBodyData extends TeaModel {
        @NameInMap("CustomizeFamily")
        public java.util.List<DescribeInstanceTypesResponseBodyDataCustomizeFamily> customizeFamily;

        @NameInMap("InstanceTypes")
        public java.util.List<DescribeInstanceTypesResponseBodyDataInstanceTypes> instanceTypes;

        @NameInMap("TrackId")
        public String trackId;

        public static DescribeInstanceTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyData self = new DescribeInstanceTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyData setCustomizeFamily(java.util.List<DescribeInstanceTypesResponseBodyDataCustomizeFamily> customizeFamily) {
            this.customizeFamily = customizeFamily;
            return this;
        }
        public java.util.List<DescribeInstanceTypesResponseBodyDataCustomizeFamily> getCustomizeFamily() {
            return this.customizeFamily;
        }

        public DescribeInstanceTypesResponseBodyData setInstanceTypes(java.util.List<DescribeInstanceTypesResponseBodyDataInstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<DescribeInstanceTypesResponseBodyDataInstanceTypes> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeInstanceTypesResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
