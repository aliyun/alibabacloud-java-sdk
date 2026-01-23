// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSecuritySecretKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecuritySecretKeyInfo")
    public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo securitySecretKeyInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetSecuritySecretKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecuritySecretKeyResponseBody self = new GetSecuritySecretKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecuritySecretKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecuritySecretKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSecuritySecretKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecuritySecretKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecuritySecretKeyResponseBody setSecuritySecretKeyInfo(GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo securitySecretKeyInfo) {
        this.securitySecretKeyInfo = securitySecretKeyInfo;
        return this;
    }
    public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo getSecuritySecretKeyInfo() {
        return this.securitySecretKeyInfo;
    }

    public GetSecuritySecretKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AES</p>
         */
        @NameInMap("AlgorithmType")
        public String algorithmType;

        /**
         * <strong>example:</strong>
         * <p>AES</p>
         */
        @NameInMap("AlgorithmTypeAlias")
        public String algorithmTypeAlias;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EnableOpenapiQuery")
        public Boolean enableOpenapiQuery;

        /**
         * <strong>example:</strong>
         * <p>SYSTEM_GENERATION</p>
         */
        @NameInMap("GenerationType")
        public String generationType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IsOwnerManageOnly")
        public Boolean isOwnerManageOnly;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("SecretKeyList")
        public java.util.List<String> secretKeyList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SubKeyCount")
        public Long subKeyCount;

        /**
         * <strong>example:</strong>
         * <p>HASH</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo self = new GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo();
            return TeaModel.build(map, self);
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setAlgorithmTypeAlias(String algorithmTypeAlias) {
            this.algorithmTypeAlias = algorithmTypeAlias;
            return this;
        }
        public String getAlgorithmTypeAlias() {
            return this.algorithmTypeAlias;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setEnableOpenapiQuery(Boolean enableOpenapiQuery) {
            this.enableOpenapiQuery = enableOpenapiQuery;
            return this;
        }
        public Boolean getEnableOpenapiQuery() {
            return this.enableOpenapiQuery;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setGenerationType(String generationType) {
            this.generationType = generationType;
            return this;
        }
        public String getGenerationType() {
            return this.generationType;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setIsOwnerManageOnly(Boolean isOwnerManageOnly) {
            this.isOwnerManageOnly = isOwnerManageOnly;
            return this;
        }
        public Boolean getIsOwnerManageOnly() {
            return this.isOwnerManageOnly;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setSecretKeyList(java.util.List<String> secretKeyList) {
            this.secretKeyList = secretKeyList;
            return this;
        }
        public java.util.List<String> getSecretKeyList() {
            return this.secretKeyList;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setSubKeyCount(Long subKeyCount) {
            this.subKeyCount = subKeyCount;
            return this;
        }
        public Long getSubKeyCount() {
            return this.subKeyCount;
        }

        public GetSecuritySecretKeyResponseBodySecuritySecretKeyInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
