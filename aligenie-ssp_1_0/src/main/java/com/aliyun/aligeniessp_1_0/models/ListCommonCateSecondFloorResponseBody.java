// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCommonCateSecondFloorResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListCommonCateSecondFloorResponseBodyResult> result;

    public static ListCommonCateSecondFloorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommonCateSecondFloorResponseBody self = new ListCommonCateSecondFloorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommonCateSecondFloorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCommonCateSecondFloorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCommonCateSecondFloorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommonCateSecondFloorResponseBody setResult(java.util.List<ListCommonCateSecondFloorResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCommonCateSecondFloorResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListCommonCateSecondFloorResponseBodyResult extends TeaModel {
        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("ParentCateId")
        public Long parentCateId;

        public static ListCommonCateSecondFloorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCommonCateSecondFloorResponseBodyResult self = new ListCommonCateSecondFloorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCommonCateSecondFloorResponseBodyResult setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public ListCommonCateSecondFloorResponseBodyResult setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListCommonCateSecondFloorResponseBodyResult setParentCateId(Long parentCateId) {
            this.parentCateId = parentCateId;
            return this;
        }
        public Long getParentCateId() {
            return this.parentCateId;
        }

    }

}
