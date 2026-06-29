// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetOrganizationResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetOrganizationResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0CB5868D-C6E5-59A6-A20A-C39EB2E75BDE</p>
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

    public static GetOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationResponseBody self = new GetOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrganizationResponseBody setData(GetOrganizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOrganizationResponseBodyData getData() {
        return this.data;
    }

    public GetOrganizationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOrganizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrganizationResponseBodyData extends TeaModel {
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
         * <p>2025-11-20T02:26:35Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-13T02:11:56Z</p>
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
         * <p>1543686331379464</p>
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
         * <p>The status. Valid values: ACTIVE and FROZEN.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetOrganizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationResponseBodyData self = new GetOrganizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrganizationResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOrganizationResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetOrganizationResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetOrganizationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOrganizationResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetOrganizationResponseBodyData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public GetOrganizationResponseBodyData setOwnerBizAccountId(String ownerBizAccountId) {
            this.ownerBizAccountId = ownerBizAccountId;
            return this;
        }
        public String getOwnerBizAccountId() {
            return this.ownerBizAccountId;
        }

        public GetOrganizationResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetOrganizationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
