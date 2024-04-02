// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeViewContentResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ViewContentList")
    public java.util.List<DescribeViewContentResponseBodyViewContentList> viewContentList;

    public static DescribeViewContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeViewContentResponseBody self = new DescribeViewContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeViewContentResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeViewContentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeViewContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeViewContentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeViewContentResponseBody setViewContentList(java.util.List<DescribeViewContentResponseBodyViewContentList> viewContentList) {
        this.viewContentList = viewContentList;
        return this;
    }
    public java.util.List<DescribeViewContentResponseBodyViewContentList> getViewContentList() {
        return this.viewContentList;
    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsAge extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Value")
        public Integer value;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsAge build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsAge self = new DescribeViewContentResponseBodyViewContentListFaceResultsAge();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsAge setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsAge setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsBang extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Value")
        public String value;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsBang build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsBang self = new DescribeViewContentResponseBodyViewContentListFaceResultsBang();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsBang setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsBang setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsGender extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Value")
        public String value;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsGender build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsGender self = new DescribeViewContentResponseBodyViewContentListFaceResultsGender();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsGender setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsGender setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsGlasses extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Value")
        public String value;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsGlasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsGlasses self = new DescribeViewContentResponseBodyViewContentListFaceResultsGlasses();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsGlasses setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsGlasses setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsHairstyle extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Value")
        public String value;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsHairstyle build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsHairstyle self = new DescribeViewContentResponseBodyViewContentListFaceResultsHairstyle();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsHairstyle setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsHairstyle setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsHat extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Value")
        public String value;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsHat build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsHat self = new DescribeViewContentResponseBodyViewContentListFaceResultsHat();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsHat setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsHat setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsImage extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsImage self = new DescribeViewContentResponseBodyViewContentListFaceResultsImage();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsImage setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsImage setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsLocation extends TeaModel {
        @NameInMap("H")
        public Integer h;

        @NameInMap("W")
        public Integer w;

        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsLocation self = new DescribeViewContentResponseBodyViewContentListFaceResultsLocation();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsMustache extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Value")
        public String value;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsMustache build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsMustache self = new DescribeViewContentResponseBodyViewContentListFaceResultsMustache();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsMustache setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsMustache setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsQuality extends TeaModel {
        @NameInMap("Blur")
        public Float blur;

        @NameInMap("Pitch")
        public Float pitch;

        @NameInMap("Roll")
        public Float roll;

        @NameInMap("Yaw")
        public Float yaw;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsQuality build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsQuality self = new DescribeViewContentResponseBodyViewContentListFaceResultsQuality();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsQuality setBlur(Float blur) {
            this.blur = blur;
            return this;
        }
        public Float getBlur() {
            return this.blur;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsQuality setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsQuality setRoll(Float roll) {
            this.roll = roll;
            return this;
        }
        public Float getRoll() {
            return this.roll;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsQuality setYaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }
        public Float getYaw() {
            return this.yaw;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsRespirator extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Value")
        public String value;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsRespirator build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsRespirator self = new DescribeViewContentResponseBodyViewContentListFaceResultsRespirator();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsRespirator setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsRespirator setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResultsSmile extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Value")
        public Float value;

        public static DescribeViewContentResponseBodyViewContentListFaceResultsSmile build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResultsSmile self = new DescribeViewContentResponseBodyViewContentListFaceResultsSmile();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsSmile setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResultsSmile setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFaceResults extends TeaModel {
        @NameInMap("Age")
        public DescribeViewContentResponseBodyViewContentListFaceResultsAge age;

        @NameInMap("Bang")
        public DescribeViewContentResponseBodyViewContentListFaceResultsBang bang;

        @NameInMap("Bualified")
        public Boolean bualified;

        @NameInMap("Gender")
        public DescribeViewContentResponseBodyViewContentListFaceResultsGender gender;

        @NameInMap("Glasses")
        public DescribeViewContentResponseBodyViewContentListFaceResultsGlasses glasses;

        @NameInMap("Hairstyle")
        public DescribeViewContentResponseBodyViewContentListFaceResultsHairstyle hairstyle;

        @NameInMap("Hat")
        public DescribeViewContentResponseBodyViewContentListFaceResultsHat hat;

        @NameInMap("Image")
        public DescribeViewContentResponseBodyViewContentListFaceResultsImage image;

        @NameInMap("Location")
        public DescribeViewContentResponseBodyViewContentListFaceResultsLocation location;

        @NameInMap("Mustache")
        public DescribeViewContentResponseBodyViewContentListFaceResultsMustache mustache;

        @NameInMap("Quality")
        public DescribeViewContentResponseBodyViewContentListFaceResultsQuality quality;

        @NameInMap("Respirator")
        public DescribeViewContentResponseBodyViewContentListFaceResultsRespirator respirator;

        @NameInMap("Smile")
        public DescribeViewContentResponseBodyViewContentListFaceResultsSmile smile;

        public static DescribeViewContentResponseBodyViewContentListFaceResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFaceResults self = new DescribeViewContentResponseBodyViewContentListFaceResults();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setAge(DescribeViewContentResponseBodyViewContentListFaceResultsAge age) {
            this.age = age;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsAge getAge() {
            return this.age;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setBang(DescribeViewContentResponseBodyViewContentListFaceResultsBang bang) {
            this.bang = bang;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsBang getBang() {
            return this.bang;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setBualified(Boolean bualified) {
            this.bualified = bualified;
            return this;
        }
        public Boolean getBualified() {
            return this.bualified;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setGender(DescribeViewContentResponseBodyViewContentListFaceResultsGender gender) {
            this.gender = gender;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsGender getGender() {
            return this.gender;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setGlasses(DescribeViewContentResponseBodyViewContentListFaceResultsGlasses glasses) {
            this.glasses = glasses;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsGlasses getGlasses() {
            return this.glasses;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setHairstyle(DescribeViewContentResponseBodyViewContentListFaceResultsHairstyle hairstyle) {
            this.hairstyle = hairstyle;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsHairstyle getHairstyle() {
            return this.hairstyle;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setHat(DescribeViewContentResponseBodyViewContentListFaceResultsHat hat) {
            this.hat = hat;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsHat getHat() {
            return this.hat;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setImage(DescribeViewContentResponseBodyViewContentListFaceResultsImage image) {
            this.image = image;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsImage getImage() {
            return this.image;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setLocation(DescribeViewContentResponseBodyViewContentListFaceResultsLocation location) {
            this.location = location;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsLocation getLocation() {
            return this.location;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setMustache(DescribeViewContentResponseBodyViewContentListFaceResultsMustache mustache) {
            this.mustache = mustache;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsMustache getMustache() {
            return this.mustache;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setQuality(DescribeViewContentResponseBodyViewContentListFaceResultsQuality quality) {
            this.quality = quality;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsQuality getQuality() {
            return this.quality;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setRespirator(DescribeViewContentResponseBodyViewContentListFaceResultsRespirator respirator) {
            this.respirator = respirator;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsRespirator getRespirator() {
            return this.respirator;
        }

        public DescribeViewContentResponseBodyViewContentListFaceResults setSmile(DescribeViewContentResponseBodyViewContentListFaceResultsSmile smile) {
            this.smile = smile;
            return this;
        }
        public DescribeViewContentResponseBodyViewContentListFaceResultsSmile getSmile() {
            return this.smile;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListFrameResults extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Offset")
        public Integer offset;

        @NameInMap("Url")
        public String url;

        public static DescribeViewContentResponseBodyViewContentListFrameResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListFrameResults self = new DescribeViewContentResponseBodyViewContentListFrameResults();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListFrameResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeViewContentResponseBodyViewContentListFrameResults setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public DescribeViewContentResponseBodyViewContentListFrameResults setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentListResults extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        public static DescribeViewContentResponseBodyViewContentListResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentListResults self = new DescribeViewContentResponseBodyViewContentListResults();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentListResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeViewContentResponseBodyViewContentListResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeViewContentResponseBodyViewContentListResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class DescribeViewContentResponseBodyViewContentList extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Content")
        public String content;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("FaceResults")
        public java.util.List<DescribeViewContentResponseBodyViewContentListFaceResults> faceResults;

        @NameInMap("FrameResults")
        public java.util.List<DescribeViewContentResponseBodyViewContentListFrameResults> frameResults;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NewUrl")
        public String newUrl;

        @NameInMap("RequestTime")
        public String requestTime;

        @NameInMap("Results")
        public java.util.List<DescribeViewContentResponseBodyViewContentListResults> results;

        @NameInMap("ScanFinishedTime")
        public String scanFinishedTime;

        @NameInMap("ScanResult")
        public String scanResult;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("Url")
        public String url;

        public static DescribeViewContentResponseBodyViewContentList build(java.util.Map<String, ?> map) throws Exception {
            DescribeViewContentResponseBodyViewContentList self = new DescribeViewContentResponseBodyViewContentList();
            return TeaModel.build(map, self);
        }

        public DescribeViewContentResponseBodyViewContentList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeViewContentResponseBodyViewContentList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeViewContentResponseBodyViewContentList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeViewContentResponseBodyViewContentList setFaceResults(java.util.List<DescribeViewContentResponseBodyViewContentListFaceResults> faceResults) {
            this.faceResults = faceResults;
            return this;
        }
        public java.util.List<DescribeViewContentResponseBodyViewContentListFaceResults> getFaceResults() {
            return this.faceResults;
        }

        public DescribeViewContentResponseBodyViewContentList setFrameResults(java.util.List<DescribeViewContentResponseBodyViewContentListFrameResults> frameResults) {
            this.frameResults = frameResults;
            return this;
        }
        public java.util.List<DescribeViewContentResponseBodyViewContentListFrameResults> getFrameResults() {
            return this.frameResults;
        }

        public DescribeViewContentResponseBodyViewContentList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeViewContentResponseBodyViewContentList setNewUrl(String newUrl) {
            this.newUrl = newUrl;
            return this;
        }
        public String getNewUrl() {
            return this.newUrl;
        }

        public DescribeViewContentResponseBodyViewContentList setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public DescribeViewContentResponseBodyViewContentList setResults(java.util.List<DescribeViewContentResponseBodyViewContentListResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DescribeViewContentResponseBodyViewContentListResults> getResults() {
            return this.results;
        }

        public DescribeViewContentResponseBodyViewContentList setScanFinishedTime(String scanFinishedTime) {
            this.scanFinishedTime = scanFinishedTime;
            return this;
        }
        public String getScanFinishedTime() {
            return this.scanFinishedTime;
        }

        public DescribeViewContentResponseBodyViewContentList setScanResult(String scanResult) {
            this.scanResult = scanResult;
            return this;
        }
        public String getScanResult() {
            return this.scanResult;
        }

        public DescribeViewContentResponseBodyViewContentList setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public DescribeViewContentResponseBodyViewContentList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeViewContentResponseBodyViewContentList setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public DescribeViewContentResponseBodyViewContentList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
