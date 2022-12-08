// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserBatchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryFaceUserBatchResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceUserBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserBatchResponseBody self = new QueryFaceUserBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserBatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserBatchResponseBody setData(java.util.List<QueryFaceUserBatchResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFaceUserBatchResponseBodyData> getData() {
        return this.data;
    }

    public QueryFaceUserBatchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserBatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList extends TeaModel {
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

        public static QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList self = new QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList setAlgorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }
        public String getAlgorithmProvider() {
            return this.algorithmProvider;
        }

        public QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList setFaceMd5(String faceMd5) {
            this.faceMd5 = faceMd5;
            return this;
        }
        public String getFaceMd5() {
            return this.faceMd5;
        }

    }

    public static class QueryFaceUserBatchResponseBodyDataFacePicList extends TeaModel {
        @NameInMap("FaceMd5")
        public String faceMd5;

        @NameInMap("FaceUrl")
        public String faceUrl;

        @NameInMap("FeatureDTOList")
        public java.util.List<QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList> featureDTOList;

        public static QueryFaceUserBatchResponseBodyDataFacePicList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserBatchResponseBodyDataFacePicList self = new QueryFaceUserBatchResponseBodyDataFacePicList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserBatchResponseBodyDataFacePicList setFaceMd5(String faceMd5) {
            this.faceMd5 = faceMd5;
            return this;
        }
        public String getFaceMd5() {
            return this.faceMd5;
        }

        public QueryFaceUserBatchResponseBodyDataFacePicList setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public QueryFaceUserBatchResponseBodyDataFacePicList setFeatureDTOList(java.util.List<QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList> featureDTOList) {
            this.featureDTOList = featureDTOList;
            return this;
        }
        public java.util.List<QueryFaceUserBatchResponseBodyDataFacePicListFeatureDTOList> getFeatureDTOList() {
            return this.featureDTOList;
        }

    }

    public static class QueryFaceUserBatchResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CustomUserId")
        public String customUserId;

        @NameInMap("FacePicList")
        public java.util.List<QueryFaceUserBatchResponseBodyDataFacePicList> facePicList;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Params")
        public String params;

        @NameInMap("UserId")
        public String userId;

        public static QueryFaceUserBatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserBatchResponseBodyData self = new QueryFaceUserBatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserBatchResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryFaceUserBatchResponseBodyData setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceUserBatchResponseBodyData setFacePicList(java.util.List<QueryFaceUserBatchResponseBodyDataFacePicList> facePicList) {
            this.facePicList = facePicList;
            return this;
        }
        public java.util.List<QueryFaceUserBatchResponseBodyDataFacePicList> getFacePicList() {
            return this.facePicList;
        }

        public QueryFaceUserBatchResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryFaceUserBatchResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFaceUserBatchResponseBodyData setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryFaceUserBatchResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
