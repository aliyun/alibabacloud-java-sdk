// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionsResponseBody extends TeaModel {
    /**
     * <p>The service code. 0 is returned for a successful request. An error code is returned for a failed request.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the regions.</p>
     */
    @NameInMap("EnsRegions")
    public DescribeEnsRegionsResponseBodyEnsRegions ensRegions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnsRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionsResponseBody self = new DescribeEnsRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnsRegionsResponseBody setEnsRegions(DescribeEnsRegionsResponseBodyEnsRegions ensRegions) {
        this.ensRegions = ensRegions;
        return this;
    }
    public DescribeEnsRegionsResponseBodyEnsRegions getEnsRegions() {
        return this.ensRegions;
    }

    public DescribeEnsRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions extends TeaModel {
        /**
         * <p>The code of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>NorthEastChina</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>NorthChina</p>
         */
        @NameInMap("EnName")
        public String enName;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-dalian-unicom</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The province where the node is deployed.</p>
         */
        @NameInMap("Province")
        public String province;

        public static DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions self = new DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class DescribeEnsRegionsResponseBodyEnsRegions extends TeaModel {
        @NameInMap("EnsRegions")
        public java.util.List<DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions> ensRegions;

        public static DescribeEnsRegionsResponseBodyEnsRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionsResponseBodyEnsRegions self = new DescribeEnsRegionsResponseBodyEnsRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionsResponseBodyEnsRegions setEnsRegions(java.util.List<DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions> ensRegions) {
            this.ensRegions = ensRegions;
            return this;
        }
        public java.util.List<DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions> getEnsRegions() {
            return this.ensRegions;
        }

    }

}
