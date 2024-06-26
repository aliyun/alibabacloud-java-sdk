// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetFormDataByIdListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>[ &quot;FINST-SASNOO39NSIFF780&quot; ]</p>
     */
    @NameInMap("result")
    public java.util.List<BatchGetFormDataByIdListResponseBodyResult> result;

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

    public static BatchGetFormDataByIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFormDataByIdListResponseBody self = new BatchGetFormDataByIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetFormDataByIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetFormDataByIdListResponseBody setResult(java.util.List<BatchGetFormDataByIdListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<BatchGetFormDataByIdListResponseBodyResult> getResult() {
        return this.result;
    }

    public BatchGetFormDataByIdListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public BatchGetFormDataByIdListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class BatchGetFormDataByIdListResponseBodyResultModifyUserName extends TeaModel {
        @NameInMap("NameInChinese")
        public String nameInChinese;

        /**
         * <strong>example:</strong>
         * <p>EnglishName</p>
         */
        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        public static BatchGetFormDataByIdListResponseBodyResultModifyUserName build(java.util.Map<String, ?> map) throws Exception {
            BatchGetFormDataByIdListResponseBodyResultModifyUserName self = new BatchGetFormDataByIdListResponseBodyResultModifyUserName();
            return TeaModel.build(map, self);
        }

        public BatchGetFormDataByIdListResponseBodyResultModifyUserName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public BatchGetFormDataByIdListResponseBodyResultModifyUserName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

    }

    public static class BatchGetFormDataByIdListResponseBodyResultModifyUser extends TeaModel {
        @NameInMap("Name")
        public BatchGetFormDataByIdListResponseBodyResultModifyUserName name;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static BatchGetFormDataByIdListResponseBodyResultModifyUser build(java.util.Map<String, ?> map) throws Exception {
            BatchGetFormDataByIdListResponseBodyResultModifyUser self = new BatchGetFormDataByIdListResponseBodyResultModifyUser();
            return TeaModel.build(map, self);
        }

        public BatchGetFormDataByIdListResponseBodyResultModifyUser setName(BatchGetFormDataByIdListResponseBodyResultModifyUserName name) {
            this.name = name;
            return this;
        }
        public BatchGetFormDataByIdListResponseBodyResultModifyUserName getName() {
            return this.name;
        }

        public BatchGetFormDataByIdListResponseBodyResultModifyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class BatchGetFormDataByIdListResponseBodyResultOriginatorName extends TeaModel {
        @NameInMap("NameInChinese")
        public String nameInChinese;

        /**
         * <strong>example:</strong>
         * <p>EnglishName</p>
         */
        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        public static BatchGetFormDataByIdListResponseBodyResultOriginatorName build(java.util.Map<String, ?> map) throws Exception {
            BatchGetFormDataByIdListResponseBodyResultOriginatorName self = new BatchGetFormDataByIdListResponseBodyResultOriginatorName();
            return TeaModel.build(map, self);
        }

        public BatchGetFormDataByIdListResponseBodyResultOriginatorName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public BatchGetFormDataByIdListResponseBodyResultOriginatorName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

    }

    public static class BatchGetFormDataByIdListResponseBodyResultOriginator extends TeaModel {
        @NameInMap("Name")
        public BatchGetFormDataByIdListResponseBodyResultOriginatorName name;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static BatchGetFormDataByIdListResponseBodyResultOriginator build(java.util.Map<String, ?> map) throws Exception {
            BatchGetFormDataByIdListResponseBodyResultOriginator self = new BatchGetFormDataByIdListResponseBodyResultOriginator();
            return TeaModel.build(map, self);
        }

        public BatchGetFormDataByIdListResponseBodyResultOriginator setName(BatchGetFormDataByIdListResponseBodyResultOriginatorName name) {
            this.name = name;
            return this;
        }
        public BatchGetFormDataByIdListResponseBodyResultOriginatorName getName() {
            return this.name;
        }

        public BatchGetFormDataByIdListResponseBodyResultOriginator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class BatchGetFormDataByIdListResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-05-01 10:10:10</p>
         */
        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("CreatorUserId")
        public String creatorUserId;

        @NameInMap("FormData")
        public java.util.Map<String, ?> formData;

        /**
         * <strong>example:</strong>
         * <p>FINST-xxxx</p>
         */
        @NameInMap("FormInstanceId")
        public String formInstanceId;

        /**
         * <strong>example:</strong>
         * <p>FORM-xxxx</p>
         */
        @NameInMap("FormUuid")
        public String formUuid;

        /**
         * <strong>example:</strong>
         * <p>21044829126</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("InstanceValue")
        public String instanceValue;

        /**
         * <strong>example:</strong>
         * <p>2021-05-01 10:10:10</p>
         */
        @NameInMap("ModifiedTimeGMT")
        public String modifiedTimeGMT;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ModifyUser")
        public BatchGetFormDataByIdListResponseBodyResultModifyUser modifyUser;

        @NameInMap("Originator")
        public BatchGetFormDataByIdListResponseBodyResultOriginator originator;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <strong>example:</strong>
         * <p>SA65776</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Version")
        public Long version;

        public static BatchGetFormDataByIdListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            BatchGetFormDataByIdListResponseBodyResult self = new BatchGetFormDataByIdListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public BatchGetFormDataByIdListResponseBodyResult setCreateTimeGMT(String createTimeGMT) {
            this.createTimeGMT = createTimeGMT;
            return this;
        }
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        public BatchGetFormDataByIdListResponseBodyResult setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public BatchGetFormDataByIdListResponseBodyResult setFormData(java.util.Map<String, ?> formData) {
            this.formData = formData;
            return this;
        }
        public java.util.Map<String, ?> getFormData() {
            return this.formData;
        }

        public BatchGetFormDataByIdListResponseBodyResult setFormInstanceId(String formInstanceId) {
            this.formInstanceId = formInstanceId;
            return this;
        }
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        public BatchGetFormDataByIdListResponseBodyResult setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public BatchGetFormDataByIdListResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchGetFormDataByIdListResponseBodyResult setInstanceValue(String instanceValue) {
            this.instanceValue = instanceValue;
            return this;
        }
        public String getInstanceValue() {
            return this.instanceValue;
        }

        public BatchGetFormDataByIdListResponseBodyResult setModifiedTimeGMT(String modifiedTimeGMT) {
            this.modifiedTimeGMT = modifiedTimeGMT;
            return this;
        }
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        public BatchGetFormDataByIdListResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public BatchGetFormDataByIdListResponseBodyResult setModifyUser(BatchGetFormDataByIdListResponseBodyResultModifyUser modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public BatchGetFormDataByIdListResponseBodyResultModifyUser getModifyUser() {
            return this.modifyUser;
        }

        public BatchGetFormDataByIdListResponseBodyResult setOriginator(BatchGetFormDataByIdListResponseBodyResultOriginator originator) {
            this.originator = originator;
            return this;
        }
        public BatchGetFormDataByIdListResponseBodyResultOriginator getOriginator() {
            return this.originator;
        }

        public BatchGetFormDataByIdListResponseBodyResult setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public BatchGetFormDataByIdListResponseBodyResult setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public BatchGetFormDataByIdListResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public BatchGetFormDataByIdListResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
