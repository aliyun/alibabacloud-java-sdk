// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSecurityLevelResponseBody extends TeaModel {
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

    @NameInMap("SecurityLevelInfo")
    public GetSecurityLevelResponseBodySecurityLevelInfo securityLevelInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetSecurityLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityLevelResponseBody self = new GetSecurityLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityLevelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecurityLevelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSecurityLevelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecurityLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityLevelResponseBody setSecurityLevelInfo(GetSecurityLevelResponseBodySecurityLevelInfo securityLevelInfo) {
        this.securityLevelInfo = securityLevelInfo;
        return this;
    }
    public GetSecurityLevelResponseBodySecurityLevelInfo getSecurityLevelInfo() {
        return this.securityLevelInfo;
    }

    public GetSecurityLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSecurityLevelResponseBodySecurityLevelInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RelatedClassifyIdList")
        public java.util.List<Long> relatedClassifyIdList;

        public static GetSecurityLevelResponseBodySecurityLevelInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityLevelResponseBodySecurityLevelInfo self = new GetSecurityLevelResponseBodySecurityLevelInfo();
            return TeaModel.build(map, self);
        }

        public GetSecurityLevelResponseBodySecurityLevelInfo setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public GetSecurityLevelResponseBodySecurityLevelInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSecurityLevelResponseBodySecurityLevelInfo setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public GetSecurityLevelResponseBodySecurityLevelInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSecurityLevelResponseBodySecurityLevelInfo setRelatedClassifyIdList(java.util.List<Long> relatedClassifyIdList) {
            this.relatedClassifyIdList = relatedClassifyIdList;
            return this;
        }
        public java.util.List<Long> getRelatedClassifyIdList() {
            return this.relatedClassifyIdList;
        }

    }

}
