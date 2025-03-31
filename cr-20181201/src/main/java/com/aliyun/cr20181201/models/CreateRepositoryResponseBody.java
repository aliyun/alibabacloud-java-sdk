// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepositoryResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-xwvi3osiy4ff****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>886FB272-15C3-44FC-AA54-F4ABD5B93A28</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryResponseBody self = new CreateRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRepositoryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateRepositoryResponseBody setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CreateRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
