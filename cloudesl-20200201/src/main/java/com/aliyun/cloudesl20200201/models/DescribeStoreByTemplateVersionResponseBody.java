// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoreByTemplateVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Stores")
    public java.util.List<DescribeStoreByTemplateVersionResponseBodyStores> stores;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeStoreByTemplateVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoreByTemplateVersionResponseBody self = new DescribeStoreByTemplateVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStoreByTemplateVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeStoreByTemplateVersionResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeStoreByTemplateVersionResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeStoreByTemplateVersionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeStoreByTemplateVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeStoreByTemplateVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStoreByTemplateVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStoreByTemplateVersionResponseBody setStores(java.util.List<DescribeStoreByTemplateVersionResponseBodyStores> stores) {
        this.stores = stores;
        return this;
    }
    public java.util.List<DescribeStoreByTemplateVersionResponseBodyStores> getStores() {
        return this.stores;
    }

    public DescribeStoreByTemplateVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeStoreByTemplateVersionResponseBodyStores extends TeaModel {
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Level")
        public String level;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("StoreName")
        public String storeName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("UserStoreCode")
        public String userStoreCode;

        public static DescribeStoreByTemplateVersionResponseBodyStores build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoreByTemplateVersionResponseBodyStores self = new DescribeStoreByTemplateVersionResponseBodyStores();
            return TeaModel.build(map, self);
        }

        public DescribeStoreByTemplateVersionResponseBodyStores setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeStoreByTemplateVersionResponseBodyStores setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeStoreByTemplateVersionResponseBodyStores setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeStoreByTemplateVersionResponseBodyStores setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeStoreByTemplateVersionResponseBodyStores setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeStoreByTemplateVersionResponseBodyStores setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

        public DescribeStoreByTemplateVersionResponseBodyStores setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public DescribeStoreByTemplateVersionResponseBodyStores setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public DescribeStoreByTemplateVersionResponseBodyStores setUserStoreCode(String userStoreCode) {
            this.userStoreCode = userStoreCode;
            return this;
        }
        public String getUserStoreCode() {
            return this.userStoreCode;
        }

    }

}
