// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeImageCommodityStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeImageCommodityStatusResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageCommodityStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCommodityStatusResponseBody self = new DescribeImageCommodityStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageCommodityStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeImageCommodityStatusResponseBody setData(DescribeImageCommodityStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageCommodityStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageCommodityStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeImageCommodityStatusResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeImageCommodityStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageCommodityStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageCommodityStatusResponseBodyData extends TeaModel {
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("TrackId")
        public String trackId;

        public static DescribeImageCommodityStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCommodityStatusResponseBodyData self = new DescribeImageCommodityStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageCommodityStatusResponseBodyData setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeImageCommodityStatusResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeImageCommodityStatusResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
