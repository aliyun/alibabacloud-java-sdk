// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>0E1BCF81-51E6-59D4-8D55-FF945111127A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteRepositoryMemberResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteRepositoryMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberResponseBody self = new DeleteRepositoryMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryMemberResponseBody setResult(DeleteRepositoryMemberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryMemberResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteRepositoryMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRepositoryMemberResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("accessLevel")
        public Integer accessLevel;

        /**
         * <strong>example:</strong>
         * <p>2022-03-12 12:00:00</p>
         */
        @NameInMap("createAt")
        public String createAt;

        /**
         * <strong>example:</strong>
         * <p>30815</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2080398</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>2022-03-12 12:00:00</p>
         */
        @NameInMap("updateAt")
        public String updateAt;

        /**
         * <strong>example:</strong>
         * <p>19280</p>
         */
        @NameInMap("userId")
        public Long userId;

        public static DeleteRepositoryMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryMemberResponseBodyResult self = new DeleteRepositoryMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryMemberResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public DeleteRepositoryMemberResponseBodyResult setCreateAt(String createAt) {
            this.createAt = createAt;
            return this;
        }
        public String getCreateAt() {
            return this.createAt;
        }

        public DeleteRepositoryMemberResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteRepositoryMemberResponseBodyResult setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public DeleteRepositoryMemberResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeleteRepositoryMemberResponseBodyResult setUpdateAt(String updateAt) {
            this.updateAt = updateAt;
            return this;
        }
        public String getUpdateAt() {
            return this.updateAt;
        }

        public DeleteRepositoryMemberResponseBodyResult setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
