// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20200212.models;

import com.aliyun.tea.*;

public class AddImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("PicInfo")
    @Validation(required = true)
    public AddImageResponsePicInfo picInfo;

    public static AddImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponse self = new AddImageResponse();
        return TeaModel.build(map, self);
    }

    public AddImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddImageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddImageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddImageResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddImageResponse setPicInfo(AddImageResponsePicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public AddImageResponsePicInfo getPicInfo() {
        return this.picInfo;
    }

    public static class AddImageResponsePicInfo extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Integer categoryId;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        public static AddImageResponsePicInfo build(java.util.Map<String, ?> map) throws Exception {
            AddImageResponsePicInfo self = new AddImageResponsePicInfo();
            return TeaModel.build(map, self);
        }

        public AddImageResponsePicInfo setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public AddImageResponsePicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
