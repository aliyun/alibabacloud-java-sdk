// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCommonCateFirstFloorResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

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
