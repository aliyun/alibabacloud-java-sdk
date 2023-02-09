// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class SearchImageByNameResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchImageByNameResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchImageByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByNameResponseBody self = new SearchImageByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageByNameResponseBody setData(SearchImageByNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchImageByNameResponseBodyData getData() {
        return this.data;
    }

    public SearchImageByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchImageByNameResponseBodyDataPicInfos extends TeaModel {
        @NameInMap("Bbox")
        public java.util.List<Integer> bbox;

        @NameInMap("Confidence")
        public Float confidence;

        public static SearchImageByNameResponseBodyDataPicInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyDataPicInfos self = new SearchImageByNameResponseBodyDataPicInfos();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyDataPicInfos setBbox(java.util.List<Integer> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Integer> getBbox() {
            return this.bbox;
        }

        public SearchImageByNameResponseBodyDataPicInfos setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class SearchImageByNameResponseBodyDataPicListOtherBoxes extends TeaModel {
        @NameInMap("Bbox")
        public java.util.List<Integer> bbox;

        @NameInMap("Confidence")
        public Float confidence;

        public static SearchImageByNameResponseBodyDataPicListOtherBoxes build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyDataPicListOtherBoxes self = new SearchImageByNameResponseBodyDataPicListOtherBoxes();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyDataPicListOtherBoxes setBbox(java.util.List<Integer> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Integer> getBbox() {
            return this.bbox;
        }

        public SearchImageByNameResponseBodyDataPicListOtherBoxes setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class SearchImageByNameResponseBodyDataPicListSimilarBoxes extends TeaModel {
        @NameInMap("Bbox")
        public java.util.List<Integer> bbox;

        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Score")
        public Float score;

        public static SearchImageByNameResponseBodyDataPicListSimilarBoxes build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyDataPicListSimilarBoxes self = new SearchImageByNameResponseBodyDataPicListSimilarBoxes();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyDataPicListSimilarBoxes setBbox(java.util.List<Integer> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Integer> getBbox() {
            return this.bbox;
        }

        public SearchImageByNameResponseBodyDataPicListSimilarBoxes setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public SearchImageByNameResponseBodyDataPicListSimilarBoxes setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class SearchImageByNameResponseBodyDataPicList extends TeaModel {
        @NameInMap("CustomContent")
        public String customContent;

        @NameInMap("IntAttr")
        public Integer intAttr;

        @NameInMap("OtherBoxes")
        public java.util.List<SearchImageByNameResponseBodyDataPicListOtherBoxes> otherBoxes;

        @NameInMap("PicName")
        public String picName;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("Score")
        public Float score;

        @NameInMap("SimilarBoxes")
        public java.util.List<SearchImageByNameResponseBodyDataPicListSimilarBoxes> similarBoxes;

        @NameInMap("StrAttr")
        public String strAttr;

        public static SearchImageByNameResponseBodyDataPicList build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyDataPicList self = new SearchImageByNameResponseBodyDataPicList();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyDataPicList setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByNameResponseBodyDataPicList setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByNameResponseBodyDataPicList setOtherBoxes(java.util.List<SearchImageByNameResponseBodyDataPicListOtherBoxes> otherBoxes) {
            this.otherBoxes = otherBoxes;
            return this;
        }
        public java.util.List<SearchImageByNameResponseBodyDataPicListOtherBoxes> getOtherBoxes() {
            return this.otherBoxes;
        }

        public SearchImageByNameResponseBodyDataPicList setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByNameResponseBodyDataPicList setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByNameResponseBodyDataPicList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchImageByNameResponseBodyDataPicList setSimilarBoxes(java.util.List<SearchImageByNameResponseBodyDataPicListSimilarBoxes> similarBoxes) {
            this.similarBoxes = similarBoxes;
            return this;
        }
        public java.util.List<SearchImageByNameResponseBodyDataPicListSimilarBoxes> getSimilarBoxes() {
            return this.similarBoxes;
        }

        public SearchImageByNameResponseBodyDataPicList setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

    }

    public static class SearchImageByNameResponseBodyData extends TeaModel {
        @NameInMap("PicInfos")
        public java.util.List<SearchImageByNameResponseBodyDataPicInfos> picInfos;

        @NameInMap("PicList")
        public java.util.List<SearchImageByNameResponseBodyDataPicList> picList;

        public static SearchImageByNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByNameResponseBodyData self = new SearchImageByNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchImageByNameResponseBodyData setPicInfos(java.util.List<SearchImageByNameResponseBodyDataPicInfos> picInfos) {
            this.picInfos = picInfos;
            return this;
        }
        public java.util.List<SearchImageByNameResponseBodyDataPicInfos> getPicInfos() {
            return this.picInfos;
        }

        public SearchImageByNameResponseBodyData setPicList(java.util.List<SearchImageByNameResponseBodyDataPicList> picList) {
            this.picList = picList;
            return this;
        }
        public java.util.List<SearchImageByNameResponseBodyDataPicList> getPicList() {
            return this.picList;
        }

    }

}
