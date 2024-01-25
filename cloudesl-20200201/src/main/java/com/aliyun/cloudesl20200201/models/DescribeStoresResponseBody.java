// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoresResponseBody extends TeaModel {
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

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Stores")
    public java.util.List<DescribeStoresResponseBodyStores> stores;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoresResponseBody self = new DescribeStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStoresResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeStoresResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeStoresResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeStoresResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeStoresResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeStoresResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStoresResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStoresResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStoresResponseBody setStores(java.util.List<DescribeStoresResponseBodyStores> stores) {
        this.stores = stores;
        return this;
    }
    public java.util.List<DescribeStoresResponseBodyStores> getStores() {
        return this.stores;
    }

    public DescribeStoresResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeStoresResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStoresResponseBodyStores extends TeaModel {
        @NameInMap("AutoUnbindDays")
        public Integer autoUnbindDays;

        @NameInMap("AutoUnbindOfflineEsl")
        public Boolean autoUnbindOfflineEsl;

        @NameInMap("BarCodeEncode")
        public Integer barCodeEncode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

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

        public static DescribeStoresResponseBodyStores build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoresResponseBodyStores self = new DescribeStoresResponseBodyStores();
            return TeaModel.build(map, self);
        }

        public DescribeStoresResponseBodyStores setAutoUnbindDays(Integer autoUnbindDays) {
            this.autoUnbindDays = autoUnbindDays;
            return this;
        }
        public Integer getAutoUnbindDays() {
            return this.autoUnbindDays;
        }

        public DescribeStoresResponseBodyStores setAutoUnbindOfflineEsl(Boolean autoUnbindOfflineEsl) {
            this.autoUnbindOfflineEsl = autoUnbindOfflineEsl;
            return this;
        }
        public Boolean getAutoUnbindOfflineEsl() {
            return this.autoUnbindOfflineEsl;
        }

        public DescribeStoresResponseBodyStores setBarCodeEncode(Integer barCodeEncode) {
            this.barCodeEncode = barCodeEncode;
            return this;
        }
        public Integer getBarCodeEncode() {
            return this.barCodeEncode;
        }

        public DescribeStoresResponseBodyStores setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeStoresResponseBodyStores setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeStoresResponseBodyStores setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeStoresResponseBodyStores setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeStoresResponseBodyStores setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeStoresResponseBodyStores setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeStoresResponseBodyStores setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

        public DescribeStoresResponseBodyStores setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public DescribeStoresResponseBodyStores setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public DescribeStoresResponseBodyStores setUserStoreCode(String userStoreCode) {
            this.userStoreCode = userStoreCode;
            return this;
        }
        public String getUserStoreCode() {
            return this.userStoreCode;
        }

    }

}
