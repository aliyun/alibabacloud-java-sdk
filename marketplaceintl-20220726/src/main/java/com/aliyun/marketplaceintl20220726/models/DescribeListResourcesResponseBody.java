// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeListResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeListResourcesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeListResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeListResourcesResponseBody self = new DescribeListResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeListResourcesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeListResourcesResponseBody setData(DescribeListResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeListResourcesResponseBodyData getData() {
        return this.data;
    }

    public DescribeListResourcesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeListResourcesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeListResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeListResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeListResourcesResponseBodyData extends TeaModel {
        @NameInMap("OssLink")
        public java.util.List<String> ossLink;

        @NameInMap("TrackId")
        public String trackId;

        public static DescribeListResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeListResourcesResponseBodyData self = new DescribeListResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeListResourcesResponseBodyData setOssLink(java.util.List<String> ossLink) {
            this.ossLink = ossLink;
            return this;
        }
        public java.util.List<String> getOssLink() {
            return this.ossLink;
        }

        public DescribeListResourcesResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
