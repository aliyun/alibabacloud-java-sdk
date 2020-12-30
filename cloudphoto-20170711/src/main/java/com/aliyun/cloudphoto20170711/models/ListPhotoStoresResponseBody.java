// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListPhotoStoresResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PhotoStores")
    public java.util.List<ListPhotoStoresResponseBodyPhotoStores> photoStores;

    @NameInMap("Code")
    public String code;

    public static ListPhotoStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhotoStoresResponseBody self = new ListPhotoStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhotoStoresResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListPhotoStoresResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPhotoStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPhotoStoresResponseBody setPhotoStores(java.util.List<ListPhotoStoresResponseBodyPhotoStores> photoStores) {
        this.photoStores = photoStores;
        return this;
    }
    public java.util.List<ListPhotoStoresResponseBodyPhotoStores> getPhotoStores() {
        return this.photoStores;
    }

    public ListPhotoStoresResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListPhotoStoresResponseBodyPhotoStoresBuckets extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("Region")
        public String region;

        @NameInMap("Name")
        public String name;

        public static ListPhotoStoresResponseBodyPhotoStoresBuckets build(java.util.Map<String, ?> map) throws Exception {
            ListPhotoStoresResponseBodyPhotoStoresBuckets self = new ListPhotoStoresResponseBodyPhotoStoresBuckets();
            return TeaModel.build(map, self);
        }

        public ListPhotoStoresResponseBodyPhotoStoresBuckets setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListPhotoStoresResponseBodyPhotoStoresBuckets setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListPhotoStoresResponseBodyPhotoStoresBuckets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListPhotoStoresResponseBodyPhotoStores extends TeaModel {
        @NameInMap("AutoCleanDays")
        public Integer autoCleanDays;

        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Buckets")
        public java.util.List<ListPhotoStoresResponseBodyPhotoStoresBuckets> buckets;

        @NameInMap("DefaultQuota")
        public Long defaultQuota;

        @NameInMap("Name")
        public String name;

        @NameInMap("AutoCleanEnabled")
        public Boolean autoCleanEnabled;

        @NameInMap("Id")
        public Long id;

        public static ListPhotoStoresResponseBodyPhotoStores build(java.util.Map<String, ?> map) throws Exception {
            ListPhotoStoresResponseBodyPhotoStores self = new ListPhotoStoresResponseBodyPhotoStores();
            return TeaModel.build(map, self);
        }

        public ListPhotoStoresResponseBodyPhotoStores setAutoCleanDays(Integer autoCleanDays) {
            this.autoCleanDays = autoCleanDays;
            return this;
        }
        public Integer getAutoCleanDays() {
            return this.autoCleanDays;
        }

        public ListPhotoStoresResponseBodyPhotoStores setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListPhotoStoresResponseBodyPhotoStores setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListPhotoStoresResponseBodyPhotoStores setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public ListPhotoStoresResponseBodyPhotoStores setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListPhotoStoresResponseBodyPhotoStores setBuckets(java.util.List<ListPhotoStoresResponseBodyPhotoStoresBuckets> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<ListPhotoStoresResponseBodyPhotoStoresBuckets> getBuckets() {
            return this.buckets;
        }

        public ListPhotoStoresResponseBodyPhotoStores setDefaultQuota(Long defaultQuota) {
            this.defaultQuota = defaultQuota;
            return this;
        }
        public Long getDefaultQuota() {
            return this.defaultQuota;
        }

        public ListPhotoStoresResponseBodyPhotoStores setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPhotoStoresResponseBodyPhotoStores setAutoCleanEnabled(Boolean autoCleanEnabled) {
            this.autoCleanEnabled = autoCleanEnabled;
            return this;
        }
        public Boolean getAutoCleanEnabled() {
            return this.autoCleanEnabled;
        }

        public ListPhotoStoresResponseBodyPhotoStores setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
