// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryFaceUserResponseData data;

    public static QueryFaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserResponse self = new QueryFaceUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceUserResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserResponse setData(QueryFaceUserResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserResponseData getData() {
        return this.data;
    }

    public static class QueryFaceUserResponseDataFacePicListFeatureDTOList extends TeaModel {
        @NameInMap("AlgorithmName")
        @Validation(required = true)
        public String algorithmName;

        @NameInMap("AlgorithmProvider")
        @Validation(required = true)
        public String algorithmProvider;

        @NameInMap("AlgorithmVersion")
        @Validation(required = true)
        public String algorithmVersion;

        @NameInMap("FaceMd5")
        @Validation(required = true)
        public String faceMd5;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        public static QueryFaceUserResponseDataFacePicListFeatureDTOList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserResponseDataFacePicListFeatureDTOList self = new QueryFaceUserResponseDataFacePicListFeatureDTOList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserResponseDataFacePicListFeatureDTOList setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public QueryFaceUserResponseDataFacePicListFeatureDTOList setAlgorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }
        public String getAlgorithmProvider() {
            return this.algorithmProvider;
        }

        public QueryFaceUserResponseDataFacePicListFeatureDTOList setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public QueryFaceUserResponseDataFacePicListFeatureDTOList setFaceMd5(String faceMd5) {
            this.faceMd5 = faceMd5;
            return this;
        }
        public String getFaceMd5() {
            return this.faceMd5;
        }

        public QueryFaceUserResponseDataFacePicListFeatureDTOList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryFaceUserResponseDataFacePicListFeatureDTOList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class QueryFaceUserResponseDataFacePicList extends TeaModel {
        @NameInMap("FaceMd5")
        @Validation(required = true)
        public String faceMd5;

        @NameInMap("FaceUrl")
        @Validation(required = true)
        public String faceUrl;

        @NameInMap("FeatureDTOList")
        @Validation(required = true)
        public java.util.List<QueryFaceUserResponseDataFacePicListFeatureDTOList> featureDTOList;

        public static QueryFaceUserResponseDataFacePicList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserResponseDataFacePicList self = new QueryFaceUserResponseDataFacePicList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserResponseDataFacePicList setFaceMd5(String faceMd5) {
            this.faceMd5 = faceMd5;
            return this;
        }
        public String getFaceMd5() {
            return this.faceMd5;
        }

        public QueryFaceUserResponseDataFacePicList setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public QueryFaceUserResponseDataFacePicList setFeatureDTOList(java.util.List<QueryFaceUserResponseDataFacePicListFeatureDTOList> featureDTOList) {
            this.featureDTOList = featureDTOList;
            return this;
        }
        public java.util.List<QueryFaceUserResponseDataFacePicListFeatureDTOList> getFeatureDTOList() {
            return this.featureDTOList;
        }

    }

    public static class QueryFaceUserResponseData extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("CustomUserId")
        @Validation(required = true)
        public String customUserId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Params")
        @Validation(required = true)
        public String params;

        @NameInMap("FacePicList")
        @Validation(required = true)
        public java.util.List<QueryFaceUserResponseDataFacePicList> facePicList;

        public static QueryFaceUserResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserResponseData self = new QueryFaceUserResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserResponseData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryFaceUserResponseData setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceUserResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFaceUserResponseData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryFaceUserResponseData setFacePicList(java.util.List<QueryFaceUserResponseDataFacePicList> facePicList) {
            this.facePicList = facePicList;
            return this;
        }
        public java.util.List<QueryFaceUserResponseDataFacePicList> getFacePicList() {
            return this.facePicList;
        }

    }

}
