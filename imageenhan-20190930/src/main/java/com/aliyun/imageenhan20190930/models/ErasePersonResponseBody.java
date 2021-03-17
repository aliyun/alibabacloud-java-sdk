// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ErasePersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ErasePersonResponseBodyData data;

    public static ErasePersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ErasePersonResponseBody self = new ErasePersonResponseBody();
        return TeaModel.build(map, self);
    }

    public ErasePersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ErasePersonResponseBody setData(ErasePersonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ErasePersonResponseBodyData getData() {
        return this.data;
    }

    public static class ErasePersonResponseBodyData extends TeaModel {
        @NameInMap("ImageUrl")
        public String imageUrl;

        public static ErasePersonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ErasePersonResponseBodyData self = new ErasePersonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ErasePersonResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

}
