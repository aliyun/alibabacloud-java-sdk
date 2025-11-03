// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginProtectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AutoConfirmIPList")
    public String autoConfirmIPList;

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

    @NameInMap("RegionalCurrentIPWhitelist")
    public GetOriginProtectionResponseBodyRegionalCurrentIPWhitelist regionalCurrentIPWhitelist;

    @NameInMap("RegionalDiffIPWhitelist")
    public GetOriginProtectionResponseBodyRegionalDiffIPWhitelist regionalDiffIPWhitelist;

    @NameInMap("RegionalLatestIPWhitelist")
    public GetOriginProtectionResponseBodyRegionalLatestIPWhitelist regionalLatestIPWhitelist;

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

    public GetOriginProtectionResponseBody setAutoConfirmIPList(String autoConfirmIPList) {
        this.autoConfirmIPList = autoConfirmIPList;
        return this;
    }
    public String getAutoConfirmIPList() {
        return this.autoConfirmIPList;
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

    public GetOriginProtectionResponseBody setRegionalCurrentIPWhitelist(GetOriginProtectionResponseBodyRegionalCurrentIPWhitelist regionalCurrentIPWhitelist) {
        this.regionalCurrentIPWhitelist = regionalCurrentIPWhitelist;
        return this;
    }
    public GetOriginProtectionResponseBodyRegionalCurrentIPWhitelist getRegionalCurrentIPWhitelist() {
        return this.regionalCurrentIPWhitelist;
    }

    public GetOriginProtectionResponseBody setRegionalDiffIPWhitelist(GetOriginProtectionResponseBodyRegionalDiffIPWhitelist regionalDiffIPWhitelist) {
        this.regionalDiffIPWhitelist = regionalDiffIPWhitelist;
        return this;
    }
    public GetOriginProtectionResponseBodyRegionalDiffIPWhitelist getRegionalDiffIPWhitelist() {
        return this.regionalDiffIPWhitelist;
    }

    public GetOriginProtectionResponseBody setRegionalLatestIPWhitelist(GetOriginProtectionResponseBodyRegionalLatestIPWhitelist regionalLatestIPWhitelist) {
        this.regionalLatestIPWhitelist = regionalLatestIPWhitelist;
        return this;
    }
    public GetOriginProtectionResponseBodyRegionalLatestIPWhitelist getRegionalLatestIPWhitelist() {
        return this.regionalLatestIPWhitelist;
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

    public static class GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv4 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv4 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv4 self = new GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv4();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv4 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv4 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv6 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv6 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv6 self = new GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv6();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv6 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv6 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalCurrentIPWhitelist extends TeaModel {
        @NameInMap("RegionalIPv4")
        public java.util.List<GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv4> regionalIPv4;

        @NameInMap("RegionalIPv6")
        public java.util.List<GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv6> regionalIPv6;

        public static GetOriginProtectionResponseBodyRegionalCurrentIPWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalCurrentIPWhitelist self = new GetOriginProtectionResponseBodyRegionalCurrentIPWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalCurrentIPWhitelist setRegionalIPv4(java.util.List<GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv4> regionalIPv4) {
            this.regionalIPv4 = regionalIPv4;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        public GetOriginProtectionResponseBodyRegionalCurrentIPWhitelist setRegionalIPv6(java.util.List<GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv6> regionalIPv6) {
            this.regionalIPv6 = regionalIPv6;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalCurrentIPWhitelistRegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv4 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv4 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv4 self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv4();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv4 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv4 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv6 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv6 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv6 self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv6();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv6 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv6 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelist extends TeaModel {
        @NameInMap("RegionalIPv4")
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv4> regionalIPv4;

        @NameInMap("RegionalIPv6")
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv6> regionalIPv6;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelist self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelist setRegionalIPv4(java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv4> regionalIPv4) {
            this.regionalIPv4 = regionalIPv4;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelist setRegionalIPv6(java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv6> regionalIPv6) {
            this.regionalIPv6 = regionalIPv6;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelistRegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv4 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv4 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv4 self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv4();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv4 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv4 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv6 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv6 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv6 self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv6();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv6 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv6 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelist extends TeaModel {
        @NameInMap("RegionalIPv4")
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv4> regionalIPv4;

        @NameInMap("RegionalIPv6")
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv6> regionalIPv6;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelist self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelist setRegionalIPv4(java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv4> regionalIPv4) {
            this.regionalIPv4 = regionalIPv4;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelist setRegionalIPv6(java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv6> regionalIPv6) {
            this.regionalIPv6 = regionalIPv6;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelistRegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv4 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv4 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv4 self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv4();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv4 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv4 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv6 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv6 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv6 self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv6();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv6 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv6 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelist extends TeaModel {
        @NameInMap("RegionalIPv4")
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv4> regionalIPv4;

        @NameInMap("RegionalIPv6")
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv6> regionalIPv6;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelist self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelist setRegionalIPv4(java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv4> regionalIPv4) {
            this.regionalIPv4 = regionalIPv4;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelist setRegionalIPv6(java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv6> regionalIPv6) {
            this.regionalIPv6 = regionalIPv6;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelistRegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalDiffIPWhitelist extends TeaModel {
        @NameInMap("AddedIPRegionWhitelist")
        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelist addedIPRegionWhitelist;

        @NameInMap("NoChangeIpWhitelist")
        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelist noChangeIpWhitelist;

        @NameInMap("RemovedIPRegionWhitelist")
        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelist removedIPRegionWhitelist;

        public static GetOriginProtectionResponseBodyRegionalDiffIPWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalDiffIPWhitelist self = new GetOriginProtectionResponseBodyRegionalDiffIPWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelist setAddedIPRegionWhitelist(GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelist addedIPRegionWhitelist) {
            this.addedIPRegionWhitelist = addedIPRegionWhitelist;
            return this;
        }
        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistAddedIPRegionWhitelist getAddedIPRegionWhitelist() {
            return this.addedIPRegionWhitelist;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelist setNoChangeIpWhitelist(GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelist noChangeIpWhitelist) {
            this.noChangeIpWhitelist = noChangeIpWhitelist;
            return this;
        }
        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistNoChangeIpWhitelist getNoChangeIpWhitelist() {
            return this.noChangeIpWhitelist;
        }

        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelist setRemovedIPRegionWhitelist(GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelist removedIPRegionWhitelist) {
            this.removedIPRegionWhitelist = removedIPRegionWhitelist;
            return this;
        }
        public GetOriginProtectionResponseBodyRegionalDiffIPWhitelistRemovedIPRegionWhitelist getRemovedIPRegionWhitelist() {
            return this.removedIPRegionWhitelist;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv4 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv4 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv4 self = new GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv4();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv4 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv4 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv6 extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101.66.250.0/25</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>chinese_mainland</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv6 build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv6 self = new GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv6();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv6 setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv6 setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOriginProtectionResponseBodyRegionalLatestIPWhitelist extends TeaModel {
        @NameInMap("RegionalIPv4")
        public java.util.List<GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv4> regionalIPv4;

        @NameInMap("RegionalIPv6")
        public java.util.List<GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv6> regionalIPv6;

        public static GetOriginProtectionResponseBodyRegionalLatestIPWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetOriginProtectionResponseBodyRegionalLatestIPWhitelist self = new GetOriginProtectionResponseBodyRegionalLatestIPWhitelist();
            return TeaModel.build(map, self);
        }

        public GetOriginProtectionResponseBodyRegionalLatestIPWhitelist setRegionalIPv4(java.util.List<GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv4> regionalIPv4) {
            this.regionalIPv4 = regionalIPv4;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv4> getRegionalIPv4() {
            return this.regionalIPv4;
        }

        public GetOriginProtectionResponseBodyRegionalLatestIPWhitelist setRegionalIPv6(java.util.List<GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv6> regionalIPv6) {
            this.regionalIPv6 = regionalIPv6;
            return this;
        }
        public java.util.List<GetOriginProtectionResponseBodyRegionalLatestIPWhitelistRegionalIPv6> getRegionalIPv6() {
            return this.regionalIPv6;
        }

    }

}
