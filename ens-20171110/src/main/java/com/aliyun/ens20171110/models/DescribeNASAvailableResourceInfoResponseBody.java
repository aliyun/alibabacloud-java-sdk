// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNASAvailableResourceInfoResponseBody extends TeaModel {
    /**
     * <p>Business status code. Returns 0 on success.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>you are not authorized to this workspace, or workspace not exists.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Available NAS resource information.</p>
     */
    @NameInMap("NasAvailableResourceInfo")
    public java.util.List<DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo> nasAvailableResourceInfo;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNASAvailableResourceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNASAvailableResourceInfoResponseBody self = new DescribeNASAvailableResourceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNASAvailableResourceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNASAvailableResourceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNASAvailableResourceInfoResponseBody setNasAvailableResourceInfo(java.util.List<DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo> nasAvailableResourceInfo) {
        this.nasAvailableResourceInfo = nasAvailableResourceInfo;
        return this;
    }
    public java.util.List<DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo> getNasAvailableResourceInfo() {
        return this.nasAvailableResourceInfo;
    }

    public DescribeNASAvailableResourceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo extends TeaModel {
        /**
         * <p>Edge zone product capabilities.</p>
         */
        @NameInMap("Ability")
        public java.util.List<String> ability;

        /**
         * <p>Area to which the ENS edge zone belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>SouthWestChina</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>English name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chenzhou-telecom_unicom_cmcc</p>
         */
        @NameInMap("EnName")
        public String enName;

        /**
         * <p>ENS edge zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chenzhou-telecom_unicom_cmcc</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>ENS edge zone name.</p>
         * 
         * <strong>example:</strong>
         * <p>China Hangzhou36</p>
         */
        @NameInMap("EnsRegionName")
        public String ensRegionName;

        /**
         * <p>Available NAS resource count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NasAvailableAmount")
        public Integer nasAvailableAmount;

        /**
         * <p>Available NAS resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>capacity</p>
         */
        @NameInMap("NasAvailableStorgeType")
        public String nasAvailableStorgeType;

        /**
         * <p>Province to which the ENS edge zone belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>湖北省</p>
         */
        @NameInMap("Province")
        public String province;

        public static DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo self = new DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo setAbility(java.util.List<String> ability) {
            this.ability = ability;
            return this;
        }
        public java.util.List<String> getAbility() {
            return this.ability;
        }

        public DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo setEnsRegionName(String ensRegionName) {
            this.ensRegionName = ensRegionName;
            return this;
        }
        public String getEnsRegionName() {
            return this.ensRegionName;
        }

        public DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo setNasAvailableAmount(Integer nasAvailableAmount) {
            this.nasAvailableAmount = nasAvailableAmount;
            return this;
        }
        public Integer getNasAvailableAmount() {
            return this.nasAvailableAmount;
        }

        public DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo setNasAvailableStorgeType(String nasAvailableStorgeType) {
            this.nasAvailableStorgeType = nasAvailableStorgeType;
            return this;
        }
        public String getNasAvailableStorgeType() {
            return this.nasAvailableStorgeType;
        }

        public DescribeNASAvailableResourceInfoResponseBodyNasAvailableResourceInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
