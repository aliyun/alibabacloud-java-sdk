// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ErasePersonResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ErasePersonResponseData data;

    public static ErasePersonResponse build(java.util.Map<String, ?> map) throws Exception {
        ErasePersonResponse self = new ErasePersonResponse();
        return TeaModel.build(map, self);
    }

    public ErasePersonResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ErasePersonResponse setData(ErasePersonResponseData data) {
        this.data = data;
        return this;
    }
    public ErasePersonResponseData getData() {
        return this.data;
    }

    public static class ErasePersonResponseData extends TeaModel {
        @NameInMap("ImageUrl")
        @Validation(required = true)
        public String imageUrl;

        public static ErasePersonResponseData build(java.util.Map<String, ?> map) throws Exception {
            ErasePersonResponseData self = new ErasePersonResponseData();
            return TeaModel.build(map, self);
        }

        public ErasePersonResponseData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

}
