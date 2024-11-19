// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned if the call was successful.</p>
     */
    @NameInMap("Data")
    public GetEdgeInstanceResponseBodyData data;

    /**
     * <p>The error message that is returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16645053-546B-4D7C-832E-E519B0E23CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEdgeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceResponseBody self = new GetEdgeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEdgeInstanceResponseBody setData(GetEdgeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEdgeInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetEdgeInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEdgeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEdgeInstanceResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the edge instance was enabled. Valid values:</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BizEnable")
        public Boolean bizEnable;

        /**
         * <p>The time when the edge instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-26 12:33:25</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The UNIX timestamp when the edge instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        /**
         * <p>The last time when the edge instance was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-26 12:33:25</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The last UNIX timestamp when the edge instance was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        /**
         * <p>The ID of the edge instance.</p>
         * 
         * <strong>example:</strong>
         * <p>F3APY0tPLhmgGtx0****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the latest deployment task. Valid values:</p>
         * <ul>
         * <li>0: The task was not started.</li>
         * <li>1: The task was being processed.</li>
         * <li>2: The task was successful.</li>
         * <li>3: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LatestDeploymentStatus")
        public Integer latestDeploymentStatus;

        /**
         * <p>The type of the latest deployment task. Valid values:</p>
         * <ul>
         * <li>deploy: deploys the edge instance.</li>
         * <li>reset: resets the edge instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deploy</p>
         */
        @NameInMap("LatestDeploymentType")
        public String latestDeploymentType;

        /**
         * <p>The name of the edge instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1473922805******:role/aliyuniotaccessingfcrole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The time when the RAM role was attached to IoT Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-19 11:25:48</p>
         */
        @NameInMap("RoleAttachTime")
        public String roleAttachTime;

        /**
         * <p>The UNIX timestamp when the RAM role was attached to IoT Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("RoleAttachTimestamp")
        public Long roleAttachTimestamp;

        /**
         * <p>The name of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunIOTAccessingFCRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The specifications of the edge instance. Valid values:</p>
         * <ul>
         * <li>10: Lite Edition</li>
         * <li>20: Standard Edition</li>
         * <li>30: Pro Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Spec")
        public Integer spec;

        /**
         * <p>The tags of the edge instance. Each tag is a <code>key-value</code> pair. Multiple tags are separated with commas(,). Example: <code>k1:v1,k2:v2</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>k1:v1,k2:v2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>Indicates whether you own the edge instance or you are authorized to use the edge instance. Valid values:</p>
         * <ul>
         * <li>0: You own the edge instance.</li>
         * <li>1: You are authorized to use the edge instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetEdgeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceResponseBodyData self = new GetEdgeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceResponseBodyData setBizEnable(Boolean bizEnable) {
            this.bizEnable = bizEnable;
            return this;
        }
        public Boolean getBizEnable() {
            return this.bizEnable;
        }

        public GetEdgeInstanceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceResponseBodyData setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEdgeInstanceResponseBodyData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEdgeInstanceResponseBodyData setLatestDeploymentStatus(Integer latestDeploymentStatus) {
            this.latestDeploymentStatus = latestDeploymentStatus;
            return this;
        }
        public Integer getLatestDeploymentStatus() {
            return this.latestDeploymentStatus;
        }

        public GetEdgeInstanceResponseBodyData setLatestDeploymentType(String latestDeploymentType) {
            this.latestDeploymentType = latestDeploymentType;
            return this;
        }
        public String getLatestDeploymentType() {
            return this.latestDeploymentType;
        }

        public GetEdgeInstanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEdgeInstanceResponseBodyData setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public GetEdgeInstanceResponseBodyData setRoleAttachTime(String roleAttachTime) {
            this.roleAttachTime = roleAttachTime;
            return this;
        }
        public String getRoleAttachTime() {
            return this.roleAttachTime;
        }

        public GetEdgeInstanceResponseBodyData setRoleAttachTimestamp(Long roleAttachTimestamp) {
            this.roleAttachTimestamp = roleAttachTimestamp;
            return this;
        }
        public Long getRoleAttachTimestamp() {
            return this.roleAttachTimestamp;
        }

        public GetEdgeInstanceResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetEdgeInstanceResponseBodyData setSpec(Integer spec) {
            this.spec = spec;
            return this;
        }
        public Integer getSpec() {
            return this.spec;
        }

        public GetEdgeInstanceResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetEdgeInstanceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
