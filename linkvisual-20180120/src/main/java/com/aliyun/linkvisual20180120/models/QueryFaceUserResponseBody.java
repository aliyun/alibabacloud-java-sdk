// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryFaceUserResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserResponseBody self = new QueryFaceUserResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserResponseBody setData(QueryFaceUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceUserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceUserResponseBodyDataFacePicListFeatureDTOList extends TeaModel {
        @NameInMap("AlgorithmName")
        public String algorithmName;

        @NameInMap("AlgorithmProvider")
        public String algorithmProvider;

        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FaceMd5")
        public String faceMd5;

        public static QueryFaceUserResponseBodyDataFacePicListFeatureDTOList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserResponseBodyDataFacePicListFeatureDTOList self = new QueryFaceUserResponseBodyDataFacePicListFeatureDTOList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserResponseBodyDataFacePicListFeatureDTOList setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public QueryFaceUserResponseBodyDataFacePicListFeatureDTOList setAlgorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }
        public String getAlgorithmProvider() {
            return this.algorithmProvider;
        }

        public QueryFaceUserResponseBodyDataFacePicListFeatureDTOList setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public QueryFaceUserResponseBodyDataFacePicListFeatureDTOList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryFaceUserResponseBodyDataFacePicListFeatureDTOList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryFaceUserResponseBodyDataFacePicListFeatureDTOList setFaceMd5(String faceMd5) {
            this.faceMd5 = faceMd5;
            return this;
        }
        public String getFaceMd5() {
            return this.faceMd5;
        }

    }

    public static class QueryFaceUserResponseBodyDataFacePicList extends TeaModel {
        @NameInMap("FaceMd5")
        public String faceMd5;

        @NameInMap("FaceUrl")
        public String faceUrl;

        @NameInMap("FeatureDTOList")
        public java.util.List<QueryFaceUserResponseBodyDataFacePicListFeatureDTOList> featureDTOList;

        public static QueryFaceUserResponseBodyDataFacePicList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserResponseBodyDataFacePicList self = new QueryFaceUserResponseBodyDataFacePicList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserResponseBodyDataFacePicList setFaceMd5(String faceMd5) {
            this.faceMd5 = faceMd5;
            return this;
        }
        public String getFaceMd5() {
            return this.faceMd5;
        }

        public QueryFaceUserResponseBodyDataFacePicList setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public QueryFaceUserResponseBodyDataFacePicList setFeatureDTOList(java.util.List<QueryFaceUserResponseBodyDataFacePicListFeatureDTOList> featureDTOList) {
            this.featureDTOList = featureDTOList;
            return this;
        }
        public java.util.List<QueryFaceUserResponseBodyDataFacePicListFeatureDTOList> getFeatureDTOList() {
            return this.featureDTOList;
        }

    }

    public static class QueryFaceUserResponseBodyData extends TeaModel {
        @NameInMap("CustomUserId")
        public String customUserId;

        @NameInMap("FacePicList")
        public java.util.List<QueryFaceUserResponseBodyDataFacePicList> facePicList;

        @NameInMap("Name")
        public String name;

        @NameInMap("Params")
        public String params;

        @NameInMap("UserId")
        public String userId;

        public static QueryFaceUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserResponseBodyData self = new QueryFaceUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserResponseBodyData setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceUserResponseBodyData setFacePicList(java.util.List<QueryFaceUserResponseBodyDataFacePicList> facePicList) {
            this.facePicList = facePicList;
            return this;
        }
        public java.util.List<QueryFaceUserResponseBodyDataFacePicList> getFacePicList() {
            return this.facePicList;
        }

        public QueryFaceUserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFaceUserResponseBodyData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryFaceUserResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
