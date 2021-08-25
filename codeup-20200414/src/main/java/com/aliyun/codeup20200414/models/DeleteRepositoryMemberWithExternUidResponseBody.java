// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberWithExternUidResponseBody extends TeaModel {
    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 请求结果
    @NameInMap("Success")
    public Boolean success;

    // 响应结果
    @NameInMap("Result")
    public DeleteRepositoryMemberWithExternUidResponseBodyResult result;

    public static DeleteRepositoryMemberWithExternUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberWithExternUidResponseBody self = new DeleteRepositoryMemberWithExternUidResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteRepositoryMemberWithExternUidResponseBody setResult(DeleteRepositoryMemberWithExternUidResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryMemberWithExternUidResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteRepositoryMemberWithExternUidResponseBodyResult extends TeaModel {
        // Codeup用户ID
        @NameInMap("UserId")
        public Long userId;

        // 资源类型
        @NameInMap("SourceType")
        public String sourceType;

        // 创建时间
        @NameInMap("CreatedAt")
        public String createdAt;

        // 权限类型。20-浏览者，30-开发者,40-管理员。
        @NameInMap("AccessLevel")
        public Integer accessLevel;

        // 更新时间
        @NameInMap("UpdatedAt")
        public String updatedAt;

        // 代码库ID
        @NameInMap("SourceId")
        public Long sourceId;

        // ID
        @NameInMap("Id")
        public Long id;

        public static DeleteRepositoryMemberWithExternUidResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryMemberWithExternUidResponseBodyResult self = new DeleteRepositoryMemberWithExternUidResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public DeleteRepositoryMemberWithExternUidResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
