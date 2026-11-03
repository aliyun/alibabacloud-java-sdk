// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCenterPolicyListResponseBody extends TeaModel {
    /**
     * <p>雲端電腦原則的詳細資訊。</p>
     */
    @NameInMap("DescribePolicyGroups")
    public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroups> describePolicyGroups;

    /**
     * <p>請求 ID。</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>查詢結果總數。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenterPolicyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenterPolicyListResponseBody self = new DescribeCenterPolicyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenterPolicyListResponseBody setDescribePolicyGroups(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroups> describePolicyGroups) {
        this.describePolicyGroups = describePolicyGroups;
        return this;
    }
    public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroups> getDescribePolicyGroups() {
        return this.describePolicyGroups;
    }

    public DescribeCenterPolicyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenterPolicyListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAppScreenshotBuckets extends TeaModel {
        /**
         * <p>Bucket 名稱。</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket-01</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>使用者 OSS Bucket 所在地域，必須與 Bucket 的實際地域一致。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("BucketRegionId")
        public String bucketRegionId;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAppScreenshotBuckets build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAppScreenshotBuckets self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAppScreenshotBuckets();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAppScreenshotBuckets setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAppScreenshotBuckets setBucketRegionId(String bucketRegionId) {
            this.bucketRegionId = bucketRegionId;
            return this;
        }
        public String getBucketRegionId() {
            return this.bucketRegionId;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules extends TeaModel {
        /**
         * <p>用戶端存取 IP 位址區段。格式為 CIDR 格式的 IPv4 位址區段。</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>用戶端存取 IP 位址區段備註資訊。</p>
         * 
         * <strong>example:</strong>
         * <p>公司辦公網段</p>
         */
        @NameInMap("Description")
        public String description;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules extends TeaModel {
        /**
         * <p>安全性群組管控規則的對象，CIDR 格式的 IPv4 位址區段。</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>安全性群組管控規則的描述資訊。</p>
         * 
         * <strong>example:</strong>
         * <p>允許存取內網研發環境</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>安全性群組管控規則的通訊協定類型。</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>安全性群組管控規則的授權原則。</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>安全性群組管控規則的連接埠範圍。</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>安全性群組管控規則的優先順序，數字越小，代表優先順序越高。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>安全性群組管控規則的規則方向。</p>
         * 
         * <strong>example:</strong>
         * <p>inflow</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes extends TeaModel {
        /**
         * <p>用戶端類型。</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>是否允許某一類型的用戶端登入雲端桌面。</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects extends TeaModel {
        /**
         * <p>周邊裝置類型。</p>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>重新導向類型。</p>
         * 
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules extends TeaModel {
        /**
         * <p>裝置名稱。</p>
         * 
         * <strong>example:</strong>
         * <p>sandisk</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>產品 ID。</p>
         * 
         * <strong>example:</strong>
         * <p>0x55b1</p>
         */
        @NameInMap("DevicePid")
        public String devicePid;

        /**
         * <p>周邊裝置類型。</p>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>生產廠商 ID。參見 <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>。</p>
         * 
         * <strong>example:</strong>
         * <p>0x0781</p>
         */
        @NameInMap("DeviceVid")
        public String deviceVid;

        /**
         * <p>連結最佳化指令。</p>
         * 
         * <strong>example:</strong>
         * <p>2:0</p>
         */
        @NameInMap("OptCommand")
        public String optCommand;

        /**
         * <p>裝置規則適用的平台類型。</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("Platforms")
        public String platforms;

        /**
         * <p>重新導向類型。</p>
         * 
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setDevicePid(String devicePid) {
            this.devicePid = devicePid;
            return this;
        }
        public String getDevicePid() {
            return this.devicePid;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setDeviceVid(String deviceVid) {
            this.deviceVid = deviceVid;
            return this;
        }
        public String getDeviceVid() {
            return this.deviceVid;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setOptCommand(String optCommand) {
            this.optCommand = optCommand;
            return this;
        }
        public String getOptCommand() {
            return this.optCommand;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule extends TeaModel {
        /**
         * <p>原則描述。</p>
         * 
         * <strong>example:</strong>
         * <p>測試規則</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>網域。</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>解析原則。</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule extends TeaModel {
        /**
         * <p>網域。</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>重新導向策略。</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>規則類型。</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule extends TeaModel {
        /**
         * <p>規則描述。</p>
         * 
         * <strong>example:</strong>
         * <p>測試規則</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>產品 ID。</p>
         * 
         * <strong>example:</strong>
         * <p>08**</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>USB 重新導向類型。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        /**
         * <p>USB 重新導向規則類型。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        /**
         * <p>生產廠商 ID。參見 <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>。</p>
         * 
         * <strong>example:</strong>
         * <p>04**</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setUsbRedirectType(Long usbRedirectType) {
            this.usbRedirectType = usbRedirectType;
            return this;
        }
        public Long getUsbRedirectType() {
            return this.usbRedirectType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setUsbRuleType(Long usbRuleType) {
            this.usbRuleType = usbRuleType;
            return this;
        }
        public Long getUsbRuleType() {
            return this.usbRuleType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroups extends TeaModel {
        /**
         * <p>學術代理功能開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AcademicProxy")
        public String academicProxy;

        /**
         * <p>使用者連線雲端電腦後是否具有管理員權限。</p>
         * <blockquote>
         * <p>該功能處於定向邀測中，暫不對外開放。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("AdminAccess")
        public String adminAccess;

        /**
         * <p>全螢幕模式下管理員鍵盤控制開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AdminKeyboardOnFullScreen")
        public String adminKeyboardOnFullScreen;

        /**
         * <p>Windows 系統內管理員鍵盤控制開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AdminKeyboardOnWindows")
        public String adminKeyboardOnWindows;

        /**
         * <p>管理員監控開關。取值範圍：</p>
         * <ul>
         * <li>1：開啟。</li>
         * <li>0：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AdminMonitor")
        public Integer adminMonitor;

        /**
         * <p>是否開啟防截圖功能。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AppContentProtection")
        public String appContentProtection;

        /**
         * <p>防截圖行動裝置截圖自訂 OSS Bucket 清單。</p>
         */
        @NameInMap("AppScreenshotBuckets")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAppScreenshotBuckets> appScreenshotBuckets;

        /**
         * <p>用戶端存取 IP 白名單。</p>
         */
        @NameInMap("AuthorizeAccessPolicyRules")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        /**
         * <p>安全性群組管控規則清單。</p>
         */
        @NameInMap("AuthorizeSecurityPolicyRules")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        /**
         * <p>用戶端自動重新連線開關。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AutoReconnect")
        public String autoReconnect;

        /**
         * <p>自動儲存行動裝置截圖。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AutoSaveAppScreenshot")
        public String autoSaveAppScreenshot;

        /**
         * <p>是否開啟本機攝影機重新導向。</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CameraRedirect")
        public String cameraRedirect;

        /**
         * <p>用戶端控制選單顯示開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ClientControlMenu")
        public String clientControlMenu;

        /**
         * <p>用戶端建立自訂快照功能開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientCreateSnapshot")
        public String clientCreateSnapshot;

        /**
         * <p>用戶端休眠選單開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientHibernate")
        public String clientHibernate;

        /**
         * <p>用戶端重新啟動選單開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientRestart")
        public String clientRestart;

        /**
         * <p>用戶端關機選單開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientShutdown")
        public String clientShutdown;

        /**
         * <p>登入方式管控規則。</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes> clientTypes;

        /**
         * <p>剪貼簿權限。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>設計及 3D 應用場景選擇是否開啟色彩增強。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ColorEnhancement")
        public String colorEnhancement;

        /**
         * <p>本機驅動程式剪貼簿功能開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("CpdDriveClipboard")
        public String cpdDriveClipboard;

        /**
         * <p>CPU 降頻時長，取值範圍： 30\~120。單位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("CpuDownGradeDuration")
        public Integer cpuDownGradeDuration;

        /**
         * <p>CPU 負載保護開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("CpuOverload")
        public String cpuOverload;

        /**
         * <p>處理程序名稱。</p>
         */
        @NameInMap("CpuProcessors")
        public java.util.List<String> cpuProcessors;

        /**
         * <p>CPU 保護模式開關。</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CpuProtectedMode")
        public String cpuProtectedMode;

        /**
         * <p>CPU 整體使用率百分比，取值範圍： 70\~90。</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("CpuRateLimit")
        public Integer cpuRateLimit;

        /**
         * <p>CPU 整體取樣時長，取值範圍： 10\~60。單位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CpuSampleDuration")
        public Integer cpuSampleDuration;

        /**
         * <p>CPU 單核心使用率百分比，取值範圍： 70\~100。</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("CpuSingleRateLimit")
        public Integer cpuSingleRateLimit;

        /**
         * <p>已關聯該原則的雲端電腦數量。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopCount")
        public Integer desktopCount;

        /**
         * <p>已關聯該原則的雲端電腦集區數量。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopGroupCount")
        public Integer desktopGroupCount;

        /**
         * <p>周邊裝置連線提示控制。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DeviceConnectHint")
        public String deviceConnectHint;

        /**
         * <p>裝置重新導向規則。</p>
         */
        @NameInMap("DeviceRedirects")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects> deviceRedirects;

        /**
         * <p>自訂周邊裝置規則。</p>
         */
        @NameInMap("DeviceRules")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules> deviceRules;

        /**
         * <p>工作階段斷線保留。</p>
         * <blockquote>
         * <p>僅適用於雲端應用程式原則。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>persistent</p>
         */
        @NameInMap("DisconnectKeepSession")
        public String disconnectKeepSession;

        /**
         * <p>工作階段斷線保留時長。單位：秒。</p>
         * <blockquote>
         * <p>僅適用於雲端應用程式原則。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("DisconnectKeepSessionTime")
        public Integer disconnectKeepSessionTime;

        /**
         * <p>磁碟負載保護開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DiskOverload")
        public String diskOverload;

        /**
         * <p>顯示模式。</p>
         * 
         * <strong>example:</strong>
         * <p>adminCustom</p>
         */
        @NameInMap("DisplayMode")
        public String displayMode;

        /**
         * <p>網域解析生效欄位。</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainRegisterValue")
        public String domainRegisterValue;

        /**
         * <p>網域解析原則詳情。</p>
         */
        @NameInMap("DomainResolveRule")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule> domainResolveRule;

        /**
         * <p>網域解析原則開關。</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DomainResolveRuleType")
        public String domainResolveRuleType;

        /**
         * <p>使用者請求管理員協助。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("EndUserApplyAdminCoordinate")
        public String endUserApplyAdminCoordinate;

        /**
         * <p>關聯的終端使用者數量。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EndUserCount")
        public String endUserCount;

        /**
         * <p>同一個辦公網路下使用者共享雲端電腦。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("EndUserGroupCoordinate")
        public String endUserGroupCoordinate;

        /**
         * <p>外接儲存裝置使用開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ExternalDrive")
        public String externalDrive;

        /**
         * <p>檔案遷移。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileMigrate")
        public String fileMigrate;

        /**
         * <p>檔案傳輸功能的服務位址。</p>
         * 
         * <strong>example:</strong>
         * <p>filetransfer.example.com</p>
         */
        @NameInMap("FileTransferAddress")
        public String fileTransferAddress;

        /**
         * <p>單次傳入雲端電腦的檔案大小限制，需與傳入單位參數配合使用。</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FileTransferInSize")
        public String fileTransferInSize;

        /**
         * <p>單次傳入雲端電腦的檔案大小限制單位。</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("FileTransferInUnit")
        public String fileTransferInUnit;

        /**
         * <p>單次從雲端電腦傳出的檔案大小限制，需與傳出單位參數配合使用。</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FileTransferOutSize")
        public String fileTransferOutSize;

        /**
         * <p>單次從雲端電腦傳出的檔案大小限制單位。</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("FileTransferOutUnit")
        public String fileTransferOutUnit;

        /**
         * <p>檔案傳輸大小限制開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileTransferSizeLimit")
        public String fileTransferSizeLimit;

        /**
         * <p>檔案傳輸速度檔位。</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("FileTransferSpeed")
        public String fileTransferSpeed;

        /**
         * <p>用戶端設定的檔案傳輸速度生效位置。</p>
         * 
         * <strong>example:</strong>
         * <p>client</p>
         */
        @NameInMap("FileTransferSpeedLocation")
        public String fileTransferSpeedLocation;

        /**
         * <p>檔案同步開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FolderSync")
        public String folderSync;

        /**
         * <p>是否為圖形型規格雲端電腦開啟畫質策略。對雲端電腦效能和使用體驗要求較高時，例如專業設計場景下，建議開啟該策略。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("GpuAcceleration")
        public String gpuAcceleration;

        /**
         * <p>懸浮球設定訊息提示開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("HoverConfigMsg")
        public String hoverConfigMsg;

        /**
         * <p>懸浮球休眠按鈕開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("HoverHibernate")
        public String hoverHibernate;

        /**
         * <p>懸浮球重新啟動按鈕開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("HoverRestart")
        public String hoverRestart;

        /**
         * <p>懸浮球關機按鈕開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("HoverShutdown")
        public String hoverShutdown;

        /**
         * <p>Web用戶端存取策略。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Html5Access")
        public String html5Access;

        /**
         * <p>Web用戶端檔案傳輸策略。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>網路通訊協定。</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("InternetCommunicationProtocol")
        public String internetCommunicationProtocol;

        /**
         * <p>網路印表機功能開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("InternetPrinter")
        public String internetPrinter;

        /**
         * <p>懸浮球鍵盤控制開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("KeyboardControl")
        public String keyboardControl;

        /**
         * <p>KMS 伺服器開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("KmsServer")
        public String kmsServer;

        /**
         * <p>KMS 伺服器設定，格式為位址:連接埠。</p>
         * 
         * <strong>example:</strong>
         * <p>kms.example.com:1688</p>
         */
        @NameInMap("KmsServerConfig")
        public String kmsServerConfig;

        /**
         * <p>本機磁碟映射權限。</p>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("LocalDrive")
        public String localDrive;

        /**
         * <p>雲端電腦由於客觀原因造成中斷連線的最大連線重試時間。取值範圍：30\~7200，單位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MaxReconnectTime")
        public Integer maxReconnectTime;

        /**
         * <p>開啟 MCP 服務。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("McpService")
        public String mcpService;

        /**
         * <p>單個處理程序記憶體降頻時長，取值範圍： 30\~120。單位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemoryDownGradeDuration")
        public Integer memoryDownGradeDuration;

        /**
         * <p>記憶體負載保護開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MemoryOverload")
        public String memoryOverload;

        /**
         * <p>處理程序名稱。</p>
         */
        @NameInMap("MemoryProcessors")
        public java.util.List<String> memoryProcessors;

        /**
         * <p>記憶體保護模式開關。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MemoryProtectedMode")
        public String memoryProtectedMode;

        /**
         * <p>記憶體整體使用率百分比，取值範圍： 70\~90。</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("MemoryRateLimit")
        public Integer memoryRateLimit;

        /**
         * <p>記憶體整體取樣時長，取值範圍： 30\~60。單位：秒。</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemorySampleDuration")
        public Integer memorySampleDuration;

        /**
         * <p>單個處理程序記憶體使用率百分比，取值範圍： 30\~60。</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemorySingleRateLimit")
        public Integer memorySingleRateLimit;

        /**
         * <p>透過行動端（Android用戶端&lt;props=&quot;china&quot;&gt;和iOS用戶端）連線雲端電腦時，是否在雲端電腦懸浮球內提供重新啟動按鈕。</p>
         * <blockquote>
         * <p>僅適用於V7.4或更高版本的行動端。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileRestart")
        public String mobileRestart;

        /**
         * <p>行動端Windows 安全性控制開關。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileSafeMenu")
        public String mobileSafeMenu;

        /**
         * <p>透過行動端（Android用戶端&lt;props=&quot;china&quot;&gt;和iOS用戶端）連線雲端電腦時，是否在雲端電腦懸浮球內提供關機按鈕。</p>
         * <blockquote>
         * <p>僅適用於V7.4或更高版本的行動端。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileShutdown")
        public String mobileShutdown;

        /**
         * <p>行動端無影管家開關。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileWuyingKeeper")
        public String mobileWuyingKeeper;

        /**
         * <p>行動端小穎的開關。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileWyAssistant")
        public String mobileWyAssistant;

        /**
         * <p>模型庫功能開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ModelLibrary")
        public String modelLibrary;

        /**
         * <p>多螢幕顯示功能開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MultiScreen")
        public String multiScreen;

        /**
         * <p>策略名稱。</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicyGroupName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>網路重新導向。</p>
         * <blockquote>
         * <p>該功能處於定向邀測中，暫不對外開放。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        /**
         * <p>網路重新導向策略詳細資訊。</p>
         * <blockquote>
         * <p>該功能處於定向邀測中，暫不對外開放。</p>
         * </blockquote>
         */
        @NameInMap("NetRedirectRule")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule> netRedirectRule;

        /**
         * <p>網路印表機功能開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetworkPrinter")
        public String networkPrinter;

        /**
         * <p>無操作中斷連線。</p>
         * <blockquote>
         * <p>僅適用於雲端應用策略。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NoOperationDisconnect")
        public String noOperationDisconnect;

        /**
         * <p>無操作中斷連線時長。單位：秒。</p>
         * <blockquote>
         * <p>僅適用於雲端應用策略。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("NoOperationDisconnectTime")
        public Integer noOperationDisconnectTime;

        /**
         * <p>關聯的組織數量。</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OrganizationCount")
        public String organizationCount;

        /**
         * <p>策略ID。</p>
         * 
         * <strong>example:</strong>
         * <p>pg-gx2x1dhsmthe9****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>策略類型。</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("PolicyGroupType")
        public String policyGroupType;

        /**
         * <p>雲端電腦策略狀態。</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>連接埠代理功能開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("PortProxy")
        public String portProxy;

        /**
         * <p>印表機彈出視窗提示。取值範圍：</p>
         * <ul>
         * <li>default：預設值。</li>
         * <li>off：關閉。</li>
         * <li>custom：自訂。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("PrinterAlert")
        public String printerAlert;

        /**
         * <p>印表機彈出視窗提示內容。</p>
         * 
         * <strong>example:</strong>
         * <p>Print Content.</p>
         */
        @NameInMap("PrinterAlertContent")
        public String printerAlertContent;

        /**
         * <p>印表機彈出視窗提示標題。</p>
         * 
         * <strong>example:</strong>
         * <p>Print Title</p>
         */
        @NameInMap("PrinterAlertTitle")
        public String printerAlertTitle;

        /**
         * <p>印表機重新導向策略。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("PrinterRedirection")
        public String printerRedirection;

        /**
         * <p>設計及3D應用場景選擇是否開啟畫質增強。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("QualityEnhancement")
        public String qualityEnhancement;

        /**
         * <p>是否開啟自訂螢幕錄影。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RecordContent")
        public String recordContent;

        /**
         * <p>自訂螢幕錄影的檔案過期時間，預設30天。</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RecordContentExpires")
        public Long recordContentExpires;

        /**
         * <p>螢幕錄影稽核中偵測到事件發生後螢幕錄影的時長。單位：分鐘。取值範圍：10\~60。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordEventDuration")
        public Integer recordEventDuration;

        /**
         * <p>螢幕錄影稽核中的檔案監控絕對路徑。</p>
         */
        @NameInMap("RecordEventFilePaths")
        public java.util.List<String> recordEventFilePaths;

        /**
         * <p>螢幕錄影稽核中的登錄檔監控絕對路徑。</p>
         */
        @NameInMap("RecordEventRegisters")
        public java.util.List<String> recordEventRegisters;

        /**
         * <p>是否開啟螢幕錄影。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Recording")
        public String recording;

        /**
         * <p>錄製雲端電腦聲音選項。</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RecordingAudio")
        public String recordingAudio;

        /**
         * <p>螢幕錄影檔案閱覽時長，單位為分鐘。錄製檔案會根據您設定的時長自動分割並上傳至儲存空間，檔案達到300MB時優先滾動更新。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        /**
         * <p>螢幕錄影結束時間，取值：HH:MM:SS。只有Recording取值是period時，該傳回值有實際意義。</p>
         * 
         * <strong>example:</strong>
         * <p>08:59:00</p>
         */
        @NameInMap("RecordingEndTime")
        public String recordingEndTime;

        /**
         * <p>螢幕錄影檔案的保留時間。取值範圍為1\~180天。</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("RecordingExpires")
        public Long recordingExpires;

        /**
         * <p>螢幕錄影幀率。單位：FPS（幀/秒）。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecordingFps")
        public Long recordingFps;

        /**
         * <p>螢幕錄影開始時間，取值：HH:MM:SS。只有Recording取值是period時，該傳回值有實際意義。</p>
         * 
         * <strong>example:</strong>
         * <p>08:00:00</p>
         */
        @NameInMap("RecordingStartTime")
        public String recordingStartTime;

        /**
         * <p>提示終端客戶已開啟螢幕錄影。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RecordingUserNotify")
        public String recordingUserNotify;

        /**
         * <p>提示終端客戶開啟螢幕錄影的資訊。</p>
         * 
         * <strong>example:</strong>
         * <p>螢幕錄影已開啟</p>
         */
        @NameInMap("RecordingUserNotifyMessage")
        public String recordingUserNotifyMessage;

        /**
         * <p>遠端協助鍵盤與滑鼠控制權限。</p>
         * 
         * <strong>example:</strong>
         * <p>fullControl</p>
         */
        @NameInMap("RemoteCoordinate")
        public String remoteCoordinate;

        /**
         * <p>重置雲端電腦。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ResetDesktop")
        public String resetDesktop;

        /**
         * <p>螢幕解析度的 DPI 值。</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("ResolutionDpi")
        public Integer resolutionDpi;

        /**
         * <p>解析度的高度。單位：畫素。</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <p>解析度類型。</p>
         * 
         * <strong>example:</strong>
         * <p>adaptive</p>
         */
        @NameInMap("ResolutionModel")
        public String resolutionModel;

        /**
         * <p>解析度的寬度。單位：畫素。</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        /**
         * <p>已關聯該策略的資源群組數量。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceGroupCount")
        public Integer resourceGroupCount;

        /**
         * <p>安全中心快速鍵開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("SafeMenu")
        public String safeMenu;

        /**
         * <p>策略的生效範圍。</p>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>生效的 CIDR Block。</p>
         */
        @NameInMap("ScopeValue")
        public java.util.List<String> scopeValue;

        /**
         * <p>螢幕顯示模式。</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("ScreenDisplayMode")
        public String screenDisplayMode;

        /**
         * <p>日常辦公場景選擇，是否開啟平滑度增強。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("SmoothEnhancement")
        public String smoothEnhancement;

        /**
         * <p>是否在雲端電腦懸浮球內提供狀態監控功能入口。</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("StatusMonitor")
        public String statusMonitor;

        /**
         * <p>串流模式適配場景。</p>
         * 
         * <strong>example:</strong>
         * <p>smooth</p>
         */
        @NameInMap("StreamingMode")
        public String streamingMode;

        /**
         * <p>目標幀率，取值範圍：10\~60。</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TargetFps")
        public Integer targetFps;

        /**
         * <p>應用程式工作列。</p>
         * <blockquote>
         * <p>僅適用於雲端應用程式策略。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Taskbar")
        public String taskbar;

        /**
         * <p>三螢幕開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ThreeScreen")
        public String threeScreen;

        /**
         * <p>USB 重新導向。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("UsbRedirect")
        public String usbRedirect;

        /**
         * <p>USB 重新導向規則。</p>
         */
        @NameInMap("UsbSupplyRedirectRule")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> usbSupplyRedirectRule;

        /**
         * <p>懸浮球使用時長顯示開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("UseTime")
        public String useTime;

        /**
         * <p>影片編碼平均位元率。單位：Kbps。取值範圍：1000\~50000。</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoEncAvgKbps")
        public Integer videoEncAvgKbps;

        /**
         * <p>影片編碼最大 QP，畫面最低品質，取值範圍：0\~51。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoEncMaxQP")
        public Integer videoEncMaxQP;

        /**
         * <p>影片編碼最小 QP，最高品質。取值範圍：0\~51。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoEncMinQP")
        public Integer videoEncMinQP;

        /**
         * <p>影片編碼峰值位元率。單位：Kbps。取值範圍：1000~50000。</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("VideoEncPeakKbps")
        public Integer videoEncPeakKbps;

        /**
         * <p>影片編碼策略。</p>
         * 
         * <strong>example:</strong>
         * <p>qualityFirst</p>
         */
        @NameInMap("VideoEncPolicy")
        public String videoEncPolicy;

        /**
         * <p>多媒體重新導向。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("VideoRedirect")
        public String videoRedirect;

        /**
         * <p>影像顯示品質策略。</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("VisualQuality")
        public String visualQuality;

        /**
         * <p>浮水印。</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Watermark")
        public String watermark;

        /**
         * <p>隱藏式浮水印防拍照功能。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkAntiCam")
        public String watermarkAntiCam;

        /**
         * <p>浮水印字型顏色。取值範圍：0\~16777215。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WatermarkColor")
        public Integer watermarkColor;

        /**
         * <p>若參數 <code>WatermarkType</code> 傳入 <code>custom</code>，則必須同時透過參數 <code>WatermarkCustomText</code> 傳入自訂文字的內容。</p>
         * 
         * <strong>example:</strong>
         * <p>custom-watermark</p>
         */
        @NameInMap("WatermarkCustomText")
        public String watermarkCustomText;

        /**
         * <p>浮水印傾斜度。取值範圍：-10\~-30。</p>
         * 
         * <strong>example:</strong>
         * <p>-10</p>
         */
        @NameInMap("WatermarkDegree")
        public Double watermarkDegree;

        /**
         * <p>浮水印字型大小。取值範圍：10\~20。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WatermarkFontSize")
        public Integer watermarkFontSize;

        /**
         * <p>浮水印字型樣式。</p>
         * 
         * <strong>example:</strong>
         * <p>plain</p>
         */
        @NameInMap("WatermarkFontStyle")
        public String watermarkFontStyle;

        /**
         * <p>隱藏式浮水印增強功能。</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("WatermarkPower")
        public String watermarkPower;

        /**
         * <p>浮水印行數。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("WatermarkRowAmount")
        public Integer watermarkRowAmount;

        /**
         * <p>隱藏式浮水印安全優先規則。</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("WatermarkSecurity")
        public String watermarkSecurity;

        /**
         * <p>浮水印陰影效果開關。取值範圍：</p>
         * <ul>
         * <li>on：開啟。</li>
         * <li>off：關閉。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkShadow")
        public String watermarkShadow;

        /**
         * <p>浮水印透明度，值越大，透明度越小。取值範圍：10\~100。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WatermarkTransparencyValue")
        public Integer watermarkTransparencyValue;

        /**
         * <p>浮水印類型。</p>
         * 
         * <strong>example:</strong>
         * <p>EndUserId</p>
         */
        @NameInMap("WatermarkType")
        public String watermarkType;

        /**
         * <p>無影管家開關。</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WuyingKeeper")
        public String wuyingKeeper;

        /**
         * <p>是否在雲端電腦懸浮球內提供無影 AI 助手功能入口。</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("WyAssistant")
        public String wyAssistant;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroups self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAcademicProxy(String academicProxy) {
            this.academicProxy = academicProxy;
            return this;
        }
        public String getAcademicProxy() {
            return this.academicProxy;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAdminAccess(String adminAccess) {
            this.adminAccess = adminAccess;
            return this;
        }
        public String getAdminAccess() {
            return this.adminAccess;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAdminKeyboardOnFullScreen(String adminKeyboardOnFullScreen) {
            this.adminKeyboardOnFullScreen = adminKeyboardOnFullScreen;
            return this;
        }
        public String getAdminKeyboardOnFullScreen() {
            return this.adminKeyboardOnFullScreen;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAdminKeyboardOnWindows(String adminKeyboardOnWindows) {
            this.adminKeyboardOnWindows = adminKeyboardOnWindows;
            return this;
        }
        public String getAdminKeyboardOnWindows() {
            return this.adminKeyboardOnWindows;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAdminMonitor(Integer adminMonitor) {
            this.adminMonitor = adminMonitor;
            return this;
        }
        public Integer getAdminMonitor() {
            return this.adminMonitor;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAppContentProtection(String appContentProtection) {
            this.appContentProtection = appContentProtection;
            return this;
        }
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAppScreenshotBuckets(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAppScreenshotBuckets> appScreenshotBuckets) {
            this.appScreenshotBuckets = appScreenshotBuckets;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAppScreenshotBuckets> getAppScreenshotBuckets() {
            return this.appScreenshotBuckets;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAuthorizeAccessPolicyRules(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
            this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAuthorizeSecurityPolicyRules(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules) {
            this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> getAuthorizeSecurityPolicyRules() {
            return this.authorizeSecurityPolicyRules;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAutoReconnect(String autoReconnect) {
            this.autoReconnect = autoReconnect;
            return this;
        }
        public String getAutoReconnect() {
            return this.autoReconnect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAutoSaveAppScreenshot(String autoSaveAppScreenshot) {
            this.autoSaveAppScreenshot = autoSaveAppScreenshot;
            return this;
        }
        public String getAutoSaveAppScreenshot() {
            return this.autoSaveAppScreenshot;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCameraRedirect(String cameraRedirect) {
            this.cameraRedirect = cameraRedirect;
            return this;
        }
        public String getCameraRedirect() {
            return this.cameraRedirect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClientControlMenu(String clientControlMenu) {
            this.clientControlMenu = clientControlMenu;
            return this;
        }
        public String getClientControlMenu() {
            return this.clientControlMenu;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClientCreateSnapshot(String clientCreateSnapshot) {
            this.clientCreateSnapshot = clientCreateSnapshot;
            return this;
        }
        public String getClientCreateSnapshot() {
            return this.clientCreateSnapshot;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClientHibernate(String clientHibernate) {
            this.clientHibernate = clientHibernate;
            return this;
        }
        public String getClientHibernate() {
            return this.clientHibernate;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClientRestart(String clientRestart) {
            this.clientRestart = clientRestart;
            return this;
        }
        public String getClientRestart() {
            return this.clientRestart;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClientShutdown(String clientShutdown) {
            this.clientShutdown = clientShutdown;
            return this;
        }
        public String getClientShutdown() {
            return this.clientShutdown;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClientTypes(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes> clientTypes) {
            this.clientTypes = clientTypes;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes> getClientTypes() {
            return this.clientTypes;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setColorEnhancement(String colorEnhancement) {
            this.colorEnhancement = colorEnhancement;
            return this;
        }
        public String getColorEnhancement() {
            return this.colorEnhancement;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpdDriveClipboard(String cpdDriveClipboard) {
            this.cpdDriveClipboard = cpdDriveClipboard;
            return this;
        }
        public String getCpdDriveClipboard() {
            return this.cpdDriveClipboard;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuDownGradeDuration(Integer cpuDownGradeDuration) {
            this.cpuDownGradeDuration = cpuDownGradeDuration;
            return this;
        }
        public Integer getCpuDownGradeDuration() {
            return this.cpuDownGradeDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuOverload(String cpuOverload) {
            this.cpuOverload = cpuOverload;
            return this;
        }
        public String getCpuOverload() {
            return this.cpuOverload;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuProcessors(java.util.List<String> cpuProcessors) {
            this.cpuProcessors = cpuProcessors;
            return this;
        }
        public java.util.List<String> getCpuProcessors() {
            return this.cpuProcessors;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuProtectedMode(String cpuProtectedMode) {
            this.cpuProtectedMode = cpuProtectedMode;
            return this;
        }
        public String getCpuProtectedMode() {
            return this.cpuProtectedMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuRateLimit(Integer cpuRateLimit) {
            this.cpuRateLimit = cpuRateLimit;
            return this;
        }
        public Integer getCpuRateLimit() {
            return this.cpuRateLimit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuSampleDuration(Integer cpuSampleDuration) {
            this.cpuSampleDuration = cpuSampleDuration;
            return this;
        }
        public Integer getCpuSampleDuration() {
            return this.cpuSampleDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuSingleRateLimit(Integer cpuSingleRateLimit) {
            this.cpuSingleRateLimit = cpuSingleRateLimit;
            return this;
        }
        public Integer getCpuSingleRateLimit() {
            return this.cpuSingleRateLimit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDesktopCount(Integer desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }
        public Integer getDesktopCount() {
            return this.desktopCount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDesktopGroupCount(Integer desktopGroupCount) {
            this.desktopGroupCount = desktopGroupCount;
            return this;
        }
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDeviceConnectHint(String deviceConnectHint) {
            this.deviceConnectHint = deviceConnectHint;
            return this;
        }
        public String getDeviceConnectHint() {
            return this.deviceConnectHint;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDeviceRedirects(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects> deviceRedirects) {
            this.deviceRedirects = deviceRedirects;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects> getDeviceRedirects() {
            return this.deviceRedirects;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDeviceRules(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules> deviceRules) {
            this.deviceRules = deviceRules;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules> getDeviceRules() {
            return this.deviceRules;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDisconnectKeepSession(String disconnectKeepSession) {
            this.disconnectKeepSession = disconnectKeepSession;
            return this;
        }
        public String getDisconnectKeepSession() {
            return this.disconnectKeepSession;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDisconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
            this.disconnectKeepSessionTime = disconnectKeepSessionTime;
            return this;
        }
        public Integer getDisconnectKeepSessionTime() {
            return this.disconnectKeepSessionTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDiskOverload(String diskOverload) {
            this.diskOverload = diskOverload;
            return this;
        }
        public String getDiskOverload() {
            return this.diskOverload;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDomainRegisterValue(String domainRegisterValue) {
            this.domainRegisterValue = domainRegisterValue;
            return this;
        }
        public String getDomainRegisterValue() {
            return this.domainRegisterValue;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDomainResolveRule(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule> domainResolveRule) {
            this.domainResolveRule = domainResolveRule;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule> getDomainResolveRule() {
            return this.domainResolveRule;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDomainResolveRuleType(String domainResolveRuleType) {
            this.domainResolveRuleType = domainResolveRuleType;
            return this;
        }
        public String getDomainResolveRuleType() {
            return this.domainResolveRuleType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setEndUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
            this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
            return this;
        }
        public String getEndUserApplyAdminCoordinate() {
            return this.endUserApplyAdminCoordinate;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setEndUserCount(String endUserCount) {
            this.endUserCount = endUserCount;
            return this;
        }
        public String getEndUserCount() {
            return this.endUserCount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setEndUserGroupCoordinate(String endUserGroupCoordinate) {
            this.endUserGroupCoordinate = endUserGroupCoordinate;
            return this;
        }
        public String getEndUserGroupCoordinate() {
            return this.endUserGroupCoordinate;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setExternalDrive(String externalDrive) {
            this.externalDrive = externalDrive;
            return this;
        }
        public String getExternalDrive() {
            return this.externalDrive;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileMigrate(String fileMigrate) {
            this.fileMigrate = fileMigrate;
            return this;
        }
        public String getFileMigrate() {
            return this.fileMigrate;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferAddress(String fileTransferAddress) {
            this.fileTransferAddress = fileTransferAddress;
            return this;
        }
        public String getFileTransferAddress() {
            return this.fileTransferAddress;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferInSize(String fileTransferInSize) {
            this.fileTransferInSize = fileTransferInSize;
            return this;
        }
        public String getFileTransferInSize() {
            return this.fileTransferInSize;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferInUnit(String fileTransferInUnit) {
            this.fileTransferInUnit = fileTransferInUnit;
            return this;
        }
        public String getFileTransferInUnit() {
            return this.fileTransferInUnit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferOutSize(String fileTransferOutSize) {
            this.fileTransferOutSize = fileTransferOutSize;
            return this;
        }
        public String getFileTransferOutSize() {
            return this.fileTransferOutSize;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferOutUnit(String fileTransferOutUnit) {
            this.fileTransferOutUnit = fileTransferOutUnit;
            return this;
        }
        public String getFileTransferOutUnit() {
            return this.fileTransferOutUnit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferSizeLimit(String fileTransferSizeLimit) {
            this.fileTransferSizeLimit = fileTransferSizeLimit;
            return this;
        }
        public String getFileTransferSizeLimit() {
            return this.fileTransferSizeLimit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferSpeed(String fileTransferSpeed) {
            this.fileTransferSpeed = fileTransferSpeed;
            return this;
        }
        public String getFileTransferSpeed() {
            return this.fileTransferSpeed;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferSpeedLocation(String fileTransferSpeedLocation) {
            this.fileTransferSpeedLocation = fileTransferSpeedLocation;
            return this;
        }
        public String getFileTransferSpeedLocation() {
            return this.fileTransferSpeedLocation;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFolderSync(String folderSync) {
            this.folderSync = folderSync;
            return this;
        }
        public String getFolderSync() {
            return this.folderSync;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setGpuAcceleration(String gpuAcceleration) {
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }
        public String getGpuAcceleration() {
            return this.gpuAcceleration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setHoverConfigMsg(String hoverConfigMsg) {
            this.hoverConfigMsg = hoverConfigMsg;
            return this;
        }
        public String getHoverConfigMsg() {
            return this.hoverConfigMsg;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setHoverHibernate(String hoverHibernate) {
            this.hoverHibernate = hoverHibernate;
            return this;
        }
        public String getHoverHibernate() {
            return this.hoverHibernate;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setHoverRestart(String hoverRestart) {
            this.hoverRestart = hoverRestart;
            return this;
        }
        public String getHoverRestart() {
            return this.hoverRestart;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setHoverShutdown(String hoverShutdown) {
            this.hoverShutdown = hoverShutdown;
            return this;
        }
        public String getHoverShutdown() {
            return this.hoverShutdown;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setHtml5Access(String html5Access) {
            this.html5Access = html5Access;
            return this;
        }
        public String getHtml5Access() {
            return this.html5Access;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setHtml5FileTransfer(String html5FileTransfer) {
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setInternetCommunicationProtocol(String internetCommunicationProtocol) {
            this.internetCommunicationProtocol = internetCommunicationProtocol;
            return this;
        }
        public String getInternetCommunicationProtocol() {
            return this.internetCommunicationProtocol;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setInternetPrinter(String internetPrinter) {
            this.internetPrinter = internetPrinter;
            return this;
        }
        public String getInternetPrinter() {
            return this.internetPrinter;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setKeyboardControl(String keyboardControl) {
            this.keyboardControl = keyboardControl;
            return this;
        }
        public String getKeyboardControl() {
            return this.keyboardControl;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setKmsServer(String kmsServer) {
            this.kmsServer = kmsServer;
            return this;
        }
        public String getKmsServer() {
            return this.kmsServer;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setKmsServerConfig(String kmsServerConfig) {
            this.kmsServerConfig = kmsServerConfig;
            return this;
        }
        public String getKmsServerConfig() {
            return this.kmsServerConfig;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMaxReconnectTime(Integer maxReconnectTime) {
            this.maxReconnectTime = maxReconnectTime;
            return this;
        }
        public Integer getMaxReconnectTime() {
            return this.maxReconnectTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMcpService(String mcpService) {
            this.mcpService = mcpService;
            return this;
        }
        public String getMcpService() {
            return this.mcpService;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemoryDownGradeDuration(Integer memoryDownGradeDuration) {
            this.memoryDownGradeDuration = memoryDownGradeDuration;
            return this;
        }
        public Integer getMemoryDownGradeDuration() {
            return this.memoryDownGradeDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemoryOverload(String memoryOverload) {
            this.memoryOverload = memoryOverload;
            return this;
        }
        public String getMemoryOverload() {
            return this.memoryOverload;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemoryProcessors(java.util.List<String> memoryProcessors) {
            this.memoryProcessors = memoryProcessors;
            return this;
        }
        public java.util.List<String> getMemoryProcessors() {
            return this.memoryProcessors;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemoryProtectedMode(String memoryProtectedMode) {
            this.memoryProtectedMode = memoryProtectedMode;
            return this;
        }
        public String getMemoryProtectedMode() {
            return this.memoryProtectedMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemoryRateLimit(Integer memoryRateLimit) {
            this.memoryRateLimit = memoryRateLimit;
            return this;
        }
        public Integer getMemoryRateLimit() {
            return this.memoryRateLimit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemorySampleDuration(Integer memorySampleDuration) {
            this.memorySampleDuration = memorySampleDuration;
            return this;
        }
        public Integer getMemorySampleDuration() {
            return this.memorySampleDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemorySingleRateLimit(Integer memorySingleRateLimit) {
            this.memorySingleRateLimit = memorySingleRateLimit;
            return this;
        }
        public Integer getMemorySingleRateLimit() {
            return this.memorySingleRateLimit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMobileRestart(String mobileRestart) {
            this.mobileRestart = mobileRestart;
            return this;
        }
        public String getMobileRestart() {
            return this.mobileRestart;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMobileSafeMenu(String mobileSafeMenu) {
            this.mobileSafeMenu = mobileSafeMenu;
            return this;
        }
        public String getMobileSafeMenu() {
            return this.mobileSafeMenu;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMobileShutdown(String mobileShutdown) {
            this.mobileShutdown = mobileShutdown;
            return this;
        }
        public String getMobileShutdown() {
            return this.mobileShutdown;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMobileWuyingKeeper(String mobileWuyingKeeper) {
            this.mobileWuyingKeeper = mobileWuyingKeeper;
            return this;
        }
        public String getMobileWuyingKeeper() {
            return this.mobileWuyingKeeper;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMobileWyAssistant(String mobileWyAssistant) {
            this.mobileWyAssistant = mobileWyAssistant;
            return this;
        }
        public String getMobileWyAssistant() {
            return this.mobileWyAssistant;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setModelLibrary(String modelLibrary) {
            this.modelLibrary = modelLibrary;
            return this;
        }
        public String getModelLibrary() {
            return this.modelLibrary;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMultiScreen(String multiScreen) {
            this.multiScreen = multiScreen;
            return this;
        }
        public String getMultiScreen() {
            return this.multiScreen;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setNetRedirect(String netRedirect) {
            this.netRedirect = netRedirect;
            return this;
        }
        public String getNetRedirect() {
            return this.netRedirect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setNetRedirectRule(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule> netRedirectRule) {
            this.netRedirectRule = netRedirectRule;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule> getNetRedirectRule() {
            return this.netRedirectRule;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setNetworkPrinter(String networkPrinter) {
            this.networkPrinter = networkPrinter;
            return this;
        }
        public String getNetworkPrinter() {
            return this.networkPrinter;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setNoOperationDisconnect(String noOperationDisconnect) {
            this.noOperationDisconnect = noOperationDisconnect;
            return this;
        }
        public String getNoOperationDisconnect() {
            return this.noOperationDisconnect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setNoOperationDisconnectTime(Integer noOperationDisconnectTime) {
            this.noOperationDisconnectTime = noOperationDisconnectTime;
            return this;
        }
        public Integer getNoOperationDisconnectTime() {
            return this.noOperationDisconnectTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setOrganizationCount(String organizationCount) {
            this.organizationCount = organizationCount;
            return this;
        }
        public String getOrganizationCount() {
            return this.organizationCount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPolicyGroupType(String policyGroupType) {
            this.policyGroupType = policyGroupType;
            return this;
        }
        public String getPolicyGroupType() {
            return this.policyGroupType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPortProxy(String portProxy) {
            this.portProxy = portProxy;
            return this;
        }
        public String getPortProxy() {
            return this.portProxy;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPrinterAlert(String printerAlert) {
            this.printerAlert = printerAlert;
            return this;
        }
        public String getPrinterAlert() {
            return this.printerAlert;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPrinterAlertContent(String printerAlertContent) {
            this.printerAlertContent = printerAlertContent;
            return this;
        }
        public String getPrinterAlertContent() {
            return this.printerAlertContent;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPrinterAlertTitle(String printerAlertTitle) {
            this.printerAlertTitle = printerAlertTitle;
            return this;
        }
        public String getPrinterAlertTitle() {
            return this.printerAlertTitle;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPrinterRedirection(String printerRedirection) {
            this.printerRedirection = printerRedirection;
            return this;
        }
        public String getPrinterRedirection() {
            return this.printerRedirection;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setQualityEnhancement(String qualityEnhancement) {
            this.qualityEnhancement = qualityEnhancement;
            return this;
        }
        public String getQualityEnhancement() {
            return this.qualityEnhancement;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordContent(String recordContent) {
            this.recordContent = recordContent;
            return this;
        }
        public String getRecordContent() {
            return this.recordContent;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordContentExpires(Long recordContentExpires) {
            this.recordContentExpires = recordContentExpires;
            return this;
        }
        public Long getRecordContentExpires() {
            return this.recordContentExpires;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordEventDuration(Integer recordEventDuration) {
            this.recordEventDuration = recordEventDuration;
            return this;
        }
        public Integer getRecordEventDuration() {
            return this.recordEventDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordEventFilePaths(java.util.List<String> recordEventFilePaths) {
            this.recordEventFilePaths = recordEventFilePaths;
            return this;
        }
        public java.util.List<String> getRecordEventFilePaths() {
            return this.recordEventFilePaths;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordEventRegisters(java.util.List<String> recordEventRegisters) {
            this.recordEventRegisters = recordEventRegisters;
            return this;
        }
        public java.util.List<String> getRecordEventRegisters() {
            return this.recordEventRegisters;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecording(String recording) {
            this.recording = recording;
            return this;
        }
        public String getRecording() {
            return this.recording;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingAudio(String recordingAudio) {
            this.recordingAudio = recordingAudio;
            return this;
        }
        public String getRecordingAudio() {
            return this.recordingAudio;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingDuration(Integer recordingDuration) {
            this.recordingDuration = recordingDuration;
            return this;
        }
        public Integer getRecordingDuration() {
            return this.recordingDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingEndTime(String recordingEndTime) {
            this.recordingEndTime = recordingEndTime;
            return this;
        }
        public String getRecordingEndTime() {
            return this.recordingEndTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingExpires(Long recordingExpires) {
            this.recordingExpires = recordingExpires;
            return this;
        }
        public Long getRecordingExpires() {
            return this.recordingExpires;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingFps(Long recordingFps) {
            this.recordingFps = recordingFps;
            return this;
        }
        public Long getRecordingFps() {
            return this.recordingFps;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingStartTime(String recordingStartTime) {
            this.recordingStartTime = recordingStartTime;
            return this;
        }
        public String getRecordingStartTime() {
            return this.recordingStartTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingUserNotify(String recordingUserNotify) {
            this.recordingUserNotify = recordingUserNotify;
            return this;
        }
        public String getRecordingUserNotify() {
            return this.recordingUserNotify;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingUserNotifyMessage(String recordingUserNotifyMessage) {
            this.recordingUserNotifyMessage = recordingUserNotifyMessage;
            return this;
        }
        public String getRecordingUserNotifyMessage() {
            return this.recordingUserNotifyMessage;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRemoteCoordinate(String remoteCoordinate) {
            this.remoteCoordinate = remoteCoordinate;
            return this;
        }
        public String getRemoteCoordinate() {
            return this.remoteCoordinate;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResetDesktop(String resetDesktop) {
            this.resetDesktop = resetDesktop;
            return this;
        }
        public String getResetDesktop() {
            return this.resetDesktop;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResolutionDpi(Integer resolutionDpi) {
            this.resolutionDpi = resolutionDpi;
            return this;
        }
        public Integer getResolutionDpi() {
            return this.resolutionDpi;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResolutionHeight(Integer resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResolutionModel(String resolutionModel) {
            this.resolutionModel = resolutionModel;
            return this;
        }
        public String getResolutionModel() {
            return this.resolutionModel;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResolutionWidth(Integer resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResourceGroupCount(Integer resourceGroupCount) {
            this.resourceGroupCount = resourceGroupCount;
            return this;
        }
        public Integer getResourceGroupCount() {
            return this.resourceGroupCount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setSafeMenu(String safeMenu) {
            this.safeMenu = safeMenu;
            return this;
        }
        public String getSafeMenu() {
            return this.safeMenu;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setScopeValue(java.util.List<String> scopeValue) {
            this.scopeValue = scopeValue;
            return this;
        }
        public java.util.List<String> getScopeValue() {
            return this.scopeValue;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setScreenDisplayMode(String screenDisplayMode) {
            this.screenDisplayMode = screenDisplayMode;
            return this;
        }
        public String getScreenDisplayMode() {
            return this.screenDisplayMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setSmoothEnhancement(String smoothEnhancement) {
            this.smoothEnhancement = smoothEnhancement;
            return this;
        }
        public String getSmoothEnhancement() {
            return this.smoothEnhancement;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setStatusMonitor(String statusMonitor) {
            this.statusMonitor = statusMonitor;
            return this;
        }
        public String getStatusMonitor() {
            return this.statusMonitor;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setStreamingMode(String streamingMode) {
            this.streamingMode = streamingMode;
            return this;
        }
        public String getStreamingMode() {
            return this.streamingMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setTargetFps(Integer targetFps) {
            this.targetFps = targetFps;
            return this;
        }
        public Integer getTargetFps() {
            return this.targetFps;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setTaskbar(String taskbar) {
            this.taskbar = taskbar;
            return this;
        }
        public String getTaskbar() {
            return this.taskbar;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setThreeScreen(String threeScreen) {
            this.threeScreen = threeScreen;
            return this;
        }
        public String getThreeScreen() {
            return this.threeScreen;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setUsbRedirect(String usbRedirect) {
            this.usbRedirect = usbRedirect;
            return this;
        }
        public String getUsbRedirect() {
            return this.usbRedirect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setUsbSupplyRedirectRule(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> usbSupplyRedirectRule) {
            this.usbSupplyRedirectRule = usbSupplyRedirectRule;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
            return this.usbSupplyRedirectRule;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setUseTime(String useTime) {
            this.useTime = useTime;
            return this;
        }
        public String getUseTime() {
            return this.useTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncAvgKbps(Integer videoEncAvgKbps) {
            this.videoEncAvgKbps = videoEncAvgKbps;
            return this;
        }
        public Integer getVideoEncAvgKbps() {
            return this.videoEncAvgKbps;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncMaxQP(Integer videoEncMaxQP) {
            this.videoEncMaxQP = videoEncMaxQP;
            return this;
        }
        public Integer getVideoEncMaxQP() {
            return this.videoEncMaxQP;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncMinQP(Integer videoEncMinQP) {
            this.videoEncMinQP = videoEncMinQP;
            return this;
        }
        public Integer getVideoEncMinQP() {
            return this.videoEncMinQP;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncPeakKbps(Integer videoEncPeakKbps) {
            this.videoEncPeakKbps = videoEncPeakKbps;
            return this;
        }
        public Integer getVideoEncPeakKbps() {
            return this.videoEncPeakKbps;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncPolicy(String videoEncPolicy) {
            this.videoEncPolicy = videoEncPolicy;
            return this;
        }
        public String getVideoEncPolicy() {
            return this.videoEncPolicy;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoRedirect(String videoRedirect) {
            this.videoRedirect = videoRedirect;
            return this;
        }
        public String getVideoRedirect() {
            return this.videoRedirect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVisualQuality(String visualQuality) {
            this.visualQuality = visualQuality;
            return this;
        }
        public String getVisualQuality() {
            return this.visualQuality;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermark(String watermark) {
            this.watermark = watermark;
            return this;
        }
        public String getWatermark() {
            return this.watermark;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkAntiCam(String watermarkAntiCam) {
            this.watermarkAntiCam = watermarkAntiCam;
            return this;
        }
        public String getWatermarkAntiCam() {
            return this.watermarkAntiCam;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkColor(Integer watermarkColor) {
            this.watermarkColor = watermarkColor;
            return this;
        }
        public Integer getWatermarkColor() {
            return this.watermarkColor;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkCustomText(String watermarkCustomText) {
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }
        public String getWatermarkCustomText() {
            return this.watermarkCustomText;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkDegree(Double watermarkDegree) {
            this.watermarkDegree = watermarkDegree;
            return this;
        }
        public Double getWatermarkDegree() {
            return this.watermarkDegree;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkFontSize(Integer watermarkFontSize) {
            this.watermarkFontSize = watermarkFontSize;
            return this;
        }
        public Integer getWatermarkFontSize() {
            return this.watermarkFontSize;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkFontStyle(String watermarkFontStyle) {
            this.watermarkFontStyle = watermarkFontStyle;
            return this;
        }
        public String getWatermarkFontStyle() {
            return this.watermarkFontStyle;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkPower(String watermarkPower) {
            this.watermarkPower = watermarkPower;
            return this;
        }
        public String getWatermarkPower() {
            return this.watermarkPower;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkRowAmount(Integer watermarkRowAmount) {
            this.watermarkRowAmount = watermarkRowAmount;
            return this;
        }
        public Integer getWatermarkRowAmount() {
            return this.watermarkRowAmount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkSecurity(String watermarkSecurity) {
            this.watermarkSecurity = watermarkSecurity;
            return this;
        }
        public String getWatermarkSecurity() {
            return this.watermarkSecurity;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkShadow(String watermarkShadow) {
            this.watermarkShadow = watermarkShadow;
            return this;
        }
        public String getWatermarkShadow() {
            return this.watermarkShadow;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
            this.watermarkTransparencyValue = watermarkTransparencyValue;
            return this;
        }
        public Integer getWatermarkTransparencyValue() {
            return this.watermarkTransparencyValue;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkType(String watermarkType) {
            this.watermarkType = watermarkType;
            return this;
        }
        public String getWatermarkType() {
            return this.watermarkType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWuyingKeeper(String wuyingKeeper) {
            this.wuyingKeeper = wuyingKeeper;
            return this;
        }
        public String getWuyingKeeper() {
            return this.wuyingKeeper;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWyAssistant(String wyAssistant) {
            this.wyAssistant = wyAssistant;
            return this;
        }
        public String getWyAssistant() {
            return this.wyAssistant;
        }

    }

}
