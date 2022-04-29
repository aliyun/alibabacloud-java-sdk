// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderQueryByUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public OrderQueryByUserResponseBodyResult result;

    public static OrderQueryByUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderQueryByUserResponseBody self = new OrderQueryByUserResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderQueryByUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OrderQueryByUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OrderQueryByUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderQueryByUserResponseBody setResult(OrderQueryByUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public OrderQueryByUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class OrderQueryByUserResponseBodyResultContentFormatList extends TeaModel {
        @NameInMap("Glb")
        public Boolean glb;

        @NameInMap("Jpg")
        public Boolean jpg;

        @NameInMap("Mp4")
        public Boolean mp4;

        public static OrderQueryByUserResponseBodyResultContentFormatList build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryByUserResponseBodyResultContentFormatList self = new OrderQueryByUserResponseBodyResultContentFormatList();
            return TeaModel.build(map, self);
        }

        public OrderQueryByUserResponseBodyResultContentFormatList setGlb(Boolean glb) {
            this.glb = glb;
            return this;
        }
        public Boolean getGlb() {
            return this.glb;
        }

        public OrderQueryByUserResponseBodyResultContentFormatList setJpg(Boolean jpg) {
            this.jpg = jpg;
            return this;
        }
        public Boolean getJpg() {
            return this.jpg;
        }

        public OrderQueryByUserResponseBodyResultContentFormatList setMp4(Boolean mp4) {
            this.mp4 = mp4;
            return this;
        }
        public Boolean getMp4() {
            return this.mp4;
        }

    }

    public static class OrderQueryByUserResponseBodyResultContent extends TeaModel {
        @NameInMap("FormatList")
        public OrderQueryByUserResponseBodyResultContentFormatList formatList;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("ImagePath")
        public String imagePath;

        @NameInMap("ModelPath")
        public String modelPath;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderId")
        public String orderId;

        public static OrderQueryByUserResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryByUserResponseBodyResultContent self = new OrderQueryByUserResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public OrderQueryByUserResponseBodyResultContent setFormatList(OrderQueryByUserResponseBodyResultContentFormatList formatList) {
            this.formatList = formatList;
            return this;
        }
        public OrderQueryByUserResponseBodyResultContentFormatList getFormatList() {
            return this.formatList;
        }

        public OrderQueryByUserResponseBodyResultContent setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public OrderQueryByUserResponseBodyResultContent setImagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }
        public String getImagePath() {
            return this.imagePath;
        }

        public OrderQueryByUserResponseBodyResultContent setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

        public OrderQueryByUserResponseBodyResultContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OrderQueryByUserResponseBodyResultContent setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class OrderQueryByUserResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public java.util.List<OrderQueryByUserResponseBodyResultContent> content;

        public static OrderQueryByUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryByUserResponseBodyResult self = new OrderQueryByUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public OrderQueryByUserResponseBodyResult setContent(java.util.List<OrderQueryByUserResponseBodyResultContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<OrderQueryByUserResponseBodyResultContent> getContent() {
            return this.content;
        }

    }

}
