// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardWordRootResponseBody extends TeaModel {
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

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("WordRootInfo")
    public GetStandardWordRootResponseBodyWordRootInfo wordRootInfo;

    public static GetStandardWordRootResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandardWordRootResponseBody self = new GetStandardWordRootResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandardWordRootResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStandardWordRootResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStandardWordRootResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStandardWordRootResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandardWordRootResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStandardWordRootResponseBody setWordRootInfo(GetStandardWordRootResponseBodyWordRootInfo wordRootInfo) {
        this.wordRootInfo = wordRootInfo;
        return this;
    }
    public GetStandardWordRootResponseBodyWordRootInfo getWordRootInfo() {
        return this.wordRootInfo;
    }

    public static class GetStandardWordRootResponseBodyWordRootInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>avg</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>30012021</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>average</p>
         */
        @NameInMap("FullName")
        public String fullName;

        /**
         * <strong>example:</strong>
         * <p>30012021</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LastModifierName")
        public String lastModifierName;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>平均值</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardWordRootResponseBodyWordRootInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStandardWordRootResponseBodyWordRootInfo self = new GetStandardWordRootResponseBodyWordRootInfo();
            return TeaModel.build(map, self);
        }

        public GetStandardWordRootResponseBodyWordRootInfo setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public GetStandardWordRootResponseBodyWordRootInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStandardWordRootResponseBodyWordRootInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetStandardWordRootResponseBodyWordRootInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetStandardWordRootResponseBodyWordRootInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardWordRootResponseBodyWordRootInfo setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public GetStandardWordRootResponseBodyWordRootInfo setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetStandardWordRootResponseBodyWordRootInfo setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public GetStandardWordRootResponseBodyWordRootInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetStandardWordRootResponseBodyWordRootInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
