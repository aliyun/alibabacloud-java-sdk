// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnResponseBody extends TeaModel {
    /**
     * <p>The status code of the request.</p>
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
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The struct returned after the number is successfully bound.</p>
     */
    @NameInMap("SecretBindDTO")
    public BindAxnResponseBodySecretBindDTO secretBindDTO;

    public static BindAxnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxnResponseBody self = new BindAxnResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxnResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxnResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxnResponseBody setSecretBindDTO(BindAxnResponseBodySecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxnResponseBodySecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static class BindAxnResponseBodySecretBindDTO extends TeaModel {
        /**
         * <p>The extension number.</p>
         * <blockquote>
         * <p>The BindAxn operation does not involve extension numbers. Ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The privacy number, which is Number X.</p>
         * 
         * <strong>example:</strong>
         * <p>139****1111</p>
         */
        @NameInMap("SecretNo")
        public String secretNo;

        /**
         * <p>The ID of the binding relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>1***************3</p>
         */
        @NameInMap("SubsId")
        public String subsId;

        public static BindAxnResponseBodySecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxnResponseBodySecretBindDTO self = new BindAxnResponseBodySecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxnResponseBodySecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public BindAxnResponseBodySecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxnResponseBodySecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

    }

}
