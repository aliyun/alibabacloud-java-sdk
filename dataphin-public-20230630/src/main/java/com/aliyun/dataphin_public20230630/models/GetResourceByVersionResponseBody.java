// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetResourceByVersionResponseBody extends TeaModel {
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
    public GetResourceByVersionResponseBodyResourceInfo resourceInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetResourceByVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceByVersionResponseBody self = new GetResourceByVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceByVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourceByVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetResourceByVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourceByVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceByVersionResponseBody setResourceInfo(GetResourceByVersionResponseBodyResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }
    public GetResourceByVersionResponseBodyResourceInfo getResourceInfo() {
        return this.resourceInfo;
    }

    public GetResourceByVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetResourceByVersionResponseBodyResourceInfo extends TeaModel {
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

        public static GetResourceByVersionResponseBodyResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResourceByVersionResponseBodyResourceInfo self = new GetResourceByVersionResponseBodyResourceInfo();
            return TeaModel.build(map, self);
        }

        public GetResourceByVersionResponseBodyResourceInfo setComputeEngineType(String computeEngineType) {
            this.computeEngineType = computeEngineType;
            return this;
        }
        public String getComputeEngineType() {
            return this.computeEngineType;
        }

        public GetResourceByVersionResponseBodyResourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetResourceByVersionResponseBodyResourceInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourceByVersionResponseBodyResourceInfo setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetResourceByVersionResponseBodyResourceInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetResourceByVersionResponseBodyResourceInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetResourceByVersionResponseBodyResourceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetResourceByVersionResponseBodyResourceInfo setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetResourceByVersionResponseBodyResourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceByVersionResponseBodyResourceInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetResourceByVersionResponseBodyResourceInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetResourceByVersionResponseBodyResourceInfo setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetResourceByVersionResponseBodyResourceInfo setStorageAddress(String storageAddress) {
            this.storageAddress = storageAddress;
            return this;
        }
        public String getStorageAddress() {
            return this.storageAddress;
        }

    }

}
