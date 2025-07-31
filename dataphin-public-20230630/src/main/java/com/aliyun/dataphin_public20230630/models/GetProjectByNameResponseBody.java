// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetProjectByNameResponseBody extends TeaModel {
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

    @NameInMap("ProjectInfo")
    public GetProjectByNameResponseBodyProjectInfo projectInfo;

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

    public static GetProjectByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectByNameResponseBody self = new GetProjectByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectByNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProjectByNameResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectByNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectByNameResponseBody setProjectInfo(GetProjectByNameResponseBodyProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
        return this;
    }
    public GetProjectByNameResponseBodyProjectInfo getProjectInfo() {
        return this.projectInfo;
    }

    public GetProjectByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectByNameResponseBodyProjectInfoWhiteLists extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx 白名单</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Ip</p>
         * 
         * <strong>example:</strong>
         * <p>10.11.1.21</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("Port")
        public String port;

        public static GetProjectByNameResponseBodyProjectInfoWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            GetProjectByNameResponseBodyProjectInfoWhiteLists self = new GetProjectByNameResponseBodyProjectInfoWhiteLists();
            return TeaModel.build(map, self);
        }

        public GetProjectByNameResponseBodyProjectInfoWhiteLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectByNameResponseBodyProjectInfoWhiteLists setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetProjectByNameResponseBodyProjectInfoWhiteLists setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class GetProjectByNameResponseBodyProjectInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("BizUnitDisplayName")
        public String bizUnitDisplayName;

        /**
         * <strong>example:</strong>
         * <p>101131</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>101711</p>
         */
        @NameInMap("ComputeSourceId")
        public Long computeSourceId;

        /**
         * <strong>example:</strong>
         * <p>ds1</p>
         */
        @NameInMap("ComputeSourceName")
        public String computeSourceName;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>xx test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

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
         * <p>BASIC</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>BASE</p>
         */
        @NameInMap("NameSpaceTag")
        public String nameSpaceTag;

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

        /**
         * <strong>example:</strong>
         * <p>201711</p>
         */
        @NameInMap("StreamComputeSourceId")
        public Long streamComputeSourceId;

        /**
         * <strong>example:</strong>
         * <p>ds2</p>
         */
        @NameInMap("StreamComputeSourceName")
        public String streamComputeSourceName;

        /**
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("WhiteLists")
        public java.util.List<GetProjectByNameResponseBodyProjectInfoWhiteLists> whiteLists;

        public static GetProjectByNameResponseBodyProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            GetProjectByNameResponseBodyProjectInfo self = new GetProjectByNameResponseBodyProjectInfo();
            return TeaModel.build(map, self);
        }

        public GetProjectByNameResponseBodyProjectInfo setBizUnitDisplayName(String bizUnitDisplayName) {
            this.bizUnitDisplayName = bizUnitDisplayName;
            return this;
        }
        public String getBizUnitDisplayName() {
            return this.bizUnitDisplayName;
        }

        public GetProjectByNameResponseBodyProjectInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetProjectByNameResponseBodyProjectInfo setComputeSourceId(Long computeSourceId) {
            this.computeSourceId = computeSourceId;
            return this;
        }
        public Long getComputeSourceId() {
            return this.computeSourceId;
        }

        public GetProjectByNameResponseBodyProjectInfo setComputeSourceName(String computeSourceName) {
            this.computeSourceName = computeSourceName;
            return this;
        }
        public String getComputeSourceName() {
            return this.computeSourceName;
        }

        public GetProjectByNameResponseBodyProjectInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectByNameResponseBodyProjectInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetProjectByNameResponseBodyProjectInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetProjectByNameResponseBodyProjectInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProjectByNameResponseBodyProjectInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetProjectByNameResponseBodyProjectInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetProjectByNameResponseBodyProjectInfo setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetProjectByNameResponseBodyProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectByNameResponseBodyProjectInfo setNameSpaceTag(String nameSpaceTag) {
            this.nameSpaceTag = nameSpaceTag;
            return this;
        }
        public String getNameSpaceTag() {
            return this.nameSpaceTag;
        }

        public GetProjectByNameResponseBodyProjectInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetProjectByNameResponseBodyProjectInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetProjectByNameResponseBodyProjectInfo setStreamComputeSourceId(Long streamComputeSourceId) {
            this.streamComputeSourceId = streamComputeSourceId;
            return this;
        }
        public Long getStreamComputeSourceId() {
            return this.streamComputeSourceId;
        }

        public GetProjectByNameResponseBodyProjectInfo setStreamComputeSourceName(String streamComputeSourceName) {
            this.streamComputeSourceName = streamComputeSourceName;
            return this;
        }
        public String getStreamComputeSourceName() {
            return this.streamComputeSourceName;
        }

        public GetProjectByNameResponseBodyProjectInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetProjectByNameResponseBodyProjectInfo setWhiteLists(java.util.List<GetProjectByNameResponseBodyProjectInfoWhiteLists> whiteLists) {
            this.whiteLists = whiteLists;
            return this;
        }
        public java.util.List<GetProjectByNameResponseBodyProjectInfoWhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

    }

}
