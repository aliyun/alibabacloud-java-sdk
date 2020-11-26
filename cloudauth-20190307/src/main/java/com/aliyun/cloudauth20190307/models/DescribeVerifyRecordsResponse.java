// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyRecordsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("QueryId")
    @Validation(required = true)
    public String queryId;

    @NameInMap("RecordsList")
    @Validation(required = true)
    public java.util.List<DescribeVerifyRecordsResponseRecordsList> recordsList;

    public static DescribeVerifyRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyRecordsResponse self = new DescribeVerifyRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyRecordsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyRecordsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVerifyRecordsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVerifyRecordsResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVerifyRecordsResponse setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeVerifyRecordsResponse setRecordsList(java.util.List<DescribeVerifyRecordsResponseRecordsList> recordsList) {
        this.recordsList = recordsList;
        return this;
    }
    public java.util.List<DescribeVerifyRecordsResponseRecordsList> getRecordsList() {
        return this.recordsList;
    }

    public static class DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo extends TeaModel {
        @NameInMap("FrontImageUrl")
        @Validation(required = true)
        public String frontImageUrl;

        @NameInMap("BackImageUrl")
        @Validation(required = true)
        public String backImageUrl;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Number")
        @Validation(required = true)
        public String number;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Birth")
        @Validation(required = true)
        public String birth;

        @NameInMap("Sex")
        @Validation(required = true)
        public String sex;

        @NameInMap("Nationality")
        @Validation(required = true)
        public String nationality;

        @NameInMap("Authority")
        @Validation(required = true)
        public String authority;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        public static DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo self = new DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

    }

    public static class DescribeVerifyRecordsResponseRecordsListMaterial extends TeaModel {
        @NameInMap("FaceImageUrl")
        @Validation(required = true)
        public String faceImageUrl;

        @NameInMap("IdCardName")
        @Validation(required = true)
        public String idCardName;

        @NameInMap("IdCardNumber")
        @Validation(required = true)
        public String idCardNumber;

        @NameInMap("IdCardInfo")
        @Validation(required = true)
        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo idCardInfo;

        public static DescribeVerifyRecordsResponseRecordsListMaterial build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyRecordsResponseRecordsListMaterial self = new DescribeVerifyRecordsResponseRecordsListMaterial();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyRecordsResponseRecordsListMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public DescribeVerifyRecordsResponseRecordsListMaterial setIdCardInfo(DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public DescribeVerifyRecordsResponseRecordsListMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

    }

    public static class DescribeVerifyRecordsResponseRecordsList extends TeaModel {
        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("DataStats")
        @Validation(required = true)
        public String dataStats;

        @NameInMap("VerifyId")
        @Validation(required = true)
        public String verifyId;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("IdCardFaceComparisonScore")
        @Validation(required = true)
        public Float idCardFaceComparisonScore;

        @NameInMap("AuthorityComparisonScore")
        @Validation(required = true)
        public Float authorityComparisonScore;

        @NameInMap("Material")
        @Validation(required = true)
        public DescribeVerifyRecordsResponseRecordsListMaterial material;

        public static DescribeVerifyRecordsResponseRecordsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyRecordsResponseRecordsList self = new DescribeVerifyRecordsResponseRecordsList();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyRecordsResponseRecordsList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeVerifyRecordsResponseRecordsList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeVerifyRecordsResponseRecordsList setDataStats(String dataStats) {
            this.dataStats = dataStats;
            return this;
        }
        public String getDataStats() {
            return this.dataStats;
        }

        public DescribeVerifyRecordsResponseRecordsList setVerifyId(String verifyId) {
            this.verifyId = verifyId;
            return this;
        }
        public String getVerifyId() {
            return this.verifyId;
        }

        public DescribeVerifyRecordsResponseRecordsList setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribeVerifyRecordsResponseRecordsList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeVerifyRecordsResponseRecordsList setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
            this.idCardFaceComparisonScore = idCardFaceComparisonScore;
            return this;
        }
        public Float getIdCardFaceComparisonScore() {
            return this.idCardFaceComparisonScore;
        }

        public DescribeVerifyRecordsResponseRecordsList setAuthorityComparisonScore(Float authorityComparisonScore) {
            this.authorityComparisonScore = authorityComparisonScore;
            return this;
        }
        public Float getAuthorityComparisonScore() {
            return this.authorityComparisonScore;
        }

        public DescribeVerifyRecordsResponseRecordsList setMaterial(DescribeVerifyRecordsResponseRecordsListMaterial material) {
            this.material = material;
            return this;
        }
        public DescribeVerifyRecordsResponseRecordsListMaterial getMaterial() {
            return this.material;
        }

    }

}
