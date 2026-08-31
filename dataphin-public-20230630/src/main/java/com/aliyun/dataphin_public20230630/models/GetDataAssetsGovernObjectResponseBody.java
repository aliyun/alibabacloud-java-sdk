// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataAssetsGovernObjectResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The governance object details.</p>
     */
    @NameInMap("GovernObjectInfo")
    public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo governObjectInfo;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend response exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataAssetsGovernObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataAssetsGovernObjectResponseBody self = new GetDataAssetsGovernObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataAssetsGovernObjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataAssetsGovernObjectResponseBody setGovernObjectInfo(GetDataAssetsGovernObjectResponseBodyGovernObjectInfo governObjectInfo) {
        this.governObjectInfo = governObjectInfo;
        return this;
    }
    public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo getGovernObjectInfo() {
        return this.governObjectInfo;
    }

    public GetDataAssetsGovernObjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataAssetsGovernObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataAssetsGovernObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataAssetsGovernObjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataAssetsGovernObjectResponseBodyGovernObjectInfoOwners extends TeaModel {
        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>龚恒菊2088822037866701</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300006218</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetDataAssetsGovernObjectResponseBodyGovernObjectInfoOwners build(java.util.Map<String, ?> map) throws Exception {
            GetDataAssetsGovernObjectResponseBodyGovernObjectInfoOwners self = new GetDataAssetsGovernObjectResponseBodyGovernObjectInfoOwners();
            return TeaModel.build(map, self);
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoOwners setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoOwners setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem extends TeaModel {
        /**
         * <p>The object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36ea160807b14216b62a939327941e8b</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The ID of the parent object.</p>
         * 
         * <strong>example:</strong>
         * <p>913836</p>
         */
        @NameInMap("ParentObjectId")
        public String parentObjectId;

        /**
         * <p>The contact email for the governance issue.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:178986769@gmail.com">178986769@gmail.com</a></p>
         */
        @NameInMap("ProblemContactMail")
        public String problemContactMail;

        /**
         * <p>The other contact information for the governance issue.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane</p>
         */
        @NameInMap("ProblemContactOther")
        public String problemContactOther;

        /**
         * <p>The contact phone number for the governance issue.</p>
         * 
         * <strong>example:</strong>
         * <p>12596178752</p>
         */
        @NameInMap("ProblemContactPhone")
        public String problemContactPhone;

        /**
         * <p>The description of the governance issue.</p>
         * 
         * <strong>example:</strong>
         * <p>Test issue</p>
         */
        @NameInMap("ProblemDesc")
        public String problemDesc;

        /**
         * <p>The submission method of the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("ProblemSubmitType")
        public String problemSubmitType;

        /**
         * <p>The user who submitted the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>300006218</p>
         */
        @NameInMap("ProblemSubmitter")
        public String problemSubmitter;

        /**
         * <p>The username of the user who submitted the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("ProblemSubmitterUserName")
        public String problemSubmitterUserName;

        /**
         * <p>The types of the governance issue.</p>
         */
        @NameInMap("ProblemTypes")
        public java.util.List<String> problemTypes;

        public static GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem build(java.util.Map<String, ?> map) throws Exception {
            GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem self = new GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem();
            return TeaModel.build(map, self);
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setParentObjectId(String parentObjectId) {
            this.parentObjectId = parentObjectId;
            return this;
        }
        public String getParentObjectId() {
            return this.parentObjectId;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setProblemContactMail(String problemContactMail) {
            this.problemContactMail = problemContactMail;
            return this;
        }
        public String getProblemContactMail() {
            return this.problemContactMail;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setProblemContactOther(String problemContactOther) {
            this.problemContactOther = problemContactOther;
            return this;
        }
        public String getProblemContactOther() {
            return this.problemContactOther;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setProblemContactPhone(String problemContactPhone) {
            this.problemContactPhone = problemContactPhone;
            return this;
        }
        public String getProblemContactPhone() {
            return this.problemContactPhone;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setProblemDesc(String problemDesc) {
            this.problemDesc = problemDesc;
            return this;
        }
        public String getProblemDesc() {
            return this.problemDesc;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setProblemSubmitType(String problemSubmitType) {
            this.problemSubmitType = problemSubmitType;
            return this;
        }
        public String getProblemSubmitType() {
            return this.problemSubmitType;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setProblemSubmitter(String problemSubmitter) {
            this.problemSubmitter = problemSubmitter;
            return this;
        }
        public String getProblemSubmitter() {
            return this.problemSubmitter;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setProblemSubmitterUserName(String problemSubmitterUserName) {
            this.problemSubmitterUserName = problemSubmitterUserName;
            return this;
        }
        public String getProblemSubmitterUserName() {
            return this.problemSubmitterUserName;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem setProblemTypes(java.util.List<String> problemTypes) {
            this.problemTypes = problemTypes;
            return this;
        }
        public java.util.List<String> getProblemTypes() {
            return this.problemTypes;
        }

    }

    public static class GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge extends TeaModel {
        /**
         * <p>The cause of the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>NC tag test</p>
         */
        @NameInMap("Cause")
        public String cause;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Yangchun Maternal and Child Health Cloud Service Space</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The ID of the knowledge entry.</p>
         * 
         * <strong>example:</strong>
         * <p>522072057231</p>
         */
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        /**
         * <p>The owner.</p>
         * 
         * <strong>example:</strong>
         * <p>leisatc</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>buc_166994</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The Solutions.</p>
         * 
         * <strong>example:</strong>
         * <p>RPBioOnly</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>Makassar International Eight Festival &amp; Forum (F8 Makassar)</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge build(java.util.Map<String, ?> map) throws Exception {
            GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge self = new GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge();
            return TeaModel.build(map, self);
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetDataAssetsGovernObjectResponseBodyGovernObjectInfo extends TeaModel {
        /**
         * <p>The time when the governance object was reported.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-31 10:06:01</p>
         */
        @NameInMap("CommitTime")
        public String commitTime;

        /**
         * <p>The governance object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>96928483120</p>
         */
        @NameInMap("GovernItemId")
        public Long governItemId;

        /**
         * <p>The governance object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54295947412</p>
         */
        @NameInMap("GovernObjectId")
        public Long governObjectId;

        /**
         * <p>Indicates whether rectification is in progress.</p>
         */
        @NameInMap("IsRectify")
        public Boolean isRectify;

        /**
         * <p>The list of owners.</p>
         */
        @NameInMap("Owners")
        public java.util.List<GetDataAssetsGovernObjectResponseBodyGovernObjectInfoOwners> owners;

        /**
         * <p>The governance issue object.</p>
         */
        @NameInMap("Problem")
        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem problem;

        /**
         * <p>The properties.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;properties&quot;: {
         *                 &quot;gmt_create&quot;: &quot;2026-08-24 06:00:19.649&quot;,
         *                 &quot;index_compute_type&quot;: &quot;&quot;,
         *                 &quot;table_env&quot;: &quot;PROD&quot;,
         *                 &quot;table_datasource_id&quot;: &quot;1&quot;,
         *                 &quot;index_catalog&quot;: &quot;&quot;,
         *                 &quot;qd_feature_owner&quot;: &quot;&quot;,
         *                 &quot;rule_task_start_time&quot;: &quot;2026-08-24 06:00:01&quot;,
         *                 &quot;table_id&quot;: &quot;odps.300023201.fashion_ads.api2mysql_demo&quot;,
         *                 &quot;rule_strength&quot;: &quot;WEAK&quot;,
         *                 &quot;table_biz_unit_name&quot;: &quot;LD_Fashion&quot;,
         *                 &quot;table_name&quot;: &quot;fashion_ads.api2mysql_demo&quot;,
         *                 &quot;index_type&quot;: &quot;&quot;,
         *                 &quot;table_datasource_from&quot;: &quot;META_DATA&quot;,
         *                 &quot;datasource_type&quot;: &quot;MAX_COMPUTE&quot;,
         *                 &quot;datasource_scope&quot;: &quot;OFFLINE&quot;,
         *                 &quot;template_zh_tw_name&quot;: &quot;欄位空值校正&quot;,
         *                 &quot;problem_submit_type&quot;: &quot;SYSTEM&quot;,
         *                 &quot;template_type&quot;: &quot;FIELD_NULL_VALUE_VALIDATE&quot;,
         *                 &quot;index_name_cn&quot;: &quot;&quot;,
         *                 &quot;datasource_name&quot;: &quot;Dataphin&quot;,
         *                 &quot;id&quot;: &quot;909586&quot;,
         *                 &quot;index_id&quot;: &quot;&quot;,
         *                 &quot;validate_partition&quot;: &quot;ds=\&quot;20260824\&quot;&quot;,
         *                 &quot;index_owner_id&quot;: &quot;&quot;,
         *                 &quot;datasource_owner&quot;: &quot;300006218&quot;,
         *                 &quot;rule_name&quot;: &quot;date_odps_test_2025-09-22 20:32:07&quot;,
         *                 &quot;watch_type&quot;: &quot;TABLE&quot;,
         *                 &quot;validate_status&quot;: &quot;NOT_PASS&quot;,
         *                 &quot;qd_feature_id&quot;: &quot;&quot;,
         *                 &quot;table_desc&quot;: &quot;api2mysql_demo&quot;,
         *                 &quot;is_ignore&quot;: &quot;false&quot;,
         *                 &quot;rule_desc&quot;: &quot;&quot;,
         *                 &quot;table_partitioned&quot;: &quot;true&quot;,
         *                 &quot;template_owner&quot;: &quot;300006218&quot;,
         *                 &quot;index_biz_unit_id&quot;: &quot;&quot;,
         *                 &quot;table_biz_unit_id&quot;: &quot;6865277495315392&quot;,
         *                 &quot;index_biz_unit_name&quot;: &quot;&quot;,
         *                 &quot;watch_env&quot;: &quot;PROD&quot;,
         *                 &quot;problem_contact_other&quot;: &quot;&quot;,
         *                 &quot;status&quot;: &quot;NEW&quot;,
         *                 &quot;datasource_from&quot;: &quot;META_DATA&quot;,
         *                 &quot;table_project_name&quot;: &quot;fashion_ads&quot;,
         *                 &quot;tenant_id&quot;: &quot;300023201&quot;,
         *                 &quot;datasource_env&quot;: &quot;PROD&quot;,
         *                 &quot;template_en_name&quot;: &quot;Verify Field Null Values&quot;,
         *                 &quot;commit_time&quot;: &quot;2026-08-24 06:00:18.73&quot;,
         *                 &quot;gmt_modified&quot;: &quot;2026-08-24 06:00:19.649&quot;,
         *                 &quot;qd_feature_name&quot;: &quot;&quot;,
         *                 &quot;table_catalog&quot;: &quot;fashion_ads&quot;,
         *                 &quot;rule_status&quot;: &quot;ENABLE&quot;,
         *                 &quot;problem_contact_mail&quot;: &quot;&quot;,
         *                 &quot;rule_task_status&quot;: &quot;SUCCESS&quot;,
         *                 &quot;rule_validate_object_type&quot;: &quot;COLUMN&quot;,
         *                 &quot;watch_status&quot;: &quot;ENABLE&quot;,
         *                 &quot;index_guid&quot;: &quot;&quot;,
         *                 &quot;system_template&quot;: &quot;true&quot;,
         *                 &quot;quality_owners&quot;: &quot;300006218&quot;,
         *                 &quot;index_name&quot;: &quot;&quot;,
         *                 &quot;problem_contact_phone&quot;: &quot;&quot;,
         *                 &quot;watch_task_id&quot;: &quot;8199222&quot;,
         *                 &quot;rule_task_id&quot;: &quot;8199227&quot;,
         *                 &quot;index_desc&quot;: &quot;&quot;,
         *                 &quot;table_type&quot;: &quot;PHYSICAL_TABLE&quot;,
         *                 &quot;table_project_id&quot;: &quot;6865331520706176&quot;,
         *                 &quot;trace_id&quot;: &quot;time:4326023&quot;,
         *                 &quot;datasource_id&quot;: &quot;1&quot;,
         *                 &quot;qd_feature_code&quot;: &quot;&quot;,
         *                 &quot;rule_validate_object_name&quot;: &quot;date_odps&quot;,
         *                 &quot;problem_desc&quot;: &quot;date_odps_test_2025-09-22 20:32:07&quot;,
         *                 &quot;table_owner&quot;: &quot;300006218&quot;,
         *                 &quot;quality_owner_groups&quot;: &quot;&quot;,
         *                 &quot;govern_item_id&quot;: &quot;100&quot;,
         *                 &quot;rule_catalogs&quot;: &quot;COMPLETENESS&quot;,
         *                 &quot;table_datasource_type&quot;: &quot;MAX_COMPUTE&quot;,
         *                 &quot;template_zh_cn_name&quot;: &quot;字段空值校验&quot;,
         *                 &quot;rule_task_biz_date&quot;: &quot;20260824 06:00:00&quot;,
         *                 &quot;problem_types&quot;: &quot;[{\&quot;value\&quot;:\&quot;COMPLETENESS\&quot;}]&quot;,
         *                 &quot;rule_id&quot;: &quot;4322944&quot;,
         *                 &quot;problem_attachment_file_ids&quot;: &quot;null&quot;,
         *                 &quot;watch_name&quot;: &quot;&quot;,
         *                 &quot;template_name&quot;: &quot;&quot;,
         *                 &quot;schedule_params&quot;: &quot;&quot;,
         *                 &quot;is_rectify&quot;: &quot;false&quot;,
         *                 &quot;rule_task_end_time&quot;: &quot;&quot;,
         *                 &quot;watch_id&quot;: &quot;3841908&quot;,
         *                 &quot;validate_result&quot;: &quot;false&quot;,
         *                 &quot;qd_feature_guid&quot;: &quot;&quot;,
         *                 &quot;govern_object_id&quot;: &quot;910181&quot;,
         *                 &quot;template_id&quot;: &quot;100&quot;
         *             }</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>The ID of the rectification.</p>
         * 
         * <strong>example:</strong>
         * <p>49169072991</p>
         */
        @NameInMap("RectifyId")
        public Long rectifyId;

        /**
         * <p>The name of the rectification.</p>
         * 
         * <strong>example:</strong>
         * <p>Rectification process 1</p>
         */
        @NameInMap("RectifyName")
        public String rectifyName;

        /**
         * <p>The rectification status.</p>
         * 
         * <strong>example:</strong>
         * <p>NEW</p>
         */
        @NameInMap("RectifyStatus")
        public String rectifyStatus;

        /**
         * <p>The ID of the user who performs the rectification.</p>
         * 
         * <strong>example:</strong>
         * <p>566777</p>
         */
        @NameInMap("RectifyUser")
        public String rectifyUser;

        /**
         * <p>The display name of the rectification user.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("RectifyUserName")
        public String rectifyUserName;

        /**
         * <p>The related knowledge base.</p>
         */
        @NameInMap("RelatedKnowledge")
        public java.util.List<GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge> relatedKnowledge;

        /**
         * <p>The status of the governance object.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The submission method.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("SubmitType")
        public String submitType;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>-17163770809</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static GetDataAssetsGovernObjectResponseBodyGovernObjectInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDataAssetsGovernObjectResponseBodyGovernObjectInfo self = new GetDataAssetsGovernObjectResponseBodyGovernObjectInfo();
            return TeaModel.build(map, self);
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setCommitTime(String commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public String getCommitTime() {
            return this.commitTime;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setGovernItemId(Long governItemId) {
            this.governItemId = governItemId;
            return this;
        }
        public Long getGovernItemId() {
            return this.governItemId;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setGovernObjectId(Long governObjectId) {
            this.governObjectId = governObjectId;
            return this;
        }
        public Long getGovernObjectId() {
            return this.governObjectId;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setIsRectify(Boolean isRectify) {
            this.isRectify = isRectify;
            return this;
        }
        public Boolean getIsRectify() {
            return this.isRectify;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setOwners(java.util.List<GetDataAssetsGovernObjectResponseBodyGovernObjectInfoOwners> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<GetDataAssetsGovernObjectResponseBodyGovernObjectInfoOwners> getOwners() {
            return this.owners;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setProblem(GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem problem) {
            this.problem = problem;
            return this;
        }
        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfoProblem getProblem() {
            return this.problem;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setRectifyId(Long rectifyId) {
            this.rectifyId = rectifyId;
            return this;
        }
        public Long getRectifyId() {
            return this.rectifyId;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setRectifyName(String rectifyName) {
            this.rectifyName = rectifyName;
            return this;
        }
        public String getRectifyName() {
            return this.rectifyName;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setRectifyStatus(String rectifyStatus) {
            this.rectifyStatus = rectifyStatus;
            return this;
        }
        public String getRectifyStatus() {
            return this.rectifyStatus;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setRectifyUser(String rectifyUser) {
            this.rectifyUser = rectifyUser;
            return this;
        }
        public String getRectifyUser() {
            return this.rectifyUser;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setRectifyUserName(String rectifyUserName) {
            this.rectifyUserName = rectifyUserName;
            return this;
        }
        public String getRectifyUserName() {
            return this.rectifyUserName;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setRelatedKnowledge(java.util.List<GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge> relatedKnowledge) {
            this.relatedKnowledge = relatedKnowledge;
            return this;
        }
        public java.util.List<GetDataAssetsGovernObjectResponseBodyGovernObjectInfoRelatedKnowledge> getRelatedKnowledge() {
            return this.relatedKnowledge;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setSubmitType(String submitType) {
            this.submitType = submitType;
            return this;
        }
        public String getSubmitType() {
            return this.submitType;
        }

        public GetDataAssetsGovernObjectResponseBodyGovernObjectInfo setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
