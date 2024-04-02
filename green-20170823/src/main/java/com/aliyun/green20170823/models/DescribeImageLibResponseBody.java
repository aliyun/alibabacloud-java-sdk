// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeImageLibResponseBody extends TeaModel {
    @NameInMap("ImageLibList")
    public java.util.List<DescribeImageLibResponseBodyImageLibList> imageLibList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageLibResponseBody self = new DescribeImageLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageLibResponseBody setImageLibList(java.util.List<DescribeImageLibResponseBodyImageLibList> imageLibList) {
        this.imageLibList = imageLibList;
        return this;
    }
    public java.util.List<DescribeImageLibResponseBodyImageLibList> getImageLibList() {
        return this.imageLibList;
    }

    public DescribeImageLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageLibResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImageLibResponseBodyImageLibList extends TeaModel {
        @NameInMap("BizTypes")
        public java.util.List<String> bizTypes;

        @NameInMap("Category")
        public String category;

        @NameInMap("Code")
        public String code;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ImageCount")
        public Integer imageCount;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("ServiceModule")
        public String serviceModule;

        @NameInMap("Source")
        public String source;

        public static DescribeImageLibResponseBodyImageLibList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageLibResponseBodyImageLibList self = new DescribeImageLibResponseBodyImageLibList();
            return TeaModel.build(map, self);
        }

        public DescribeImageLibResponseBodyImageLibList setBizTypes(java.util.List<String> bizTypes) {
            this.bizTypes = bizTypes;
            return this;
        }
        public java.util.List<String> getBizTypes() {
            return this.bizTypes;
        }

        public DescribeImageLibResponseBodyImageLibList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeImageLibResponseBodyImageLibList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeImageLibResponseBodyImageLibList setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeImageLibResponseBodyImageLibList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeImageLibResponseBodyImageLibList setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public DescribeImageLibResponseBodyImageLibList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeImageLibResponseBodyImageLibList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageLibResponseBodyImageLibList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeImageLibResponseBodyImageLibList setServiceModule(String serviceModule) {
            this.serviceModule = serviceModule;
            return this;
        }
        public String getServiceModule() {
            return this.serviceModule;
        }

        public DescribeImageLibResponseBodyImageLibList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
