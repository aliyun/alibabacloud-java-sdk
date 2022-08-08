// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class SubmitImageCommodityReviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SubmitImageCommodityReviewResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitImageCommodityReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCommodityReviewResponseBody self = new SubmitImageCommodityReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitImageCommodityReviewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SubmitImageCommodityReviewResponseBody setData(SubmitImageCommodityReviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitImageCommodityReviewResponseBodyData getData() {
        return this.data;
    }

    public SubmitImageCommodityReviewResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubmitImageCommodityReviewResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SubmitImageCommodityReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitImageCommodityReviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitImageCommodityReviewResponseBodyData extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("TrackId")
        public String trackId;

        public static SubmitImageCommodityReviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageCommodityReviewResponseBodyData self = new SubmitImageCommodityReviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitImageCommodityReviewResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public SubmitImageCommodityReviewResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
