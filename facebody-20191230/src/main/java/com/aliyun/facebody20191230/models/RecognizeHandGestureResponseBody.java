// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeHandGestureResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeHandGestureResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeHandGestureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHandGestureResponseBody self = new RecognizeHandGestureResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeHandGestureResponseBody setData(RecognizeHandGestureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeHandGestureResponseBodyData getData() {
        return this.data;
    }

    public RecognizeHandGestureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeHandGestureResponseBodyData extends TeaModel {
        @NameInMap("Height")
        public Long height;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Type")
        public String type;

        @NameInMap("Width")
        public Long width;

        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static RecognizeHandGestureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeHandGestureResponseBodyData self = new RecognizeHandGestureResponseBodyData();
            return TeaModel.build(map, self);
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

        public RecognizeHandGestureResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RecognizeHandGestureResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
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

    }

}
