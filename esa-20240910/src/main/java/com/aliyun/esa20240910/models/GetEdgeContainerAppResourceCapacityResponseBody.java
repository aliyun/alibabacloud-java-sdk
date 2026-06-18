// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceCapacityResponseBody extends TeaModel {
    /**
     * <p>The available regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<GetEdgeContainerAppResourceCapacityResponseBodyRegions> regions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50423A7F-A83D-1E24-B80E-86DD25790759</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeContainerAppResourceCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceCapacityResponseBody self = new GetEdgeContainerAppResourceCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceCapacityResponseBody setRegions(java.util.List<GetEdgeContainerAppResourceCapacityResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<GetEdgeContainerAppResourceCapacityResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public GetEdgeContainerAppResourceCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEdgeContainerAppResourceCapacityResponseBodyRegions extends TeaModel {
        /**
         * <p>The carrier. This parameter is returned only for regions in the Chinese mainland. Valid values:</p>
         * <ul>
         * <li><p>cmcc: China Mobile</p>
         * </li>
         * <li><p>chinanet: China Telecom</p>
         * </li>
         * <li><p>unicom: China Unicom</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The Chinese mainland:</p>
         * <ul>
         * <li><p>huadong: East China</p>
         * </li>
         * <li><p>huanan: South China</p>
         * </li>
         * <li><p>huazhong: Central China</p>
         * </li>
         * <li><p>huabei: North China</p>
         * </li>
         * <li><p>xibei: Northwest China</p>
         * </li>
         * <li><p>xinan: Southwest China</p>
         * </li>
         * <li><p>dongbei: Northeast China</p>
         * </li>
         * </ul>
         * <p>Special administrative regions and regions outside the Chinese mainland:</p>
         * <ul>
         * <li><p>tw: Taiwan (China)</p>
         * </li>
         * <li><p>mo: Macao (China)</p>
         * </li>
         * <li><p>hk: Hong Kong (China)</p>
         * </li>
         * <li><p>jp: Japan</p>
         * </li>
         * <li><p>us: US</p>
         * </li>
         * <li><p>th: Thailand</p>
         * </li>
         * <li><p>kr: South Korea</p>
         * </li>
         * <li><p>ru: Russia</p>
         * </li>
         * <li><p>sg: Singapore</p>
         * </li>
         * <li><p>fr: France</p>
         * </li>
         * <li><p>es: Spain</p>
         * </li>
         * <li><p>it: Italy</p>
         * </li>
         * <li><p>se: Sweden</p>
         * </li>
         * <li><p>ae: UAE</p>
         * </li>
         * <li><p>id: Indonesia</p>
         * </li>
         * <li><p>cl: Chile</p>
         * </li>
         * <li><p>ph: Philippines</p>
         * </li>
         * <li><p>my: Malaysia</p>
         * </li>
         * <li><p>vn: Vietnam</p>
         * </li>
         * <li><p>ar: Argentina</p>
         * </li>
         * <li><p>au: Australia</p>
         * </li>
         * <li><p>br: Brazil</p>
         * </li>
         * <li><p>co: Colombia</p>
         * </li>
         * <li><p>de: Germany</p>
         * </li>
         * <li><p>gb: UK</p>
         * </li>
         * <li><p>pe: Peru</p>
         * </li>
         * <li><p>sa: Saudi Arabia</p>
         * </li>
         * <li><p>nl: Netherlands</p>
         * </li>
         * <li><p>za: South Africa</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>huadong</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The number of container replicas that can be deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        public static GetEdgeContainerAppResourceCapacityResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppResourceCapacityResponseBodyRegions self = new GetEdgeContainerAppResourceCapacityResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppResourceCapacityResponseBodyRegions setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetEdgeContainerAppResourceCapacityResponseBodyRegions setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetEdgeContainerAppResourceCapacityResponseBodyRegions setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

    }

}
