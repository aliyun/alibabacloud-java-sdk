// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ChangeImageSizeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ChangeImageSizeResponseBodyData data;

    public static ChangeImageSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeResponseBody self = new ChangeImageSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeImageSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeImageSizeResponseBody setData(ChangeImageSizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeImageSizeResponseBodyData getData() {
        return this.data;
    }

    public static class ChangeImageSizeResponseBodyDataRetainLocation extends TeaModel {
        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Y")
        public Integer y;

        @NameInMap("X")
        public Integer x;

        public static ChangeImageSizeResponseBodyDataRetainLocation build(java.util.Map<String, ?> map) throws Exception {
            ChangeImageSizeResponseBodyDataRetainLocation self = new ChangeImageSizeResponseBodyDataRetainLocation();
            return TeaModel.build(map, self);
        }

        public ChangeImageSizeResponseBodyDataRetainLocation setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public ChangeImageSizeResponseBodyDataRetainLocation setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ChangeImageSizeResponseBodyDataRetainLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public ChangeImageSizeResponseBodyDataRetainLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

    }

    public static class ChangeImageSizeResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("RetainLocation")
        public ChangeImageSizeResponseBodyDataRetainLocation retainLocation;

        public static ChangeImageSizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeImageSizeResponseBodyData self = new ChangeImageSizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeImageSizeResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ChangeImageSizeResponseBodyData setRetainLocation(ChangeImageSizeResponseBodyDataRetainLocation retainLocation) {
            this.retainLocation = retainLocation;
            return this;
        }
        public ChangeImageSizeResponseBodyDataRetainLocation getRetainLocation() {
            return this.retainLocation;
        }

    }

}
