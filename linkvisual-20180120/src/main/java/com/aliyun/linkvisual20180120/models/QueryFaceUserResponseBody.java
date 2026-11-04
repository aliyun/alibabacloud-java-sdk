// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public QueryFaceUserResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A13279A-5640-45E7-87AA-83750541AD0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The name of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAlgorithmName</p>
         */
        @NameInMap("AlgorithmName")
        public String algorithmName;

        /**
         * <p>The provider of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAlgorithmProvider</p>
         */
        @NameInMap("AlgorithmProvider")
        public String algorithmProvider;

        /**
         * <p>The version of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAlgorithmVersion</p>
         */
        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The MD5 hash of the face.</p>
         * 
         * <strong>example:</strong>
         * <p>TestFaceMd5</p>
         */
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
        /**
         * <p>The MD5 hash of the photo.</p>
         * 
         * <strong>example:</strong>
         * <p>TestFaceMd5</p>
         */
        @NameInMap("FaceMd5")
        public String faceMd5;

        /**
         * <p>The URL of the photo.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.com/xxx.jpg">https://test.com/xxx.jpg</a></p>
         */
        @NameInMap("FaceUrl")
        public String faceUrl;

        /**
         * <p>The list of face feature values.</p>
         */
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
        /**
         * <p>The user ID in the caller\&quot;s system.</p>
         * 
         * <strong>example:</strong>
         * <p>TestCustomUserId</p>
         */
        @NameInMap("CustomUserId")
        public String customUserId;

        /**
         * <p>The list of face photo information.</p>
         */
        @NameInMap("FacePicList")
        public java.util.List<QueryFaceUserResponseBodyDataFacePicList> facePicList;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>TestName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;age&quot;:28, &quot;sex&quot;:&quot;male&quot;}</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUserId</p>
         */
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
