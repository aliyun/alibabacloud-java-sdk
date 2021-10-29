// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class CommodityTitleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CommodityTitleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CommodityTitleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommodityTitleResponseBody self = new CommodityTitleResponseBody();
        return TeaModel.build(map, self);
    }

    public CommodityTitleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CommodityTitleResponseBody setData(CommodityTitleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CommodityTitleResponseBodyData getData() {
        return this.data;
    }

    public CommodityTitleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CommodityTitleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommodityTitleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CommodityTitleResponseBodyData extends TeaModel {
        @NameInMap("Title")
        public String title;

        public static CommodityTitleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CommodityTitleResponseBodyData self = new CommodityTitleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CommodityTitleResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
