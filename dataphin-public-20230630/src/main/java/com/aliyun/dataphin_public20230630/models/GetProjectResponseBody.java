// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
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
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("ProjectInfo")
    public GetProjectResponseBodyProjectInfo projectInfo;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectResponseBody setProjectInfo(GetProjectResponseBodyProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
        return this;
    }
    public GetProjectResponseBodyProjectInfo getProjectInfo() {
        return this.projectInfo;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectResponseBodyProjectInfoWhiteLists extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>whitelist for xxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>ip</p>
         * 
         * <strong>example:</strong>
         * <p>10.209.47.198</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        public static GetProjectResponseBodyProjectInfoWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyProjectInfoWhiteLists self = new GetProjectResponseBodyProjectInfoWhiteLists();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyProjectInfoWhiteLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectResponseBodyProjectInfoWhiteLists setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetProjectResponseBodyProjectInfoWhiteLists setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class GetProjectResponseBodyProjectInfo extends TeaModel {
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
         * <p>project for xxx</p>
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
         * <p>1703048484000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1703048484000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>12356</p>
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
         * <p>dp_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("NameSpaceTag")
        public String nameSpaceTag;

        /**
         * <strong>example:</strong>
         * <p>101111</p>
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
        public java.util.List<GetProjectResponseBodyProjectInfoWhiteLists> whiteLists;

        public static GetProjectResponseBodyProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyProjectInfo self = new GetProjectResponseBodyProjectInfo();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyProjectInfo setBizUnitDisplayName(String bizUnitDisplayName) {
            this.bizUnitDisplayName = bizUnitDisplayName;
            return this;
        }
        public String getBizUnitDisplayName() {
            return this.bizUnitDisplayName;
        }

        public GetProjectResponseBodyProjectInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetProjectResponseBodyProjectInfo setComputeSourceId(Long computeSourceId) {
            this.computeSourceId = computeSourceId;
            return this;
        }
        public Long getComputeSourceId() {
            return this.computeSourceId;
        }

        public GetProjectResponseBodyProjectInfo setComputeSourceName(String computeSourceName) {
            this.computeSourceName = computeSourceName;
            return this;
        }
        public String getComputeSourceName() {
            return this.computeSourceName;
        }

        public GetProjectResponseBodyProjectInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectResponseBodyProjectInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetProjectResponseBodyProjectInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetProjectResponseBodyProjectInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProjectResponseBodyProjectInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetProjectResponseBodyProjectInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetProjectResponseBodyProjectInfo setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetProjectResponseBodyProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectResponseBodyProjectInfo setNameSpaceTag(String nameSpaceTag) {
            this.nameSpaceTag = nameSpaceTag;
            return this;
        }
        public String getNameSpaceTag() {
            return this.nameSpaceTag;
        }

        public GetProjectResponseBodyProjectInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetProjectResponseBodyProjectInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetProjectResponseBodyProjectInfo setStreamComputeSourceId(Long streamComputeSourceId) {
            this.streamComputeSourceId = streamComputeSourceId;
            return this;
        }
        public Long getStreamComputeSourceId() {
            return this.streamComputeSourceId;
        }

        public GetProjectResponseBodyProjectInfo setStreamComputeSourceName(String streamComputeSourceName) {
            this.streamComputeSourceName = streamComputeSourceName;
            return this;
        }
        public String getStreamComputeSourceName() {
            return this.streamComputeSourceName;
        }

        public GetProjectResponseBodyProjectInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetProjectResponseBodyProjectInfo setWhiteLists(java.util.List<GetProjectResponseBodyProjectInfoWhiteLists> whiteLists) {
            this.whiteLists = whiteLists;
            return this;
        }
        public java.util.List<GetProjectResponseBodyProjectInfoWhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

    }

}
