// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDatasResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("data")
    public java.util.List<SearchFormDatasResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static SearchFormDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDatasResponseBody self = new SearchFormDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchFormDatasResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public SearchFormDatasResponseBody setData(java.util.List<SearchFormDatasResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchFormDatasResponseBodyData> getData() {
        return this.data;
    }

    public SearchFormDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchFormDatasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public SearchFormDatasResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public SearchFormDatasResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class SearchFormDatasResponseBodyDataModifyUserUserName extends TeaModel {
        @NameInMap("NameInChinese")
        public String nameInChinese;

        /**
         * <strong>example:</strong>
         * <p>EngilishName</p>
         */
        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>ZH-CN</p>
         */
        @NameInMap("Type")
        public String type;

        public static SearchFormDatasResponseBodyDataModifyUserUserName build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDatasResponseBodyDataModifyUserUserName self = new SearchFormDatasResponseBodyDataModifyUserUserName();
            return TeaModel.build(map, self);
        }

        public SearchFormDatasResponseBodyDataModifyUserUserName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public SearchFormDatasResponseBodyDataModifyUserUserName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public SearchFormDatasResponseBodyDataModifyUserUserName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SearchFormDatasResponseBodyDataModifyUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public SearchFormDatasResponseBodyDataModifyUserUserName userName;

        public static SearchFormDatasResponseBodyDataModifyUser build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDatasResponseBodyDataModifyUser self = new SearchFormDatasResponseBodyDataModifyUser();
            return TeaModel.build(map, self);
        }

        public SearchFormDatasResponseBodyDataModifyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchFormDatasResponseBodyDataModifyUser setUserName(SearchFormDatasResponseBodyDataModifyUserUserName userName) {
            this.userName = userName;
            return this;
        }
        public SearchFormDatasResponseBodyDataModifyUserUserName getUserName() {
            return this.userName;
        }

    }

    public static class SearchFormDatasResponseBodyDataOriginatorUserName extends TeaModel {
        @NameInMap("NameInChinese")
        public String nameInChinese;

        /**
         * <strong>example:</strong>
         * <p>EngilishName</p>
         */
        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>ZH-CN</p>
         */
        @NameInMap("Type")
        public String type;

        public static SearchFormDatasResponseBodyDataOriginatorUserName build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDatasResponseBodyDataOriginatorUserName self = new SearchFormDatasResponseBodyDataOriginatorUserName();
            return TeaModel.build(map, self);
        }

        public SearchFormDatasResponseBodyDataOriginatorUserName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public SearchFormDatasResponseBodyDataOriginatorUserName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public SearchFormDatasResponseBodyDataOriginatorUserName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SearchFormDatasResponseBodyDataOriginator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public SearchFormDatasResponseBodyDataOriginatorUserName userName;

        public static SearchFormDatasResponseBodyDataOriginator build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDatasResponseBodyDataOriginator self = new SearchFormDatasResponseBodyDataOriginator();
            return TeaModel.build(map, self);
        }

        public SearchFormDatasResponseBodyDataOriginator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchFormDatasResponseBodyDataOriginator setUserName(SearchFormDatasResponseBodyDataOriginatorUserName userName) {
            this.userName = userName;
            return this;
        }
        public SearchFormDatasResponseBodyDataOriginatorUserName getUserName() {
            return this.userName;
        }

    }

    public static class SearchFormDatasResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2018-01-24 11:22:01</p>
         */
        @NameInMap("CreatedTimeGMT")
        public String createdTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("CreatorUserId")
        public String creatorUserId;

        /**
         * <strong>example:</strong>
         * <p>1002</p>
         */
        @NameInMap("DataId")
        public Long dataId;

        @NameInMap("FormData")
        public java.util.Map<String, ?> formData;

        /**
         * <strong>example:</strong>
         * <p>FINST-BNKJDRF</p>
         */
        @NameInMap("FormInstanceId")
        public String formInstanceId;

        /**
         * <strong>example:</strong>
         * <p>FORM-EF6Y93URN24F1SCX15VA2P918LPEIJ2H3UFORCJ1</p>
         */
        @NameInMap("FormUuid")
        public String formUuid;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("InstanceValue")
        public String instanceValue;

        /**
         * <strong>example:</strong>
         * <p>FORM-EF6Y93URN24F1SCX15VA2P918LPEIJ2H3UFORCJ1</p>
         */
        @NameInMap("ModelUuid")
        public String modelUuid;

        /**
         * <strong>example:</strong>
         * <p>2018-01-24 11:22:01</p>
         */
        @NameInMap("ModifiedTimeGMT")
        public String modifiedTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("ModifierUserId")
        public String modifierUserId;

        @NameInMap("ModifyUser")
        public SearchFormDatasResponseBodyDataModifyUser modifyUser;

        @NameInMap("Originator")
        public SearchFormDatasResponseBodyDataOriginator originator;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <strong>example:</strong>
         * <p>231008101012015353</p>
         */
        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Long version;

        public static SearchFormDatasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDatasResponseBodyData self = new SearchFormDatasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchFormDatasResponseBodyData setCreatedTimeGMT(String createdTimeGMT) {
            this.createdTimeGMT = createdTimeGMT;
            return this;
        }
        public String getCreatedTimeGMT() {
            return this.createdTimeGMT;
        }

        public SearchFormDatasResponseBodyData setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public SearchFormDatasResponseBodyData setDataId(Long dataId) {
            this.dataId = dataId;
            return this;
        }
        public Long getDataId() {
            return this.dataId;
        }

        public SearchFormDatasResponseBodyData setFormData(java.util.Map<String, ?> formData) {
            this.formData = formData;
            return this;
        }
        public java.util.Map<String, ?> getFormData() {
            return this.formData;
        }

        public SearchFormDatasResponseBodyData setFormInstanceId(String formInstanceId) {
            this.formInstanceId = formInstanceId;
            return this;
        }
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        public SearchFormDatasResponseBodyData setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public SearchFormDatasResponseBodyData setInstanceValue(String instanceValue) {
            this.instanceValue = instanceValue;
            return this;
        }
        public String getInstanceValue() {
            return this.instanceValue;
        }

        public SearchFormDatasResponseBodyData setModelUuid(String modelUuid) {
            this.modelUuid = modelUuid;
            return this;
        }
        public String getModelUuid() {
            return this.modelUuid;
        }

        public SearchFormDatasResponseBodyData setModifiedTimeGMT(String modifiedTimeGMT) {
            this.modifiedTimeGMT = modifiedTimeGMT;
            return this;
        }
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        public SearchFormDatasResponseBodyData setModifierUserId(String modifierUserId) {
            this.modifierUserId = modifierUserId;
            return this;
        }
        public String getModifierUserId() {
            return this.modifierUserId;
        }

        public SearchFormDatasResponseBodyData setModifyUser(SearchFormDatasResponseBodyDataModifyUser modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public SearchFormDatasResponseBodyDataModifyUser getModifyUser() {
            return this.modifyUser;
        }

        public SearchFormDatasResponseBodyData setOriginator(SearchFormDatasResponseBodyDataOriginator originator) {
            this.originator = originator;
            return this;
        }
        public SearchFormDatasResponseBodyDataOriginator getOriginator() {
            return this.originator;
        }

        public SearchFormDatasResponseBodyData setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public SearchFormDatasResponseBodyData setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public SearchFormDatasResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchFormDatasResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
