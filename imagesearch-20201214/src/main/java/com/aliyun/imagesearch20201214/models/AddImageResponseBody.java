// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class AddImageResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("PicInfo")
    public AddImageResponseBodyPicInfo picInfo;

    @NameInMap("Success")
    public Boolean success;

    public static AddImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponseBody self = new AddImageResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddImageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddImageResponseBody setPicInfo(AddImageResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public AddImageResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public AddImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddImageResponseBodyPicInfo extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("CategoryId")
        public Integer categoryId;

        public static AddImageResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            AddImageResponseBodyPicInfo self = new AddImageResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public AddImageResponseBodyPicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AddImageResponseBodyPicInfo setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

    }

}
