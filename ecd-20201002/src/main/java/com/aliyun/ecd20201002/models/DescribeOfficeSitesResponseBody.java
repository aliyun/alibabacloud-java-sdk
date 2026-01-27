// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesResponseBody extends TeaModel {
    /**
     * <p>The office networks.</p>
     */
    @NameInMap("OfficeSites")
    public java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> officeSites;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOfficeSitesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSitesResponseBody self = new DescribeOfficeSitesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSitesResponseBody setOfficeSites(java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> officeSites) {
        this.officeSites = officeSites;
        return this;
    }
    public java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> getOfficeSites() {
        return this.officeSites;
    }

    public DescribeOfficeSitesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOfficeSitesResponseBodyOfficeSites extends TeaModel {
        /**
         * <p>aliuid</p>
         * 
         * <strong>example:</strong>
         * <p>125552</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>biztype</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        @NameInMap("BizType")
        public Integer bizType;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com">http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com</a></p>
         */
        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <strong>example:</strong>
         * <p>268****</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://eds-cn-shanghai-67">https://eds-cn-shanghai-67</a>****</p>
         */
        @NameInMap("SsoServiceUrl")
        public String ssoServiceUrl;

        public static DescribeOfficeSitesResponseBodyOfficeSites build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseBodyOfficeSites self = new DescribeOfficeSitesResponseBodyOfficeSites();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDesktopAccessType(String desktopAccessType) {
            this.desktopAccessType = desktopAccessType;
            return this;
        }
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDesktopVpcEndpoint(String desktopVpcEndpoint) {
            this.desktopVpcEndpoint = desktopVpcEndpoint;
            return this;
        }
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setSsoServiceUrl(String ssoServiceUrl) {
            this.ssoServiceUrl = ssoServiceUrl;
            return this;
        }
        public String getSsoServiceUrl() {
            return this.ssoServiceUrl;
        }

    }

}
