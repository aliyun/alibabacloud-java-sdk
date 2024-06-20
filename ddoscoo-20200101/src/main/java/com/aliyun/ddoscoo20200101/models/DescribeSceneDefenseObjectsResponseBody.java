// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefenseObjectsResponseBody extends TeaModel {
    /**
     * <p>The information about the protected assets.</p>
     */
    @NameInMap("Objects")
    public java.util.List<DescribeSceneDefenseObjectsResponseBodyObjects> objects;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FE07E73F-F19E-4A51-B62F-AC59E3B962D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSceneDefenseObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneDefenseObjectsResponseBody self = new DescribeSceneDefenseObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneDefenseObjectsResponseBody setObjects(java.util.List<DescribeSceneDefenseObjectsResponseBodyObjects> objects) {
        this.objects = objects;
        return this;
    }
    public java.util.List<DescribeSceneDefenseObjectsResponseBodyObjects> getObjects() {
        return this.objects;
    }

    public DescribeSceneDefenseObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSceneDefenseObjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSceneDefenseObjectsResponseBodyObjects extends TeaModel {
        /**
         * <p>The domain name that is protected by the policy.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>47e07ebd-0ba5-4afc-957b-59d15b90****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance that is protected by the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>203.XX.XX.119</p>
         */
        @NameInMap("Vip")
        public String vip;

        public static DescribeSceneDefenseObjectsResponseBodyObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneDefenseObjectsResponseBodyObjects self = new DescribeSceneDefenseObjectsResponseBodyObjects();
            return TeaModel.build(map, self);
        }

        public DescribeSceneDefenseObjectsResponseBodyObjects setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeSceneDefenseObjectsResponseBodyObjects setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeSceneDefenseObjectsResponseBodyObjects setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

    }

}
