// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateAuthorityTemplateResponseBody extends TeaModel {
    /**
     * <p>The details of the permission template.</p>
     */
    @NameInMap("AuthorityTemplateView")
    public CreateAuthorityTemplateResponseBodyAuthorityTemplateView authorityTemplateView;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateAuthorityTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorityTemplateResponseBody self = new CreateAuthorityTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthorityTemplateResponseBody setAuthorityTemplateView(CreateAuthorityTemplateResponseBodyAuthorityTemplateView authorityTemplateView) {
        this.authorityTemplateView = authorityTemplateView;
        return this;
    }
    public CreateAuthorityTemplateResponseBodyAuthorityTemplateView getAuthorityTemplateView() {
        return this.authorityTemplateView;
    }

    public CreateAuthorityTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateAuthorityTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateAuthorityTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAuthorityTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateAuthorityTemplateResponseBody setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateAuthorityTemplateResponseBodyAuthorityTemplateView extends TeaModel {
        /**
         * <p>The time when the permission template was created. The time is in the yyyy-MM-DD HH:mm:ss format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the user who created the permission template.</p>
         */
        @NameInMap("CreatorId")
        public Long creatorId;

        /**
         * <p>The description of the permission template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the permission template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the permission template.</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static CreateAuthorityTemplateResponseBodyAuthorityTemplateView build(java.util.Map<String, ?> map) throws Exception {
            CreateAuthorityTemplateResponseBodyAuthorityTemplateView self = new CreateAuthorityTemplateResponseBodyAuthorityTemplateView();
            return TeaModel.build(map, self);
        }

        public CreateAuthorityTemplateResponseBodyAuthorityTemplateView setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAuthorityTemplateResponseBodyAuthorityTemplateView setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public CreateAuthorityTemplateResponseBodyAuthorityTemplateView setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAuthorityTemplateResponseBodyAuthorityTemplateView setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAuthorityTemplateResponseBodyAuthorityTemplateView setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
