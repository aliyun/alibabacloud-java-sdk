// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckResourcePermissionResponseBody extends TeaModel {
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

    @NameInMap("ResourcePermissionList")
    public java.util.List<CheckResourcePermissionResponseBodyResourcePermissionList> resourcePermissionList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckResourcePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckResourcePermissionResponseBody self = new CheckResourcePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckResourcePermissionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckResourcePermissionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CheckResourcePermissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckResourcePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckResourcePermissionResponseBody setResourcePermissionList(java.util.List<CheckResourcePermissionResponseBodyResourcePermissionList> resourcePermissionList) {
        this.resourcePermissionList = resourcePermissionList;
        return this;
    }
    public java.util.List<CheckResourcePermissionResponseBodyResourcePermissionList> getResourcePermissionList() {
        return this.resourcePermissionList;
    }

    public CheckResourcePermissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckResourcePermissionResponseBodyResourcePermissionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPermission")
        public Boolean hasPermission;

        /**
         * <strong>example:</strong>
         * <p>hadoop.300000806.data_distill.behavior_gameinfor_01</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static CheckResourcePermissionResponseBodyResourcePermissionList build(java.util.Map<String, ?> map) throws Exception {
            CheckResourcePermissionResponseBodyResourcePermissionList self = new CheckResourcePermissionResponseBodyResourcePermissionList();
            return TeaModel.build(map, self);
        }

        public CheckResourcePermissionResponseBodyResourcePermissionList setHasPermission(Boolean hasPermission) {
            this.hasPermission = hasPermission;
            return this;
        }
        public Boolean getHasPermission() {
            return this.hasPermission;
        }

        public CheckResourcePermissionResponseBodyResourcePermissionList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
