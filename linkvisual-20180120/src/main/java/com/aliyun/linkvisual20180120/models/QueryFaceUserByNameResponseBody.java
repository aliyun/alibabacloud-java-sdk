// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserByNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryFaceUserByNameResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceUserByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserByNameResponseBody self = new QueryFaceUserByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserByNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserByNameResponseBody setData(QueryFaceUserByNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserByNameResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceUserByNameResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList extends TeaModel {
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

        public static QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList self = new QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList setAlgorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }
        public String getAlgorithmProvider() {
            return this.algorithmProvider;
        }

        public QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList setFaceMd5(String faceMd5) {
            this.faceMd5 = faceMd5;
            return this;
        }
        public String getFaceMd5() {
            return this.faceMd5;
        }

    }

    public static class QueryFaceUserByNameResponseBodyDataListFacePicList extends TeaModel {
        @NameInMap("FaceMd5")
        public String faceMd5;

        @NameInMap("FaceUrl")
        public String faceUrl;

        @NameInMap("FeatureDTOList")
        public java.util.List<QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList> featureDTOList;

        public static QueryFaceUserByNameResponseBodyDataListFacePicList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserByNameResponseBodyDataListFacePicList self = new QueryFaceUserByNameResponseBodyDataListFacePicList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserByNameResponseBodyDataListFacePicList setFaceMd5(String faceMd5) {
            this.faceMd5 = faceMd5;
            return this;
        }
        public String getFaceMd5() {
            return this.faceMd5;
        }

        public QueryFaceUserByNameResponseBodyDataListFacePicList setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public QueryFaceUserByNameResponseBodyDataListFacePicList setFeatureDTOList(java.util.List<QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList> featureDTOList) {
            this.featureDTOList = featureDTOList;
            return this;
        }
        public java.util.List<QueryFaceUserByNameResponseBodyDataListFacePicListFeatureDTOList> getFeatureDTOList() {
            return this.featureDTOList;
        }

    }

    public static class QueryFaceUserByNameResponseBodyDataList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CustomUserId")
        public String customUserId;

        @NameInMap("FacePicList")
        public java.util.List<QueryFaceUserByNameResponseBodyDataListFacePicList> facePicList;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Params")
        public String params;

        @NameInMap("UserId")
        public String userId;

        public static QueryFaceUserByNameResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserByNameResponseBodyDataList self = new QueryFaceUserByNameResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserByNameResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryFaceUserByNameResponseBodyDataList setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceUserByNameResponseBodyDataList setFacePicList(java.util.List<QueryFaceUserByNameResponseBodyDataListFacePicList> facePicList) {
            this.facePicList = facePicList;
            return this;
        }
        public java.util.List<QueryFaceUserByNameResponseBodyDataListFacePicList> getFacePicList() {
            return this.facePicList;
        }

        public QueryFaceUserByNameResponseBodyDataList setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryFaceUserByNameResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFaceUserByNameResponseBodyDataList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryFaceUserByNameResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryFaceUserByNameResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryFaceUserByNameResponseBodyDataList> list;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryFaceUserByNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserByNameResponseBodyData self = new QueryFaceUserByNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserByNameResponseBodyData setList(java.util.List<QueryFaceUserByNameResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryFaceUserByNameResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryFaceUserByNameResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryFaceUserByNameResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceUserByNameResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
