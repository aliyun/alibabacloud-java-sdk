// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public ImageCategoryResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static ImageCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageCategoryResponseBody self = new ImageCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageCategoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImageCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageCategoryResponseBody setData(ImageCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageCategoryResponseBodyData getData() {
        return this.data;
    }

    public ImageCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImageCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImageCategoryResponseBodyDataCateResult extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static ImageCategoryResponseBodyDataCateResult build(java.util.Map<String, ?> map) throws Exception {
            ImageCategoryResponseBodyDataCateResult self = new ImageCategoryResponseBodyDataCateResult();
            return TeaModel.build(map, self);
        }

        public ImageCategoryResponseBodyDataCateResult setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public ImageCategoryResponseBodyDataCateResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImageCategoryResponseBodyDataCateResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ImageCategoryResponseBodyData extends TeaModel {
        @NameInMap("CateResult")
        public java.util.List<ImageCategoryResponseBodyDataCateResult> cateResult;

        public static ImageCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageCategoryResponseBodyData self = new ImageCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageCategoryResponseBodyData setCateResult(java.util.List<ImageCategoryResponseBodyDataCateResult> cateResult) {
            this.cateResult = cateResult;
            return this;
        }
        public java.util.List<ImageCategoryResponseBodyDataCateResult> getCateResult() {
            return this.cateResult;
        }

    }

}
