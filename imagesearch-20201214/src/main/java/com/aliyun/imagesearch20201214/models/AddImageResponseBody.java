// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class AddImageResponseBody extends TeaModel {
    /**
     * <p>The code returned.</p>
     * <br>
     * <p>*   A value of 0 indicates that the request was successful.</p>
     * <p>*   Values other than 0 indicate that the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message returned if the request failed.</p>
     * <br>
     * <p>> No value is returned if the request was successful, and an error message is returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The results of category prediction and subject identification.</p>
     */
    @NameInMap("PicInfo")
    public AddImageResponseBodyPicInfo picInfo;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponseBody self = new AddImageResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddImageResponseBody setPicInfo(AddImageResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public AddImageResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public AddImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddImageResponseBodyPicInfo extends TeaModel {
        /**
         * <p>The result of category prediction. If a category is specified in the request, the specified category prevails.</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The result of subject identification. The subject area of the image is in the format of `x1,x2,y1,y2`. `x1 and y1` represent the position in the upper-left corner, in pixels. `x2 and y2` represent the position in the lower-right corner, in pixels. If a subject area is specified in the request, the specified subject area prevails.</p>
         */
        @NameInMap("Region")
        public String region;

        public static AddImageResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            AddImageResponseBodyPicInfo self = new AddImageResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public AddImageResponseBodyPicInfo setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public AddImageResponseBodyPicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
