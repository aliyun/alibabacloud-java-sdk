// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionDifferencesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetProductVersionDifferencesResponseBodyData> data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static GetProductVersionDifferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionDifferencesResponseBody self = new GetProductVersionDifferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionDifferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProductVersionDifferencesResponseBody setData(java.util.List<GetProductVersionDifferencesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProductVersionDifferencesResponseBodyData> getData() {
        return this.data;
    }

    public GetProductVersionDifferencesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductVersionDifferencesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetProductVersionDifferencesResponseBodyData extends TeaModel {
        // 组件名称
        @NameInMap("componentName")
        public String componentName;

        // 组件实例名称
        @NameInMap("releaseName")
        public String releaseName;

        // 组件当前的版本号
        @NameInMap("version")
        public String version;

        // 组件之前的版本号
        @NameInMap("preVersion")
        public String preVersion;

        // 变更类型，ENUM 类型
        @NameInMap("difference")
        public String difference;

        @NameInMap("upgradeFlag")
        public Boolean upgradeFlag;

        // 变更描述信息
        @NameInMap("message")
        public String message;

        public static GetProductVersionDifferencesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionDifferencesResponseBodyData self = new GetProductVersionDifferencesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductVersionDifferencesResponseBodyData setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetProductVersionDifferencesResponseBodyData setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public GetProductVersionDifferencesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetProductVersionDifferencesResponseBodyData setPreVersion(String preVersion) {
            this.preVersion = preVersion;
            return this;
        }
        public String getPreVersion() {
            return this.preVersion;
        }

        public GetProductVersionDifferencesResponseBodyData setDifference(String difference) {
            this.difference = difference;
            return this;
        }
        public String getDifference() {
            return this.difference;
        }

        public GetProductVersionDifferencesResponseBodyData setUpgradeFlag(Boolean upgradeFlag) {
            this.upgradeFlag = upgradeFlag;
            return this;
        }
        public Boolean getUpgradeFlag() {
            return this.upgradeFlag;
        }

        public GetProductVersionDifferencesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
