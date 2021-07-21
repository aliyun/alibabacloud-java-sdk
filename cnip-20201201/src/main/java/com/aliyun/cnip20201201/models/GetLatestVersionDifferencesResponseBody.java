// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetLatestVersionDifferencesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetLatestVersionDifferencesResponseBodyData> data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetLatestVersionDifferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLatestVersionDifferencesResponseBody self = new GetLatestVersionDifferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLatestVersionDifferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLatestVersionDifferencesResponseBody setData(java.util.List<GetLatestVersionDifferencesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLatestVersionDifferencesResponseBodyData> getData() {
        return this.data;
    }

    public GetLatestVersionDifferencesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetLatestVersionDifferencesResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetLatestVersionDifferencesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLatestVersionDifferencesResponseBodyData extends TeaModel {
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

        public static GetLatestVersionDifferencesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLatestVersionDifferencesResponseBodyData self = new GetLatestVersionDifferencesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLatestVersionDifferencesResponseBodyData setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetLatestVersionDifferencesResponseBodyData setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public GetLatestVersionDifferencesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetLatestVersionDifferencesResponseBodyData setPreVersion(String preVersion) {
            this.preVersion = preVersion;
            return this;
        }
        public String getPreVersion() {
            return this.preVersion;
        }

        public GetLatestVersionDifferencesResponseBodyData setDifference(String difference) {
            this.difference = difference;
            return this;
        }
        public String getDifference() {
            return this.difference;
        }

        public GetLatestVersionDifferencesResponseBodyData setUpgradeFlag(Boolean upgradeFlag) {
            this.upgradeFlag = upgradeFlag;
            return this;
        }
        public Boolean getUpgradeFlag() {
            return this.upgradeFlag;
        }

        public GetLatestVersionDifferencesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
