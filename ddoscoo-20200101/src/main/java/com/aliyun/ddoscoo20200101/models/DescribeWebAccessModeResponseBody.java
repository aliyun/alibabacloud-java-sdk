// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessModeResponseBody extends TeaModel {
    /**
     * <p>An array consisting of the modes in which the website service is added.</p>
     */
    @NameInMap("DomainModes")
    public java.util.List<DescribeWebAccessModeResponseBodyDomainModes> domainModes;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebAccessModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessModeResponseBody self = new DescribeWebAccessModeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessModeResponseBody setDomainModes(java.util.List<DescribeWebAccessModeResponseBodyDomainModes> domainModes) {
        this.domainModes = domainModes;
        return this;
    }
    public java.util.List<DescribeWebAccessModeResponseBodyDomainModes> getDomainModes() {
        return this.domainModes;
    }

    public DescribeWebAccessModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWebAccessModeResponseBodyDomainModes extends TeaModel {
        /**
         * <p>The mode in which the website service is added. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: A record</li>
         * <li><strong>1</strong>: anti-DDoS mode</li>
         * <li><strong>2</strong>: origin redundancy mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AccessMode")
        public Integer accessMode;

        /**
         * <p>The domain name of the website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        public static DescribeWebAccessModeResponseBodyDomainModes build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebAccessModeResponseBodyDomainModes self = new DescribeWebAccessModeResponseBodyDomainModes();
            return TeaModel.build(map, self);
        }

        public DescribeWebAccessModeResponseBodyDomainModes setAccessMode(Integer accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public Integer getAccessMode() {
            return this.accessMode;
        }

        public DescribeWebAccessModeResponseBodyDomainModes setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
