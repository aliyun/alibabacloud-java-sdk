// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    @NameInMap("AppInfo")
    public CreateAppResponseBodyAppInfo appInfo;

    /**
     * <strong>example:</strong>
     * <p>126D4DDD-05A5-49B1-B18C-39C4A929****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setAppInfo(CreateAppResponseBodyAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public CreateAppResponseBodyAppInfo getAppInfo() {
        return this.appInfo;
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppResponseBodyAppInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <strong>example:</strong>
         * <p>com.test.ios</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <strong>example:</strong>
         * <p>2020-12-16T06:25:52Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2020-12-16T06:25:52Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>com.test.android</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ProductId")
        public Integer productId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static CreateAppResponseBodyAppInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyAppInfo self = new CreateAppResponseBodyAppInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public CreateAppResponseBodyAppInfo setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateAppResponseBodyAppInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAppResponseBodyAppInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppResponseBodyAppInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public CreateAppResponseBodyAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppResponseBodyAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public CreateAppResponseBodyAppInfo setProductId(Integer productId) {
            this.productId = productId;
            return this;
        }
        public Integer getProductId() {
            return this.productId;
        }

        public CreateAppResponseBodyAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
