// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class AddIntlImageProductVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AddIntlImageProductVersionResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddIntlImageProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIntlImageProductVersionResponseBody self = new AddIntlImageProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIntlImageProductVersionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddIntlImageProductVersionResponseBody setData(AddIntlImageProductVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddIntlImageProductVersionResponseBodyData getData() {
        return this.data;
    }

    public AddIntlImageProductVersionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddIntlImageProductVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AddIntlImageProductVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddIntlImageProductVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddIntlImageProductVersionResponseBodyData extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("TrackId")
        public String trackId;

        public static AddIntlImageProductVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddIntlImageProductVersionResponseBodyData self = new AddIntlImageProductVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddIntlImageProductVersionResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public AddIntlImageProductVersionResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
