// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ResetSshKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
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
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sshKey")
    public ResetSshKeyResponseBodySshKey sshKey;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ResetSshKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetSshKeyResponseBody self = new ResetSshKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetSshKeyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ResetSshKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ResetSshKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetSshKeyResponseBody setSshKey(ResetSshKeyResponseBodySshKey sshKey) {
        this.sshKey = sshKey;
        return this;
    }
    public ResetSshKeyResponseBodySshKey getSshKey() {
        return this.sshKey;
    }

    public ResetSshKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResetSshKeyResponseBodySshKey extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1212</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>saaaaaaaaaaaaaaaa</p>
         */
        @NameInMap("publicKey")
        public String publicKey;

        public static ResetSshKeyResponseBodySshKey build(java.util.Map<String, ?> map) throws Exception {
            ResetSshKeyResponseBodySshKey self = new ResetSshKeyResponseBodySshKey();
            return TeaModel.build(map, self);
        }

        public ResetSshKeyResponseBodySshKey setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ResetSshKeyResponseBodySshKey setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

    }

}
