// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUdfResponseBody extends TeaModel {
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
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the user-defined function.</p>
     */
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
         * <p>The category. Valid values:</p>
         * <ul>
         * <li>1: window function.</li>
         * <li>2: aggregate function.</li>
         * <li>3: numeric function.</li>
         * <li>4: string function.</li>
         * <li>5: time function.</li>
         * <li>6: IP address utility function.</li>
         * <li>7: URL-related function.</li>
         * <li>8: encoding and decoding function.</li>
         * <li>9: business-related function.</li>
         * <li>10: other.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <p>The registered class name.</p>
         * 
         * <strong>example:</strong>
         * <p>com.lydaas.dataphin.UdfTest</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The command help information.</p>
         * 
         * <strong>example:</strong>
         * <p>udf_to_lower(char x)</p>
         */
        @NameInMap("CommandHelp")
        public String commandHelp;

        /**
         * <p>The compute engine. Valid values: HADOOP, MAX_COMPUTE, and FLINK.</p>
         * 
         * <strong>example:</strong>
         * <p>HADOOP</p>
         */
        @NameInMap("ComputeEngineType")
        public String computeEngineType;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012110</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The directory where the function is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The creation time, in the yyyy-MM-d HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-10 10:01:01</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time, in the yyyy-MM-d HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-10 10:01:01</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The user-defined function ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1030111021</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>30012110</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <p>The function name.</p>
         * 
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
