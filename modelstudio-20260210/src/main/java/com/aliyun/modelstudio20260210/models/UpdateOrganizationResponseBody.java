// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateOrganizationResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public UpdateOrganizationResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC0B0D42-A88C-55F5-AF48-498B8207F6BC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationResponseBody self = new UpdateOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateOrganizationResponseBody setData(UpdateOrganizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateOrganizationResponseBodyData getData() {
        return this.data;
    }

    public UpdateOrganizationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateOrganizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateOrganizationResponseBodyData extends TeaModel {
        /**
         * <p>The organization description.</p>
         * 
         * <strong>example:</strong>
         * <p>组织描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T02:19:27Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-08 13:59:11</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The organization name.</p>
         * 
         * <strong>example:</strong>
         * <p>组织名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The product namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace-1</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org_123456789</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The business account identifier of the organization owner. The value is aliyunUid for the ALIYUN type and userIdentifier for the SSO type.</p>
         * 
         * <strong>example:</strong>
         * <p>1269388320468566</p>
         */
        @NameInMap("OwnerBizAccountId")
        public String ownerBizAccountId;

        /**
         * <p>The UAC account ID of the organization owner.</p>
         * 
         * <strong>example:</strong>
         * <p>acc_123456789</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>ACTIVE</li>
         * <li>FROZEN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateOrganizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateOrganizationResponseBodyData self = new UpdateOrganizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateOrganizationResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateOrganizationResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateOrganizationResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UpdateOrganizationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateOrganizationResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public UpdateOrganizationResponseBodyData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public UpdateOrganizationResponseBodyData setOwnerBizAccountId(String ownerBizAccountId) {
            this.ownerBizAccountId = ownerBizAccountId;
            return this;
        }
        public String getOwnerBizAccountId() {
            return this.ownerBizAccountId;
        }

        public UpdateOrganizationResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public UpdateOrganizationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
