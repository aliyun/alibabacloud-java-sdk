// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeHandGestureResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeHandGestureResponseBodyData data;

    public static RecognizeHandGestureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHandGestureResponseBody self = new RecognizeHandGestureResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeHandGestureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeHandGestureResponseBody setData(RecognizeHandGestureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeHandGestureResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeHandGestureResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        @NameInMap("Width")
        public Long width;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Score")
        public Float score;

        public static RecognizeHandGestureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeHandGestureResponseBodyData self = new RecognizeHandGestureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeHandGestureResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RecognizeHandGestureResponseBodyData setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public RecognizeHandGestureResponseBodyData setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

        public RecognizeHandGestureResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public RecognizeHandGestureResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public RecognizeHandGestureResponseBodyData setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

}
