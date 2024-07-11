// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionRequest extends TeaModel {
    /**
     * <p>适配文件ID。此功能灰度开放，如未约定使用请勿传入。</p>
     * 
     * <strong>example:</strong>
     * <p>501716211209548966XXXX</p>
     */
    @NameInMap("AdapterFileId")
    public String adapterFileId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13027XXXX</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>35067XXXX</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <strong>example:</strong>
     * <p>192.168.XXX.XXX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ADE0XXXX</p>
     */
    @NameInMap("CustomSessionId")
    public String customSessionId;

    /**
     * <strong>example:</strong>
     * <p>2YEF0XXXX</p>
     */
    @NameInMap("CustomUserId")
    public String customUserId;

    /**
     * <strong>example:</strong>
     * <p>huadong</p>
     */
    @NameInMap("DistrictId")
    public String districtId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePostpaid")
    public Boolean enablePostpaid;

    /**
     * <p>项目ID。如果已将应用关联到项目，创建会话时需填写正确的项目ID。</p>
     * 
     * <strong>example:</strong>
     * <p>d9a8****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("StartParameters")
    public java.util.List<CreateAppSessionRequestStartParameters> startParameters;

    @NameInMap("SystemInfo")
    public java.util.List<CreateAppSessionRequestSystemInfo> systemInfo;

    /**
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static CreateAppSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionRequest self = new CreateAppSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionRequest setAdapterFileId(String adapterFileId) {
        this.adapterFileId = adapterFileId;
        return this;
    }
    public String getAdapterFileId() {
        return this.adapterFileId;
    }

    public CreateAppSessionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppSessionRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppSessionRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public CreateAppSessionRequest setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public CreateAppSessionRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public CreateAppSessionRequest setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public CreateAppSessionRequest setEnablePostpaid(Boolean enablePostpaid) {
        this.enablePostpaid = enablePostpaid;
        return this;
    }
    public Boolean getEnablePostpaid() {
        return this.enablePostpaid;
    }

    public CreateAppSessionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAppSessionRequest setStartParameters(java.util.List<CreateAppSessionRequestStartParameters> startParameters) {
        this.startParameters = startParameters;
        return this;
    }
    public java.util.List<CreateAppSessionRequestStartParameters> getStartParameters() {
        return this.startParameters;
    }

    public CreateAppSessionRequest setSystemInfo(java.util.List<CreateAppSessionRequestSystemInfo> systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }
    public java.util.List<CreateAppSessionRequestSystemInfo> getSystemInfo() {
        return this.systemInfo;
    }

    public CreateAppSessionRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public static class CreateAppSessionRequestStartParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>startArgument</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>exampleValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAppSessionRequestStartParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionRequestStartParameters self = new CreateAppSessionRequestStartParameters();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionRequestStartParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionRequestStartParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionRequestSystemInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>utdid</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>OE0usD+APXXXX</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAppSessionRequestSystemInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionRequestSystemInfo self = new CreateAppSessionRequestSystemInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionRequestSystemInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionRequestSystemInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
