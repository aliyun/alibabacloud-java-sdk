// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeCnameReusesResponseBody extends TeaModel {
    /**
     * <p>The CNAME reuse information.</p>
     */
    @NameInMap("CnameReuses")
    public java.util.List<DescribeCnameReusesResponseBodyCnameReuses> cnameReuses;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCnameReusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCnameReusesResponseBody self = new DescribeCnameReusesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCnameReusesResponseBody setCnameReuses(java.util.List<DescribeCnameReusesResponseBodyCnameReuses> cnameReuses) {
        this.cnameReuses = cnameReuses;
        return this;
    }
    public java.util.List<DescribeCnameReusesResponseBodyCnameReuses> getCnameReuses() {
        return this.cnameReuses;
    }

    public DescribeCnameReusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCnameReusesResponseBodyCnameReuses extends TeaModel {
        /**
         * <p>The reused canonical name value.</p>
         * 
         * <strong>example:</strong>
         * <p>4o6ep6q217k9****.aliyunddos0004.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The domain name of the website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether CNAME reuse is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: disabled</p>
         * </li>
         * <li><p><strong>1</strong>: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        public static DescribeCnameReusesResponseBodyCnameReuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeCnameReusesResponseBodyCnameReuses self = new DescribeCnameReusesResponseBodyCnameReuses();
            return TeaModel.build(map, self);
        }

        public DescribeCnameReusesResponseBodyCnameReuses setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeCnameReusesResponseBodyCnameReuses setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCnameReusesResponseBodyCnameReuses setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

    }

}
