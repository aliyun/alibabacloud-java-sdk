// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateAuthorityTemplateResponseBody extends TeaModel {
    /**
     * <p>The details of the permission template.</p>
     */
    @NameInMap("AuthorityTemplateView")
    public UpdateAuthorityTemplateResponseBodyAuthorityTemplateView authorityTemplateView;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
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

    @NameInMap("Tid")
    public Long tid;

    public static UpdateAuthorityTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorityTemplateResponseBody self = new UpdateAuthorityTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorityTemplateResponseBody setAuthorityTemplateView(UpdateAuthorityTemplateResponseBodyAuthorityTemplateView authorityTemplateView) {
        this.authorityTemplateView = authorityTemplateView;
        return this;
    }
    public UpdateAuthorityTemplateResponseBodyAuthorityTemplateView getAuthorityTemplateView() {
        return this.authorityTemplateView;
    }

    public UpdateAuthorityTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateAuthorityTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateAuthorityTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAuthorityTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateAuthorityTemplateResponseBody setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class UpdateAuthorityTemplateResponseBodyAuthorityTemplateView extends TeaModel {
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

        public static UpdateAuthorityTemplateResponseBodyAuthorityTemplateView build(java.util.Map<String, ?> map) throws Exception {
            UpdateAuthorityTemplateResponseBodyAuthorityTemplateView self = new UpdateAuthorityTemplateResponseBodyAuthorityTemplateView();
            return TeaModel.build(map, self);
        }

        public UpdateAuthorityTemplateResponseBodyAuthorityTemplateView setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public UpdateAuthorityTemplateResponseBodyAuthorityTemplateView setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAuthorityTemplateResponseBodyAuthorityTemplateView setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAuthorityTemplateResponseBodyAuthorityTemplateView setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
