// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppInfo")
    public CreateAppResponseBodyAppInfo appInfo;

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppResponseBody setAppInfo(CreateAppResponseBodyAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public CreateAppResponseBodyAppInfo getAppInfo() {
        return this.appInfo;
    }

    public static class CreateAppResponseBodyAppInfo extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("Description")
        public String description;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ProductId")
        public Integer productId;

        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static CreateAppResponseBodyAppInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyAppInfo self = new CreateAppResponseBodyAppInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CreateAppResponseBodyAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public CreateAppResponseBodyAppInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppResponseBodyAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public CreateAppResponseBodyAppInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAppResponseBodyAppInfo setProductId(Integer productId) {
            this.productId = productId;
            return this;
        }
        public Integer getProductId() {
            return this.productId;
        }

        public CreateAppResponseBodyAppInfo setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateAppResponseBodyAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppResponseBodyAppInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
