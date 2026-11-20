// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnExtensionResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * <ul>
     * <li>A value of OK indicates that the request is successful.</li>
     * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9297B722-A016-43FB-B51A-E54050D9369D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The struct returned upon successful binding.</p>
     */
    @NameInMap("SecretBindDTO")
    public BindAxnExtensionResponseBodySecretBindDTO secretBindDTO;

    public static BindAxnExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxnExtensionResponseBody self = new BindAxnExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxnExtensionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxnExtensionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxnExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxnExtensionResponseBody setSecretBindDTO(BindAxnExtensionResponseBodySecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxnExtensionResponseBodySecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static class BindAxnExtensionResponseBodySecretBindDTO extends TeaModel {
        /**
         * <p>The extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The privacy number, which is number X.</p>
         * 
         * <strong>example:</strong>
         * <p>139*****1111</p>
         */
        @NameInMap("SecretNo")
        public String secretNo;

        /**
         * <p>The binding relationship ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1***************3</p>
         */
        @NameInMap("SubsId")
        public String subsId;

        public static BindAxnExtensionResponseBodySecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxnExtensionResponseBodySecretBindDTO self = new BindAxnExtensionResponseBodySecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxnExtensionResponseBodySecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public BindAxnExtensionResponseBodySecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxnExtensionResponseBodySecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

    }

}
