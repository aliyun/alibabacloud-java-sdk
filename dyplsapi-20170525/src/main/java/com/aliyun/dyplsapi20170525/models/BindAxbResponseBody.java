// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
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
     * <p>9297B722-A016-43FB-B51A-E54050D9369D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information returned after the phone numbers were bound.</p>
     */
    @NameInMap("SecretBindDTO")
    public BindAxbResponseBodySecretBindDTO secretBindDTO;

    public static BindAxbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxbResponseBody self = new BindAxbResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxbResponseBody setSecretBindDTO(BindAxbResponseBodySecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxbResponseBodySecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static class BindAxbResponseBodySecretBindDTO extends TeaModel {
        /**
         * <p>The extension of the phone number.</p>
         * <blockquote>
         * <p> The BindAxb operation does not involve an extension. Ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>130</p>
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
         * <p>1**************3</p>
         */
        @NameInMap("SubsId")
        public String subsId;

        public static BindAxbResponseBodySecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxbResponseBodySecretBindDTO self = new BindAxbResponseBodySecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxbResponseBodySecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public BindAxbResponseBodySecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxbResponseBodySecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

    }

}
