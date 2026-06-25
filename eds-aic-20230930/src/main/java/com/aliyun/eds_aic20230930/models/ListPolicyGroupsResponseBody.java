// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ListPolicyGroupsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policies.</p>
     */
    @NameInMap("PolicyGroupModel")
    public java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModel> policyGroupModel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7B9EFA4F-4305-5968-BAEE-BD8B8DE5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPolicyGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyGroupsResponseBody self = new ListPolicyGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPolicyGroupsResponseBody setPolicyGroupModel(java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModel> policyGroupModel) {
        this.policyGroupModel = policyGroupModel;
        return this;
    }
    public java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModel> getPolicyGroupModel() {
        return this.policyGroupModel;
    }

    public ListPolicyGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicyGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules extends TeaModel {
        /**
         * <p>The type of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The name of the application package or domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.baidu.com</p>
         */
        @NameInMap("Target")
        public String target;

        public static ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules self = new ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules();
            return TeaModel.build(map, self);
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy extends TeaModel {
        /**
         * <p>Indicates whether to manually configure a custom proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("CustomProxy")
        public String customProxy;

        /**
         * <p>The IPv4 address of the custom proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        @NameInMap("HostAddr")
        public String hostAddr;

        /**
         * <p>Indicates whether the network redirection feature is enabled. When this feature is enabled, network traffic is automatically redirected to the on-premises network by default.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        /**
         * <p>The port of the custom proxy. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>1145</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The password of the proxy. The password must be 1 to 256 in length and cannot contain Chinese character or space characters.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("ProxyPassword")
        public String proxyPassword;

        /**
         * <p>The type of the proxy protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>socks5</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        /**
         * <p>The username of the proxy. The name must be 1 to 256 in length and cannot contain Chinese character or space characters.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("ProxyUserName")
        public String proxyUserName;

        /**
         * <p>The proxy rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules> rules;

        public static ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy self = new ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy();
            return TeaModel.build(map, self);
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy setCustomProxy(String customProxy) {
            this.customProxy = customProxy;
            return this;
        }
        public String getCustomProxy() {
            return this.customProxy;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy setHostAddr(String hostAddr) {
            this.hostAddr = hostAddr;
            return this;
        }
        public String getHostAddr() {
            return this.hostAddr;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy setNetRedirect(String netRedirect) {
            this.netRedirect = netRedirect;
            return this;
        }
        public String getNetRedirect() {
            return this.netRedirect;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy setProxyPassword(String proxyPassword) {
            this.proxyPassword = proxyPassword;
            return this;
        }
        public String getProxyPassword() {
            return this.proxyPassword;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy setProxyUserName(String proxyUserName) {
            this.proxyUserName = proxyUserName;
            return this;
        }
        public String getProxyUserName() {
            return this.proxyUserName;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy setRules(java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules> getRules() {
            return this.rules;
        }

    }

    public static class ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources extends TeaModel {
        /**
         * <p>The instance group IDs.</p>
         */
        @NameInMap("AndroidInstanceGroupIds")
        public java.util.List<String> androidInstanceGroupIds;

        /**
         * <p>The matrix IDs.</p>
         */
        @NameInMap("CloudPhoneMatrixIds")
        public java.util.List<String> cloudPhoneMatrixIds;

        public static ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources self = new ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources();
            return TeaModel.build(map, self);
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources setAndroidInstanceGroupIds(java.util.List<String> androidInstanceGroupIds) {
            this.androidInstanceGroupIds = androidInstanceGroupIds;
            return this;
        }
        public java.util.List<String> getAndroidInstanceGroupIds() {
            return this.androidInstanceGroupIds;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources setCloudPhoneMatrixIds(java.util.List<String> cloudPhoneMatrixIds) {
            this.cloudPhoneMatrixIds = cloudPhoneMatrixIds;
            return this;
        }
        public java.util.List<String> getCloudPhoneMatrixIds() {
            return this.cloudPhoneMatrixIds;
        }

    }

    public static class ListPolicyGroupsResponseBodyPolicyGroupModelWatermark extends TeaModel {
        /**
         * <p>The font color of the watermark. Valid values: 0 to 16777215.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WatermarkColor")
        public Integer watermarkColor;

        /**
         * <p>The custom text for the watermark. The text can be up to 10 characters in length and cannot contain emoji characters.</p>
         * 
         * <strong>example:</strong>
         * <p>custom text</p>
         */
        @NameInMap("WatermarkCustomText")
        public String watermarkCustomText;

        /**
         * <p>The font size of the watermark. Valid values: 10 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("WatermarkFontSize")
        public Integer watermarkFontSize;

        /**
         * <p>Specifies whether to enable the screen watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkSwitch")
        public String watermarkSwitch;

        /**
         * <p>The opacity of the watermark. A larger value makes the watermark more opaque. Valid values: 10 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("WatermarkTransparencyValue")
        public Integer watermarkTransparencyValue;

        /**
         * <p>The content of the screen watermark.</p>
         */
        @NameInMap("WatermarkTypes")
        public java.util.List<String> watermarkTypes;

        public static ListPolicyGroupsResponseBodyPolicyGroupModelWatermark build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyGroupsResponseBodyPolicyGroupModelWatermark self = new ListPolicyGroupsResponseBodyPolicyGroupModelWatermark();
            return TeaModel.build(map, self);
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelWatermark setWatermarkColor(Integer watermarkColor) {
            this.watermarkColor = watermarkColor;
            return this;
        }
        public Integer getWatermarkColor() {
            return this.watermarkColor;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelWatermark setWatermarkCustomText(String watermarkCustomText) {
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }
        public String getWatermarkCustomText() {
            return this.watermarkCustomText;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelWatermark setWatermarkFontSize(Integer watermarkFontSize) {
            this.watermarkFontSize = watermarkFontSize;
            return this;
        }
        public Integer getWatermarkFontSize() {
            return this.watermarkFontSize;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelWatermark setWatermarkSwitch(String watermarkSwitch) {
            this.watermarkSwitch = watermarkSwitch;
            return this;
        }
        public String getWatermarkSwitch() {
            return this.watermarkSwitch;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelWatermark setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
            this.watermarkTransparencyValue = watermarkTransparencyValue;
            return this;
        }
        public Integer getWatermarkTransparencyValue() {
            return this.watermarkTransparencyValue;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelWatermark setWatermarkTypes(java.util.List<String> watermarkTypes) {
            this.watermarkTypes = watermarkTypes;
            return this;
        }
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

    }

    public static class ListPolicyGroupsResponseBodyPolicyGroupModel extends TeaModel {
        /**
         * <p>Specifies whether to enable the webcam redirection feature.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CameraRedirect")
        public String cameraRedirect;

        /**
         * <p>The read/write permissions on the clipboard.</p>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>The time when the policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-04 10:28:54</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The file transfer policy of the HTML5 client.</p>
         * 
         * <strong>example:</strong>
         * <p>download</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>The read/write permissions on the on-premises drive.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("LocalDrive")
        public String localDrive;

        /**
         * <p>Identifies whether the resolution is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("LockResolution")
        public String lockResolution;

        /**
         * <p>The network redirection policy.</p>
         */
        @NameInMap("NetRedirectPolicy")
        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy netRedirectPolicy;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-9q6o8qpiy8opkj****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Default policy.</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <p>The resources associated with the policy.</p>
         */
        @NameInMap("PolicyRelatedResources")
        public ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources policyRelatedResources;

        /**
         * <p>The height of the resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("SessionResolutionHeight")
        public Integer sessionResolutionHeight;

        /**
         * <p>The width of the resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("SessionResolutionWidth")
        public Integer sessionResolutionWidth;

        /**
         * <p>The screen watermark.</p>
         */
        @NameInMap("Watermark")
        public ListPolicyGroupsResponseBodyPolicyGroupModelWatermark watermark;

        public static ListPolicyGroupsResponseBodyPolicyGroupModel build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyGroupsResponseBodyPolicyGroupModel self = new ListPolicyGroupsResponseBodyPolicyGroupModel();
            return TeaModel.build(map, self);
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setCameraRedirect(String cameraRedirect) {
            this.cameraRedirect = cameraRedirect;
            return this;
        }
        public String getCameraRedirect() {
            return this.cameraRedirect;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setHtml5FileTransfer(String html5FileTransfer) {
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setLockResolution(String lockResolution) {
            this.lockResolution = lockResolution;
            return this;
        }
        public String getLockResolution() {
            return this.lockResolution;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setNetRedirectPolicy(ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy netRedirectPolicy) {
            this.netRedirectPolicy = netRedirectPolicy;
            return this;
        }
        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy getNetRedirectPolicy() {
            return this.netRedirectPolicy;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setPolicyRelatedResources(ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources policyRelatedResources) {
            this.policyRelatedResources = policyRelatedResources;
            return this;
        }
        public ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources getPolicyRelatedResources() {
            return this.policyRelatedResources;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setSessionResolutionHeight(Integer sessionResolutionHeight) {
            this.sessionResolutionHeight = sessionResolutionHeight;
            return this;
        }
        public Integer getSessionResolutionHeight() {
            return this.sessionResolutionHeight;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setSessionResolutionWidth(Integer sessionResolutionWidth) {
            this.sessionResolutionWidth = sessionResolutionWidth;
            return this;
        }
        public Integer getSessionResolutionWidth() {
            return this.sessionResolutionWidth;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModel setWatermark(ListPolicyGroupsResponseBodyPolicyGroupModelWatermark watermark) {
            this.watermark = watermark;
            return this;
        }
        public ListPolicyGroupsResponseBodyPolicyGroupModelWatermark getWatermark() {
            return this.watermark;
        }

    }

}
