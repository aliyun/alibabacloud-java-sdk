// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ChangeImageSizeResponseBody extends TeaModel {
    @NameInMap("Data")
    public ChangeImageSizeResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ChangeImageSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeResponseBody self = new ChangeImageSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeImageSizeResponseBody setData(ChangeImageSizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeImageSizeResponseBodyData getData() {
        return this.data;
    }

    public ChangeImageSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeImageSizeResponseBodyDataRetainLocation extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static ChangeImageSizeResponseBodyDataRetainLocation build(java.util.Map<String, ?> map) throws Exception {
            ChangeImageSizeResponseBodyDataRetainLocation self = new ChangeImageSizeResponseBodyDataRetainLocation();
            return TeaModel.build(map, self);
        }

        public ChangeImageSizeResponseBodyDataRetainLocation setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ChangeImageSizeResponseBodyDataRetainLocation setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public ChangeImageSizeResponseBodyDataRetainLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public ChangeImageSizeResponseBodyDataRetainLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class ChangeImageSizeResponseBodyData extends TeaModel {
        @NameInMap("RetainLocation")
        public ChangeImageSizeResponseBodyDataRetainLocation retainLocation;

        @NameInMap("Url")
        public String url;

        public static ChangeImageSizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeImageSizeResponseBodyData self = new ChangeImageSizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeImageSizeResponseBodyData setRetainLocation(ChangeImageSizeResponseBodyDataRetainLocation retainLocation) {
            this.retainLocation = retainLocation;
            return this;
        }
        public ChangeImageSizeResponseBodyDataRetainLocation getRetainLocation() {
            return this.retainLocation;
        }

        public ChangeImageSizeResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
