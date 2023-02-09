// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class SearchImageByPicResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchImageByPicResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchImageByPicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicResponseBody self = new SearchImageByPicResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicResponseBody setData(SearchImageByPicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchImageByPicResponseBodyData getData() {
        return this.data;
    }

    public SearchImageByPicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageByPicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchImageByPicResponseBodyDataPicInfos extends TeaModel {
        @NameInMap("Bbox")
        public java.util.List<Integer> bbox;

        @NameInMap("Confidence")
        public Float confidence;

        public static SearchImageByPicResponseBodyDataPicInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyDataPicInfos self = new SearchImageByPicResponseBodyDataPicInfos();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyDataPicInfos setBbox(java.util.List<Integer> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Integer> getBbox() {
            return this.bbox;
        }

        public SearchImageByPicResponseBodyDataPicInfos setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class SearchImageByPicResponseBodyDataPicListOtherBoxes extends TeaModel {
        @NameInMap("Bbox")
        public java.util.List<Integer> bbox;

        @NameInMap("Confidence")
        public Float confidence;

        public static SearchImageByPicResponseBodyDataPicListOtherBoxes build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyDataPicListOtherBoxes self = new SearchImageByPicResponseBodyDataPicListOtherBoxes();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyDataPicListOtherBoxes setBbox(java.util.List<Integer> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Integer> getBbox() {
            return this.bbox;
        }

        public SearchImageByPicResponseBodyDataPicListOtherBoxes setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class SearchImageByPicResponseBodyDataPicListSimilarBoxes extends TeaModel {
        @NameInMap("Bbox")
        public java.util.List<Integer> bbox;

        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Score")
        public Float score;

        public static SearchImageByPicResponseBodyDataPicListSimilarBoxes build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyDataPicListSimilarBoxes self = new SearchImageByPicResponseBodyDataPicListSimilarBoxes();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyDataPicListSimilarBoxes setBbox(java.util.List<Integer> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Integer> getBbox() {
            return this.bbox;
        }

        public SearchImageByPicResponseBodyDataPicListSimilarBoxes setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public SearchImageByPicResponseBodyDataPicListSimilarBoxes setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class SearchImageByPicResponseBodyDataPicList extends TeaModel {
        @NameInMap("CustomContent")
        public String customContent;

        @NameInMap("IntAttr")
        public Integer intAttr;

        @NameInMap("OtherBoxes")
        public java.util.List<SearchImageByPicResponseBodyDataPicListOtherBoxes> otherBoxes;

        @NameInMap("PicName")
        public String picName;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("Score")
        public Float score;

        @NameInMap("SimilarBoxes")
        public java.util.List<SearchImageByPicResponseBodyDataPicListSimilarBoxes> similarBoxes;

        @NameInMap("StrAttr")
        public String strAttr;

        public static SearchImageByPicResponseBodyDataPicList build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyDataPicList self = new SearchImageByPicResponseBodyDataPicList();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyDataPicList setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByPicResponseBodyDataPicList setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByPicResponseBodyDataPicList setOtherBoxes(java.util.List<SearchImageByPicResponseBodyDataPicListOtherBoxes> otherBoxes) {
            this.otherBoxes = otherBoxes;
            return this;
        }
        public java.util.List<SearchImageByPicResponseBodyDataPicListOtherBoxes> getOtherBoxes() {
            return this.otherBoxes;
        }

        public SearchImageByPicResponseBodyDataPicList setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByPicResponseBodyDataPicList setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByPicResponseBodyDataPicList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchImageByPicResponseBodyDataPicList setSimilarBoxes(java.util.List<SearchImageByPicResponseBodyDataPicListSimilarBoxes> similarBoxes) {
            this.similarBoxes = similarBoxes;
            return this;
        }
        public java.util.List<SearchImageByPicResponseBodyDataPicListSimilarBoxes> getSimilarBoxes() {
            return this.similarBoxes;
        }

        public SearchImageByPicResponseBodyDataPicList setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

    }

    public static class SearchImageByPicResponseBodyData extends TeaModel {
        @NameInMap("PicInfos")
        public java.util.List<SearchImageByPicResponseBodyDataPicInfos> picInfos;

        @NameInMap("PicList")
        public java.util.List<SearchImageByPicResponseBodyDataPicList> picList;

        public static SearchImageByPicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByPicResponseBodyData self = new SearchImageByPicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchImageByPicResponseBodyData setPicInfos(java.util.List<SearchImageByPicResponseBodyDataPicInfos> picInfos) {
            this.picInfos = picInfos;
            return this;
        }
        public java.util.List<SearchImageByPicResponseBodyDataPicInfos> getPicInfos() {
            return this.picInfos;
        }

        public SearchImageByPicResponseBodyData setPicList(java.util.List<SearchImageByPicResponseBodyDataPicList> picList) {
            this.picList = picList;
            return this;
        }
        public java.util.List<SearchImageByPicResponseBodyDataPicList> getPicList() {
            return this.picList;
        }

    }

}
