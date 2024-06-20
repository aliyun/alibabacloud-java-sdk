// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmBaseImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateWmBaseImageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWmBaseImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWmBaseImageResponseBody self = new CreateWmBaseImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWmBaseImageResponseBody setData(CreateWmBaseImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWmBaseImageResponseBodyData getData() {
        return this.data;
    }

    public CreateWmBaseImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateWmBaseImageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>fafb432cdede9b20640e12105845386e-496883833-8242409229217337*****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/test-*****.png">https://example.com/test-*****.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>17185*****</p>
         */
        @NameInMap("ImageUrlExp")
        public Long imageUrlExp;

        public static CreateWmBaseImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWmBaseImageResponseBodyData self = new CreateWmBaseImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWmBaseImageResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateWmBaseImageResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public CreateWmBaseImageResponseBodyData setImageUrlExp(Long imageUrlExp) {
            this.imageUrlExp = imageUrlExp;
            return this;
        }
        public Long getImageUrlExp() {
            return this.imageUrlExp;
        }

    }

}
