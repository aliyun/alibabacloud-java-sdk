// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class AddImageResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * <ul>
     * <li>0: success.</li>
     * <li>Non-zero: failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message.</p>
     * <blockquote>
     * <p>No data is returned for successful requests. Error messages are returned for failed requests.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The category prediction and subject identification results.</p>
     */
    @NameInMap("PicInfo")
    public AddImageResponseBodyPicInfo picInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E0845DE6-52AF-4B50-9F15-51ED4044E6AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public static class AddImageResponseBodyPicInfoAllCategories extends TeaModel {
        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>88888888</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The category name.</p>
         * 
         * <strong>example:</strong>
         * <p>Other</p>
         */
        @NameInMap("Name")
        public String name;

        public static AddImageResponseBodyPicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            AddImageResponseBodyPicInfoAllCategories self = new AddImageResponseBodyPicInfoAllCategories();
            return TeaModel.build(map, self);
        }

        public AddImageResponseBodyPicInfoAllCategories setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public AddImageResponseBodyPicInfoAllCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AddImageResponseBodyPicInfoMultiRegion extends TeaModel {
        /**
         * <p>The subject identification result. The subject region of the image, in the format of x1,x2,y1,y2, where x1,y1 is the upper-left point and x2,y2 is the lower-right point. If the user specifies a subject region in the request, the specified region is used.</p>
         * 
         * <strong>example:</strong>
         * <p>94,691,206,650</p>
         */
        @NameInMap("Region")
        public String region;

        public static AddImageResponseBodyPicInfoMultiRegion build(java.util.Map<String, ?> map) throws Exception {
            AddImageResponseBodyPicInfoMultiRegion self = new AddImageResponseBodyPicInfoMultiRegion();
            return TeaModel.build(map, self);
        }

        public AddImageResponseBodyPicInfoMultiRegion setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class AddImageResponseBodyPicInfo extends TeaModel {
        /**
         * <p>The information about all categories supported by the system.</p>
         */
        @NameInMap("AllCategories")
        public java.util.List<AddImageResponseBodyPicInfoAllCategories> allCategories;

        /**
         * <p>The category prediction result. If the user specifies a category in the request, the specified category is used.</p>
         * 
         * <strong>example:</strong>
         * <p>88888888</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The collection of subject identification results.</p>
         * <blockquote>
         * <p>Upgrade to V3.1.1 or later to use this feature.</p>
         * </blockquote>
         */
        @NameInMap("MultiRegion")
        public java.util.List<AddImageResponseBodyPicInfoMultiRegion> multiRegion;

        /**
         * <p>The subject identification result. The subject region of the image, in the format of <code>x1,x2,y1,y2</code>, where <code>x1,y1</code> is the upper-left point and <code>x2,y2</code> is the lower-right point. If the user specifies a subject region in the request, the specified region is used.</p>
         * 
         * <strong>example:</strong>
         * <p>94,691,206,650</p>
         */
        @NameInMap("Region")
        public String region;

        public static AddImageResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            AddImageResponseBodyPicInfo self = new AddImageResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public AddImageResponseBodyPicInfo setAllCategories(java.util.List<AddImageResponseBodyPicInfoAllCategories> allCategories) {
            this.allCategories = allCategories;
            return this;
        }
        public java.util.List<AddImageResponseBodyPicInfoAllCategories> getAllCategories() {
            return this.allCategories;
        }

        public AddImageResponseBodyPicInfo setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public AddImageResponseBodyPicInfo setMultiRegion(java.util.List<AddImageResponseBodyPicInfoMultiRegion> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public java.util.List<AddImageResponseBodyPicInfoMultiRegion> getMultiRegion() {
            return this.multiRegion;
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
