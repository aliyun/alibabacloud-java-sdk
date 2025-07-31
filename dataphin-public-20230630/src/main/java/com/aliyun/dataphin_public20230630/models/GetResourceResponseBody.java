// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetResourceResponseBody extends TeaModel {
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

    @NameInMap("ResourceInfo")
    public GetResourceResponseBodyResourceInfo resourceInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceResponseBody self = new GetResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceResponseBody setResourceInfo(GetResourceResponseBodyResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }
    public GetResourceResponseBodyResourceInfo getResourceInfo() {
        return this.resourceInfo;
    }

    public GetResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetResourceResponseBodyResourceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("ComputeEngineType")
        public String computeEngineType;

        /**
         * <strong>example:</strong>
         * <p>30011021</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
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
         * <p>10200121011</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>30011021</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <strong>example:</strong>
         * <p>udf_sleep.jar</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1030111021</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>JAR</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>102400</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>300011448/711833/cdcd1c44-f1ee-46bb-b318-1d123dbabf6c</p>
         */
        @NameInMap("StorageAddress")
        public String storageAddress;

        public static GetResourceResponseBodyResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResourceResponseBodyResourceInfo self = new GetResourceResponseBodyResourceInfo();
            return TeaModel.build(map, self);
        }

        public GetResourceResponseBodyResourceInfo setComputeEngineType(String computeEngineType) {
            this.computeEngineType = computeEngineType;
            return this;
        }
        public String getComputeEngineType() {
            return this.computeEngineType;
        }

        public GetResourceResponseBodyResourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetResourceResponseBodyResourceInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourceResponseBodyResourceInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetResourceResponseBodyResourceInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetResourceResponseBodyResourceInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetResourceResponseBodyResourceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetResourceResponseBodyResourceInfo setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetResourceResponseBodyResourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceResponseBodyResourceInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetResourceResponseBodyResourceInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetResourceResponseBodyResourceInfo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetResourceResponseBodyResourceInfo setStorageAddress(String storageAddress) {
            this.storageAddress = storageAddress;
            return this;
        }
        public String getStorageAddress() {
            return this.storageAddress;
        }

    }

}
