// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUdfByVersionResponseBody extends TeaModel {
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
    public GetUdfByVersionResponseBodyUdfInfo udfInfo;

    public static GetUdfByVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUdfByVersionResponseBody self = new GetUdfByVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUdfByVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUdfByVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUdfByVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUdfByVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUdfByVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUdfByVersionResponseBody setUdfInfo(GetUdfByVersionResponseBodyUdfInfo udfInfo) {
        this.udfInfo = udfInfo;
        return this;
    }
    public GetUdfByVersionResponseBodyUdfInfo getUdfInfo() {
        return this.udfInfo;
    }

    public static class GetUdfByVersionResponseBodyUdfInfo extends TeaModel {
        /**
         * <p>The udf type. Valid values:</p>
         * <ul>
         * <li>1: window function.</li>
         * <li>2: statistical function.</li>
         * <li>3: numerical function.</li>
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
         * <p>The command help.</p>
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
         * <p>The update time, in the yyyy-MM-d HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-10 10:01:01</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the user-defined function.</p>
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

        public static GetUdfByVersionResponseBodyUdfInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUdfByVersionResponseBodyUdfInfo self = new GetUdfByVersionResponseBodyUdfInfo();
            return TeaModel.build(map, self);
        }

        public GetUdfByVersionResponseBodyUdfInfo setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public GetUdfByVersionResponseBodyUdfInfo setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public GetUdfByVersionResponseBodyUdfInfo setCommandHelp(String commandHelp) {
            this.commandHelp = commandHelp;
            return this;
        }
        public String getCommandHelp() {
            return this.commandHelp;
        }

        public GetUdfByVersionResponseBodyUdfInfo setComputeEngineType(String computeEngineType) {
            this.computeEngineType = computeEngineType;
            return this;
        }
        public String getComputeEngineType() {
            return this.computeEngineType;
        }

        public GetUdfByVersionResponseBodyUdfInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetUdfByVersionResponseBodyUdfInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUdfByVersionResponseBodyUdfInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetUdfByVersionResponseBodyUdfInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUdfByVersionResponseBodyUdfInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetUdfByVersionResponseBodyUdfInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUdfByVersionResponseBodyUdfInfo setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetUdfByVersionResponseBodyUdfInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
