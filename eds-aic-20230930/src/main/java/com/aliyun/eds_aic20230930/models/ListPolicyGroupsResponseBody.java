// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ListPolicyGroupsResponseBody extends TeaModel {
    /**
     * <p>The token that indicates the read position returned by the current call. An empty value indicates that all data has been read.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policy information.</p>
     */
    @NameInMap("PolicyGroupModel")
    public java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModel> policyGroupModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B9EFA4F-4305-5968-BAEE-BD8B8DE5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
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

    public static class ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies extends TeaModel {
        /**
         * <p>The access policy rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("AccessPolicyRuleId")
        public Long accessPolicyRuleId;

        /**
         * <p>The CIDR IP address block to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the access policy rule.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The access policy action. ALLOW indicates that access is allowed, and DENY indicates that access is denied.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The priority of the access policy rule.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies self = new ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies();
            return TeaModel.build(map, self);
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies setAccessPolicyRuleId(Long accessPolicyRuleId) {
            this.accessPolicyRuleId = accessPolicyRuleId;
            return this;
        }
        public Long getAccessPolicyRuleId() {
            return this.accessPolicyRuleId;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicyRules extends TeaModel {
        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The application package name or domain name.</p>
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
         * <p>Indicates whether a transparent proxy is manually configured.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("CustomProxy")
        public String customProxy;

        /**
         * <p>The transparent proxy IP address. The format is an IPv4 address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        @NameInMap("HostAddr")
        public String hostAddr;

        /**
         * <p>Indicates whether network redirection is enabled. If enabled, traffic is redirected to the client-side network by default.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        /**
         * <p>The transparent proxy port. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>1145</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The proxy password. The length ranges from 1 to 256 characters. Chinese characters and whitespace characters are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("ProxyPassword")
        public String proxyPassword;

        /**
         * <p>The proxy protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>socks5</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        /**
         * <p>The proxy username. The length ranges from 1 to 256 characters. Chinese characters and whitespace characters are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("ProxyUserName")
        public String proxyUserName;

        /**
         * <p>The proxy rule list.</p>
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
         * <p>The list of instance group IDs.</p>
         */
        @NameInMap("AndroidInstanceGroupIds")
        public java.util.List<String> androidInstanceGroupIds;

        /**
         * <p>The list of matrix IDs.</p>
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
         * <p>The watermark font color. Valid values: 0 to 16777215.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WatermarkColor")
        public Integer watermarkColor;

        /**
         * <p>The custom watermark content. The length cannot exceed 10 characters, and emoji characters are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>custom text</p>
         */
        @NameInMap("WatermarkCustomText")
        public String watermarkCustomText;

        /**
         * <p>The watermark font size. Valid values: 10 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("WatermarkFontSize")
        public Integer watermarkFontSize;

        /**
         * <p>The screen watermark switch.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkSwitch")
        public String watermarkSwitch;

        /**
         * <p>The watermark opacity. A larger value indicates lower transparency. Valid values: 10 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("WatermarkTransparencyValue")
        public Integer watermarkTransparencyValue;

        /**
         * <p>The screen watermark content.</p>
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
         * <p>The list of access policy rules.</p>
         */
        @NameInMap("AccessPolicies")
        public java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies> accessPolicies;

        /**
         * <p>Indicates whether local camera redirection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CameraRedirect")
        public String cameraRedirect;

        /**
         * <p>The clipboard permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-04 10:28:54</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The HTML5 client file transfer policy.</p>
         * 
         * <strong>example:</strong>
         * <p>download</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>The local disk mapping permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("LocalDrive")
        public String localDrive;

        /**
         * <p>The locked resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("LockResolution")
        public String lockResolution;

        /**
         * <p>The network redirection.</p>
         */
        @NameInMap("NetRedirectPolicy")
        public ListPolicyGroupsResponseBodyPolicyGroupModelNetRedirectPolicy netRedirectPolicy;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-9q6o8qpiy8opkj****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default policy</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <p>The resources associated with the policy.</p>
         */
        @NameInMap("PolicyRelatedResources")
        public ListPolicyGroupsResponseBodyPolicyGroupModelPolicyRelatedResources policyRelatedResources;

        /**
         * <p>The resolution height.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("SessionResolutionHeight")
        public Integer sessionResolutionHeight;

        /**
         * <p>The resolution width.</p>
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

        public ListPolicyGroupsResponseBodyPolicyGroupModel setAccessPolicies(java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public java.util.List<ListPolicyGroupsResponseBodyPolicyGroupModelAccessPolicies> getAccessPolicies() {
            return this.accessPolicies;
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
