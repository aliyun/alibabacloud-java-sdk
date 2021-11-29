// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionDifferencesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetProductVersionDifferencesResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetProductVersionDifferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionDifferencesResponseBody self = new GetProductVersionDifferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionDifferencesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductVersionDifferencesResponseBody setData(java.util.List<GetProductVersionDifferencesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProductVersionDifferencesResponseBodyData> getData() {
        return this.data;
    }

    public GetProductVersionDifferencesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetProductVersionDifferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductVersionDifferencesResponseBodyData extends TeaModel {
        // 组件名称
        @NameInMap("componentName")
        public String componentName;

        // 变更类型，ENUM 类型
        @NameInMap("difference")
        public String difference;

        // 变更描述信息
        @NameInMap("message")
        public String message;

        // 组件之前的版本号
        @NameInMap("preVersion")
        public String preVersion;

        // 组件实例名称
        @NameInMap("releaseName")
        public String releaseName;

        @NameInMap("upgradeFlag")
        public Boolean upgradeFlag;

        // 组件当前的版本号
        @NameInMap("version")
        public String version;

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

        public GetProductVersionDifferencesResponseBodyData setDifference(String difference) {
            this.difference = difference;
            return this;
        }
        public String getDifference() {
            return this.difference;
        }

        public GetProductVersionDifferencesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetProductVersionDifferencesResponseBodyData setPreVersion(String preVersion) {
            this.preVersion = preVersion;
            return this;
        }
        public String getPreVersion() {
            return this.preVersion;
        }

        public GetProductVersionDifferencesResponseBodyData setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public GetProductVersionDifferencesResponseBodyData setUpgradeFlag(Boolean upgradeFlag) {
            this.upgradeFlag = upgradeFlag;
            return this;
        }
        public Boolean getUpgradeFlag() {
            return this.upgradeFlag;
        }

        public GetProductVersionDifferencesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
