// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclAppsResponseBody extends TeaModel {
    /**
     * <p>The list of access control applications.</p>
     */
    @NameInMap("AclApps")
    public java.util.List<DescribeAclAppsResponseBodyAclApps> aclApps;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9063AB86-6FFA-5B2D-A16D-697C966D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAclAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclAppsResponseBody self = new DescribeAclAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclAppsResponseBody setAclApps(java.util.List<DescribeAclAppsResponseBodyAclApps> aclApps) {
        this.aclApps = aclApps;
        return this;
    }
    public java.util.List<DescribeAclAppsResponseBodyAclApps> getAclApps() {
        return this.aclApps;
    }

    public DescribeAclAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAclAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAclAppsResponseBodyAclApps extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Specifies whether the application is common. Valid values:</p>
         * <ul>
         * <li><p>1: Common.</p>
         * </li>
         * <li><p>0: Uncommon.</p>
         * </li>
         * <li><p>Empty (default): All.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Popular")
        public Integer popular;

        /**
         * <p>The list of protocol types.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The risk assessment level. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Low-risk.</li>
         * <li><strong>2</strong>: Medium-risk.</li>
         * <li><strong>3</strong>: High-risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>Specifies whether <strong>FQDN</strong> is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Not supported.</p>
         * </li>
         * <li><p><strong>1</strong>: Supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SupportFqdn")
        public Integer supportFqdn;

        public static DescribeAclAppsResponseBodyAclApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclAppsResponseBodyAclApps self = new DescribeAclAppsResponseBodyAclApps();
            return TeaModel.build(map, self);
        }

        public DescribeAclAppsResponseBodyAclApps setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public DescribeAclAppsResponseBodyAclApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAclAppsResponseBodyAclApps setPopular(Integer popular) {
            this.popular = popular;
            return this;
        }
        public Integer getPopular() {
            return this.popular;
        }

        public DescribeAclAppsResponseBodyAclApps setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public DescribeAclAppsResponseBodyAclApps setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeAclAppsResponseBodyAclApps setSupportFqdn(Integer supportFqdn) {
            this.supportFqdn = supportFqdn;
            return this;
        }
        public Integer getSupportFqdn() {
            return this.supportFqdn;
        }

    }

}
