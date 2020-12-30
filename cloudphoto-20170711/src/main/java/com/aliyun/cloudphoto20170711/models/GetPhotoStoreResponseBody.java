// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPhotoStoreResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PhotoStore")
    public GetPhotoStoreResponseBodyPhotoStore photoStore;

    @NameInMap("Code")
    public String code;

    public static GetPhotoStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhotoStoreResponseBody self = new GetPhotoStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhotoStoreResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetPhotoStoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhotoStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhotoStoreResponseBody setPhotoStore(GetPhotoStoreResponseBodyPhotoStore photoStore) {
        this.photoStore = photoStore;
        return this;
    }
    public GetPhotoStoreResponseBodyPhotoStore getPhotoStore() {
        return this.photoStore;
    }

    public GetPhotoStoreResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetPhotoStoreResponseBodyPhotoStoreBuckets extends TeaModel {
        @NameInMap("Acl")
        public String acl;

        @NameInMap("State")
        public String state;

        @NameInMap("Region")
        public String region;

        @NameInMap("Name")
        public String name;

        public static GetPhotoStoreResponseBodyPhotoStoreBuckets build(java.util.Map<String, ?> map) throws Exception {
            GetPhotoStoreResponseBodyPhotoStoreBuckets self = new GetPhotoStoreResponseBodyPhotoStoreBuckets();
            return TeaModel.build(map, self);
        }

        public GetPhotoStoreResponseBodyPhotoStoreBuckets setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public GetPhotoStoreResponseBodyPhotoStoreBuckets setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetPhotoStoreResponseBodyPhotoStoreBuckets setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetPhotoStoreResponseBodyPhotoStoreBuckets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhotoStoreResponseBodyPhotoStore extends TeaModel {
        @NameInMap("AutoCleanDays")
        public Integer autoCleanDays;

        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("DefaultTrashQuota")
        public Long defaultTrashQuota;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Buckets")
        public java.util.List<GetPhotoStoreResponseBodyPhotoStoreBuckets> buckets;

        @NameInMap("DefaultQuota")
        public Long defaultQuota;

        @NameInMap("Name")
        public String name;

        @NameInMap("AutoCleanEnabled")
        public Boolean autoCleanEnabled;

        @NameInMap("Id")
        public Long id;

        public static GetPhotoStoreResponseBodyPhotoStore build(java.util.Map<String, ?> map) throws Exception {
            GetPhotoStoreResponseBodyPhotoStore self = new GetPhotoStoreResponseBodyPhotoStore();
            return TeaModel.build(map, self);
        }

        public GetPhotoStoreResponseBodyPhotoStore setAutoCleanDays(Integer autoCleanDays) {
            this.autoCleanDays = autoCleanDays;
            return this;
        }
        public Integer getAutoCleanDays() {
            return this.autoCleanDays;
        }

        public GetPhotoStoreResponseBodyPhotoStore setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public GetPhotoStoreResponseBodyPhotoStore setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public GetPhotoStoreResponseBodyPhotoStore setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public GetPhotoStoreResponseBodyPhotoStore setDefaultTrashQuota(Long defaultTrashQuota) {
            this.defaultTrashQuota = defaultTrashQuota;
            return this;
        }
        public Long getDefaultTrashQuota() {
            return this.defaultTrashQuota;
        }

        public GetPhotoStoreResponseBodyPhotoStore setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetPhotoStoreResponseBodyPhotoStore setBuckets(java.util.List<GetPhotoStoreResponseBodyPhotoStoreBuckets> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<GetPhotoStoreResponseBodyPhotoStoreBuckets> getBuckets() {
            return this.buckets;
        }

        public GetPhotoStoreResponseBodyPhotoStore setDefaultQuota(Long defaultQuota) {
            this.defaultQuota = defaultQuota;
            return this;
        }
        public Long getDefaultQuota() {
            return this.defaultQuota;
        }

        public GetPhotoStoreResponseBodyPhotoStore setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPhotoStoreResponseBodyPhotoStore setAutoCleanEnabled(Boolean autoCleanEnabled) {
            this.autoCleanEnabled = autoCleanEnabled;
            return this;
        }
        public Boolean getAutoCleanEnabled() {
            return this.autoCleanEnabled;
        }

        public GetPhotoStoreResponseBodyPhotoStore setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
