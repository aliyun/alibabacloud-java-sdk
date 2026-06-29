// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSecurityClassifyResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
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

    /**
     * <p>The data classification details.</p>
     */
    @NameInMap("SecurityClassifyInfo")
    public GetSecurityClassifyResponseBodySecurityClassifyInfo securityClassifyInfo;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSecurityClassifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityClassifyResponseBody self = new GetSecurityClassifyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityClassifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecurityClassifyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSecurityClassifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecurityClassifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityClassifyResponseBody setSecurityClassifyInfo(GetSecurityClassifyResponseBodySecurityClassifyInfo securityClassifyInfo) {
        this.securityClassifyInfo = securityClassifyInfo;
        return this;
    }
    public GetSecurityClassifyResponseBodySecurityClassifyInfo getSecurityClassifyInfo() {
        return this.securityClassifyInfo;
    }

    public GetSecurityClassifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSecurityClassifyResponseBodySecurityClassifyInfo extends TeaModel {
        /**
         * <p>The classification abbreviation.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

        /**
         * <p>The data classification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The security level abbreviation.</p>
         * 
         * <strong>example:</strong>
         * <p>lv_test</p>
         */
        @NameInMap("LevelAbbreviation")
        public String levelAbbreviation;

        /**
         * <p>The security level index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelIndex")
        public Long levelIndex;

        /**
         * <p>The security level name.</p>
         * 
         * <strong>example:</strong>
         * <p>lv_teat</p>
         */
        @NameInMap("LevelName")
        public String levelName;

        /**
         * <p>The classification name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The classification path.</p>
         * 
         * <strong>example:</strong>
         * <p>/a/b/c</p>
         */
        @NameInMap("Path")
        public String path;

        public static GetSecurityClassifyResponseBodySecurityClassifyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityClassifyResponseBodySecurityClassifyInfo self = new GetSecurityClassifyResponseBodySecurityClassifyInfo();
            return TeaModel.build(map, self);
        }

        public GetSecurityClassifyResponseBodySecurityClassifyInfo setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public GetSecurityClassifyResponseBodySecurityClassifyInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSecurityClassifyResponseBodySecurityClassifyInfo setLevelAbbreviation(String levelAbbreviation) {
            this.levelAbbreviation = levelAbbreviation;
            return this;
        }
        public String getLevelAbbreviation() {
            return this.levelAbbreviation;
        }

        public GetSecurityClassifyResponseBodySecurityClassifyInfo setLevelIndex(Long levelIndex) {
            this.levelIndex = levelIndex;
            return this;
        }
        public Long getLevelIndex() {
            return this.levelIndex;
        }

        public GetSecurityClassifyResponseBodySecurityClassifyInfo setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public GetSecurityClassifyResponseBodySecurityClassifyInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSecurityClassifyResponseBodySecurityClassifyInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
