// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUdfResponseBody extends TeaModel {
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

    @NameInMap("UdfInfo")
    public GetUdfResponseBodyUdfInfo udfInfo;

    public static GetUdfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUdfResponseBody self = new GetUdfResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUdfResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUdfResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUdfResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUdfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUdfResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUdfResponseBody setUdfInfo(GetUdfResponseBodyUdfInfo udfInfo) {
        this.udfInfo = udfInfo;
        return this;
    }
    public GetUdfResponseBodyUdfInfo getUdfInfo() {
        return this.udfInfo;
    }

    public static class GetUdfResponseBodyUdfInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <strong>example:</strong>
         * <p>com.lydaas.dataphin.UdfTest</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <strong>example:</strong>
         * <p>udf_to_lower(char x)</p>
         */
        @NameInMap("CommandHelp")
        public String commandHelp;

        /**
         * <strong>example:</strong>
         * <p>HADOOP</p>
         */
        @NameInMap("ComputeEngineType")
        public String computeEngineType;

        /**
         * <strong>example:</strong>
         * <p>30012110</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <strong>example:</strong>
         * <p>2025-06-10 10:01:01</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-06-10 10:01:01</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1030111021</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>30012110</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <strong>example:</strong>
         * <p>udf_to_lower</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetUdfResponseBodyUdfInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUdfResponseBodyUdfInfo self = new GetUdfResponseBodyUdfInfo();
            return TeaModel.build(map, self);
        }

        public GetUdfResponseBodyUdfInfo setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public GetUdfResponseBodyUdfInfo setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public GetUdfResponseBodyUdfInfo setCommandHelp(String commandHelp) {
            this.commandHelp = commandHelp;
            return this;
        }
        public String getCommandHelp() {
            return this.commandHelp;
        }

        public GetUdfResponseBodyUdfInfo setComputeEngineType(String computeEngineType) {
            this.computeEngineType = computeEngineType;
            return this;
        }
        public String getComputeEngineType() {
            return this.computeEngineType;
        }

        public GetUdfResponseBodyUdfInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetUdfResponseBodyUdfInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUdfResponseBodyUdfInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetUdfResponseBodyUdfInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUdfResponseBodyUdfInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetUdfResponseBodyUdfInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUdfResponseBodyUdfInfo setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetUdfResponseBodyUdfInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
