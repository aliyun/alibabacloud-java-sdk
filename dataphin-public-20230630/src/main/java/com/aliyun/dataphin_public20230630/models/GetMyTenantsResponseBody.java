// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetMyTenantsResponseBody extends TeaModel {
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
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("DeleteTime")
        public Long deleteTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>132311</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OpsTenant")
        public Boolean opsTenant;

        /**
         * <strong>example:</strong>
         * <p>21323231</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ResourceLimited")
        public Boolean resourceLimited;

        @NameInMap("TenantTypeList")
        public java.util.List<String> tenantTypeList;

        /**
         * <strong>example:</strong>
         * <p>icon</p>
         */
        @NameInMap("TitleType")
        public String titleType;

        /**
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
