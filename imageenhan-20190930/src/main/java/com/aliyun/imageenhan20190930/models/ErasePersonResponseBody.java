// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ErasePersonResponseBody extends TeaModel {
    @NameInMap("Data")
    public ErasePersonResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2FEDA495-9A5D-48B5-8922-98A4FE01D381</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ErasePersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ErasePersonResponseBody self = new ErasePersonResponseBody();
        return TeaModel.build(map, self);
    }

    public ErasePersonResponseBody setData(ErasePersonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ErasePersonResponseBodyData getData() {
        return this.data;
    }

    public ErasePersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ErasePersonResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-isr-lab-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/remove-person/2020-10-29_10%3A59%3A21.421276_img19.png?Expires=1603970961&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=9lBakx0r6FOssTEYTcKs5pk8ta">http://algo-app-isr-lab-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/remove-person/2020-10-29_10%3A59%3A21.421276_img19.png?Expires=1603970961&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=9lBakx0r6FOssTEYTcKs5pk8ta</a>****</p>
         */
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
