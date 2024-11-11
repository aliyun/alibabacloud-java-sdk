// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCommonCateFirstFloorResponseBody extends TeaModel {
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
     * <p>F12B6147-5925-19E5-A3AD-E1EE1360F34E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListCommonCateFirstFloorResponseBodyResult> result;

    public static ListCommonCateFirstFloorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommonCateFirstFloorResponseBody self = new ListCommonCateFirstFloorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommonCateFirstFloorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCommonCateFirstFloorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCommonCateFirstFloorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommonCateFirstFloorResponseBody setResult(java.util.List<ListCommonCateFirstFloorResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCommonCateFirstFloorResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListCommonCateFirstFloorResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>80012</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParentCateId")
        public Long parentCateId;

        public static ListCommonCateFirstFloorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCommonCateFirstFloorResponseBodyResult self = new ListCommonCateFirstFloorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCommonCateFirstFloorResponseBodyResult setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public ListCommonCateFirstFloorResponseBodyResult setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListCommonCateFirstFloorResponseBodyResult setParentCateId(Long parentCateId) {
            this.parentCateId = parentCateId;
            return this;
        }
        public Long getParentCateId() {
            return this.parentCateId;
        }

    }

}
