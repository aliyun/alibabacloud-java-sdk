// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginProtectionResponseBody extends TeaModel {
    /**
     * <p>The IP whitelist for origin protection used by the website.</p>
     */
    @NameInMap("CurrentIPWhitelist")
    public GetOriginProtectionResponseBodyCurrentIPWhitelist currentIPWhitelist;

    /**
     * <p>The IP whitelist for origin protection that has been updated.</p>
     */
    @NameInMap("DiffIPWhitelist")
    public GetOriginProtectionResponseBodyDiffIPWhitelist diffIPWhitelist;

    /**
     * <p>The latest IP whitelist for origin protection.</p>
     */
    @NameInMap("LatestIPWhitelist")
    public GetOriginProtectionResponseBodyLatestIPWhitelist latestIPWhitelist;

    /**
     * <p>Indicates whether the IP whitelist for origin protection needs to be updated. If the currently used IP whitelist is different from the latest IP whitelist, it needs to be updated, and the value is true.</p>
     * <ul>
     * <li>true: The update is required.</li>
     * <li>false: No update is required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedUpdate")
    public Boolean needUpdate;

    /**
     * <p>Indicates whether IP convergence is enabled.</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginConverge")
    public String originConverge;

    /**
     * <p>Indicates whether origin protection is enabled.</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginProtection")
    public String originProtection;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetOriginProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOriginProtectionResponseBody self = new GetOriginProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOriginProtectionResponseBody setCurrentIPWhitelist(GetOriginProtectionResponseBodyCurrentIPWhitelist currentIPWhitelist) {
        this.currentIPWhitelist = currentIPWhitelist;
        return this;
    }
    public GetOriginProtectionResponseBodyCurrentIPWhitelist getCurrentIPWhitelist() {
        return this.currentIPWhitelist;
    }

    public GetOriginProtectionResponseBody setDiffIPWhitelist(GetOriginProtectionResponseBodyDiffIPWhitelist diffIPWhitelist) {
        this.diffIPWhitelist = diffIPWhitelist;
        return this;
    }
    public GetOriginProtectionResponseBodyDiffIPWhitelist getDiffIPWhitelist() {
        return this.diffIPWhitelist;
    }

    public GetOriginProtectionResponseBody setLatestIPWhitelist(GetOriginProtectionResponseBodyLatestIPWhitelist latestIPWhitelist) {
        this.latestIPWhitelist = latestIPWhitelist;
        return this;
    }
    public GetOriginProtectionResponseBodyLatestIPWhitelist getLatestIPWhitelist() {
        return this.latestIPWhitelist;
    }

    public GetOriginProtectionResponseBody setNeedUpdate(Boolean needUpdate) {
        this.needUpdate = needUpdate;
        return this;
    }
    public Boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public GetOriginProtectionResponseBody setOriginConverge(String originConverge) {
        this.originConverge = originConverge;
        return this;
    }
    public String getOriginConverge() {
        return this.originConverge;
    }

    public GetOriginProtectionResponseBody setOriginProtection(String originProtection) {
        this.originProtection = originProtection;
        return this;
    }
    public String getOriginProtection() {
        return this.originProtection;
    }

    public GetOriginProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOriginProtectionResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class GetOriginProtectionResponseBodyCurrentIPWhitelist extends TeaModel {
        /**
         * <p>The IP whitelist for origin protection used by the website, specified as IPv4 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv4")
        public java.util.List<String> IPv4;

        /**
         * <p>The IP whitelist for origin protection used by the website, specified as IPv6 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv6")
        public java.util.List<String> IPv6;

        public static GetOriginProtectionResponseBodyCurrentIPWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyCurrentIPWhitelist self = new GetOriginProtectionResponseBodyCurrentIPWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyCurrentIPWhitelist setIPv4(java.util.List<String> IPv4) {
            this.IPv4 = IPv4;
            return this;
        }
        public java.util.List<String> getIPv4() {
            return this.IPv4;
        }

        public GetOriginProtectionResponseBodyCurrentIPWhitelist setIPv6(java.util.List<String> IPv6) {
            this.IPv6 = IPv6;
            return this;
        }
        public java.util.List<String> getIPv6() {
            return this.IPv6;
        }

    }

    public static class GetOriginProtectionResponseBodyDiffIPWhitelistAddedIPWhitelist extends TeaModel {
        /**
         * <p>The IP whitelist for origin protection, specified as IPv4 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv4")
        public java.util.List<String> IPv4;

        /**
         * <p>The IP whitelist for origin protection, specified as IPv6 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv6")
        public java.util.List<String> IPv6;

        public static GetOriginProtectionResponseBodyDiffIPWhitelistAddedIPWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyDiffIPWhitelistAddedIPWhitelist self = new GetOriginProtectionResponseBodyDiffIPWhitelistAddedIPWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyDiffIPWhitelistAddedIPWhitelist setIPv4(java.util.List<String> IPv4) {
            this.IPv4 = IPv4;
            return this;
        }
        public java.util.List<String> getIPv4() {
            return this.IPv4;
        }

        public GetOriginProtectionResponseBodyDiffIPWhitelistAddedIPWhitelist setIPv6(java.util.List<String> IPv6) {
            this.IPv6 = IPv6;
            return this;
        }
        public java.util.List<String> getIPv6() {
            return this.IPv6;
        }

    }

    public static class GetOriginProtectionResponseBodyDiffIPWhitelistNoChangeIpWhitelist extends TeaModel {
        /**
         * <p>The IP whitelist for origin protection, specified as IPv4 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv4")
        public java.util.List<String> IPv4;

        /**
         * <p>The IP whitelist for origin protection, specified as IPv6 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv6")
        public java.util.List<String> IPv6;

        public static GetOriginProtectionResponseBodyDiffIPWhitelistNoChangeIpWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyDiffIPWhitelistNoChangeIpWhitelist self = new GetOriginProtectionResponseBodyDiffIPWhitelistNoChangeIpWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyDiffIPWhitelistNoChangeIpWhitelist setIPv4(java.util.List<String> IPv4) {
            this.IPv4 = IPv4;
            return this;
        }
        public java.util.List<String> getIPv4() {
            return this.IPv4;
        }

        public GetOriginProtectionResponseBodyDiffIPWhitelistNoChangeIpWhitelist setIPv6(java.util.List<String> IPv6) {
            this.IPv6 = IPv6;
            return this;
        }
        public java.util.List<String> getIPv6() {
            return this.IPv6;
        }

    }

    public static class GetOriginProtectionResponseBodyDiffIPWhitelistRemovedIPWhitelist extends TeaModel {
        /**
         * <p>The IP whitelist for origin protection, specified as IPv4 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv4")
        public java.util.List<String> IPv4;

        /**
         * <p>The IP whitelist for origin protection, specified as IPv6 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv6")
        public java.util.List<String> IPv6;

        public static GetOriginProtectionResponseBodyDiffIPWhitelistRemovedIPWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyDiffIPWhitelistRemovedIPWhitelist self = new GetOriginProtectionResponseBodyDiffIPWhitelistRemovedIPWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyDiffIPWhitelistRemovedIPWhitelist setIPv4(java.util.List<String> IPv4) {
            this.IPv4 = IPv4;
            return this;
        }
        public java.util.List<String> getIPv4() {
            return this.IPv4;
        }

        public GetOriginProtectionResponseBodyDiffIPWhitelistRemovedIPWhitelist setIPv6(java.util.List<String> IPv6) {
            this.IPv6 = IPv6;
            return this;
        }
        public java.util.List<String> getIPv6() {
            return this.IPv6;
        }

    }

    public static class GetOriginProtectionResponseBodyDiffIPWhitelist extends TeaModel {
        /**
         * <p>The new IP whitelist for origin protection.</p>
         */
        @NameInMap("AddedIPWhitelist")
        public GetOriginProtectionResponseBodyDiffIPWhitelistAddedIPWhitelist addedIPWhitelist;

        /**
         * <p>The IP whitelist for origin protection that remains unchanged.</p>
         */
        @NameInMap("NoChangeIpWhitelist")
        public GetOriginProtectionResponseBodyDiffIPWhitelistNoChangeIpWhitelist noChangeIpWhitelist;

        /**
         * <p>The IP whitelist for origin protection that has been deleted.</p>
         */
        @NameInMap("RemovedIPWhitelist")
        public GetOriginProtectionResponseBodyDiffIPWhitelistRemovedIPWhitelist removedIPWhitelist;

        public static GetOriginProtectionResponseBodyDiffIPWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyDiffIPWhitelist self = new GetOriginProtectionResponseBodyDiffIPWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyDiffIPWhitelist setAddedIPWhitelist(GetOriginProtectionResponseBodyDiffIPWhitelistAddedIPWhitelist addedIPWhitelist) {
            this.addedIPWhitelist = addedIPWhitelist;
            return this;
        }
        public GetOriginProtectionResponseBodyDiffIPWhitelistAddedIPWhitelist getAddedIPWhitelist() {
            return this.addedIPWhitelist;
        }

        public GetOriginProtectionResponseBodyDiffIPWhitelist setNoChangeIpWhitelist(GetOriginProtectionResponseBodyDiffIPWhitelistNoChangeIpWhitelist noChangeIpWhitelist) {
            this.noChangeIpWhitelist = noChangeIpWhitelist;
            return this;
        }
        public GetOriginProtectionResponseBodyDiffIPWhitelistNoChangeIpWhitelist getNoChangeIpWhitelist() {
            return this.noChangeIpWhitelist;
        }

        public GetOriginProtectionResponseBodyDiffIPWhitelist setRemovedIPWhitelist(GetOriginProtectionResponseBodyDiffIPWhitelistRemovedIPWhitelist removedIPWhitelist) {
            this.removedIPWhitelist = removedIPWhitelist;
            return this;
        }
        public GetOriginProtectionResponseBodyDiffIPWhitelistRemovedIPWhitelist getRemovedIPWhitelist() {
            return this.removedIPWhitelist;
        }

    }

    public static class GetOriginProtectionResponseBodyLatestIPWhitelist extends TeaModel {
        /**
         * <p>The latest IP whitelist for origin protection, specified as IPv4 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv4")
        public java.util.List<String> IPv4;

        /**
         * <p>The latest IP whitelist for origin protection, specified as IPv6 addresses or CIDR blocks.</p>
         */
        @NameInMap("IPv6")
        public java.util.List<String> IPv6;

        public static GetOriginProtectionResponseBodyLatestIPWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyLatestIPWhitelist self = new GetOriginProtectionResponseBodyLatestIPWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyLatestIPWhitelist setIPv4(java.util.List<String> IPv4) {
            this.IPv4 = IPv4;
            return this;
        }
        public java.util.List<String> getIPv4() {
            return this.IPv4;
        }

        public GetOriginProtectionResponseBodyLatestIPWhitelist setIPv6(java.util.List<String> IPv6) {
            this.IPv6 = IPv6;
            return this;
        }
        public java.util.List<String> getIPv6() {
            return this.IPv6;
        }

    }

}
