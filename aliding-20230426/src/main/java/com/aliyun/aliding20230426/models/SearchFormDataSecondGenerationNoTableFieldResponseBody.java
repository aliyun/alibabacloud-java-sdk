// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDataSecondGenerationNoTableFieldResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<SearchFormDataSecondGenerationNoTableFieldResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static SearchFormDataSecondGenerationNoTableFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDataSecondGenerationNoTableFieldResponseBody self = new SearchFormDataSecondGenerationNoTableFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFormDataSecondGenerationNoTableFieldResponseBody setData(java.util.List<SearchFormDataSecondGenerationNoTableFieldResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchFormDataSecondGenerationNoTableFieldResponseBodyData> getData() {
        return this.data;
    }

    public SearchFormDataSecondGenerationNoTableFieldResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchFormDataSecondGenerationNoTableFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchFormDataSecondGenerationNoTableFieldResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public SearchFormDataSecondGenerationNoTableFieldResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public SearchFormDataSecondGenerationNoTableFieldResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUserName extends TeaModel {
        @NameInMap("NameInChinese")
        public String nameInChinese;

        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        public static SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUserName build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUserName self = new SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUserName();
            return TeaModel.build(map, self);
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUserName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUserName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

    }

    public static class SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUser extends TeaModel {
        @NameInMap("Name")
        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUserName name;

        @NameInMap("UserId")
        public String userId;

        public static SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUser build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUser self = new SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUser();
            return TeaModel.build(map, self);
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUser setName(SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUserName name) {
            this.name = name;
            return this;
        }
        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUserName getName() {
            return this.name;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginatorName extends TeaModel {
        @NameInMap("NameInChinese")
        public String nameInChinese;

        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        public static SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginatorName build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginatorName self = new SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginatorName();
            return TeaModel.build(map, self);
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginatorName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginatorName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

    }

    public static class SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginator extends TeaModel {
        @NameInMap("Name")
        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginatorName name;

        @NameInMap("UserId")
        public String userId;

        public static SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginator build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginator self = new SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginator();
            return TeaModel.build(map, self);
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginator setName(SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginatorName name) {
            this.name = name;
            return this;
        }
        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginatorName getName() {
            return this.name;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchFormDataSecondGenerationNoTableFieldResponseBodyData extends TeaModel {
        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        @NameInMap("CreatorUserId")
        public String creatorUserId;

        @NameInMap("FormData")
        public java.util.Map<String, ?> formData;

        @NameInMap("FormInstanceId")
        public String formInstanceId;

        @NameInMap("FormUuid")
        public String formUuid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceValue")
        public String instanceValue;

        @NameInMap("ModifiedTimeGMT")
        public String modifiedTimeGMT;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ModifyUser")
        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUser modifyUser;

        @NameInMap("Originator")
        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginator originator;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Title")
        public String title;

        @NameInMap("Version")
        public Long version;

        public static SearchFormDataSecondGenerationNoTableFieldResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDataSecondGenerationNoTableFieldResponseBodyData self = new SearchFormDataSecondGenerationNoTableFieldResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setCreateTimeGMT(String createTimeGMT) {
            this.createTimeGMT = createTimeGMT;
            return this;
        }
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setFormData(java.util.Map<String, ?> formData) {
            this.formData = formData;
            return this;
        }
        public java.util.Map<String, ?> getFormData() {
            return this.formData;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setFormInstanceId(String formInstanceId) {
            this.formInstanceId = formInstanceId;
            return this;
        }
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setInstanceValue(String instanceValue) {
            this.instanceValue = instanceValue;
            return this;
        }
        public String getInstanceValue() {
            return this.instanceValue;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setModifiedTimeGMT(String modifiedTimeGMT) {
            this.modifiedTimeGMT = modifiedTimeGMT;
            return this;
        }
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setModifyUser(SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUser modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataModifyUser getModifyUser() {
            return this.modifyUser;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setOriginator(SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginator originator) {
            this.originator = originator;
            return this;
        }
        public SearchFormDataSecondGenerationNoTableFieldResponseBodyDataOriginator getOriginator() {
            return this.originator;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchFormDataSecondGenerationNoTableFieldResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
