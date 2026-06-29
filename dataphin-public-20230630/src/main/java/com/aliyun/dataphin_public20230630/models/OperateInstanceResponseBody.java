// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OperateInstanceResponseBody extends TeaModel {
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
     * <p>The O&amp;M results of the instances.</p>
     */
    @NameInMap("InstanceStatusList")
    public java.util.List<OperateInstanceResponseBodyInstanceStatusList> instanceStatusList;

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

    public static OperateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateInstanceResponseBody self = new OperateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OperateInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public OperateInstanceResponseBody setInstanceStatusList(java.util.List<OperateInstanceResponseBodyInstanceStatusList> instanceStatusList) {
        this.instanceStatusList = instanceStatusList;
        return this;
    }
    public java.util.List<OperateInstanceResponseBodyInstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    public OperateInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OperateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OperateInstanceResponseBodyInstanceStatusList extends TeaModel {
        /**
         * <p>The display name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The error message returned when the operation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t_132435</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>121311</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The owner of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The result of the operation, which indicates success or failure.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static OperateInstanceResponseBodyInstanceStatusList build(java.util.Map<String, ?> map) throws Exception {
            OperateInstanceResponseBodyInstanceStatusList self = new OperateInstanceResponseBodyInstanceStatusList();
            return TeaModel.build(map, self);
        }

        public OperateInstanceResponseBodyInstanceStatusList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public OperateInstanceResponseBodyInstanceStatusList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public OperateInstanceResponseBodyInstanceStatusList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public OperateInstanceResponseBodyInstanceStatusList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OperateInstanceResponseBodyInstanceStatusList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public OperateInstanceResponseBodyInstanceStatusList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public OperateInstanceResponseBodyInstanceStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
