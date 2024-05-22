// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

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
    public DescribeStoresResponseBodyStores stores;

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

    public DescribeStoresResponseBody setStores(DescribeStoresResponseBodyStores stores) {
        this.stores = stores;
        return this;
    }
    public DescribeStoresResponseBodyStores getStores() {
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

    public static class DescribeStoresResponseBodyStoresStoreInfo extends TeaModel {
        @NameInMap("Brand")
        public String brand;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("CompanyId")
        public String companyId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Groups")
        public String groups;

        @NameInMap("Level")
        public String level;

        @NameInMap("OutId")
        public String outId;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("StoreName")
        public String storeName;

        public static DescribeStoresResponseBodyStoresStoreInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoresResponseBodyStoresStoreInfo self = new DescribeStoresResponseBodyStoresStoreInfo();
            return TeaModel.build(map, self);
        }

        public DescribeStoresResponseBodyStoresStoreInfo setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setCompanyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        public String getCompanyId() {
            return this.companyId;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setGroups(String groups) {
            this.groups = groups;
            return this;
        }
        public String getGroups() {
            return this.groups;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeStoresResponseBodyStoresStoreInfo setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

    }

    public static class DescribeStoresResponseBodyStores extends TeaModel {
        @NameInMap("StoreInfo")
        public java.util.List<DescribeStoresResponseBodyStoresStoreInfo> storeInfo;

        public static DescribeStoresResponseBodyStores build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoresResponseBodyStores self = new DescribeStoresResponseBodyStores();
            return TeaModel.build(map, self);
        }

        public DescribeStoresResponseBodyStores setStoreInfo(java.util.List<DescribeStoresResponseBodyStoresStoreInfo> storeInfo) {
            this.storeInfo = storeInfo;
            return this;
        }
        public java.util.List<DescribeStoresResponseBodyStoresStoreInfo> getStoreInfo() {
            return this.storeInfo;
        }

    }

}
