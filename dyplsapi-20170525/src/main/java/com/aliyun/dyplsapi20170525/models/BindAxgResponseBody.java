// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxgResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
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
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information returned after the phone numbers were bound.</p>
     */
    @NameInMap("SecretBindDTO")
    public BindAxgResponseBodySecretBindDTO secretBindDTO;

    public static BindAxgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxgResponseBody self = new BindAxgResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxgResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxgResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxgResponseBody setSecretBindDTO(BindAxgResponseBodySecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxgResponseBodySecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static class BindAxgResponseBodySecretBindDTO extends TeaModel {
        /**
         * <p>The extension of the phone number.</p>
         * <blockquote>
         * <p> The BindAxg operation does not involve an extension. Ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>139****0000</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The private number, that is, phone number X.</p>
         * 
         * <strong>example:</strong>
         * <p>139****0000</p>
         */
        @NameInMap("SecretNo")
        public String secretNo;

        /**
         * <p>The binding ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1************3</p>
         */
        @NameInMap("SubsId")
        public String subsId;

        public static BindAxgResponseBodySecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxgResponseBodySecretBindDTO self = new BindAxgResponseBodySecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxgResponseBodySecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public BindAxgResponseBodySecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxgResponseBodySecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

    }

}
