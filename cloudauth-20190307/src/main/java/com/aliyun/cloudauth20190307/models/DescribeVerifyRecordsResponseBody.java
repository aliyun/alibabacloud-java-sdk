// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyRecordsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryId")
    public String queryId;

    @NameInMap("RecordsList")
    public java.util.List<DescribeVerifyRecordsResponseBodyRecordsList> recordsList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVerifyRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyRecordsResponseBody self = new DescribeVerifyRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyRecordsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVerifyRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVerifyRecordsResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeVerifyRecordsResponseBody setRecordsList(java.util.List<DescribeVerifyRecordsResponseBodyRecordsList> recordsList) {
        this.recordsList = recordsList;
        return this;
    }
    public java.util.List<DescribeVerifyRecordsResponseBodyRecordsList> getRecordsList() {
        return this.recordsList;
    }

    public DescribeVerifyRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Authority")
        public String authority;

        @NameInMap("BackImageUrl")
        public String backImageUrl;

        @NameInMap("Birth")
        public String birth;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("FrontImageUrl")
        public String frontImageUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nationality")
        public String nationality;

        @NameInMap("Number")
        public String number;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("StartDate")
        public String startDate;

        public static DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo self = new DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeVerifyRecordsResponseBodyRecordsListMaterial extends TeaModel {
        @NameInMap("FaceImageUrl")
        public String faceImageUrl;

        @NameInMap("IdCardInfo")
        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo idCardInfo;

        @NameInMap("IdCardName")
        public String idCardName;

        @NameInMap("IdCardNumber")
        public String idCardNumber;

        public static DescribeVerifyRecordsResponseBodyRecordsListMaterial build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyRecordsResponseBodyRecordsListMaterial self = new DescribeVerifyRecordsResponseBodyRecordsListMaterial();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterial setIdCardInfo(DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public DescribeVerifyRecordsResponseBodyRecordsListMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public DescribeVerifyRecordsResponseBodyRecordsListMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

    }

    public static class DescribeVerifyRecordsResponseBodyRecordsList extends TeaModel {
        @NameInMap("AuthorityComparisonScore")
        public Float authorityComparisonScore;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("DataStats")
        public String dataStats;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("IdCardFaceComparisonScore")
        public Float idCardFaceComparisonScore;

        @NameInMap("Material")
        public DescribeVerifyRecordsResponseBodyRecordsListMaterial material;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("VerifyId")
        public String verifyId;

        public static DescribeVerifyRecordsResponseBodyRecordsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyRecordsResponseBodyRecordsList self = new DescribeVerifyRecordsResponseBodyRecordsList();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyRecordsResponseBodyRecordsList setAuthorityComparisonScore(Float authorityComparisonScore) {
            this.authorityComparisonScore = authorityComparisonScore;
            return this;
        }
        public Float getAuthorityComparisonScore() {
            return this.authorityComparisonScore;
        }

        public DescribeVerifyRecordsResponseBodyRecordsList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeVerifyRecordsResponseBodyRecordsList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeVerifyRecordsResponseBodyRecordsList setDataStats(String dataStats) {
            this.dataStats = dataStats;
            return this;
        }
        public String getDataStats() {
            return this.dataStats;
        }

        public DescribeVerifyRecordsResponseBodyRecordsList setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribeVerifyRecordsResponseBodyRecordsList setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
            this.idCardFaceComparisonScore = idCardFaceComparisonScore;
            return this;
        }
        public Float getIdCardFaceComparisonScore() {
            return this.idCardFaceComparisonScore;
        }

        public DescribeVerifyRecordsResponseBodyRecordsList setMaterial(DescribeVerifyRecordsResponseBodyRecordsListMaterial material) {
            this.material = material;
            return this;
        }
        public DescribeVerifyRecordsResponseBodyRecordsListMaterial getMaterial() {
            return this.material;
        }

        public DescribeVerifyRecordsResponseBodyRecordsList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeVerifyRecordsResponseBodyRecordsList setVerifyId(String verifyId) {
            this.verifyId = verifyId;
            return this;
        }
        public String getVerifyId() {
            return this.verifyId;
        }

    }

}
