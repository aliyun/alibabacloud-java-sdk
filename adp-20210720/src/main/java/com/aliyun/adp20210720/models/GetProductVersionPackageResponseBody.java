// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetProductVersionPackageResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetProductVersionPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageResponseBody self = new GetProductVersionPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductVersionPackageResponseBody setData(GetProductVersionPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductVersionPackageResponseBodyData getData() {
        return this.data;
    }

    public GetProductVersionPackageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetProductVersionPackageResponseBodyData extends TeaModel {
        @NameInMap("packageContentType")
        public String packageContentType;

        @NameInMap("packageSize")
        public String packageSize;

        @NameInMap("packageStatus")
        public String packageStatus;

        @NameInMap("packageType")
        public String packageType;

        @NameInMap("packageUID")
        public String packageUID;

        @NameInMap("packageURL")
        public String packageURL;

        @NameInMap("platform")
        public Platform platform;

        @NameInMap("platformList")
        public java.util.List<Platform> platformList;

        public static GetProductVersionPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionPackageResponseBodyData self = new GetProductVersionPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductVersionPackageResponseBodyData setPackageContentType(String packageContentType) {
            this.packageContentType = packageContentType;
            return this;
        }
        public String getPackageContentType() {
            return this.packageContentType;
        }

        public GetProductVersionPackageResponseBodyData setPackageSize(String packageSize) {
            this.packageSize = packageSize;
            return this;
        }
        public String getPackageSize() {
            return this.packageSize;
        }

        public GetProductVersionPackageResponseBodyData setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

        public GetProductVersionPackageResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetProductVersionPackageResponseBodyData setPackageUID(String packageUID) {
            this.packageUID = packageUID;
            return this;
        }
        public String getPackageUID() {
            return this.packageUID;
        }

        public GetProductVersionPackageResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public GetProductVersionPackageResponseBodyData setPlatform(Platform platform) {
            this.platform = platform;
            return this;
        }
        public Platform getPlatform() {
            return this.platform;
        }

        public GetProductVersionPackageResponseBodyData setPlatformList(java.util.List<Platform> platformList) {
            this.platformList = platformList;
            return this;
        }
        public java.util.List<Platform> getPlatformList() {
            return this.platformList;
        }

    }

}
