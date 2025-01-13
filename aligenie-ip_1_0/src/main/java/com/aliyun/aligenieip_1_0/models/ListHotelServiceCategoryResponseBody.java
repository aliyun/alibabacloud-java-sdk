// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelServiceCategoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5373C821-65D2-1764-B9F9-951914937FF5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListHotelServiceCategoryResponseBodyResult> result;

    public static ListHotelServiceCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelServiceCategoryResponseBody self = new ListHotelServiceCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelServiceCategoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHotelServiceCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelServiceCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelServiceCategoryResponseBody setResult(java.util.List<ListHotelServiceCategoryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListHotelServiceCategoryResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListHotelServiceCategoryResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GOODS</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>生活及洗漱用品</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingfenlei/wupintianjia.png">https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingfenlei/wupintianjia.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>物品添加</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>HOTEL_SERVICE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListHotelServiceCategoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelServiceCategoryResponseBodyResult self = new ListHotelServiceCategoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelServiceCategoryResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListHotelServiceCategoryResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListHotelServiceCategoryResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListHotelServiceCategoryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHotelServiceCategoryResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
