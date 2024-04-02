// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeCustomOcrTemplateResponseBody extends TeaModel {
    @NameInMap("OcrTemplateList")
    public java.util.List<DescribeCustomOcrTemplateResponseBodyOcrTemplateList> ocrTemplateList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCustomOcrTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomOcrTemplateResponseBody self = new DescribeCustomOcrTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomOcrTemplateResponseBody setOcrTemplateList(java.util.List<DescribeCustomOcrTemplateResponseBodyOcrTemplateList> ocrTemplateList) {
        this.ocrTemplateList = ocrTemplateList;
        return this;
    }
    public java.util.List<DescribeCustomOcrTemplateResponseBodyOcrTemplateList> getOcrTemplateList() {
        return this.ocrTemplateList;
    }

    public DescribeCustomOcrTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomOcrTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Name")
        public String name;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea self = new DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea();
            return TeaModel.build(map, self);
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Name")
        public String name;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea self = new DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea();
            return TeaModel.build(map, self);
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class DescribeCustomOcrTemplateResponseBodyOcrTemplateList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("ImgUrl")
        public String imgUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("RecognizeArea")
        public java.util.List<DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea> recognizeArea;

        @NameInMap("ReferArea")
        public java.util.List<DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea> referArea;

        @NameInMap("Status")
        public Integer status;

        public static DescribeCustomOcrTemplateResponseBodyOcrTemplateList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomOcrTemplateResponseBodyOcrTemplateList self = new DescribeCustomOcrTemplateResponseBodyOcrTemplateList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateList setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
            return this;
        }
        public String getImgUrl() {
            return this.imgUrl;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateList setRecognizeArea(java.util.List<DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea> recognizeArea) {
            this.recognizeArea = recognizeArea;
            return this;
        }
        public java.util.List<DescribeCustomOcrTemplateResponseBodyOcrTemplateListRecognizeArea> getRecognizeArea() {
            return this.recognizeArea;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateList setReferArea(java.util.List<DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea> referArea) {
            this.referArea = referArea;
            return this;
        }
        public java.util.List<DescribeCustomOcrTemplateResponseBodyOcrTemplateListReferArea> getReferArea() {
            return this.referArea;
        }

        public DescribeCustomOcrTemplateResponseBodyOcrTemplateList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
