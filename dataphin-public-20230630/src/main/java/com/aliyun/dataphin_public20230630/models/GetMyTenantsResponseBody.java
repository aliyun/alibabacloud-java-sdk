// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetMyTenantsResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The list of tenants.</p>
     */
    @NameInMap("TenantList")
    public java.util.List<GetMyTenantsResponseBodyTenantList> tenantList;

    public static GetMyTenantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMyTenantsResponseBody self = new GetMyTenantsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMyTenantsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMyTenantsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMyTenantsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMyTenantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMyTenantsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMyTenantsResponseBody setTenantList(java.util.List<GetMyTenantsResponseBodyTenantList> tenantList) {
        this.tenantList = tenantList;
        return this;
    }
    public java.util.List<GetMyTenantsResponseBodyTenantList> getTenantList() {
        return this.tenantList;
    }

    public static class GetMyTenantsResponseBodyTenantList extends TeaModel {
        /**
         * <p>The time when the tenant was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("DeleteTime")
        public Long deleteTime;

        /**
         * <p>Indicates whether the tenant is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <p>The tenant description.</p>
         * 
         * <strong>example:</strong>
         * <p>xx 测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>132311</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The tenant name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the tenant is an O&amp;M tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OpsTenant")
        public Boolean opsTenant;

        /**
         * <p>The ID of the user to whom the tenant belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>21323231</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>Indicates whether resource quota calculation is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ResourceLimited")
        public Boolean resourceLimited;

        /**
         * <p>The tenant types.</p>
         */
        @NameInMap("TenantTypeList")
        public java.util.List<String> tenantTypeList;

        /**
         * <p>The title type of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>icon</p>
         */
        @NameInMap("TitleType")
        public String titleType;

        /**
         * <p>Indicates whether the tenant is visible.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Visible")
        public Boolean visible;

        public static GetMyTenantsResponseBodyTenantList build(java.util.Map<String, ?> map) throws Exception {
            GetMyTenantsResponseBodyTenantList self = new GetMyTenantsResponseBodyTenantList();
            return TeaModel.build(map, self);
        }

        public GetMyTenantsResponseBodyTenantList setDeleteTime(Long deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        public GetMyTenantsResponseBodyTenantList setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetMyTenantsResponseBodyTenantList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMyTenantsResponseBodyTenantList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMyTenantsResponseBodyTenantList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMyTenantsResponseBodyTenantList setOpsTenant(Boolean opsTenant) {
            this.opsTenant = opsTenant;
            return this;
        }
        public Boolean getOpsTenant() {
            return this.opsTenant;
        }

        public GetMyTenantsResponseBodyTenantList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMyTenantsResponseBodyTenantList setResourceLimited(Boolean resourceLimited) {
            this.resourceLimited = resourceLimited;
            return this;
        }
        public Boolean getResourceLimited() {
            return this.resourceLimited;
        }

        public GetMyTenantsResponseBodyTenantList setTenantTypeList(java.util.List<String> tenantTypeList) {
            this.tenantTypeList = tenantTypeList;
            return this;
        }
        public java.util.List<String> getTenantTypeList() {
            return this.tenantTypeList;
        }

        public GetMyTenantsResponseBodyTenantList setTitleType(String titleType) {
            this.titleType = titleType;
            return this;
        }
        public String getTitleType() {
            return this.titleType;
        }

        public GetMyTenantsResponseBodyTenantList setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

}
