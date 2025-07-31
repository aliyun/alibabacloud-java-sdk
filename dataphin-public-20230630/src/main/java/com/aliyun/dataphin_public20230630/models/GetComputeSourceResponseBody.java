// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetComputeSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ComputeSourceInfo")
    public GetComputeSourceResponseBodyComputeSourceInfo computeSourceInfo;

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

    public static GetComputeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeSourceResponseBody self = new GetComputeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetComputeSourceResponseBody setComputeSourceInfo(GetComputeSourceResponseBodyComputeSourceInfo computeSourceInfo) {
        this.computeSourceInfo = computeSourceInfo;
        return this;
    }
    public GetComputeSourceResponseBodyComputeSourceInfo getComputeSourceInfo() {
        return this.computeSourceInfo;
    }

    public GetComputeSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetComputeSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetComputeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetComputeSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetComputeSourceResponseBodyComputeSourceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BindProject")
        public Boolean bindProject;

        /**
         * <strong>example:</strong>
         * <p>10101101</p>
         */
        @NameInMap("BindProjectId")
        public Long bindProjectId;

        /**
         * <strong>example:</strong>
         * <p>dp_mctest</p>
         */
        @NameInMap("BindProjectName")
        public String bindProjectName;

        /**
         * <strong>example:</strong>
         * <p>101101</p>
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
         * <p>compute source for xxx.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>dp_test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>1681881607000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1711881607000</p>
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
         * <p>dp_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>101101</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetComputeSourceResponseBodyComputeSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetComputeSourceResponseBodyComputeSourceInfo self = new GetComputeSourceResponseBodyComputeSourceInfo();
            return TeaModel.build(map, self);
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setBindProject(Boolean bindProject) {
            this.bindProject = bindProject;
            return this;
        }
        public Boolean getBindProject() {
            return this.bindProject;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setBindProjectId(Long bindProjectId) {
            this.bindProjectId = bindProjectId;
            return this;
        }
        public Long getBindProjectId() {
            return this.bindProjectId;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setBindProjectName(String bindProjectName) {
            this.bindProjectName = bindProjectName;
            return this;
        }
        public String getBindProjectName() {
            return this.bindProjectName;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetComputeSourceResponseBodyComputeSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
