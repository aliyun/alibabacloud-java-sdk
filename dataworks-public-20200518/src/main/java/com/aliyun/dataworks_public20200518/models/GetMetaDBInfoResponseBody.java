// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBInfoResponseBody extends TeaModel {
    /**
     * <p>The basic metadata information.</p>
     */
    @NameInMap("Data")
    public GetMetaDBInfoResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMetaDBInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBInfoResponseBody self = new GetMetaDBInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaDBInfoResponseBody setData(GetMetaDBInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaDBInfoResponseBodyData getData() {
        return this.data;
    }

    public GetMetaDBInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMetaDBInfoResponseBodyData extends TeaModel {
        /**
         * <p>The compute engine instance ID. Specify the ID in the <code>Engine type.Engine name</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name</p>
         */
        @NameInMap("AppGuid")
        public String appGuid;

        /**
         * <p>The EMR cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("ClusterBizId")
        public String clusterBizId;

        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>The ID of the compute engine instance. The ID is in the Engine type.Engine name format.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the compute engine instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1541576644000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The endpoint of the service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://service.odpsstg.aliyun-inc.com/">http://service.odpsstg.aliyun-inc.com/</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The type of the environment. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnvType")
        public Integer envType;

        /**
         * <p>The storage path of the metadatabase of the EMR cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The time when the compute engine instance was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1541576644000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the Alibaba Cloud account used by the workspace owner.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The name of the workspace owner.</p>
         * 
         * <strong>example:</strong>
         * <p>323</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The display name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>The storage path of the metadatabase of the EMR cluster.</p>
         */
        @NameInMap("ProjectNameCn")
        public String projectNameCn;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The type of the metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetMetaDBInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBInfoResponseBodyData self = new GetMetaDBInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaDBInfoResponseBodyData setAppGuid(String appGuid) {
            this.appGuid = appGuid;
            return this;
        }
        public String getAppGuid() {
            return this.appGuid;
        }

        public GetMetaDBInfoResponseBodyData setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public GetMetaDBInfoResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaDBInfoResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaDBInfoResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetMetaDBInfoResponseBodyData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaDBInfoResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaDBInfoResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetMetaDBInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetaDBInfoResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaDBInfoResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetMetaDBInfoResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaDBInfoResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaDBInfoResponseBodyData setProjectNameCn(String projectNameCn) {
            this.projectNameCn = projectNameCn;
            return this;
        }
        public String getProjectNameCn() {
            return this.projectNameCn;
        }

        public GetMetaDBInfoResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetMetaDBInfoResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
