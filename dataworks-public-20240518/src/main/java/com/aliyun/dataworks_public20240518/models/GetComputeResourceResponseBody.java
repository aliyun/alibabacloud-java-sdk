// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetComputeResourceResponseBody extends TeaModel {
    /**
     * <p>The details of the computing resource.</p>
     */
    @NameInMap("ComputeResource")
    public GetComputeResourceResponseBodyComputeResource computeResource;

    /**
     * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetComputeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeResourceResponseBody self = new GetComputeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeResourceResponseBody setComputeResource(GetComputeResourceResponseBodyComputeResource computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public GetComputeResourceResponseBodyComputeResource getComputeResource() {
        return this.computeResource;
    }

    public GetComputeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetComputeResourceResponseBodyComputeResource extends TeaModel {
        /**
         * <p>The specific connection configuration details for the computing resource, including the connection address, access identity, and environment information. envType, which specifies the computing resource environment, is a property of this object. Valid values:</p>
         * <ul>
         * <li>Dev</li>
         * <li>Prod Different types of computing resources have different attribute specifications under various configuration modes (ConnectionPropertiesMode).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;envType&quot;: &quot;Prod&quot;,
         *     &quot;regionId&quot;: &quot;cn-beijing&quot;,
         *     &quot;instanceId&quot;: &quot;hgprecn-cn-x0r3oun4k001&quot;,
         *     &quot;database&quot;: &quot;testdb&quot;,
         *     &quot;securityProtocol&quot;: &quot;authTypeNone&quot;,
         *     &quot;authType&quot;: &quot;Executor&quot;,
         *     &quot;authIdentity&quot;: &quot;1107550004253538&quot;
         * }</p>
         */
        @NameInMap("ConnectionProperties")
        public Object connectionProperties;

        /**
         * <p>The addition category of the computing resource. Different types will have different subtypes, each with corresponding parameter constraints. For instance:</p>
         * <ul>
         * <li>InstanceMode: Instance mode</li>
         * <li>UrlMode: Connection String Mode</li>
         * <li>CdhMode: CDH mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceMode</p>
         */
        @NameInMap("ConnectionPropertiesMode")
        public String connectionPropertiesMode;

        /**
         * <p>The creation time, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1698286929333</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1107550004253538</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The description of the computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>My Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>16738</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The last modification time, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1698286929333</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1107550004253538</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCs</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the workspace to which the computing resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>52660</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The business unique key for the computing resource. For example, the format for Hologres is ${tenantOwnerId}:${regionId}:${type}:${instanceId}:${database}.</p>
         * 
         * <strong>example:</strong>
         * <p>1107550004253538:cn-beijing:holo:hgprecn-cn-x0r3oun4k001:testdb</p>
         */
        @NameInMap("QualifiedName")
        public String qualifiedName;

        /**
         * <p>The type of the computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>hologres</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Specifies whether it is the default computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WhetherDefault")
        public Boolean whetherDefault;

        public static GetComputeResourceResponseBodyComputeResource build(java.util.Map<String, ?> map) throws Exception {
            GetComputeResourceResponseBodyComputeResource self = new GetComputeResourceResponseBodyComputeResource();
            return TeaModel.build(map, self);
        }

        public GetComputeResourceResponseBodyComputeResource setConnectionProperties(Object connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public Object getConnectionProperties() {
            return this.connectionProperties;
        }

        public GetComputeResourceResponseBodyComputeResource setConnectionPropertiesMode(String connectionPropertiesMode) {
            this.connectionPropertiesMode = connectionPropertiesMode;
            return this;
        }
        public String getConnectionPropertiesMode() {
            return this.connectionPropertiesMode;
        }

        public GetComputeResourceResponseBodyComputeResource setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetComputeResourceResponseBodyComputeResource setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetComputeResourceResponseBodyComputeResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetComputeResourceResponseBodyComputeResource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetComputeResourceResponseBodyComputeResource setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetComputeResourceResponseBodyComputeResource setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetComputeResourceResponseBodyComputeResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeResourceResponseBodyComputeResource setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetComputeResourceResponseBodyComputeResource setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }
        public String getQualifiedName() {
            return this.qualifiedName;
        }

        public GetComputeResourceResponseBodyComputeResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetComputeResourceResponseBodyComputeResource setWhetherDefault(Boolean whetherDefault) {
            this.whetherDefault = whetherDefault;
            return this;
        }
        public Boolean getWhetherDefault() {
            return this.whetherDefault;
        }

    }

}
